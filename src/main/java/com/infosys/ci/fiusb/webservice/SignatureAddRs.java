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
 * <p>Java class for SignatureAddRs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SignatureAddRs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AcctId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AcctCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CustId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EmployeeIdent" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BankCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SigPowerNum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SigAddStatusCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignatureAddRs", propOrder = {
    "acctId",
    "acctCode",
    "custId",
    "employeeIdent",
    "bankCode",
    "sigPowerNum",
    "sigAddStatusCode"
})
public class SignatureAddRs {

    @XmlElement(name = "AcctId", required = true)
    protected String acctId;
    @XmlElement(name = "AcctCode", required = true)
    protected String acctCode;
    @XmlElement(name = "CustId", required = true)
    protected String custId;
    @XmlElement(name = "EmployeeIdent", required = true)
    protected String employeeIdent;
    @XmlElement(name = "BankCode", required = true)
    protected String bankCode;
    @XmlElement(name = "SigPowerNum", required = true)
    protected String sigPowerNum;
    @XmlElement(name = "SigAddStatusCode", required = true)
    protected String sigAddStatusCode;

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctId(String value) {
        this.acctId = value;
    }

    /**
     * Gets the value of the acctCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctCode() {
        return acctCode;
    }

    /**
     * Sets the value of the acctCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctCode(String value) {
        this.acctCode = value;
    }

    /**
     * Gets the value of the custId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustId() {
        return custId;
    }

    /**
     * Sets the value of the custId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustId(String value) {
        this.custId = value;
    }

    /**
     * Gets the value of the employeeIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeIdent() {
        return employeeIdent;
    }

    /**
     * Sets the value of the employeeIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeIdent(String value) {
        this.employeeIdent = value;
    }

    /**
     * Gets the value of the bankCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * Sets the value of the bankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankCode(String value) {
        this.bankCode = value;
    }

    /**
     * Gets the value of the sigPowerNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSigPowerNum() {
        return sigPowerNum;
    }

    /**
     * Sets the value of the sigPowerNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSigPowerNum(String value) {
        this.sigPowerNum = value;
    }

    /**
     * Gets the value of the sigAddStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSigAddStatusCode() {
        return sigAddStatusCode;
    }

    /**
     * Sets the value of the sigAddStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSigAddStatusCode(String value) {
        this.sigAddStatusCode = value;
    }

}
