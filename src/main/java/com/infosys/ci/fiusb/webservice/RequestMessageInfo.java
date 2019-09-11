//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.11 at 11:05:51 AM WAT 
//


package com.infosys.ci.fiusb.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RequestMessageInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestMessageInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BankId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TimeZone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MessageDateTime" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestMessageInfo", propOrder = {
    "bankId",
    "timeZone",
    "messageDateTime"
})
public class RequestMessageInfo {

    @XmlElement(name = "BankId", required = true)
    protected String bankId;
    @XmlElement(name = "TimeZone", required = true)
    protected String timeZone;
    @XmlElement(name = "MessageDateTime", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar messageDateTime;

    /**
     * Gets the value of the bankId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankId() {
        return bankId;
    }

    /**
     * Sets the value of the bankId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankId(String value) {
        this.bankId = value;
    }

    /**
     * Gets the value of the timeZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZone(String value) {
        this.timeZone = value;
    }

    /**
     * Gets the value of the messageDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMessageDateTime() {
        return messageDateTime;
    }

    /**
     * Sets the value of the messageDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMessageDateTime(XMLGregorianCalendar value) {
        this.messageDateTime = value;
    }

}
