//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.1 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.04.27 at 04:35:46 PM BST 
//


package generated;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Defines base structures for a hierarchical RoleClass tree. The hierarchical structure of a role library has organizational character only. 
 * 
 * <p>Java class for RoleFamilyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoleFamilyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}RoleClassType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="RoleClass" type="{}RoleFamilyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoleFamilyType", propOrder = {
    "roleClass"
})
public class RoleFamilyType
    extends RoleClassType
{

    @XmlElement(name = "RoleClass")
    protected List<RoleFamilyType> roleClass;

    /**
     * Gets the value of the roleClass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the roleClass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoleClass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoleFamilyType }
     * 
     * 
     */
    public List<RoleFamilyType> getRoleClass() {
        if (roleClass == null) {
            roleClass = new ArrayList<RoleFamilyType>();
        }
        return this.roleClass;
    }

}
