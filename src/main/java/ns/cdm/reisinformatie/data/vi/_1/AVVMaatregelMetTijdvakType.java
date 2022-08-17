
package ns.cdm.reisinformatie.data.vi._1;

import java.math.BigInteger;
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
 * Geeft het Treinvervangend vervoer met Tijdvak
 * 
 * <p>Java class for AVVMaatregelMetTijdvakType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AVVMaatregelMetTijdvakType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MaatregelTraject" type="{urn:ns:cdm:reisinformatie:data:vi:1}TrajectType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="AVVCode" type="{urn:ns:cdm:reisinformatie:data:vi:1}AVVCodeType"/&gt;
 *         &lt;element name="AVVOmschrijving" type="{urn:ns:cdm:reisinformatie:data:vi:1}OmschrijvingInTaalType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="AVVStop" type="{urn:ns:cdm:reisinformatie:data:vi:1}AVVStopType" maxOccurs="unbounded" minOccurs="2"/&gt;
 *         &lt;element name="Id" type="{urn:ns:cdm:reisinformatie:data:vi:1}AVVMaatregelIdType"/&gt;
 *         &lt;element name="MaatregelTijdvak" type="{urn:ns:cdm:reisinformatie:data:vi:1}TijdvakType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PresentatieAVVMaatregel" type="{urn:ns:cdm:reisinformatie:data:vi:1}MeertaligeUitingenType" minOccurs="0"/&gt;
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
@XmlType(name = "AVVMaatregelMetTijdvakType", propOrder = {
    "maatregelTraject",
    "avvCode",
    "avvOmschrijving",
    "avvStop",
    "id",
    "maatregelTijdvak",
    "presentatieAVVMaatregel",
    "any"
})
public class AVVMaatregelMetTijdvakType {

    @XmlElement(name = "MaatregelTraject", required = true)
    protected List<TrajectType> maatregelTraject;
    @XmlElement(name = "AVVCode", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String avvCode;
    @XmlElement(name = "AVVOmschrijving", required = true)
    protected List<OmschrijvingInTaalType> avvOmschrijving;
    @XmlElement(name = "AVVStop", required = true)
    protected List<AVVStopType> avvStop;
    @XmlElement(name = "Id", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger id;
    @XmlElement(name = "MaatregelTijdvak")
    protected List<TijdvakType> maatregelTijdvak;
    @XmlElement(name = "PresentatieAVVMaatregel")
    protected MeertaligeUitingenType presentatieAVVMaatregel;
    @XmlAnyElement
    protected List<Element> any;

    /**
     * Gets the value of the maatregelTraject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the maatregelTraject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaatregelTraject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrajectType }
     * 
     * 
     */
    public List<TrajectType> getMaatregelTraject() {
        if (maatregelTraject == null) {
            maatregelTraject = new ArrayList<TrajectType>();
        }
        return this.maatregelTraject;
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
     * Gets the value of the avvStop property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the avvStop property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAVVStop().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AVVStopType }
     * 
     * 
     */
    public List<AVVStopType> getAVVStop() {
        if (avvStop == null) {
            avvStop = new ArrayList<AVVStopType>();
        }
        return this.avvStop;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setId(BigInteger value) {
        this.id = value;
    }

    /**
     * Gets the value of the maatregelTijdvak property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the maatregelTijdvak property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaatregelTijdvak().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TijdvakType }
     * 
     * 
     */
    public List<TijdvakType> getMaatregelTijdvak() {
        if (maatregelTijdvak == null) {
            maatregelTijdvak = new ArrayList<TijdvakType>();
        }
        return this.maatregelTijdvak;
    }

    /**
     * Gets the value of the presentatieAVVMaatregel property.
     * 
     * @return
     *     possible object is
     *     {@link MeertaligeUitingenType }
     *     
     */
    public MeertaligeUitingenType getPresentatieAVVMaatregel() {
        return presentatieAVVMaatregel;
    }

    /**
     * Sets the value of the presentatieAVVMaatregel property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeertaligeUitingenType }
     *     
     */
    public void setPresentatieAVVMaatregel(MeertaligeUitingenType value) {
        this.presentatieAVVMaatregel = value;
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
