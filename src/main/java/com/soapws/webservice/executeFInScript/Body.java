//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.01 at 02:23:50 PM GMT+01:00 
//


package com.soapws.webservice.executeFInScript;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Body complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Body">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="executeFinacleScriptResponse" type="{http://webservice.fiusb.ci.infosys.com}executeFinacleScriptResponse"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Body", propOrder = {
    "executeFinacleScriptResponse"
})
public class Body {

    @XmlElement(required = true)
    protected ExecuteFinacleScriptResponse executeFinacleScriptResponse;

    /**
     * Gets the value of the executeFinacleScriptResponse property.
     * 
     * @return
     *     possible object is
     *     {@link ExecuteFinacleScriptResponse }
     *     
     */
    public ExecuteFinacleScriptResponse getExecuteFinacleScriptResponse() {
        return executeFinacleScriptResponse;
    }

    /**
     * Sets the value of the executeFinacleScriptResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExecuteFinacleScriptResponse }
     *     
     */
    public void setExecuteFinacleScriptResponse(ExecuteFinacleScriptResponse value) {
        this.executeFinacleScriptResponse = value;
    }

}
