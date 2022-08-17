
package ns.cdm.reisinformatie.data.vi._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Geeft de priode waarvoor GV geldig is inclusief aanvullend advies
 * 
 * <p>Java class for PeriodeKalenderMetAanvullendAdvies complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PeriodeKalenderMetAanvullendAdvies"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PeriodeKalender" type="{urn:ns:cdm:reisinformatie:data:vi:1}PeriodeKalenderType"/&gt;
 *         &lt;element name="SituatieTijdvak" type="{urn:ns:cdm:reisinformatie:data:vi:1}SituatieTijdvakType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="AanvullendAdvies" type="{urn:ns:cdm:reisinformatie:data:vi:1}AanVullendAdviesType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PeriodeKalenderMetAanvullendAdvies", propOrder = {
    "periodeKalender",
    "situatieTijdvak",
    "aanvullendAdvies"
})
public class PeriodeKalenderMetAanvullendAdvies {

    @XmlElement(name = "PeriodeKalender", required = true)
    protected PeriodeKalenderType periodeKalender;
    @XmlElement(name = "SituatieTijdvak", required = true)
    protected List<SituatieTijdvakType> situatieTijdvak;
    @XmlElement(name = "AanvullendAdvies")
    protected AanVullendAdviesType aanvullendAdvies;

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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the situatieTijdvak property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSituatieTijdvak().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SituatieTijdvakType }
     * 
     * 
     */
    public List<SituatieTijdvakType> getSituatieTijdvak() {
        if (situatieTijdvak == null) {
            situatieTijdvak = new ArrayList<SituatieTijdvakType>();
        }
        return this.situatieTijdvak;
    }

    /**
     * Gets the value of the aanvullendAdvies property.
     * 
     * @return
     *     possible object is
     *     {@link AanVullendAdviesType }
     *     
     */
    public AanVullendAdviesType getAanvullendAdvies() {
        return aanvullendAdvies;
    }

    /**
     * Sets the value of the aanvullendAdvies property.
     * 
     * @param value
     *     allowed object is
     *     {@link AanVullendAdviesType }
     *     
     */
    public void setAanvullendAdvies(AanVullendAdviesType value) {
        this.aanvullendAdvies = value;
    }

}
