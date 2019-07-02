//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.01 at 02:28:42 PM GMT+01:00 
//


package com.soapws.webservice.customerUpdate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.DatatypeConfigurationException;


/**
 * <p>Java class for ResponseHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseHeader">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequestMessageKey" type="{http://webservice.fiusb.ci.infosys.com}RequestMessageKey"/>
 *         &lt;element name="ResponseMessageInfo" type="{http://webservice.fiusb.ci.infosys.com}ResponseMessageInfo"/>
 *         &lt;element name="UBUSTransaction" type="{http://webservice.fiusb.ci.infosys.com}UBUSTransaction"/>
 *         &lt;element name="HostTransaction" type="{http://webservice.fiusb.ci.infosys.com}HostTransaction"/>
 *         &lt;element name="HostParentTransaction" type="{http://webservice.fiusb.ci.infosys.com}HostParentTransaction"/>
 *         &lt;element name="CustomInfo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseHeader", propOrder = {
    "requestMessageKey",
    "responseMessageInfo",
    "ubusTransaction",
    "hostTransaction",
    "hostParentTransaction",
    "customInfo"
})
public class ResponseHeader {

    @XmlElement(name = "RequestMessageKey", required = true)
    protected RequestMessageKey requestMessageKey = new RequestMessageKey();
    @XmlElement(name = "ResponseMessageInfo", required = true)
    protected ResponseMessageInfo responseMessageInfo = new ResponseMessageInfo();
    @XmlElement(name = "UBUSTransaction", required = true)
    protected UBUSTransaction ubusTransaction = new UBUSTransaction();
    @XmlElement(name = "HostTransaction", required = true)
    protected HostTransaction hostTransaction = new HostTransaction();
    @XmlElement(name = "HostParentTransaction", required = true)
    protected HostParentTransaction hostParentTransaction = new HostParentTransaction();
    @XmlElement(name = "CustomInfo", required = true)
    protected String customInfo = "";

    public ResponseHeader() {
    }

    /**
     * Gets the value of the requestMessageKey property.
     * 
     * @return
     *     possible object is
     *     {@link RequestMessageKey }
     *     
     */
    public RequestMessageKey getRequestMessageKey() {
        return requestMessageKey;
    }

    /**
     * Sets the value of the requestMessageKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestMessageKey }
     *     
     */
    public void setRequestMessageKey(RequestMessageKey value) {
        this.requestMessageKey = value;
    }

    /**
     * Gets the value of the responseMessageInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseMessageInfo }
     *     
     */
    public ResponseMessageInfo getResponseMessageInfo() {
        return responseMessageInfo;
    }

    /**
     * Sets the value of the responseMessageInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseMessageInfo }
     *     
     */
    public void setResponseMessageInfo(ResponseMessageInfo value) {
        this.responseMessageInfo = value;
    }

    /**
     * Gets the value of the ubusTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link UBUSTransaction }
     *     
     */
    public UBUSTransaction getUBUSTransaction() {
        return ubusTransaction;
    }

    /**
     * Sets the value of the ubusTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link UBUSTransaction }
     *     
     */
    public void setUBUSTransaction(UBUSTransaction value) {
        this.ubusTransaction = value;
    }

    /**
     * Gets the value of the hostTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link HostTransaction }
     *     
     */
    public HostTransaction getHostTransaction() {
        return hostTransaction;
    }

    /**
     * Sets the value of the hostTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostTransaction }
     *     
     */
    public void setHostTransaction(HostTransaction value) {
        this.hostTransaction = value;
    }

    /**
     * Gets the value of the hostParentTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link HostParentTransaction }
     *     
     */
    public HostParentTransaction getHostParentTransaction() {
        return hostParentTransaction;
    }

    /**
     * Sets the value of the hostParentTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostParentTransaction }
     *     
     */
    public void setHostParentTransaction(HostParentTransaction value) {
        this.hostParentTransaction = value;
    }

    /**
     * Gets the value of the customInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomInfo() {
        return customInfo;
    }

    /**
     * Sets the value of the customInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomInfo(String value) {
        this.customInfo = value;
    }

}
