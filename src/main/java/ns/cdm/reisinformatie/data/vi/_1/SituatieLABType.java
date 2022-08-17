
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
 * Geeft de situatie van de verstoring weer
 * 
 * <p>Java class for SituatieLABType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SituatieLABType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="EVBeginTijd" type="{urn:ns:cdm:reisinformatie:data:vi:1}EVBeginTijdType"/&gt;
 *             &lt;element name="PresentatieEVBeginTijd" type="{urn:ns:cdm:reisinformatie:data:vi:1}MeertaligeUitingenType" minOccurs="0"/&gt;
 *             &lt;element name="AanvullendAdvies" type="{urn:ns:cdm:reisinformatie:data:vi:1}AanVullendAdviesType" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="PeriodeKalenderMetAanvullendAdvies" type="{urn:ns:cdm:reisinformatie:data:vi:1}PeriodeKalenderMetAanvullendAdvies" maxOccurs="unbounded"/&gt;
 *           &lt;/sequence&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="PresentatiePeriode" type="{urn:ns:cdm:reisinformatie:data:vi:1}MeertaligeUitingenType" minOccurs="0"/&gt;
 *         &lt;element name="PresentatieAanvullendAdvies" type="{urn:ns:cdm:reisinformatie:data:vi:1}MeertaligeUitingenType" minOccurs="0"/&gt;
 *         &lt;element name="BaanvakBeperking" type="{urn:ns:cdm:reisinformatie:data:vi:1}BaanvakBeperkingType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="SignaleringVerstoring" type="{urn:ns:cdm:reisinformatie:data:vi:1}SignaleringVerstoringType"/&gt;
 *         &lt;choice&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="AanleidingCode" type="{urn:ns:cdm:reisinformatie:data:vi:1}AanleidingCodeType"/&gt;
 *             &lt;element name="OorzaakKort" type="{urn:ns:cdm:reisinformatie:data:vi:1}OorzaakKortType"/&gt;
 *             &lt;element name="OorzaakLang" type="{urn:ns:cdm:reisinformatie:data:vi:1}OorzaakLangType"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;element name="EvenementNaam" type="{urn:ns:cdm:reisinformatie:data:vi:1}EvenementNaamType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="PresentatieOorzaak" type="{urn:ns:cdm:reisinformatie:data:vi:1}MeertaligeUitingenType" minOccurs="0"/&gt;
 *         &lt;element name="Prognose" type="{urn:ns:cdm:reisinformatie:data:vi:1}PrognoseType" minOccurs="0"/&gt;
 *         &lt;element name="PresentatiePrognose" type="{urn:ns:cdm:reisinformatie:data:vi:1}MeertaligeUitingenType" minOccurs="0"/&gt;
 *         &lt;element name="InformatiePersoneel" type="{urn:ns:cdm:reisinformatie:data:vi:1}InformatiePersoneelType" minOccurs="0"/&gt;
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
@XmlType(name = "SituatieLABType", propOrder = {
    "evBeginTijd",
    "presentatieEVBeginTijd",
    "aanvullendAdvies",
    "periodeKalenderMetAanvullendAdvies",
    "presentatiePeriode",
    "presentatieAanvullendAdvies",
    "baanvakBeperking",
    "signaleringVerstoring",
    "aanleidingCode",
    "oorzaakKort",
    "oorzaakLang",
    "evenementNaam",
    "presentatieOorzaak",
    "prognose",
    "presentatiePrognose",
    "informatiePersoneel",
    "any"
})
public class SituatieLABType {

    @XmlElement(name = "EVBeginTijd")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar evBeginTijd;
    @XmlElement(name = "PresentatieEVBeginTijd")
    protected MeertaligeUitingenType presentatieEVBeginTijd;
    @XmlElement(name = "AanvullendAdvies")
    protected AanVullendAdviesType aanvullendAdvies;
    @XmlElement(name = "PeriodeKalenderMetAanvullendAdvies")
    protected List<PeriodeKalenderMetAanvullendAdvies> periodeKalenderMetAanvullendAdvies;
    @XmlElement(name = "PresentatiePeriode")
    protected MeertaligeUitingenType presentatiePeriode;
    @XmlElement(name = "PresentatieAanvullendAdvies")
    protected MeertaligeUitingenType presentatieAanvullendAdvies;
    @XmlElement(name = "BaanvakBeperking", required = true)
    protected List<BaanvakBeperkingType> baanvakBeperking;
    @XmlElement(name = "SignaleringVerstoring", required = true)
    protected SignaleringVerstoringType signaleringVerstoring;
    @XmlElement(name = "AanleidingCode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String aanleidingCode;
    @XmlElement(name = "OorzaakKort")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String oorzaakKort;
    @XmlElement(name = "OorzaakLang")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String oorzaakLang;
    @XmlElement(name = "EvenementNaam")
    protected String evenementNaam;
    @XmlElement(name = "PresentatieOorzaak")
    protected MeertaligeUitingenType presentatieOorzaak;
    @XmlElement(name = "Prognose")
    protected PrognoseType prognose;
    @XmlElement(name = "PresentatiePrognose")
    protected MeertaligeUitingenType presentatiePrognose;
    @XmlElement(name = "InformatiePersoneel")
    protected String informatiePersoneel;
    @XmlAnyElement
    protected List<Element> any;

    /**
     * Gets the value of the evBeginTijd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEVBeginTijd() {
        return evBeginTijd;
    }

    /**
     * Sets the value of the evBeginTijd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEVBeginTijd(XMLGregorianCalendar value) {
        this.evBeginTijd = value;
    }

    /**
     * Gets the value of the presentatieEVBeginTijd property.
     * 
     * @return
     *     possible object is
     *     {@link MeertaligeUitingenType }
     *     
     */
    public MeertaligeUitingenType getPresentatieEVBeginTijd() {
        return presentatieEVBeginTijd;
    }

    /**
     * Sets the value of the presentatieEVBeginTijd property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeertaligeUitingenType }
     *     
     */
    public void setPresentatieEVBeginTijd(MeertaligeUitingenType value) {
        this.presentatieEVBeginTijd = value;
    }

    /**
     * Gets the value of the aanvullendAdvies property.
     * 
     * @return
     *     possible object is
     *     {@link AanVullendAdviesType }
     *     
     */
    public AanVullendAdviesType getAanvullendAdvies() {
        return aanvullendAdvies;
    }

    /**
     * Sets the value of the aanvullendAdvies property.
     * 
     * @param value
     *     allowed object is
     *     {@link AanVullendAdviesType }
     *     
     */
    public void setAanvullendAdvies(AanVullendAdviesType value) {
        this.aanvullendAdvies = value;
    }

    /**
     * Gets the value of the periodeKalenderMetAanvullendAdvies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the periodeKalenderMetAanvullendAdvies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPeriodeKalenderMetAanvullendAdvies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PeriodeKalenderMetAanvullendAdvies }
     * 
     * 
     */
    public List<PeriodeKalenderMetAanvullendAdvies> getPeriodeKalenderMetAanvullendAdvies() {
        if (periodeKalenderMetAanvullendAdvies == null) {
            periodeKalenderMetAanvullendAdvies = new ArrayList<PeriodeKalenderMetAanvullendAdvies>();
        }
        return this.periodeKalenderMetAanvullendAdvies;
    }

    /**
     * Gets the value of the presentatiePeriode property.
     * 
     * @return
     *     possible object is
     *     {@link MeertaligeUitingenType }
     *     
     */
    public MeertaligeUitingenType getPresentatiePeriode() {
        return presentatiePeriode;
    }

    /**
     * Sets the value of the presentatiePeriode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeertaligeUitingenType }
     *     
     */
    public void setPresentatiePeriode(MeertaligeUitingenType value) {
        this.presentatiePeriode = value;
    }

    /**
     * Gets the value of the presentatieAanvullendAdvies property.
     * 
     * @return
     *     possible object is
     *     {@link MeertaligeUitingenType }
     *     
     */
    public MeertaligeUitingenType getPresentatieAanvullendAdvies() {
        return presentatieAanvullendAdvies;
    }

    /**
     * Sets the value of the presentatieAanvullendAdvies property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeertaligeUitingenType }
     *     
     */
    public void setPresentatieAanvullendAdvies(MeertaligeUitingenType value) {
        this.presentatieAanvullendAdvies = value;
    }

    /**
     * Gets the value of the baanvakBeperking property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the baanvakBeperking property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBaanvakBeperking().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BaanvakBeperkingType }
     * 
     * 
     */
    public List<BaanvakBeperkingType> getBaanvakBeperking() {
        if (baanvakBeperking == null) {
            baanvakBeperking = new ArrayList<BaanvakBeperkingType>();
        }
        return this.baanvakBeperking;
    }

    /**
     * Gets the value of the signaleringVerstoring property.
     * 
     * @return
     *     possible object is
     *     {@link SignaleringVerstoringType }
     *     
     */
    public SignaleringVerstoringType getSignaleringVerstoring() {
        return signaleringVerstoring;
    }

    /**
     * Sets the value of the signaleringVerstoring property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignaleringVerstoringType }
     *     
     */
    public void setSignaleringVerstoring(SignaleringVerstoringType value) {
        this.signaleringVerstoring = value;
    }

    /**
     * Gets the value of the aanleidingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAanleidingCode() {
        return aanleidingCode;
    }

    /**
     * Sets the value of the aanleidingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAanleidingCode(String value) {
        this.aanleidingCode = value;
    }

    /**
     * Gets the value of the oorzaakKort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOorzaakKort() {
        return oorzaakKort;
    }

    /**
     * Sets the value of the oorzaakKort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOorzaakKort(String value) {
        this.oorzaakKort = value;
    }

    /**
     * Gets the value of the oorzaakLang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOorzaakLang() {
        return oorzaakLang;
    }

    /**
     * Sets the value of the oorzaakLang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOorzaakLang(String value) {
        this.oorzaakLang = value;
    }

    /**
     * Gets the value of the evenementNaam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvenementNaam() {
        return evenementNaam;
    }

    /**
     * Sets the value of the evenementNaam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvenementNaam(String value) {
        this.evenementNaam = value;
    }

    /**
     * Gets the value of the presentatieOorzaak property.
     * 
     * @return
     *     possible object is
     *     {@link MeertaligeUitingenType }
     *     
     */
    public MeertaligeUitingenType getPresentatieOorzaak() {
        return presentatieOorzaak;
    }

    /**
     * Sets the value of the presentatieOorzaak property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeertaligeUitingenType }
     *     
     */
    public void setPresentatieOorzaak(MeertaligeUitingenType value) {
        this.presentatieOorzaak = value;
    }

    /**
     * Gets the value of the prognose property.
     * 
     * @return
     *     possible object is
     *     {@link PrognoseType }
     *     
     */
    public PrognoseType getPrognose() {
        return prognose;
    }

    /**
     * Sets the value of the prognose property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrognoseType }
     *     
     */
    public void setPrognose(PrognoseType value) {
        this.prognose = value;
    }

    /**
     * Gets the value of the presentatiePrognose property.
     * 
     * @return
     *     possible object is
     *     {@link MeertaligeUitingenType }
     *     
     */
    public MeertaligeUitingenType getPresentatiePrognose() {
        return presentatiePrognose;
    }

    /**
     * Sets the value of the presentatiePrognose property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeertaligeUitingenType }
     *     
     */
    public void setPresentatiePrognose(MeertaligeUitingenType value) {
        this.presentatiePrognose = value;
    }

    /**
     * Gets the value of the informatiePersoneel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInformatiePersoneel() {
        return informatiePersoneel;
    }

    /**
     * Sets the value of the informatiePersoneel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInformatiePersoneel(String value) {
        this.informatiePersoneel = value;
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
