
package ns.cdm.reisinformatie.data.vi._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Geeft de uitingen weer in een bepaalde taal
 * 
 * <p>Java class for UitingenType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UitingenType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Uiting" type="{urn:ns:cdm:reisinformatie:data:vi:1}UitingType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Taal" type="{urn:ns:cdm:reisinformatie:data:vi:1}TaalCodeEnumType" /&gt;
 *       &lt;attribute name="PresentatieType" type="{urn:ns:cdm:reisinformatie:data:vi:1}PresentatieTypeType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UitingenType", propOrder = {
    "uiting"
})
public class UitingenType {

    @XmlElement(name = "Uiting", required = true)
    protected List<UitingType> uiting;
    @XmlAttribute(name = "Taal")
    protected ISO6391LanguageCodeContentType taal;
    @XmlAttribute(name = "PresentatieType")
    protected PresentatieTypeType presentatieType;

    /**
     * Gets the value of the uiting property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uiting property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUiting().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UitingType }
     * 
     * 
     */
    public List<UitingType> getUiting() {
        if (uiting == null) {
            uiting = new ArrayList<UitingType>();
        }
        return this.uiting;
    }

    /**
     * Gets the value of the taal property.
     * 
     * @return
     *     possible object is
     *     {@link ISO6391LanguageCodeContentType }
     *     
     */
    public ISO6391LanguageCodeContentType getTaal() {
        return taal;
    }

    /**
     * Sets the value of the taal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ISO6391LanguageCodeContentType }
     *     
     */
    public void setTaal(ISO6391LanguageCodeContentType value) {
        this.taal = value;
    }

    /**
     * Gets the value of the presentatieType property.
     * 
     * @return
     *     possible object is
     *     {@link PresentatieTypeType }
     *     
     */
    public PresentatieTypeType getPresentatieType() {
        return presentatieType;
    }

    /**
     * Sets the value of the presentatieType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PresentatieTypeType }
     *     
     */
    public void setPresentatieType(PresentatieTypeType value) {
        this.presentatieType = value;
    }

}
