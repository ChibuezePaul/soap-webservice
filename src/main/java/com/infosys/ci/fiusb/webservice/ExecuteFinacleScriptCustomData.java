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
 * <p>Java class for executeFinacleScript_CustomData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="executeFinacleScript_CustomData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="signId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SuccessOrFailure" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LienB2kId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "executeFinacleScript_CustomData", propOrder = {
    "signId",
    "successOrFailure",
    "lienB2KId"
})
public class ExecuteFinacleScriptCustomData {

    @XmlElement(required = true)
    protected String signId;
    @XmlElement(name = "SuccessOrFailure", required = true)
    protected String successOrFailure;
    @XmlElement(name = "LienB2kId", required = true)
    protected String lienB2KId;

    /**
     * Gets the value of the signId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignId() {
        return signId;
    }

    /**
     * Sets the value of the signId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignId(String value) {
        this.signId = value;
    }

    /**
     * Gets the value of the successOrFailure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuccessOrFailure() {
        return successOrFailure;
    }

    /**
     * Sets the value of the successOrFailure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuccessOrFailure(String value) {
        this.successOrFailure = value;
    }

    /**
     * Gets the value of the lienB2KId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLienB2KId() {
        return lienB2KId;
    }

    /**
     * Sets the value of the lienB2KId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLienB2KId(String value) {
        this.lienB2KId = value;
    }

}
