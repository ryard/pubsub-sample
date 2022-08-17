
package ns.cdm.reisinformatie.data.vi._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * Geeft een samengevoegd omreisadvies weer.
 * 
 * <p>Java class for LABOmreisAdviesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LABOmreisAdviesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StationVanaf" type="{urn:ns:cdm:reisinformatie:data:vi:1}StationType"/&gt;
 *         &lt;element name="BestemmingStation" type="{urn:ns:cdm:reisinformatie:data:vi:1}StationType" maxOccurs="2"/&gt;
 *         &lt;element name="Richting" type="{urn:ns:cdm:reisinformatie:data:vi:1}RichtingType"/&gt;
 *         &lt;element name="Advies" type="{urn:ns:cdm:reisinformatie:data:vi:1}OmreisAdviesType"/&gt;
 *         &lt;element name="OmreisExtraReistijd" type="{urn:ns:cdm:reisinformatie:data:vi:1}OmreisExtraReistijdType"/&gt;
 *         &lt;element name="PresentatieOmreisAdvies" type="{urn:ns:cdm:reisinformatie:data:vi:1}MeertaligeUitingenType" minOccurs="0"/&gt;
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
@XmlType(name = "LABOmreisAdviesType", propOrder = {
    "stationVanaf",
    "bestemmingStation",
    "richting",
    "advies",
    "omreisExtraReistijd",
    "presentatieOmreisAdvies",
    "any"
})
public class LABOmreisAdviesType {

    @XmlElement(name = "StationVanaf", required = true)
    protected StationType stationVanaf;
    @XmlElement(name = "BestemmingStation", required = true)
    protected List<StationType> bestemmingStation;
    @XmlElement(name = "Richting", required = true)
    @XmlSchemaType(name = "string")
    protected RichtingType richting;
    @XmlElement(name = "Advies", required = true)
    protected OmreisAdviesType advies;
    @XmlElement(name = "OmreisExtraReistijd", required = true)
    protected OmreisExtraReistijdType omreisExtraReistijd;
    @XmlElement(name = "PresentatieOmreisAdvies")
    protected MeertaligeUitingenType presentatieOmreisAdvies;
    @XmlAnyElement
    protected List<Element> any;

    /**
     * Gets the value of the stationVanaf property.
     * 
     * @return
     *     possible object is
     *     {@link StationType }
     *     
     */
    public StationType getStationVanaf() {
        return stationVanaf;
    }

    /**
     * Sets the value of the stationVanaf property.
     * 
     * @param value
     *     allowed object is
     *     {@link StationType }
     *     
     */
    public void setStationVanaf(StationType value) {
        this.stationVanaf = value;
    }

    /**
     * Gets the value of the bestemmingStation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bestemmingStation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBestemmingStation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StationType }
     * 
     * 
     */
    public List<StationType> getBestemmingStation() {
        if (bestemmingStation == null) {
            bestemmingStation = new ArrayList<StationType>();
        }
        return this.bestemmingStation;
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
     * Gets the value of the advies property.
     * 
     * @return
     *     possible object is
     *     {@link OmreisAdviesType }
     *     
     */
    public OmreisAdviesType getAdvies() {
        return advies;
    }

    /**
     * Sets the value of the advies property.
     * 
     * @param value
     *     allowed object is
     *     {@link OmreisAdviesType }
     *     
     */
    public void setAdvies(OmreisAdviesType value) {
        this.advies = value;
    }

    /**
     * Gets the value of the omreisExtraReistijd property.
     * 
     * @return
     *     possible object is
     *     {@link OmreisExtraReistijdType }
     *     
     */
    public OmreisExtraReistijdType getOmreisExtraReistijd() {
        return omreisExtraReistijd;
    }

    /**
     * Sets the value of the omreisExtraReistijd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OmreisExtraReistijdType }
     *     
     */
    public void setOmreisExtraReistijd(OmreisExtraReistijdType value) {
        this.omreisExtraReistijd = value;
    }

    /**
     * Gets the value of the presentatieOmreisAdvies property.
     * 
     * @return
     *     possible object is
     *     {@link MeertaligeUitingenType }
     *     
     */
    public MeertaligeUitingenType getPresentatieOmreisAdvies() {
        return presentatieOmreisAdvies;
    }

    /**
     * Sets the value of the presentatieOmreisAdvies property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeertaligeUitingenType }
     *     
     */
    public void setPresentatieOmreisAdvies(MeertaligeUitingenType value) {
        this.presentatieOmreisAdvies = value;
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
