
package ns.cdm.reisinformatie.data.vi._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Geeft een samengevoegd omreisadvies weer voor een EV of één tijdvak van een GV/ET.
 * 
 * <p>Java class for OAPerTijdvakType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OAPerTijdvakType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Tijdvak" type="{urn:ns:cdm:reisinformatie:data:vi:1}TijdvakType" minOccurs="0"/&gt;
 *         &lt;element name="OmreisAdvies" type="{urn:ns:cdm:reisinformatie:data:vi:1}LABOmreisAdviesType" maxOccurs="5"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OAPerTijdvakType", propOrder = {
    "tijdvak",
    "omreisAdvies"
})
public class OAPerTijdvakType {

    @XmlElement(name = "Tijdvak")
    protected TijdvakType tijdvak;
    @XmlElement(name = "OmreisAdvies", required = true)
    protected List<LABOmreisAdviesType> omreisAdvies;

    /**
     * Gets the value of the tijdvak property.
     * 
     * @return
     *     possible object is
     *     {@link TijdvakType }
     *     
     */
    public TijdvakType getTijdvak() {
        return tijdvak;
    }

    /**
     * Sets the value of the tijdvak property.
     * 
     * @param value
     *     allowed object is
     *     {@link TijdvakType }
     *     
     */
    public void setTijdvak(TijdvakType value) {
        this.tijdvak = value;
    }

    /**
     * Gets the value of the omreisAdvies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the omreisAdvies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOmreisAdvies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LABOmreisAdviesType }
     * 
     * 
     */
    public List<LABOmreisAdviesType> getOmreisAdvies() {
        if (omreisAdvies == null) {
            omreisAdvies = new ArrayList<LABOmreisAdviesType>();
        }
        return this.omreisAdvies;
    }

}
