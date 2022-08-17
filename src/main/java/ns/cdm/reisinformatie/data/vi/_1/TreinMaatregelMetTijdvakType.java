
package ns.cdm.reisinformatie.data.vi._1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3c.dom.Element;


/**
 * Geeft de genomen Treinmaatregelen weer.
 * 
 * <p>Java class for TreinMaatregelMetTijdvakType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TreinMaatregelMetTijdvakType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StationGeografie" type="{urn:ns:cdm:reisinformatie:data:vi:1}StationGeografieType" minOccurs="0"/&gt;
 *         &lt;element name="Richting" type="{urn:ns:cdm:reisinformatie:data:vi:1}RichtingType" minOccurs="0"/&gt;
 *         &lt;element name="TreinSoort" type="{urn:ns:cdm:reisinformatie:data:vi:1}TreinSoortType" minOccurs="0"/&gt;
 *         &lt;element name="TreinFormule" type="{urn:ns:cdm:reisinformatie:data:vi:1}TreinFormuleType" minOccurs="0"/&gt;
 *         &lt;element name="TreinSerie" type="{urn:ns:cdm:reisinformatie:data:vi:1}TreinSerieInMaatregelType" minOccurs="0"/&gt;
 *         &lt;element name="MaatregelCode" type="{urn:ns:cdm:reisinformatie:data:vi:1}MaatregelCodeType"/&gt;
 *         &lt;element name="MaatregelOmschrijving" type="{urn:ns:cdm:reisinformatie:data:vi:1}OmschrijvingInTaalType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="StationBijMaatregel" type="{urn:ns:cdm:reisinformatie:data:vi:1}StationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/&gt;
 *         &lt;element name="MaatregelTijdvak" type="{urn:ns:cdm:reisinformatie:data:vi:1}TijdvakType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PresentatieTreinMaatregel" type="{urn:ns:cdm:reisinformatie:data:vi:1}MeertaligeUitingenType" minOccurs="0"/&gt;
 *         &lt;any processContents='skip' namespace='##other' maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TreinMaatregelMetTijdvakType", propOrder = {
    "stationGeografie",
    "richting",
    "treinSoort",
    "treinFormule",
    "treinSerie",
    "maatregelCode",
    "maatregelOmschrijving",
    "stationBijMaatregel",
    "id",
    "maatregelTijdvak",
    "presentatieTreinMaatregel",
    "any"
})
public class TreinMaatregelMetTijdvakType {

    @XmlElement(name = "StationGeografie")
    protected StationGeografieType stationGeografie;
    @XmlElement(name = "Richting")
    @XmlSchemaType(name = "string")
    protected RichtingType richting;
    @XmlElement(name = "TreinSoort")
    protected TreinSoortType treinSoort;
    @XmlElement(name = "TreinFormule")
    protected TreinFormuleType treinFormule;
    @XmlElement(name = "TreinSerie")
    protected TreinSerieInMaatregelType treinSerie;
    @XmlElement(name = "MaatregelCode", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String maatregelCode;
    @XmlElement(name = "MaatregelOmschrijving", required = true)
    protected List<OmschrijvingInTaalType> maatregelOmschrijving;
    @XmlElement(name = "StationBijMaatregel")
    protected List<StationType> stationBijMaatregel;
    @XmlElement(name = "Id", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger id;
    @XmlElement(name = "MaatregelTijdvak")
    protected List<TijdvakType> maatregelTijdvak;
    @XmlElement(name = "PresentatieTreinMaatregel")
    protected MeertaligeUitingenType presentatieTreinMaatregel;
    @XmlAnyElement
    protected List<Element> any;

    /**
     * Gets the value of the stationGeografie property.
     * 
     * @return
     *     possible object is
     *     {@link StationGeografieType }
     *     
     */
    public StationGeografieType getStationGeografie() {
        return stationGeografie;
    }

    /**
     * Sets the value of the stationGeografie property.
     * 
     * @param value
     *     allowed object is
     *     {@link StationGeografieType }
     *     
     */
    public void setStationGeografie(StationGeografieType value) {
        this.stationGeografie = value;
    }

    /**
     * Gets the value of the richting property.
     * 
     * @return
     *     possible object is
     *     {@link RichtingType }
     *     
     */
    public RichtingType getRichting() {
        return richting;
    }

    /**
     * Sets the value of the richting property.
     * 
     * @param value
     *     allowed object is
     *     {@link RichtingType }
     *     
     */
    public void setRichting(RichtingType value) {
        this.richting = value;
    }

    /**
     * Gets the value of the treinSoort property.
     * 
     * @return
     *     possible object is
     *     {@link TreinSoortType }
     *     
     */
    public TreinSoortType getTreinSoort() {
        return treinSoort;
    }

    /**
     * Sets the value of the treinSoort property.
     * 
     * @param value
     *     allowed object is
     *     {@link TreinSoortType }
     *     
     */
    public void setTreinSoort(TreinSoortType value) {
        this.treinSoort = value;
    }

    /**
     * Gets the value of the treinFormule property.
     * 
     * @return
     *     possible object is
     *     {@link TreinFormuleType }
     *     
     */
    public TreinFormuleType getTreinFormule() {
        return treinFormule;
    }

    /**
     * Sets the value of the treinFormule property.
     * 
     * @param value
     *     allowed object is
     *     {@link TreinFormuleType }
     *     
     */
    public void setTreinFormule(TreinFormuleType value) {
        this.treinFormule = value;
    }

    /**
     * Gets the value of the treinSerie property.
     * 
     * @return
     *     possible object is
     *     {@link TreinSerieInMaatregelType }
     *     
     */
    public TreinSerieInMaatregelType getTreinSerie() {
        return treinSerie;
    }

    /**
     * Sets the value of the treinSerie property.
     * 
     * @param value
     *     allowed object is
     *     {@link TreinSerieInMaatregelType }
     *     
     */
    public void setTreinSerie(TreinSerieInMaatregelType value) {
        this.treinSerie = value;
    }

    /**
     * Gets the value of the maatregelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaatregelCode() {
        return maatregelCode;
    }

    /**
     * Sets the value of the maatregelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaatregelCode(String value) {
        this.maatregelCode = value;
    }

    /**
     * Gets the value of the maatregelOmschrijving property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the maatregelOmschrijving property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaatregelOmschrijving().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OmschrijvingInTaalType }
     * 
     * 
     */
    public List<OmschrijvingInTaalType> getMaatregelOmschrijving() {
        if (maatregelOmschrijving == null) {
            maatregelOmschrijving = new ArrayList<OmschrijvingInTaalType>();
        }
        return this.maatregelOmschrijving;
    }

    /**
     * Gets the value of the stationBijMaatregel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stationBijMaatregel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStationBijMaatregel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StationType }
     * 
     * 
     */
    public List<StationType> getStationBijMaatregel() {
        if (stationBijMaatregel == null) {
            stationBijMaatregel = new ArrayList<StationType>();
        }
        return this.stationBijMaatregel;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setId(BigInteger value) {
        this.id = value;
    }

    /**
     * Gets the value of the maatregelTijdvak property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the maatregelTijdvak property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaatregelTijdvak().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TijdvakType }
     * 
     * 
     */
    public List<TijdvakType> getMaatregelTijdvak() {
        if (maatregelTijdvak == null) {
            maatregelTijdvak = new ArrayList<TijdvakType>();
        }
        return this.maatregelTijdvak;
    }

    /**
     * Gets the value of the presentatieTreinMaatregel property.
     * 
     * @return
     *     possible object is
     *     {@link MeertaligeUitingenType }
     *     
     */
    public MeertaligeUitingenType getPresentatieTreinMaatregel() {
        return presentatieTreinMaatregel;
    }

    /**
     * Sets the value of the presentatieTreinMaatregel property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeertaligeUitingenType }
     *     
     */
    public void setPresentatieTreinMaatregel(MeertaligeUitingenType value) {
        this.presentatieTreinMaatregel = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * 
     * 
     */
    public List<Element> getAny() {
        if (any == null) {
            any = new ArrayList<Element>();
        }
        return this.any;
    }

}
