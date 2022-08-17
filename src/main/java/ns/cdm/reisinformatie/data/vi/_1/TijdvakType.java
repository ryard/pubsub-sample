
package ns.cdm.reisinformatie.data.vi._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Bevat tijdvak (lokale tijd) dat eventueel hoort bij een SituatieTijdvak. Bedoeld voor maatregelen bij GV of ET waardoor de afnemer de periodenkalender niet perse hoeft te interpreteren.
 * 			   - de samenhang tussen de tijdvakken van de verstoring en de maatregelen door CRIS wordt vastgelegd.
 * 			De samenhang is ontleend aan overlap van het tijdvak van de afwijking treindienst (infrabeperking) enerzijds met het maatregeltijdvak/omreisadviestijdvak. SituatieTijdvakId refereert aan de Id van het SituatieTijdvak.  Id is een unieke waarde binnen het dossier.
 * 
 * <p>Java class for TijdvakType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TijdvakType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BeginTijd" type="{urn:ns:cdm:reisinformatie:data:vi:1}BeginTijdType"/&gt;
 *         &lt;element name="EindTijd" type="{urn:ns:cdm:reisinformatie:data:vi:1}EindTijdType"/&gt;
 *         &lt;element name="SituatieTijdvakId" type="{urn:ns:cdm:reisinformatie:data:vi:1}SituatieTijdvakIdType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TijdvakType", propOrder = {
    "beginTijd",
    "eindTijd",
    "situatieTijdvakId"
})
public class TijdvakType {

    @XmlElement(name = "BeginTijd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar beginTijd;
    @XmlElement(name = "EindTijd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eindTijd;
    @XmlElement(name = "SituatieTijdvakId")
    protected Long situatieTijdvakId;

    /**
     * Gets the value of the beginTijd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBeginTijd() {
        return beginTijd;
    }

    /**
     * Sets the value of the beginTijd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBeginTijd(XMLGregorianCalendar value) {
        this.beginTijd = value;
    }

    /**
     * Gets the value of the eindTijd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEindTijd() {
        return eindTijd;
    }

    /**
     * Sets the value of the eindTijd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEindTijd(XMLGregorianCalendar value) {
        this.eindTijd = value;
    }

    /**
     * Gets the value of the situatieTijdvakId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSituatieTijdvakId() {
        return situatieTijdvakId;
    }

    /**
     * Sets the value of the situatieTijdvakId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSituatieTijdvakId(Long value) {
        this.situatieTijdvakId = value;
    }

}
