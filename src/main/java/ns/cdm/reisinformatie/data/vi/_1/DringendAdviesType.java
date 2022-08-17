
package ns.cdm.reisinformatie.data.vi._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Geeft dringend advies
 * 
 * <p>Java class for DringendAdviesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DringendAdviesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DringendAdviesKort" type="{urn:ns:cdm:reisinformatie:data:vi:1}DringendAdviesKortType"/&gt;
 *         &lt;element name="DringendAdviesLang" type="{urn:ns:cdm:reisinformatie:data:vi:1}DringendAdviesLangType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DringendAdviesType", propOrder = {
    "dringendAdviesKort",
    "dringendAdviesLang"
})
public class DringendAdviesType {

    @XmlElement(name = "DringendAdviesKort", required = true)
    protected String dringendAdviesKort;
    @XmlElement(name = "DringendAdviesLang", required = true)
    protected String dringendAdviesLang;

    /**
     * Gets the value of the dringendAdviesKort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDringendAdviesKort() {
        return dringendAdviesKort;
    }

    /**
     * Sets the value of the dringendAdviesKort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDringendAdviesKort(String value) {
        this.dringendAdviesKort = value;
    }

    /**
     * Gets the value of the dringendAdviesLang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDringendAdviesLang() {
        return dringendAdviesLang;
    }

    /**
     * Sets the value of the dringendAdviesLang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDringendAdviesLang(String value) {
        this.dringendAdviesLang = value;
    }

}
