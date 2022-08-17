
package ns.cdm.reisinformatie.data.vi._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Dit element bevat een actueel overzicht van alle landelijke berichten.
 * 
 * <p>Java class for GeefActueleLandelijkeBerichtenResponseMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeefActueleLandelijkeBerichtenResponseMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BerichtStatus" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="GeefActueleLandelijkeBerichtenRequestMessage" type="{urn:ns:cdm:reisinformatie:data:vi:1}GeefActueleLandelijkeBerichtenRequestMessageType"/&gt;
 *         &lt;element name="ActueleLandelijkeBerichten" type="{urn:ns:cdm:reisinformatie:data:vi:1}ActueleLandelijkeBerichtenType" minOccurs="0"/&gt;
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
@XmlType(name = "GeefActueleLandelijkeBerichtenResponseMessageType", propOrder = {
    "berichtStatus",
    "geefActueleLandelijkeBerichtenRequestMessage",
    "actueleLandelijkeBerichten"
})
public class GeefActueleLandelijkeBerichtenResponseMessageType {

    @XmlElement(name = "BerichtStatus")
    protected int berichtStatus;
    @XmlElement(name = "GeefActueleLandelijkeBerichtenRequestMessage", required = true)
    protected GeefActueleLandelijkeBerichtenRequestMessageType geefActueleLandelijkeBerichtenRequestMessage;
    @XmlElement(name = "ActueleLandelijkeBerichten")
    protected ActueleLandelijkeBerichtenType actueleLandelijkeBerichten;
    @XmlAttribute(name = "TimeStamp", required = true)
    protected XMLGregorianCalendar timeStamp;

    /**
     * Gets the value of the berichtStatus property.
     * 
     */
    public int getBerichtStatus() {
        return berichtStatus;
    }

    /**
     * Sets the value of the berichtStatus property.
     * 
     */
    public void setBerichtStatus(int value) {
        this.berichtStatus = value;
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
     * Gets the value of the actueleLandelijkeBerichten property.
     * 
     * @return
     *     possible object is
     *     {@link ActueleLandelijkeBerichtenType }
     *     
     */
    public ActueleLandelijkeBerichtenType getActueleLandelijkeBerichten() {
        return actueleLandelijkeBerichten;
    }

    /**
     * Sets the value of the actueleLandelijkeBerichten property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActueleLandelijkeBerichtenType }
     *     
     */
    public void setActueleLandelijkeBerichten(ActueleLandelijkeBerichtenType value) {
        this.actueleLandelijkeBerichten = value;
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
