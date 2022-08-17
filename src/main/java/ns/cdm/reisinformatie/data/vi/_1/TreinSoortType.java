
package ns.cdm.reisinformatie.data.vi._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Geeft de commerciële benaming van de soort trein aan. De maxLength van InstapTipTreinSoort kan niet door de XSD worden afgedwongen, omdat een beperking op een element dat tevens een attribuut heeft niet toegestaan is bij de constructie van een XSD. De stamtabel TreinSoort bevat de toegestane waarden.
 * 
 * <p>Java class for TreinSoortType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TreinSoortType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Code" type="{urn:ns:cdm:reisinformatie:data:vi:1}TreinSoortCodeType"/&gt;
 *         &lt;element name="Omschrijving" type="{urn:ns:cdm:reisinformatie:data:vi:1}TreinSoortOmschrijvingType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TreinSoortType", propOrder = {
    "code",
    "omschrijving"
})
public class TreinSoortType {

    @XmlElement(name = "Code", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String code;
    @XmlElement(name = "Omschrijving", required = true)
    protected String omschrijving;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
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

}
