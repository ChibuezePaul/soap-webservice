//package com.longbridge.soap.integrify.services.implementation;
//
//import com.longbridge.console.doc.integrify_finacle_service.PaymentDetails;
//import com.longbridge.console.doc.integrify_finacle_service.Response;
//import com.longbridge.console.doc.integrify_finacle_service.VendorpaymentRequest;
//import com.longbridge.soap.integrify.Utils.DateFormatter;
//import com.longbridge.soap.integrify.Utils.GeneralUtils;
//import com.longbridge.soap.integrify.Utils.SafeString;
//import com.longbridge.soap.integrify.dtos.RequestLogDTO;
//import com.longbridge.soap.integrify.dtos.RequestTpe;
//import com.longbridge.soap.integrify.dtos.ResponseDTO;
//import com.longbridge.soap.integrify.exceptions.WsException;
//import com.longbridge.soap.integrify.repositories.RequestLogRepo;
//import com.longbridge.soap.integrify.services.SecurityService;
//import com.longbridge.soap.integrify.services.VendorPaymentFiProcessorService;
//import org.modelmapper.ModelMapper;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Service;
//import org.thymeleaf.TemplateEngine;
//import org.thymeleaf.context.Context;
//
//import java.util.*;
//
///**
// * Created by JUDE on 5/28/2019.
// */
//@Service
//public class VendorPaymentFiProcessorServiceImpl implements VendorPaymentFiProcessorService {
//    Logger logger = LoggerFactory.getLogger(this.getClass());
//    @Autowired
//    ModelMapper modelMapper;
//    @Autowired
//    DateFormatter dateFormatter;
//    @Autowired
//    SafeString safeString;
//    @Value("${bank.id}")
//    private String bankId;
//
//    @Autowired
//    private TemplateEngine templateEngine;
//    @Autowired
//    private GeneralUtils generalUtils;
//    @Autowired
//    private SecurityService securityService;
//    @Autowired
//    RequestLogRepo requestLogRepo;
//
//    @Override
//    public Response sendVendorPaymentRequestToFIAndSaveToLogTable(VendorpaymentRequest vendorpaymentrequest) {
//        Response response = new Response();
//        try {
//            Context context = getContext(vendorpaymentrequest);
//            requestLogRepo.saveOrUpdateRequestOnLogTable(instantiate(vendorpaymentrequest));
//
//            String result = templateEngine.process("vendorpayment", context);
//            logger.info("FI_XML IS = {}", result);
//            ResponseDTO response1 = generalUtils.getFiResponseFromXml(result);
//            response = modelMapper.map(response1, Response.class);
//            return response;
//        } catch (WsException e) {
//            logger.info("exception occurred on sendVendorPaymentRequestToFIAndSaveToLogTable because ;{}", e.getMessage());
//            logger.info("EXCEPTION ", e);
//            throw new WsException(e.getMessage(),e.getCause());
//        }
//    }
//
//    private Context getContext(VendorpaymentRequest vendorpaymentrequest){
//        Context context = new Context();
//        try {
//            Map<String, List<String>> listMap = extractIndividualParameterFromPaymentDeatils(vendorpaymentrequest.getPaymentDetails());
//
//            String accountIdTag =safeString.generateXmlTagsForAlistOfStrings("acctNo",listMap.get(keys.accountIdList.toString()));
//            String currencyCodeTag =safeString.generateXmlTagsForAlistOfStrings("ccy",listMap.get(keys.currencyCodeList.toString()));
//            String amountTag =safeString.generateXmlTagsForAlistOfStrings("amt",listMap.get(keys.amountList.toString()));
//            String partTranTypeTag =safeString.generateXmlTagsForAlistOfStrings("subType",listMap.get(keys.partTranTypeList.toString()));
//            String tranParticularsTag =safeString.generateXmlTagsForAlistOfStrings("tranPartcls",listMap.get(keys.tranParticularsList.toString()));
//            String valueDateTag =safeString.generateXmlTagsForAlistOfStrings("valueDate",listMap.get(keys.valueDateList.toString()));
//            String transactionCodeTag =safeString.generateXmlTagsForAlistOfStrings("tranCode",listMap.get(keys.transactionCodeList.toString()));
//
//            context.setVariable("bankId", bankId);
//            context.setVariable("MessageDateTime", dateFormatter.formatDateTime(new Date()));
//            context.setVariable("channel", securityService.getAuthentication().getName());
//            context.setVariable("transubType", safeString.catchNullPointerInString(vendorpaymentrequest.getTranSubType(), "tranSubType"));
//            context.setVariable("postFlag", safeString.catchNullPointerInString(vendorpaymentrequest.getPostFlag(), "postFlag"));
//            context.setVariable("requestReference", safeString.catchNullPointerInString(vendorpaymentrequest.getRequestId(), "requestId"));
//            context.setVariable("accountId", accountIdTag);
//            context.setVariable("currencyCode", currencyCodeTag);
//            context.setVariable("amount", amountTag);
//            context.setVariable("partTranType", partTranTypeTag);
//            context.setVariable("tranParticulars", tranParticularsTag);
//            context.setVariable("valueDate", valueDateTag);
//            context.setVariable("transactionCode", transactionCodeTag);
//            context.setVariable("recCount", vendorpaymentrequest.getPaymentDetails().size());
//
//            return context;
//        }catch (WsException e){
//            throw new WsException(e.getMessage(),e.getCause());
//        }
//    }
//
//   private RequestLogDTO instantiate(VendorpaymentRequest vendorpaymentRequest){
//       return generalUtils.instantiateRequestLog(vendorpaymentRequest.getRequestId(),
//                vendorpaymentRequest.getProcessorEmail(), RequestTpe.VENDOR_PAYMENT.toString());
//    }
//
//    private Map<String, List<String>> extractIndividualParameterFromPaymentDeatils(List<PaymentDetails> paymentDetailsList) {
//        Map<String, List<String>> result = new HashMap<>();
//        try {
//            List<String> accountIdList = new ArrayList<>();
//            List<String> currencyCodeList = new ArrayList<>();
//            List<String> amountList = new ArrayList<>();
//            List<String> partTranTypeList = new ArrayList<>();
//            List<String> tranParticularsList = new ArrayList<>();
//            List<String> transactionCodeList = new ArrayList<>();
//            List<String> valueDateList = new ArrayList<>();
//
//            for (PaymentDetails paymentDetails : paymentDetailsList) {
//                accountIdList.add(safeString.catchNullPointerInString(paymentDetails.getAccountId(), "AccountId"));
//                currencyCodeList.add(safeString.catchNullPointerInString(paymentDetails.getCurrencyCode(), "currency"));
//                amountList.add(safeString.catchNullPointerInString(paymentDetails.getAmount(), "amount"));
//                if (!safeString.isAmountStringValid(paymentDetails.getAmount())) {
//                    throw new WsException("Invalid amount");
//                }
//                partTranTypeList.add(safeString.catchNullPointerInString(paymentDetails.getPartTranType(), "partTranType"));
//                tranParticularsList.add(safeString.catchNullPointerInString(paymentDetails.getTranParticulars(), "tranParticular"));
//                if (!safeString.isStringEmpty(paymentDetails.getTransactionCode())) {
//                    transactionCodeList.add(paymentDetails.getTransactionCode());
//                } else {
//                    transactionCodeList.add("");
//                }
//                if (!safeString.isStringEmpty(paymentDetails.getValueDate())) {
//                    System.out.println("value date is -----------");
//                    System.out.println(paymentDetails.getValueDate());
//                    valueDateList.add(paymentDetails.getValueDate());
//                } else {
//                    System.out.println("value date is empty -----------");
//                    valueDateList.add("");
//                }
//            }
//            result.put(keys.accountIdList.toString(),accountIdList);
//            result.put(keys.amountList.toString(),amountList);
//            result.put(keys.currencyCodeList.toString(),currencyCodeList);
//            result.put(keys.partTranTypeList.toString(),partTranTypeList);
//            result.put(keys.tranParticularsList.toString(),tranParticularsList);
//            result.put(keys.transactionCodeList.toString(),transactionCodeList);
//            result.put(keys.valueDateList.toString(),valueDateList);
//        } catch (WsException e) {
//            logger.info("an error occurred at extractIndividualParameterFromPaymentDeatils {}", e.getMessage());
//            logger.info("EXCEPTION", e);
//            throw new WsException(e.getMessage(),e.getCause());
//        }
//        return result;
//    }
//
//    enum keys {
//        accountIdList,
//        currencyCodeList,
//        amountList,
//        partTranTypeList,
//        tranParticularsList,
//        valueDateList,
//        transactionCodeList
//
//    }
//
//}
