
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
import javax.xml.datatype.XMLGregorianCalendar;
import org.w3c.dom.Element;


/**
 * Geeft de prognose weer. Alleen bij EV.
 * 				De Omschrijving is gebaseerd op SituatieDuidelijk en TreindienstNormaalCode, via de stamtabel TreindienstNormaalPrognose.
 * 			Het tijdstip waarop naar verwachting de treindienst weer normaal zal zijn.
 * 			Bij "onbekend" zijn 0 waarden aanwezig.
 * 
 * 			Bij "voorlopig" is één waarde aanwezig, nl. PrognoseVanTijd.
 * 			Bij "vanaf" is één waarde aanwezig, nl. PrognoseVanTijd.
 * 			Bij "tussen" zijn twee waarden aanwezig, de eerste kleiner dan de tweede.
 * 
 * <p>Java class for PrognoseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrognoseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SituatieDuidelijk" type="{urn:ns:cdm:reisinformatie:data:vi:1}IndicatieType"/&gt;
 *         &lt;element name="TreindienstNormaalCode" type="{urn:ns:cdm:reisinformatie:data:vi:1}TreindienstNormaalCodeType"/&gt;
 *         &lt;element name="Omschrijving" type="{urn:ns:cdm:reisinformatie:data:vi:1}OmschrijvingInTaalType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="PrognoseVanTijd" type="{urn:ns:cdm:reisinformatie:data:vi:1}PrognoseTijdType" minOccurs="0"/&gt;
 *         &lt;element name="PrognoseTotTijd" type="{urn:ns:cdm:reisinformatie:data:vi:1}PrognoseTijdType" minOccurs="0"/&gt;
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
@XmlType(name = "PrognoseType", propOrder = {
    "situatieDuidelijk",
    "treindienstNormaalCode",
    "omschrijving",
    "prognoseVanTijd",
    "prognoseTotTijd",
    "any"
})
public class PrognoseType {

    @XmlElement(name = "SituatieDuidelijk", required = true)
    @XmlSchemaType(name = "string")
    protected IndicatieType situatieDuidelijk;
    @XmlElement(name = "TreindienstNormaalCode", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String treindienstNormaalCode;
    @XmlElement(name = "Omschrijving", required = true)
    protected List<OmschrijvingInTaalType> omschrijving;
    @XmlElement(name = "PrognoseVanTijd")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar prognoseVanTijd;
    @XmlElement(name = "PrognoseTotTijd")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar prognoseTotTijd;
    @XmlAnyElement
    protected List<Element> any;

    /**
     * Gets the value of the situatieDuidelijk property.
     * 
     * @return
     *     possible object is
     *     {@link IndicatieType }
     *     
     */
    public IndicatieType getSituatieDuidelijk() {
        return situatieDuidelijk;
    }

    /**
     * Sets the value of the situatieDuidelijk property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicatieType }
     *     
     */
    public void setSituatieDuidelijk(IndicatieType value) {
        this.situatieDuidelijk = value;
    }

    /**
     * Gets the value of the treindienstNormaalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTreindienstNormaalCode() {
        return treindienstNormaalCode;
    }

    /**
     * Sets the value of the treindienstNormaalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTreindienstNormaalCode(String value) {
        this.treindienstNormaalCode = value;
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

    /**
     * Gets the value of the prognoseVanTijd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPrognoseVanTijd() {
        return prognoseVanTijd;
    }

    /**
     * Sets the value of the prognoseVanTijd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPrognoseVanTijd(XMLGregorianCalendar value) {
        this.prognoseVanTijd = value;
    }

    /**
     * Gets the value of the prognoseTotTijd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPrognoseTotTijd() {
        return prognoseTotTijd;
    }

    /**
     * Sets the value of the prognoseTotTijd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPrognoseTotTijd(XMLGregorianCalendar value) {
        this.prognoseTotTijd = value;
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
