
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
 * De mate waarin de reiziger vertraging oploopt.
 * 			Bij "onbekend" zijn 0 waarden aanwezig.
 * 			Bij "gelijk aan"zijn 2 identieke waarden aanwezig.
 * 			Bij "groter dan" is één waarde aanwezig, nl. VertragingVanIncl.
 * 			Bij "kleiner dan" is één waarde aanwezig, nl. VertragingTotIncl.
 * 			Bij "tussen" zijn twee waarden aanwezig, de eerste kleiner dan de tweede.
 * 			
 * 
 * <p>Java class for MateVertragingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MateVertragingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VertragingsKeuzeCode" type="{urn:ns:cdm:reisinformatie:data:vi:1}VertragingsKeuzeCodeType"/&gt;
 *         &lt;element name="Omschrijving" type="{urn:ns:cdm:reisinformatie:data:vi:1}OmschrijvingInTaalType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="VertragingVanIncl" type="{urn:ns:cdm:reisinformatie:data:vi:1}VertragingsWaardeType" minOccurs="0"/&gt;
 *         &lt;element name="VertragingTotIncl" type="{urn:ns:cdm:reisinformatie:data:vi:1}VertragingsWaardeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MateVertragingType", propOrder = {
    "vertragingsKeuzeCode",
    "omschrijving",
    "vertragingVanIncl",
    "vertragingTotIncl"
})
public class MateVertragingType {

    @XmlElement(name = "VertragingsKeuzeCode", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String vertragingsKeuzeCode;
    @XmlElement(name = "Omschrijving", required = true)
    protected List<OmschrijvingInTaalType> omschrijving;
    @XmlElement(name = "VertragingVanIncl")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected Integer vertragingVanIncl;
    @XmlElement(name = "VertragingTotIncl")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected Integer vertragingTotIncl;

    /**
     * Gets the value of the vertragingsKeuzeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVertragingsKeuzeCode() {
        return vertragingsKeuzeCode;
    }

    /**
     * Sets the value of the vertragingsKeuzeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVertragingsKeuzeCode(String value) {
        this.vertragingsKeuzeCode = value;
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
     * Gets the value of the vertragingVanIncl property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVertragingVanIncl() {
        return vertragingVanIncl;
    }

    /**
     * Sets the value of the vertragingVanIncl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVertragingVanIncl(Integer value) {
        this.vertragingVanIncl = value;
    }

    /**
     * Gets the value of the vertragingTotIncl property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVertragingTotIncl() {
        return vertragingTotIncl;
    }

    /**
     * Sets the value of the vertragingTotIncl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVertragingTotIncl(Integer value) {
        this.vertragingTotIncl = value;
    }

}
