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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for executeServiceReturn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="executeServiceReturn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FIXML" type="{http://webservice.fiusb.ci.infosys.com}FIXML"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "executeServiceReturn", propOrder = {
    "fixml"
})
public class ExecuteServiceReturn {

    @XmlElement(name = "FIXML", required = true)
    protected FIXML fixml;

    /**
     * Gets the value of the fixml property.
     * 
     * @return
     *     possible object is
     *     {@link FIXML }
     *     
     */
    public FIXML getFIXML() {
        return fixml;
    }

    /**
     * Sets the value of the fixml property.
     * 
     * @param value
     *     allowed object is
     *     {@link FIXML }
     *     
     */
    public void setFIXML(FIXML value) {
        this.fixml = value;
    }

}
