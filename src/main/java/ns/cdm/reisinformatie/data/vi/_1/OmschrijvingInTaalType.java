
package ns.cdm.reisinformatie.data.vi._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Geeft de omschrijving in een bepaalde taal
 * 
 * <p>Java class for OmschrijvingInTaalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OmschrijvingInTaalType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TaalCode" type="{urn:ns:cdm:reisinformatie:data:vi:1}TaalCodeType" minOccurs="0"/&gt;
 *         &lt;element name="Kort" type="{urn:ns:cdm:reisinformatie:data:vi:1}OmschrijvingKortType" minOccurs="0"/&gt;
 *         &lt;element name="Middel" type="{urn:ns:cdm:reisinformatie:data:vi:1}OmschrijvingMiddelType" minOccurs="0"/&gt;
 *         &lt;element name="Lang" type="{urn:ns:cdm:reisinformatie:data:vi:1}OmschrijvingLangType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OmschrijvingInTaalType", propOrder = {
    "taalCode",
    "kort",
    "middel",
    "lang"
})
public class OmschrijvingInTaalType {

    @XmlElement(name = "TaalCode")
    protected String taalCode;
    @XmlElement(name = "Kort")
    protected String kort;
    @XmlElement(name = "Middel")
    protected String middel;
    @XmlElement(name = "Lang")
    protected String lang;

    /**
     * Gets the value of the taalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaalCode() {
        return taalCode;
    }

    /**
     * Sets the value of the taalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaalCode(String value) {
        this.taalCode = value;
    }

    /**
     * Gets the value of the kort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKort() {
        return kort;
    }

    /**
     * Sets the value of the kort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKort(String value) {
        this.kort = value;
    }

    /**
     * Gets the value of the middel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddel() {
        return middel;
    }

    /**
     * Sets the value of the middel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddel(String value) {
        this.middel = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

}
