
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
 * Hoeveel extra reistijd het omreisadvies oplevert.
 * 			Bij "onbekend" zijn 0 waarden aanwezig.
 * 			Bij "gelijk aan"zijn 2 identieke waarden aanwezig.
 * 			Bij "groter dan" is één waarde aanwezig, nl. ExtraTijdVanIncl.
 * 			Bij "kleiner dan" is één waarde aanwezig, nl. ExtraTokdTotIncl.
 * 			Bij "tussen" zijn twee waarden aanwezig, de eerste kleiner dan de tweede.
 * 			
 * 
 * <p>Java class for OmreisExtraReistijdType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OmreisExtraReistijdType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="KeuzeCode" type="{urn:ns:cdm:reisinformatie:data:vi:1}VertragingsKeuzeCodeType"/&gt;
 *         &lt;element name="Omschrijving" type="{urn:ns:cdm:reisinformatie:data:vi:1}OmschrijvingInTaalType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="ExtraTijdVanIncl" type="{urn:ns:cdm:reisinformatie:data:vi:1}VertragingsWaardeType" minOccurs="0"/&gt;
 *         &lt;element name="ExtraTijdTotIncl" type="{urn:ns:cdm:reisinformatie:data:vi:1}VertragingsWaardeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OmreisExtraReistijdType", propOrder = {
    "keuzeCode",
    "omschrijving",
    "extraTijdVanIncl",
    "extraTijdTotIncl"
})
public class OmreisExtraReistijdType {

    @XmlElement(name = "KeuzeCode", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String keuzeCode;
    @XmlElement(name = "Omschrijving", required = true)
    protected List<OmschrijvingInTaalType> omschrijving;
    @XmlElement(name = "ExtraTijdVanIncl")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected Integer extraTijdVanIncl;
    @XmlElement(name = "ExtraTijdTotIncl")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected Integer extraTijdTotIncl;

    /**
     * Gets the value of the keuzeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeuzeCode() {
        return keuzeCode;
    }

    /**
     * Sets the value of the keuzeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeuzeCode(String value) {
        this.keuzeCode = value;
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
     * Gets the value of the extraTijdVanIncl property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExtraTijdVanIncl() {
        return extraTijdVanIncl;
    }

    /**
     * Sets the value of the extraTijdVanIncl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExtraTijdVanIncl(Integer value) {
        this.extraTijdVanIncl = value;
    }

    /**
     * Gets the value of the extraTijdTotIncl property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExtraTijdTotIncl() {
        return extraTijdTotIncl;
    }

    /**
     * Sets the value of the extraTijdTotIncl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExtraTijdTotIncl(Integer value) {
        this.extraTijdTotIncl = value;
    }

}
