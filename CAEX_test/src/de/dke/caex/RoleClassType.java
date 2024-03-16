//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.1 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.05.04 at 05:08:34 PM BST 
//


package de.dke.caex;

import java.util.ArrayList;
import java.util.List;

import Interfaces.IRoleClassType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Shall be used for RoleClass definition, provides base structures for a role class definition.
 * 
 * <p>Java class for RoleClassType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoleClassType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.dke.de/CAEX}CAEXObject"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="Attribute" type="{http://www.dke.de/CAEX}AttributeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ExternalInterface" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.dke.de/CAEX}InterfaceClassType"&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="RefBaseClassPath" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoleClassType", propOrder = {
    "attribute",
    "externalInterface"
})
@XmlSeeAlso({
    RoleFamilyType.class
})
public class RoleClassType
    extends CAEXObject implements IRoleClassType
{

    @XmlElement(name = "Attribute")
    protected List<AttributeType> attribute;
    @XmlElement(name = "ExternalInterface")
    protected List<RoleClassType.ExternalInterface> externalInterface;
    @XmlAttribute(name = "RefBaseClassPath")
    protected String refBaseClassPath;

    /**
     * Gets the value of the attribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the attribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttributeType }
     * 
     * 
     */
    @Override
	public List<AttributeType> getAttribute() {
        if (attribute == null) {
            attribute = new ArrayList<AttributeType>();
        }
        return this.attribute;
    }

    /**
     * Gets the value of the externalInterface property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the externalInterface property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExternalInterface().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoleClassType.ExternalInterface }
     * 
     * 
     */
    @Override
	public List<RoleClassType.ExternalInterface> getExternalInterface() {
        if (externalInterface == null) {
            externalInterface = new ArrayList<RoleClassType.ExternalInterface>();
        }
        return this.externalInterface;
    }

    /**
     * Gets the value of the refBaseClassPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Override
	public String getRefBaseClassPath() {
        return refBaseClassPath;
    }

    /**
     * Sets the value of the refBaseClassPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Override
	public void setRefBaseClassPath(String value) {
        this.refBaseClassPath = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.dke.de/CAEX}InterfaceClassType"&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ExternalInterface
        extends InterfaceClassType
    {


    }

}
