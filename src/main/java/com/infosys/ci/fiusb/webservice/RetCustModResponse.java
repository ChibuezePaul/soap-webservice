//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.10 at 02:02:24 PM WAT 
//


package com.infosys.ci.fiusb.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetCustModResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetCustModResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RetCustModRs" type="{http://webservice.fiusb.ci.infosys.com}RetCustModRs"/>
 *         &lt;element name="RetCustMod_CustomData" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetCustModResponse", propOrder = {
    "retCustModRs",
    "retCustModCustomData"
})
public class RetCustModResponse {

    @XmlElement(name = "RetCustModRs", required = true)
    protected RetCustModRs retCustModRs;
    @XmlElement(name = "RetCustMod_CustomData", required = true)
    protected String retCustModCustomData;

    /**
     * Gets the value of the retCustModRs property.
     * 
     * @return
     *     possible object is
     *     {@link RetCustModRs }
     *     
     */
    public RetCustModRs getRetCustModRs() {
        return retCustModRs;
    }

    /**
     * Sets the value of the retCustModRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetCustModRs }
     *     
     */
    public void setRetCustModRs(RetCustModRs value) {
        this.retCustModRs = value;
    }

    /**
     * Gets the value of the retCustModCustomData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetCustModCustomData() {
        return retCustModCustomData;
    }

    /**
     * Sets the value of the retCustModCustomData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetCustModCustomData(String value) {
        this.retCustModCustomData = value;
    }

}
