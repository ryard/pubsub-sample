
package ns.cdm.reisinformatie.data.vi._1;

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
 * De gegevens van een stop van Treinvervangend vervoer.
 * 
 * <p>Java class for AVVStopType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AVVStopType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Stop" type="{urn:ns:cdm:reisinformatie:data:vi:1}StationType"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;choice&gt;
 *             &lt;element name="StopPlaatsCode" type="{urn:ns:cdm:reisinformatie:data:vi:1}AVVStopPlaatsCodeType"/&gt;
 *             &lt;element name="StandaardStopPlaatsCode" type="{urn:ns:cdm:reisinformatie:data:vi:1}AVVStopPlaatsCodeType"/&gt;
 *           &lt;/choice&gt;
 *           &lt;element name="StopPlaatsOmschrijving" type="{urn:ns:cdm:reisinformatie:data:vi:1}OmschrijvingInTaalType" maxOccurs="unbounded"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element name="PresentatieAVVStop" type="{urn:ns:cdm:reisinformatie:data:vi:1}MeertaligeUitingenType" minOccurs="0"/&gt;
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
@XmlType(name = "AVVStopType", propOrder = {
    "stop",
    "stopPlaatsCode",
    "standaardStopPlaatsCode",
    "stopPlaatsOmschrijving",
    "presentatieAVVStop",
    "any"
})
public class AVVStopType {

    @XmlElement(name = "Stop", required = true)
    protected StationType stop;
    @XmlElement(name = "StopPlaatsCode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String stopPlaatsCode;
    @XmlElement(name = "StandaardStopPlaatsCode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String standaardStopPlaatsCode;
    @XmlElement(name = "StopPlaatsOmschrijving")
    protected List<OmschrijvingInTaalType> stopPlaatsOmschrijving;
    @XmlElement(name = "PresentatieAVVStop")
    protected MeertaligeUitingenType presentatieAVVStop;
    @XmlAnyElement
    protected List<Element> any;

    /**
     * Gets the value of the stop property.
     * 
     * @return
     *     possible object is
     *     {@link StationType }
     *     
     */
    public StationType getStop() {
        return stop;
    }

    /**
     * Sets the value of the stop property.
     * 
     * @param value
     *     allowed object is
     *     {@link StationType }
     *     
     */
    public void setStop(StationType value) {
        this.stop = value;
    }

    /**
     * Gets the value of the stopPlaatsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStopPlaatsCode() {
        return stopPlaatsCode;
    }

    /**
     * Sets the value of the stopPlaatsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStopPlaatsCode(String value) {
        this.stopPlaatsCode = value;
    }

    /**
     * Gets the value of the standaardStopPlaatsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandaardStopPlaatsCode() {
        return standaardStopPlaatsCode;
    }

    /**
     * Sets the value of the standaardStopPlaatsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandaardStopPlaatsCode(String value) {
        this.standaardStopPlaatsCode = value;
    }

    /**
     * Gets the value of the stopPlaatsOmschrijving property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stopPlaatsOmschrijving property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStopPlaatsOmschrijving().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OmschrijvingInTaalType }
     * 
     * 
     */
    public List<OmschrijvingInTaalType> getStopPlaatsOmschrijving() {
        if (stopPlaatsOmschrijving == null) {
            stopPlaatsOmschrijving = new ArrayList<OmschrijvingInTaalType>();
        }
        return this.stopPlaatsOmschrijving;
    }

    /**
     * Gets the value of the presentatieAVVStop property.
     * 
     * @return
     *     possible object is
     *     {@link MeertaligeUitingenType }
     *     
     */
    public MeertaligeUitingenType getPresentatieAVVStop() {
        return presentatieAVVStop;
    }

    /**
     * Sets the value of the presentatieAVVStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeertaligeUitingenType }
     *     
     */
    public void setPresentatieAVVStop(MeertaligeUitingenType value) {
        this.presentatieAVVStop = value;
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
