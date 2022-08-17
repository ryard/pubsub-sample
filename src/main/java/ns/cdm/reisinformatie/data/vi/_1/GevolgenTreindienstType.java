
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
 * Geeft de gevolgen voor de treindienst, dus bijv minder treinen, geen intercity's e.d.
 * 
 * <p>Java class for GevolgenTreindienstType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GevolgenTreindienstType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GevolgenTreindienstCode" type="{urn:ns:cdm:reisinformatie:data:vi:1}GevolgenTreindienstCodeType"/&gt;
 *         &lt;element name="Niveau" type="{urn:ns:cdm:reisinformatie:data:vi:1}GevolgenTreindienstNiveauType"/&gt;
 *         &lt;element name="Omschrijving" type="{urn:ns:cdm:reisinformatie:data:vi:1}OmschrijvingInTaalType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GevolgenTreindienstType", propOrder = {
    "gevolgenTreindienstCode",
    "niveau",
    "omschrijving"
})
public class GevolgenTreindienstType {

    @XmlElement(name = "GevolgenTreindienstCode", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String gevolgenTreindienstCode;
    @XmlElement(name = "Niveau", required = true)
    @XmlSchemaType(name = "normalizedString")
    protected GevolgenTreindienstNiveauType niveau;
    @XmlElement(name = "Omschrijving", required = true)
    protected List<OmschrijvingInTaalType> omschrijving;

    /**
     * Gets the value of the gevolgenTreindienstCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGevolgenTreindienstCode() {
        return gevolgenTreindienstCode;
    }

    /**
     * Sets the value of the gevolgenTreindienstCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGevolgenTreindienstCode(String value) {
        this.gevolgenTreindienstCode = value;
    }

    /**
     * Gets the value of the niveau property.
     * 
     * @return
     *     possible object is
     *     {@link GevolgenTreindienstNiveauType }
     *     
     */
    public GevolgenTreindienstNiveauType getNiveau() {
        return niveau;
    }

    /**
     * Sets the value of the niveau property.
     * 
     * @param value
     *     allowed object is
     *     {@link GevolgenTreindienstNiveauType }
     *     
     */
    public void setNiveau(GevolgenTreindienstNiveauType value) {
        this.niveau = value;
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

}
