
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
import javax.xml.datatype.XMLGregorianCalendar;
import org.w3c.dom.Element;


/**
 * Het element LandelijkePatroonInformatie bevat de landelijke gegevens van één geplande of ongeplande verstoring op één bepaalde geldigheidsdatum.
 * 
 * <p>Java class for LandelijkePatroonInformatieType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LandelijkePatroonInformatieType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DossierNummer" type="{urn:ns:cdm:reisinformatie:data:vi:1}DossierNummerType"/&gt;
 *         &lt;element name="DossierVolgNummer" type="{urn:ns:cdm:reisinformatie:data:vi:1}DossierVolgNummerType"/&gt;
 *         &lt;element name="DossierNaam" type="{urn:ns:cdm:reisinformatie:data:vi:1}DossierNaamType"/&gt;
 *         &lt;element name="VerstoringSoort" type="{urn:ns:cdm:reisinformatie:data:vi:1}VerstoringSoortType"/&gt;
 *         &lt;element name="VerstoringFase" type="{urn:ns:cdm:reisinformatie:data:vi:1}VerstoringFaseType" minOccurs="0"/&gt;
 *         &lt;element name="VerstoringImpact" type="{urn:ns:cdm:reisinformatie:data:vi:1}ImpactType"/&gt;
 *         &lt;element name="ImpactOmschrijving" type="{urn:ns:cdm:reisinformatie:data:vi:1}ImpactOmschrijvingType"/&gt;
 *         &lt;element name="RegistratieTijd" type="{urn:ns:cdm:reisinformatie:data:vi:1}RegistratieTijdType"/&gt;
 *         &lt;element name="VrijgaveTijd" type="{urn:ns:cdm:reisinformatie:data:vi:1}VrijgaveTijdType"/&gt;
 *         &lt;element name="PresentatieMeldTijd" type="{urn:ns:cdm:reisinformatie:data:vi:1}MeertaligeUitingenType" minOccurs="0"/&gt;
 *         &lt;element name="WijzigingTypeBericht" type="{urn:ns:cdm:reisinformatie:data:vi:1}WijzigingTypeBerichtType"/&gt;
 *         &lt;element name="Situatie" type="{urn:ns:cdm:reisinformatie:data:vi:1}SituatieLABType"/&gt;
 *         &lt;element name="PresentatieLocatie" type="{urn:ns:cdm:reisinformatie:data:vi:1}MeertaligeUitingenType" minOccurs="0"/&gt;
 *         &lt;element name="PresentatieSituatie" type="{urn:ns:cdm:reisinformatie:data:vi:1}MeertaligeUitingenType" minOccurs="0"/&gt;
 *         &lt;element name="DringendAdvies" type="{urn:ns:cdm:reisinformatie:data:vi:1}DringendAdviesType" minOccurs="0"/&gt;
 *         &lt;element name="PresentatieDringendAdvies" type="{urn:ns:cdm:reisinformatie:data:vi:1}MeertaligeUitingenType" minOccurs="0"/&gt;
 *         &lt;element name="TreinMaatregel" type="{urn:ns:cdm:reisinformatie:data:vi:1}TreinMaatregelType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AVVMaatregel" type="{urn:ns:cdm:reisinformatie:data:vi:1}AVVMaatregelType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OmreisAdviesSet" type="{urn:ns:cdm:reisinformatie:data:vi:1}OAPerTijdvakType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OmreizenMogelijk" type="{urn:ns:cdm:reisinformatie:data:vi:1}IndicatieType"/&gt;
 *         &lt;element name="PresentatieOmreizenMogelijk" type="{urn:ns:cdm:reisinformatie:data:vi:1}MeertaligeUitingenType" minOccurs="0"/&gt;
 *         &lt;element name="SamenvattingMateVertraging" type="{urn:ns:cdm:reisinformatie:data:vi:1}MateVertragingType" minOccurs="0"/&gt;
 *         &lt;element name="PresentatieSamenvattingMateVertraging" type="{urn:ns:cdm:reisinformatie:data:vi:1}MeertaligeUitingenType" minOccurs="0"/&gt;
 *         &lt;element name="SamenvattingAVVBijBaanvak" type="{urn:ns:cdm:reisinformatie:data:vi:1}SamenvattingAVVPerBaanvakType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SamenvattingAVVDossier" type="{urn:ns:cdm:reisinformatie:data:vi:1}SamenvattingAVVMaatregelenType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "LandelijkePatroonInformatieType", propOrder = {
    "dossierNummer",
    "dossierVolgNummer",
    "dossierNaam",
    "verstoringSoort",
    "verstoringFase",
    "verstoringImpact",
    "impactOmschrijving",
    "registratieTijd",
    "vrijgaveTijd",
    "presentatieMeldTijd",
    "wijzigingTypeBericht",
    "situatie",
    "presentatieLocatie",
    "presentatieSituatie",
    "dringendAdvies",
    "presentatieDringendAdvies",
    "treinMaatregel",
    "avvMaatregel",
    "omreisAdviesSet",
    "omreizenMogelijk",
    "presentatieOmreizenMogelijk",
    "samenvattingMateVertraging",
    "presentatieSamenvattingMateVertraging",
    "samenvattingAVVBijBaanvak",
    "samenvattingAVVDossier",
    "any"
})
public class LandelijkePatroonInformatieType {

    @XmlElement(name = "DossierNummer", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger dossierNummer;
    @XmlElement(name = "DossierVolgNummer", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger dossierVolgNummer;
    @XmlElement(name = "DossierNaam", required = true)
    protected String dossierNaam;
    @XmlElement(name = "VerstoringSoort", required = true)
    @XmlSchemaType(name = "string")
    protected VerstoringSoortType verstoringSoort;
    @XmlElement(name = "VerstoringFase")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String verstoringFase;
    @XmlElement(name = "VerstoringImpact", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger verstoringImpact;
    @XmlElement(name = "ImpactOmschrijving", required = true)
    protected ImpactOmschrijvingType impactOmschrijving;
    @XmlElement(name = "RegistratieTijd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar registratieTijd;
    @XmlElement(name = "VrijgaveTijd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar vrijgaveTijd;
    @XmlElement(name = "PresentatieMeldTijd")
    protected MeertaligeUitingenType presentatieMeldTijd;
    @XmlElement(name = "WijzigingTypeBericht", required = true)
    @XmlSchemaType(name = "string")
    protected WijzigingTypeBerichtType wijzigingTypeBericht;
    @XmlElement(name = "Situatie", required = true)
    protected SituatieLABType situatie;
    @XmlElement(name = "PresentatieLocatie")
    protected MeertaligeUitingenType presentatieLocatie;
    @XmlElement(name = "PresentatieSituatie")
    protected MeertaligeUitingenType presentatieSituatie;
    @XmlElement(name = "DringendAdvies")
    protected DringendAdviesType dringendAdvies;
    @XmlElement(name = "PresentatieDringendAdvies")
    protected MeertaligeUitingenType presentatieDringendAdvies;
    @XmlElement(name = "TreinMaatregel")
    protected List<TreinMaatregelType> treinMaatregel;
    @XmlElement(name = "AVVMaatregel")
    protected List<AVVMaatregelType> avvMaatregel;
    @XmlElement(name = "OmreisAdviesSet")
    protected List<OAPerTijdvakType> omreisAdviesSet;
    @XmlElement(name = "OmreizenMogelijk", required = true)
    @XmlSchemaType(name = "string")
    protected IndicatieType omreizenMogelijk;
    @XmlElement(name = "PresentatieOmreizenMogelijk")
    protected MeertaligeUitingenType presentatieOmreizenMogelijk;
    @XmlElement(name = "SamenvattingMateVertraging")
    protected MateVertragingType samenvattingMateVertraging;
    @XmlElement(name = "PresentatieSamenvattingMateVertraging")
    protected MeertaligeUitingenType presentatieSamenvattingMateVertraging;
    @XmlElement(name = "SamenvattingAVVBijBaanvak")
    protected List<SamenvattingAVVPerBaanvakType> samenvattingAVVBijBaanvak;
    @XmlElement(name = "SamenvattingAVVDossier")
    protected List<SamenvattingAVVMaatregelenType> samenvattingAVVDossier;
    @XmlAnyElement
    protected List<Element> any;

    /**
     * Gets the value of the dossierNummer property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDossierNummer() {
        return dossierNummer;
    }

    /**
     * Sets the value of the dossierNummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDossierNummer(BigInteger value) {
        this.dossierNummer = value;
    }

    /**
     * Gets the value of the dossierVolgNummer property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDossierVolgNummer() {
        return dossierVolgNummer;
    }

    /**
     * Sets the value of the dossierVolgNummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDossierVolgNummer(BigInteger value) {
        this.dossierVolgNummer = value;
    }

    /**
     * Gets the value of the dossierNaam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDossierNaam() {
        return dossierNaam;
    }

    /**
     * Sets the value of the dossierNaam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDossierNaam(String value) {
        this.dossierNaam = value;
    }

    /**
     * Gets the value of the verstoringSoort property.
     * 
     * @return
     *     possible object is
     *     {@link VerstoringSoortType }
     *     
     */
    public VerstoringSoortType getVerstoringSoort() {
        return verstoringSoort;
    }

    /**
     * Sets the value of the verstoringSoort property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerstoringSoortType }
     *     
     */
    public void setVerstoringSoort(VerstoringSoortType value) {
        this.verstoringSoort = value;
    }

    /**
     * Gets the value of the verstoringFase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerstoringFase() {
        return verstoringFase;
    }

    /**
     * Sets the value of the verstoringFase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerstoringFase(String value) {
        this.verstoringFase = value;
    }

    /**
     * Gets the value of the verstoringImpact property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVerstoringImpact() {
        return verstoringImpact;
    }

    /**
     * Sets the value of the verstoringImpact property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVerstoringImpact(BigInteger value) {
        this.verstoringImpact = value;
    }

    /**
     * Gets the value of the impactOmschrijving property.
     * 
     * @return
     *     possible object is
     *     {@link ImpactOmschrijvingType }
     *     
     */
    public ImpactOmschrijvingType getImpactOmschrijving() {
        return impactOmschrijving;
    }

    /**
     * Sets the value of the impactOmschrijving property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImpactOmschrijvingType }
     *     
     */
    public void setImpactOmschrijving(ImpactOmschrijvingType value) {
        this.impactOmschrijving = value;
    }

    /**
     * Gets the value of the registratieTijd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegistratieTijd() {
        return registratieTijd;
    }

    /**
     * Sets the value of the registratieTijd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegistratieTijd(XMLGregorianCalendar value) {
        this.registratieTijd = value;
    }

    /**
     * Gets the value of the vrijgaveTijd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVrijgaveTijd() {
        return vrijgaveTijd;
    }

    /**
     * Sets the value of the vrijgaveTijd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVrijgaveTijd(XMLGregorianCalendar value) {
        this.vrijgaveTijd = value;
    }

    /**
     * Gets the value of the presentatieMeldTijd property.
     * 
     * @return
     *     possible object is
     *     {@link MeertaligeUitingenType }
     *     
     */
    public MeertaligeUitingenType getPresentatieMeldTijd() {
        return presentatieMeldTijd;
    }

    /**
     * Sets the value of the presentatieMeldTijd property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeertaligeUitingenType }
     *     
     */
    public void setPresentatieMeldTijd(MeertaligeUitingenType value) {
        this.presentatieMeldTijd = value;
    }

    /**
     * Gets the value of the wijzigingTypeBericht property.
     * 
     * @return
     *     possible object is
     *     {@link WijzigingTypeBerichtType }
     *     
     */
    public WijzigingTypeBerichtType getWijzigingTypeBericht() {
        return wijzigingTypeBericht;
    }

    /**
     * Sets the value of the wijzigingTypeBericht property.
     * 
     * @param value
     *     allowed object is
     *     {@link WijzigingTypeBerichtType }
     *     
     */
    public void setWijzigingTypeBericht(WijzigingTypeBerichtType value) {
        this.wijzigingTypeBericht = value;
    }

    /**
     * Gets the value of the situatie property.
     * 
     * @return
     *     possible object is
     *     {@link SituatieLABType }
     *     
     */
    public SituatieLABType getSituatie() {
        return situatie;
    }

    /**
     * Sets the value of the situatie property.
     * 
     * @param value
     *     allowed object is
     *     {@link SituatieLABType }
     *     
     */
    public void setSituatie(SituatieLABType value) {
        this.situatie = value;
    }

    /**
     * Gets the value of the presentatieLocatie property.
     * 
     * @return
     *     possible object is
     *     {@link MeertaligeUitingenType }
     *     
     */
    public MeertaligeUitingenType getPresentatieLocatie() {
        return presentatieLocatie;
    }

    /**
     * Sets the value of the presentatieLocatie property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeertaligeUitingenType }
     *     
     */
    public void setPresentatieLocatie(MeertaligeUitingenType value) {
        this.presentatieLocatie = value;
    }

    /**
     * Gets the value of the presentatieSituatie property.
     * 
     * @return
     *     possible object is
     *     {@link MeertaligeUitingenType }
     *     
     */
    public MeertaligeUitingenType getPresentatieSituatie() {
        return presentatieSituatie;
    }

    /**
     * Sets the value of the presentatieSituatie property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeertaligeUitingenType }
     *     
     */
    public void setPresentatieSituatie(MeertaligeUitingenType value) {
        this.presentatieSituatie = value;
    }

    /**
     * Gets the value of the dringendAdvies property.
     * 
     * @return
     *     possible object is
     *     {@link DringendAdviesType }
     *     
     */
    public DringendAdviesType getDringendAdvies() {
        return dringendAdvies;
    }

    /**
     * Sets the value of the dringendAdvies property.
     * 
     * @param value
     *     allowed object is
     *     {@link DringendAdviesType }
     *     
     */
    public void setDringendAdvies(DringendAdviesType value) {
        this.dringendAdvies = value;
    }

    /**
     * Gets the value of the presentatieDringendAdvies property.
     * 
     * @return
     *     possible object is
     *     {@link MeertaligeUitingenType }
     *     
     */
    public MeertaligeUitingenType getPresentatieDringendAdvies() {
        return presentatieDringendAdvies;
    }

    /**
     * Sets the value of the presentatieDringendAdvies property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeertaligeUitingenType }
     *     
     */
    public void setPresentatieDringendAdvies(MeertaligeUitingenType value) {
        this.presentatieDringendAdvies = value;
    }

    /**
     * Gets the value of the treinMaatregel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the treinMaatregel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTreinMaatregel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TreinMaatregelType }
     * 
     * 
     */
    public List<TreinMaatregelType> getTreinMaatregel() {
        if (treinMaatregel == null) {
            treinMaatregel = new ArrayList<TreinMaatregelType>();
        }
        return this.treinMaatregel;
    }

    /**
     * Gets the value of the avvMaatregel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the avvMaatregel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAVVMaatregel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AVVMaatregelType }
     * 
     * 
     */
    public List<AVVMaatregelType> getAVVMaatregel() {
        if (avvMaatregel == null) {
            avvMaatregel = new ArrayList<AVVMaatregelType>();
        }
        return this.avvMaatregel;
    }

    /**
     * Gets the value of the omreisAdviesSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the omreisAdviesSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOmreisAdviesSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OAPerTijdvakType }
     * 
     * 
     */
    public List<OAPerTijdvakType> getOmreisAdviesSet() {
        if (omreisAdviesSet == null) {
            omreisAdviesSet = new ArrayList<OAPerTijdvakType>();
        }
        return this.omreisAdviesSet;
    }

    /**
     * Gets the value of the omreizenMogelijk property.
     * 
     * @return
     *     possible object is
     *     {@link IndicatieType }
     *     
     */
    public IndicatieType getOmreizenMogelijk() {
        return omreizenMogelijk;
    }

    /**
     * Sets the value of the omreizenMogelijk property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicatieType }
     *     
     */
    public void setOmreizenMogelijk(IndicatieType value) {
        this.omreizenMogelijk = value;
    }

    /**
     * Gets the value of the presentatieOmreizenMogelijk property.
     * 
     * @return
     *     possible object is
     *     {@link MeertaligeUitingenType }
     *     
     */
    public MeertaligeUitingenType getPresentatieOmreizenMogelijk() {
        return presentatieOmreizenMogelijk;
    }

    /**
     * Sets the value of the presentatieOmreizenMogelijk property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeertaligeUitingenType }
     *     
     */
    public void setPresentatieOmreizenMogelijk(MeertaligeUitingenType value) {
        this.presentatieOmreizenMogelijk = value;
    }

    /**
     * Gets the value of the samenvattingMateVertraging property.
     * 
     * @return
     *     possible object is
     *     {@link MateVertragingType }
     *     
     */
    public MateVertragingType getSamenvattingMateVertraging() {
        return samenvattingMateVertraging;
    }

    /**
     * Sets the value of the samenvattingMateVertraging property.
     * 
     * @param value
     *     allowed object is
     *     {@link MateVertragingType }
     *     
     */
    public void setSamenvattingMateVertraging(MateVertragingType value) {
        this.samenvattingMateVertraging = value;
    }

    /**
     * Gets the value of the presentatieSamenvattingMateVertraging property.
     * 
     * @return
     *     possible object is
     *     {@link MeertaligeUitingenType }
     *     
     */
    public MeertaligeUitingenType getPresentatieSamenvattingMateVertraging() {
        return presentatieSamenvattingMateVertraging;
    }

    /**
     * Sets the value of the presentatieSamenvattingMateVertraging property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeertaligeUitingenType }
     *     
     */
    public void setPresentatieSamenvattingMateVertraging(MeertaligeUitingenType value) {
        this.presentatieSamenvattingMateVertraging = value;
    }

    /**
     * Gets the value of the samenvattingAVVBijBaanvak property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the samenvattingAVVBijBaanvak property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSamenvattingAVVBijBaanvak().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SamenvattingAVVPerBaanvakType }
     * 
     * 
     */
    public List<SamenvattingAVVPerBaanvakType> getSamenvattingAVVBijBaanvak() {
        if (samenvattingAVVBijBaanvak == null) {
            samenvattingAVVBijBaanvak = new ArrayList<SamenvattingAVVPerBaanvakType>();
        }
        return this.samenvattingAVVBijBaanvak;
    }

    /**
     * Gets the value of the samenvattingAVVDossier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the samenvattingAVVDossier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSamenvattingAVVDossier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SamenvattingAVVMaatregelenType }
     * 
     * 
     */
    public List<SamenvattingAVVMaatregelenType> getSamenvattingAVVDossier() {
        if (samenvattingAVVDossier == null) {
            samenvattingAVVDossier = new ArrayList<SamenvattingAVVMaatregelenType>();
        }
        return this.samenvattingAVVDossier;
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
