
package ns.cdm.reisinformatie.data.vi._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Is gevuld als een groot gebied getroffen is.
 * Voorbeelden: noordoost nederland, regio .., provincie .., kustprovincies. 
 * 
 * <p>Java class for GeografischeAanduidingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeografischeAanduidingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GeografischeAanduidingCode" type="{urn:ns:cdm:reisinformatie:data:vi:1}GeoCodeType"/&gt;
 *         &lt;element name="Stations" type="{urn:ns:cdm:reisinformatie:data:vi:1}StationsGeografischeAanduidingType" minOccurs="0"/&gt;
 *         &lt;element name="Omschrijving" type="{urn:ns:cdm:reisinformatie:data:vi:1}OmschrijvingInTaalType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeografischeAanduidingType", propOrder = {
    "geografischeAanduidingCode",
    "stations",
    "omschrijving"
})
public class GeografischeAanduidingType {

    @XmlElement(name = "GeografischeAanduidingCode", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String geografischeAanduidingCode;
    @XmlElement(name = "Stations")
    protected StationsGeografischeAanduidingType stations;
    @XmlElement(name = "Omschrijving", required = true)
    protected List<OmschrijvingInTaalType> omschrijving;

    /**
     * Gets the value of the geografischeAanduidingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeografischeAanduidingCode() {
        return geografischeAanduidingCode;
    }

    /**
     * Sets the value of the geografischeAanduidingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeografischeAanduidingCode(String value) {
        this.geografischeAanduidingCode = value;
    }

    /**
     * Gets the value of the stations property.
     * 
     * @return
     *     possible object is
     *     {@link StationsGeografischeAanduidingType }
     *     
     */
    public StationsGeografischeAanduidingType getStations() {
        return stations;
    }

    /**
     * Sets the value of the stations property.
     * 
     * @param value
     *     allowed object is
     *     {@link StationsGeografischeAanduidingType }
     *     
     */
    public void setStations(StationsGeografischeAanduidingType value) {
        this.stations = value;
    }

    /**
     * Gets the value of the omschrijving property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the omschrijving property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOmschrijving().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OmschrijvingInTaalType }
     * 
     * 
     */
    public List<OmschrijvingInTaalType> getOmschrijving() {
        if (omschrijving == null) {
            omschrijving = new ArrayList<OmschrijvingInTaalType>();
        }
        return this.omschrijving;
    }

}
