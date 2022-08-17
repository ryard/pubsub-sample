
package ns.cdm.reisinformatie.data.vi._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * In de kalender wordt voor het eerste tijdvak de dag /  begintijd en dag / eindtijdstip in lokale tijd vastgelegd. Vervolgens wordt in Regel aangegeven wat de frequentie en de einddatum is. Ontbreken van de regel betekent één aaneengesloten tijdvak.
 * 
 * <p>Java class for PeriodeKalenderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PeriodeKalenderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EersteTijdvakBegin" type="{urn:ns:cdm:reisinformatie:data:vi:1}EersteTijdvakBeginType"/&gt;
 *         &lt;element name="EersteTijdvakEind" type="{urn:ns:cdm:reisinformatie:data:vi:1}EersteTijdvakEindType"/&gt;
 *         &lt;element name="Regel" type="{urn:ns:cdm:reisinformatie:data:vi:1}RegelType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PeriodeKalenderType", propOrder = {
    "eersteTijdvakBegin",
    "eersteTijdvakEind",
    "regel"
})
public class PeriodeKalenderType {

    @XmlElement(name = "EersteTijdvakBegin", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eersteTijdvakBegin;
    @XmlElement(name = "EersteTijdvakEind", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eersteTijdvakEind;
    @XmlElement(name = "Regel")
    protected RegelType regel;

    /**
     * Gets the value of the eersteTijdvakBegin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEersteTijdvakBegin() {
        return eersteTijdvakBegin;
    }

    /**
     * Sets the value of the eersteTijdvakBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEersteTijdvakBegin(XMLGregorianCalendar value) {
        this.eersteTijdvakBegin = value;
    }

    /**
     * Gets the value of the eersteTijdvakEind property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEersteTijdvakEind() {
        return eersteTijdvakEind;
    }

    /**
     * Sets the value of the eersteTijdvakEind property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEersteTijdvakEind(XMLGregorianCalendar value) {
        this.eersteTijdvakEind = value;
    }

    /**
     * Gets the value of the regel property.
     * 
     * @return
     *     possible object is
     *     {@link RegelType }
     *     
     */
    public RegelType getRegel() {
        return regel;
    }

    /**
     * Sets the value of the regel property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegelType }
     *     
     */
    public void setRegel(RegelType value) {
        this.regel = value;
    }

}
