package com.old.customAcctDetatils;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.datatype.DatatypeConfigurationException;

//@Service
public class FIService {

//    @Autowired
    FIRepository fiRepository;

    public FIXML getCustomAcctDetails(ExecuteService request) throws DatatypeConfigurationException {

        ExecuteServiceResponse response = new ExecuteServiceResponse();

//        response.getFIXML().getHeader().getResponseHeader().getRequestMessageKey().setChannelId(request.getArg00().getFIXML().getHeader().getRequestHeader().getMessageKey().getChannelId());
//
//        response.getFIXML().getHeader().getResponseHeader().getRequestMessageKey().setRequestUUID(request.getArg00().getFIXML().getHeader().getRequestHeader().getMessageKey().getRequestUUID());
//
//        response.getFIXML().getHeader().getResponseHeader().getRequestMessageKey().setServiceRequestId(request.getArg00().getFIXML().getHeader().getRequestHeader().getMessageKey().getServiceRequestId());
//
//        response.getFIXML().getHeader().getResponseHeader().getRequestMessageKey().setServiceRequestId(request.getArg00().getFIXML().getHeader().getRequestHeader().getMessageKey().getServiceRequestVersion());

        return fiRepository.setCustomAcctDetails(response);
    }
}
