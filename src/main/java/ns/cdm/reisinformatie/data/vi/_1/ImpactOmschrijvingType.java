
package ns.cdm.reisinformatie.data.vi._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Geeft de omschrijving van de impact
 * 
 * <p>Java class for ImpactOmschrijvingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImpactOmschrijvingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ImpactOmschrijvingKort" type="{urn:ns:cdm:reisinformatie:data:vi:1}ImpactOmschrijvingKortType"/&gt;
 *         &lt;element name="ImpactOmschrijvingLang" type="{urn:ns:cdm:reisinformatie:data:vi:1}ImpactOmschrijvingLangType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImpactOmschrijvingType", propOrder = {
    "impactOmschrijvingKort",
    "impactOmschrijvingLang"
})
public class ImpactOmschrijvingType {

    @XmlElement(name = "ImpactOmschrijvingKort", required = true)
    protected String impactOmschrijvingKort;
    @XmlElement(name = "ImpactOmschrijvingLang", required = true)
    protected String impactOmschrijvingLang;

    /**
     * Gets the value of the impactOmschrijvingKort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImpactOmschrijvingKort() {
        return impactOmschrijvingKort;
    }

    /**
     * Sets the value of the impactOmschrijvingKort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImpactOmschrijvingKort(String value) {
        this.impactOmschrijvingKort = value;
    }

    /**
     * Gets the value of the impactOmschrijvingLang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImpactOmschrijvingLang() {
        return impactOmschrijvingLang;
    }

    /**
     * Sets the value of the impactOmschrijvingLang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImpactOmschrijvingLang(String value) {
        this.impactOmschrijvingLang = value;
    }

}
