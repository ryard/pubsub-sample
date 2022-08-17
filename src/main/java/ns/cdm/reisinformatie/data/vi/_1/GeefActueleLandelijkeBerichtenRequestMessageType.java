
package ns.cdm.reisinformatie.data.vi._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * De vraag voor actuele vertrektijden
 * 
 * <p>Java class for GeefActueleLandelijkeBerichtenRequestMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeefActueleLandelijkeBerichtenRequestMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TaalCodes" type="{urn:ns:cdm:reisinformatie:data:vi:1}TaalCodesType" minOccurs="0"/&gt;
 *         &lt;element name="Aanvrager" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "GeefActueleLandelijkeBerichtenRequestMessageType", propOrder = {
    "taalCodes",
    "aanvrager"
})
public class GeefActueleLandelijkeBerichtenRequestMessageType {

    @XmlElement(name = "TaalCodes")
    protected TaalCodesType taalCodes;
    @XmlElement(name = "Aanvrager", required = true)
    protected String aanvrager;
    @XmlAttribute(name = "TimeStamp", required = true)
    protected XMLGregorianCalendar timeStamp;

    /**
     * Gets the value of the taalCodes property.
     * 
     * @return
     *     possible object is
     *     {@link TaalCodesType }
     *     
     */
    public TaalCodesType getTaalCodes() {
        return taalCodes;
    }

    /**
     * Sets the value of the taalCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaalCodesType }
     *     
     */
    public void setTaalCodes(TaalCodesType value) {
        this.taalCodes = value;
    }

    /**
     * Gets the value of the aanvrager property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAanvrager() {
        return aanvrager;
    }

    /**
     * Sets the value of the aanvrager property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAanvrager(String value) {
        this.aanvrager = value;
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
