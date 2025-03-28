//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.1 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.05.04 at 05:08:34 PM BST 
//


package de.dke.caex;

import java.util.ArrayList;
import java.util.List;

import Interfaces.IAttributeValueRequirementType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Defines base structures for definition of value requirements of an attribute.
 * 
 * <p>Java class for AttributeValueRequirementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttributeValueRequirementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.dke.de/CAEX}CAEXBasicObject"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="OrdinalScaledType"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="RequiredMaxValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="RequiredValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="RequiredMinValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NominalScaledType"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="RequiredValue" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UnknownType"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="Requirements" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttributeValueRequirementType", propOrder = {
    "ordinalScaledType",
    "nominalScaledType",
    "unknownType"
})
public class AttributeValueRequirementType
    extends CAEXBasicObject implements IAttributeValueRequirementType
{

    @XmlElement(name = "OrdinalScaledType")
    protected AttributeValueRequirementType.OrdinalScaledType ordinalScaledType;
    @XmlElement(name = "NominalScaledType")
    protected AttributeValueRequirementType.NominalScaledType nominalScaledType;
    @XmlElement(name = "UnknownType")
    protected AttributeValueRequirementType.UnknownType unknownType;
    @XmlAttribute(name = "Name", required = true)
    protected String name;

    /**
     * Gets the value of the ordinalScaledType property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeValueRequirementType.OrdinalScaledType }
     *     
     */
    @Override
	public AttributeValueRequirementType.OrdinalScaledType getOrdinalScaledType() {
        return ordinalScaledType;
    }

    /**
     * Sets the value of the ordinalScaledType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeValueRequirementType.OrdinalScaledType }
     *     
     */
    @Override
	public void setOrdinalScaledType(AttributeValueRequirementType.OrdinalScaledType value) {
        this.ordinalScaledType = value;
    }

    /**
     * Gets the value of the nominalScaledType property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeValueRequirementType.NominalScaledType }
     *     
     */
    @Override
	public AttributeValueRequirementType.NominalScaledType getNominalScaledType() {
        return nominalScaledType;
    }

    /**
     * Sets the value of the nominalScaledType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeValueRequirementType.NominalScaledType }
     *     
     */
    @Override
	public void setNominalScaledType(AttributeValueRequirementType.NominalScaledType value) {
        this.nominalScaledType = value;
    }

    /**
     * Gets the value of the unknownType property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeValueRequirementType.UnknownType }
     *     
     */
    @Override
	public AttributeValueRequirementType.UnknownType getUnknownType() {
        return unknownType;
    }

    /**
     * Sets the value of the unknownType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeValueRequirementType.UnknownType }
     *     
     */
    @Override
	public void setUnknownType(AttributeValueRequirementType.UnknownType value) {
        this.unknownType = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Override
	public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Override
	public void setName(String value) {
        this.name = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence minOccurs="0"&gt;
     *         &lt;element name="RequiredValue" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "requiredValue"
    })
    public static class NominalScaledType {

        @XmlElement(name = "RequiredValue")
        protected List<String> requiredValue;

        /**
         * Gets the value of the requiredValue property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the requiredValue property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRequiredValue().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getRequiredValue() {
            if (requiredValue == null) {
                requiredValue = new ArrayList<String>();
            }
            return this.requiredValue;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence minOccurs="0"&gt;
     *         &lt;element name="RequiredMaxValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="RequiredValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="RequiredMinValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "requiredMaxValue",
        "requiredValue",
        "requiredMinValue"
    })
    public static class OrdinalScaledType {

        @XmlElement(name = "RequiredMaxValue")
        protected String requiredMaxValue;
        @XmlElement(name = "RequiredValue")
        protected String requiredValue;
        @XmlElement(name = "RequiredMinValue")
        protected String requiredMinValue;

        /**
         * Gets the value of the requiredMaxValue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRequiredMaxValue() {
            return requiredMaxValue;
        }

        /**
         * Sets the value of the requiredMaxValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRequiredMaxValue(String value) {
            this.requiredMaxValue = value;
        }

        /**
         * Gets the value of the requiredValue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRequiredValue() {
            return requiredValue;
        }

        /**
         * Sets the value of the requiredValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRequiredValue(String value) {
            this.requiredValue = value;
        }

        /**
         * Gets the value of the requiredMinValue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRequiredMinValue() {
            return requiredMinValue;
        }

        /**
         * Sets the value of the requiredMinValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRequiredMinValue(String value) {
            this.requiredMinValue = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence minOccurs="0"&gt;
     *         &lt;element name="Requirements" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "requirements"
    })
    public static class UnknownType {

        @XmlElement(name = "Requirements")
        protected String requirements;

        /**
         * Gets the value of the requirements property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRequirements() {
            return requirements;
        }

        /**
         * Sets the value of the requirements property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRequirements(String value) {
            this.requirements = value;
        }

    }

}
