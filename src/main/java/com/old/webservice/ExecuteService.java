//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.29 at 11:46:42 PM GMT+01:00 
//


package com.old.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg_0_0" type="{http://webservice.fiusb.ci.infosys.com}arg_0_0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "arg00"
})
@XmlRootElement(name = "executeService")
public class ExecuteService {

    @XmlElement(name = "arg_0_0", required = true)
    protected Arg00 arg00;

    /**
     * Gets the value of the arg00 property.
     * 
     * @return
     *     possible object is
     *     {@link Arg00 }
     *     
     */
    public Arg00 getArg00() {
        return arg00;
    }

    /**
     * Sets the value of the arg00 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Arg00 }
     *     
     */
    public void setArg00(Arg00 value) {
        this.arg00 = value;
    }

}
