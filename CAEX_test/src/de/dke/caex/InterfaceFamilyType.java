//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.1 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.05.04 at 05:08:34 PM BST 
//


package de.dke.caex;

import java.util.ArrayList;
import java.util.List;

import Interfaces.IInterfaceFamilyType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Defines base structures for a hierarchical InterfaceClass tree. The hierarchical structure of an interface library has organizational character only.
 * 
 * <p>Java class for InterfaceFamilyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InterfaceFamilyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.dke.de/CAEX}InterfaceClassType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="InterfaceClass" type="{http://www.dke.de/CAEX}InterfaceFamilyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterfaceFamilyType", propOrder = {
    "interfaceClass"
})
public class InterfaceFamilyType
    extends InterfaceClassType implements IInterfaceFamilyType
{

    @XmlElement(name = "InterfaceClass")
    protected List<InterfaceFamilyType> interfaceClass;

    /**
     * Gets the value of the interfaceClass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the interfaceClass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInterfaceClass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InterfaceFamilyType }
     * 
     * 
     */
    @Override
	public List<InterfaceFamilyType> getInterfaceClass() {
        if (interfaceClass == null) {
            interfaceClass = new ArrayList<InterfaceFamilyType>();
        }
        return this.interfaceClass;
    }

}
