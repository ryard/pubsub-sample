
package ns.cdm.reisinformatie.data.vi._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SituatieTijdvakMetPeriodeKalenderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SituatieTijdvakMetPeriodeKalenderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PeriodeKalender" type="{urn:ns:cdm:reisinformatie:data:vi:1}PeriodeKalenderType" minOccurs="0"/&gt;
 *         &lt;element name="SituatieTijdvak" type="{urn:ns:cdm:reisinformatie:data:vi:1}SituatieTijdvakType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SituatieTijdvakMetPeriodeKalenderType", propOrder = {
    "periodeKalender",
    "situatieTijdvak"
})
public class SituatieTijdvakMetPeriodeKalenderType {

    @XmlElement(name = "PeriodeKalender")
    protected PeriodeKalenderType periodeKalender;
    @XmlElement(name = "SituatieTijdvak", required = true)
    protected SituatieTijdvakType situatieTijdvak;

    /**
     * Gets the value of the periodeKalender property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodeKalenderType }
     *     
     */
    public PeriodeKalenderType getPeriodeKalender() {
        return periodeKalender;
    }

    /**
     * Sets the value of the periodeKalender property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodeKalenderType }
     *     
     */
    public void setPeriodeKalender(PeriodeKalenderType value) {
        this.periodeKalender = value;
    }

    /**
     * Gets the value of the situatieTijdvak property.
     * 
     * @return
     *     possible object is
     *     {@link SituatieTijdvakType }
     *     
     */
    public SituatieTijdvakType getSituatieTijdvak() {
        return situatieTijdvak;
    }

    /**
     * Sets the value of the situatieTijdvak property.
     * 
     * @param value
     *     allowed object is
     *     {@link SituatieTijdvakType }
     *     
     */
    public void setSituatieTijdvak(SituatieTijdvakType value) {
        this.situatieTijdvak = value;
    }

}
