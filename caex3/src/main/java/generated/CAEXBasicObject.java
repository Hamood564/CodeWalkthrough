//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.1 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.04.27 at 04:35:46 PM BST 
//


package generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * CAEX basis object that comprises a basic set of attributes and header information which exist for all CAEX elements.
 * 
 * <p>Java class for CAEXBasicObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CAEXBasicObject"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;group ref="{}Header" minOccurs="0"/&gt;
 *       &lt;attribute name="ChangeMode" type="{}ChangeMode" default="state" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CAEXBasicObject", propOrder = {
    "description",
    "version",
    "revision",
    "copyright",
    "additionalInformation"
})
@XmlSeeAlso({
    CAEXBasicObject.Revision.class,
    CAEXFile.ExternalReference.class,
    generated.SystemUnitClassType.SupportedRoleClass.class,
    generated.InternalElementType.RoleRequirements.class,
    generated.AttributeType.RefSemantic.class,
    CAEXObject.class,
    AttributeValueRequirementType.class,
    MappingType.AttributeNameMapping.class,
    MappingType.InterfaceNameMapping.class,
    MappingType.class,
    CAEXFile.class
})
public class CAEXBasicObject {

    @XmlElement(name = "Description")
    protected CAEXBasicObject.Description description;
    @XmlElement(name = "Version")
    protected CAEXBasicObject.Version version;
    @XmlElement(name = "Revision")
    protected List<CAEXBasicObject.Revision> revision;
    @XmlElement(name = "Copyright")
    protected CAEXBasicObject.Copyright copyright;
    @XmlElement(name = "AdditionalInformation")
    protected List<Object> additionalInformation;
    @XmlAttribute(name = "ChangeMode")
    protected ChangeMode changeMode;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link CAEXBasicObject.Description }
     *     
     */
    public CAEXBasicObject.Description getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link CAEXBasicObject.Description }
     *     
     */
    public void setDescription(CAEXBasicObject.Description value) {
        this.description = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link CAEXBasicObject.Version }
     *     
     */
    public CAEXBasicObject.Version getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link CAEXBasicObject.Version }
     *     
     */
    public void setVersion(CAEXBasicObject.Version value) {
        this.version = value;
    }

    /**
     * Gets the value of the revision property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the revision property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRevision().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CAEXBasicObject.Revision }
     * 
     * 
     */
    public List<CAEXBasicObject.Revision> getRevision() {
        if (revision == null) {
            revision = new ArrayList<CAEXBasicObject.Revision>();
        }
        return this.revision;
    }

    /**
     * Gets the value of the copyright property.
     * 
     * @return
     *     possible object is
     *     {@link CAEXBasicObject.Copyright }
     *     
     */
    public CAEXBasicObject.Copyright getCopyright() {
        return copyright;
    }

    /**
     * Sets the value of the copyright property.
     * 
     * @param value
     *     allowed object is
     *     {@link CAEXBasicObject.Copyright }
     *     
     */
    public void setCopyright(CAEXBasicObject.Copyright value) {
        this.copyright = value;
    }

    /**
     * Gets the value of the additionalInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the additionalInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAdditionalInformation() {
        if (additionalInformation == null) {
            additionalInformation = new ArrayList<Object>();
        }
        return this.additionalInformation;
    }

    /**
     * Gets the value of the changeMode property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeMode }
     *     
     */
    public ChangeMode getChangeMode() {
        if (changeMode == null) {
            return ChangeMode.STATE;
        } else {
            return changeMode;
        }
    }

    /**
     * Sets the value of the changeMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeMode }
     *     
     */
    public void setChangeMode(ChangeMode value) {
        this.changeMode = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attribute name="ChangeMode" type="{}ChangeMode" default="state" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Copyright {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "ChangeMode")
        protected ChangeMode changeMode;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the changeMode property.
         * 
         * @return
         *     possible object is
         *     {@link ChangeMode }
         *     
         */
        public ChangeMode getChangeMode() {
            if (changeMode == null) {
                return ChangeMode.STATE;
            } else {
                return changeMode;
            }
        }

        /**
         * Sets the value of the changeMode property.
         * 
         * @param value
         *     allowed object is
         *     {@link ChangeMode }
         *     
         */
        public void setChangeMode(ChangeMode value) {
            this.changeMode = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attribute name="ChangeMode" type="{}ChangeMode" default="state" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Description {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "ChangeMode")
        protected ChangeMode changeMode;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the changeMode property.
         * 
         * @return
         *     possible object is
         *     {@link ChangeMode }
         *     
         */
        public ChangeMode getChangeMode() {
            if (changeMode == null) {
                return ChangeMode.STATE;
            } else {
                return changeMode;
            }
        }

        /**
         * Sets the value of the changeMode property.
         * 
         * @param value
         *     allowed object is
         *     {@link ChangeMode }
         *     
         */
        public void setChangeMode(ChangeMode value) {
            this.changeMode = value;
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
     *     &lt;extension base="{}CAEXBasicObject"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="RevisionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
     *         &lt;element name="OldVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="NewVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="AuthorName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "revisionDate",
        "oldVersion",
        "newVersion",
        "authorName",
        "comment"
    })
    public static class Revision
        extends CAEXBasicObject
    {

        @XmlElement(name = "RevisionDate", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar revisionDate;
        @XmlElement(name = "OldVersion")
        protected String oldVersion;
        @XmlElement(name = "NewVersion")
        protected String newVersion;
        @XmlElement(name = "AuthorName", required = true)
        protected String authorName;
        @XmlElement(name = "Comment")
        protected String comment;

        /**
         * Gets the value of the revisionDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getRevisionDate() {
            return revisionDate;
        }

        /**
         * Sets the value of the revisionDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setRevisionDate(XMLGregorianCalendar value) {
            this.revisionDate = value;
        }

        /**
         * Gets the value of the oldVersion property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOldVersion() {
            return oldVersion;
        }

        /**
         * Sets the value of the oldVersion property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOldVersion(String value) {
            this.oldVersion = value;
        }

        /**
         * Gets the value of the newVersion property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNewVersion() {
            return newVersion;
        }

        /**
         * Sets the value of the newVersion property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNewVersion(String value) {
            this.newVersion = value;
        }

        /**
         * Gets the value of the authorName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAuthorName() {
            return authorName;
        }

        /**
         * Sets the value of the authorName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAuthorName(String value) {
            this.authorName = value;
        }

        /**
         * Gets the value of the comment property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getComment() {
            return comment;
        }

        /**
         * Sets the value of the comment property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setComment(String value) {
            this.comment = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attribute name="ChangeMode" type="{}ChangeMode" default="state" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Version {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "ChangeMode")
        protected ChangeMode changeMode;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the changeMode property.
         * 
         * @return
         *     possible object is
         *     {@link ChangeMode }
         *     
         */
        public ChangeMode getChangeMode() {
            if (changeMode == null) {
                return ChangeMode.STATE;
            } else {
                return changeMode;
            }
        }

        /**
         * Sets the value of the changeMode property.
         * 
         * @param value
         *     allowed object is
         *     {@link ChangeMode }
         *     
         */
        public void setChangeMode(ChangeMode value) {
            this.changeMode = value;
        }

    }

}
