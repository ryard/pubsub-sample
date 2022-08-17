
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
import org.w3c.dom.Element;


/**
 * Geeft de samenvatting van de getroffen AVV maatregelen ongeacht het traject, voor één tijdvak.
 * 
 * <p>Java class for SamenvattingAVVMaatregelenType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SamenvattingAVVMaatregelenType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MaatregelTijdvak" type="{urn:ns:cdm:reisinformatie:data:vi:1}TijdvakType" minOccurs="0"/&gt;
 *         &lt;element name="AVVCode" type="{urn:ns:cdm:reisinformatie:data:vi:1}AVVCodeType"/&gt;
 *         &lt;element name="AVVOmschrijving" type="{urn:ns:cdm:reisinformatie:data:vi:1}OmschrijvingInTaalType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="PresentatieSamenvattingAVVDossier" type="{urn:ns:cdm:reisinformatie:data:vi:1}MeertaligeUitingenType" minOccurs="0"/&gt;
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
@XmlType(name = "SamenvattingAVVMaatregelenType", propOrder = {
    "maatregelTijdvak",
    "avvCode",
    "avvOmschrijving",
    "presentatieSamenvattingAVVDossier",
    "any"
})
public class SamenvattingAVVMaatregelenType {

    @XmlElement(name = "MaatregelTijdvak")
    protected TijdvakType maatregelTijdvak;
    @XmlElement(name = "AVVCode", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String avvCode;
    @XmlElement(name = "AVVOmschrijving", required = true)
    protected List<OmschrijvingInTaalType> avvOmschrijving;
    @XmlElement(name = "PresentatieSamenvattingAVVDossier")
    protected MeertaligeUitingenType presentatieSamenvattingAVVDossier;
    @XmlAnyElement
    protected List<Element> any;

    /**
     * Gets the value of the maatregelTijdvak property.
     * 
     * @return
     *     possible object is
     *     {@link TijdvakType }
     *     
     */
    public TijdvakType getMaatregelTijdvak() {
        return maatregelTijdvak;
    }

    /**
     * Sets the value of the maatregelTijdvak property.
     * 
     * @param value
     *     allowed object is
     *     {@link TijdvakType }
     *     
     */
    public void setMaatregelTijdvak(TijdvakType value) {
        this.maatregelTijdvak = value;
    }

    /**
     * Gets the value of the avvCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAVVCode() {
        return avvCode;
    }

    /**
     * Sets the value of the avvCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAVVCode(String value) {
        this.avvCode = value;
    }

    /**
     * Gets the value of the avvOmschrijving property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the avvOmschrijving property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAVVOmschrijving().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OmschrijvingInTaalType }
     * 
     * 
     */
    public List<OmschrijvingInTaalType> getAVVOmschrijving() {
        if (avvOmschrijving == null) {
            avvOmschrijving = new ArrayList<OmschrijvingInTaalType>();
        }
        return this.avvOmschrijving;
    }

    /**
     * Gets the value of the presentatieSamenvattingAVVDossier property.
     * 
     * @return
     *     possible object is
     *     {@link MeertaligeUitingenType }
     *     
     */
    public MeertaligeUitingenType getPresentatieSamenvattingAVVDossier() {
        return presentatieSamenvattingAVVDossier;
    }

    /**
     * Sets the value of the presentatieSamenvattingAVVDossier property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeertaligeUitingenType }
     *     
     */
    public void setPresentatieSamenvattingAVVDossier(MeertaligeUitingenType value) {
        this.presentatieSamenvattingAVVDossier = value;
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
