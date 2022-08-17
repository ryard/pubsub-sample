
package ns.cdm.reisinformatie.data.vi._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for GeefActueleLandelijkeBerichtenFaultMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeefActueleLandelijkeBerichtenFaultMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Foutnummer" type="{urn:ns:cdm:reisinformatie:data:vi:1}FoutnummerType"/&gt;
 *         &lt;element name="Omschrijving" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="GeefActueleLandelijkeBerichtenRequestMessage" type="{urn:ns:cdm:reisinformatie:data:vi:1}GeefActueleLandelijkeBerichtenRequestMessageType"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="TimeStamp" use="required" type="{urn:ns:cdm:reisinformatie:data:vi:1}TimeStampType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeefActueleLandelijkeBerichtenFaultMessageType", propOrder = {
    "foutnummer",
    "omschrijving",
    "geefActueleLandelijkeBerichtenRequestMessage"
})
public class GeefActueleLandelijkeBerichtenFaultMessageType {

    @XmlElement(name = "Foutnummer")
    protected int foutnummer;
    @XmlElement(name = "Omschrijving", required = true)
    protected String omschrijving;
    @XmlElement(name = "GeefActueleLandelijkeBerichtenRequestMessage", required = true)
    protected GeefActueleLandelijkeBerichtenRequestMessageType geefActueleLandelijkeBerichtenRequestMessage;
    @XmlAttribute(name = "TimeStamp", required = true)
    protected XMLGregorianCalendar timeStamp;

    /**
     * Gets the value of the foutnummer property.
     * 
     */
    public int getFoutnummer() {
        return foutnummer;
    }

    /**
     * Sets the value of the foutnummer property.
     * 
     */
    public void setFoutnummer(int value) {
        this.foutnummer = value;
    }

    /**
     * Gets the value of the omschrijving property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOmschrijving() {
        return omschrijving;
    }

    /**
     * Sets the value of the omschrijving property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOmschrijving(String value) {
        this.omschrijving = value;
    }

    /**
     * Gets the value of the geefActueleLandelijkeBerichtenRequestMessage property.
     * 
     * @return
     *     possible object is
     *     {@link GeefActueleLandelijkeBerichtenRequestMessageType }
     *     
     */
    public GeefActueleLandelijkeBerichtenRequestMessageType getGeefActueleLandelijkeBerichtenRequestMessage() {
        return geefActueleLandelijkeBerichtenRequestMessage;
    }

    /**
     * Sets the value of the geefActueleLandelijkeBerichtenRequestMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeefActueleLandelijkeBerichtenRequestMessageType }
     *     
     */
    public void setGeefActueleLandelijkeBerichtenRequestMessage(GeefActueleLandelijkeBerichtenRequestMessageType value) {
        this.geefActueleLandelijkeBerichtenRequestMessage = value;
    }

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeStamp(XMLGregorianCalendar value) {
        this.timeStamp = value;
    }

}
