
package ns.cdm.reisinformatie.data.vi._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Geeft aanvullend advies bij EV
 * 
 * <p>Java class for AanVullendAdviesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AanVullendAdviesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AanvullendAdviesMiddel" type="{urn:ns:cdm:reisinformatie:data:vi:1}AanvullendAdviesMiddelType"/&gt;
 *         &lt;element name="AanvullendAdviesLang" type="{urn:ns:cdm:reisinformatie:data:vi:1}AanvullendAdviesLangType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AanVullendAdviesType", propOrder = {
    "aanvullendAdviesMiddel",
    "aanvullendAdviesLang"
})
public class AanVullendAdviesType {

    @XmlElement(name = "AanvullendAdviesMiddel", required = true)
    protected String aanvullendAdviesMiddel;
    @XmlElement(name = "AanvullendAdviesLang", required = true)
    protected String aanvullendAdviesLang;

    /**
     * Gets the value of the aanvullendAdviesMiddel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAanvullendAdviesMiddel() {
        return aanvullendAdviesMiddel;
    }

    /**
     * Sets the value of the aanvullendAdviesMiddel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAanvullendAdviesMiddel(String value) {
        this.aanvullendAdviesMiddel = value;
    }

    /**
     * Gets the value of the aanvullendAdviesLang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAanvullendAdviesLang() {
        return aanvullendAdviesLang;
    }

    /**
     * Sets the value of the aanvullendAdviesLang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAanvullendAdviesLang(String value) {
        this.aanvullendAdviesLang = value;
    }

}
