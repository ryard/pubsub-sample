
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
import javax.xml.datatype.Duration;
import org.w3c.dom.Element;


/**
 * Geeft een samengesteld omreisadvies weer voor een stations- en treinbericht.
 * 
 * <p>Java class for SamengesteldOmreisAdviesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SamengesteldOmreisAdviesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BestemmingStation" type="{urn:ns:cdm:reisinformatie:data:vi:1}StationType" maxOccurs="3"/&gt;
 *         &lt;element name="AantalReizen" type="{urn:ns:cdm:reisinformatie:data:vi:1}AantalReizenType"/&gt;
 *         &lt;element name="ExtraReistijdVan" type="{urn:ns:cdm:reisinformatie:data:vi:1}ExtraReistijdType"/&gt;
 *         &lt;element name="ExtraReistijdTot" type="{urn:ns:cdm:reisinformatie:data:vi:1}ExtraReistijdType"/&gt;
 *         &lt;element name="Advies" type="{urn:ns:cdm:reisinformatie:data:vi:1}OmreisAdviesType"/&gt;
 *         &lt;element name="PresentatieOmreisAdvies" type="{urn:ns:cdm:reisinformatie:data:vi:1}MeertaligeUitingenType" minOccurs="0"/&gt;
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
@XmlType(name = "SamengesteldOmreisAdviesType", propOrder = {
    "bestemmingStation",
    "aantalReizen",
    "extraReistijdVan",
    "extraReistijdTot",
    "advies",
    "presentatieOmreisAdvies",
    "any"
})
public class SamengesteldOmreisAdviesType {

    @XmlElement(name = "BestemmingStation", required = true)
    protected List<StationType> bestemmingStation;
    @XmlElement(name = "AantalReizen", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger aantalReizen;
    @XmlElement(name = "ExtraReistijdVan", required = true)
    protected Duration extraReistijdVan;
    @XmlElement(name = "ExtraReistijdTot", required = true)
    protected Duration extraReistijdTot;
    @XmlElement(name = "Advies", required = true)
    protected OmreisAdviesType advies;
    @XmlElement(name = "PresentatieOmreisAdvies")
    protected MeertaligeUitingenType presentatieOmreisAdvies;
    @XmlAnyElement
    protected List<Element> any;

    /**
     * Gets the value of the bestemmingStation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bestemmingStation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBestemmingStation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StationType }
     * 
     * 
     */
    public List<StationType> getBestemmingStation() {
        if (bestemmingStation == null) {
            bestemmingStation = new ArrayList<StationType>();
        }
        return this.bestemmingStation;
    }

    /**
     * Gets the value of the aantalReizen property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAantalReizen() {
        return aantalReizen;
    }

    /**
     * Sets the value of the aantalReizen property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAantalReizen(BigInteger value) {
        this.aantalReizen = value;
    }

    /**
     * Gets the value of the extraReistijdVan property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getExtraReistijdVan() {
        return extraReistijdVan;
    }

    /**
     * Sets the value of the extraReistijdVan property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setExtraReistijdVan(Duration value) {
        this.extraReistijdVan = value;
    }

    /**
     * Gets the value of the extraReistijdTot property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getExtraReistijdTot() {
        return extraReistijdTot;
    }

    /**
     * Sets the value of the extraReistijdTot property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setExtraReistijdTot(Duration value) {
        this.extraReistijdTot = value;
    }

    /**
     * Gets the value of the advies property.
     * 
     * @return
     *     possible object is
     *     {@link OmreisAdviesType }
     *     
     */
    public OmreisAdviesType getAdvies() {
        return advies;
    }

    /**
     * Sets the value of the advies property.
     * 
     * @param value
     *     allowed object is
     *     {@link OmreisAdviesType }
     *     
     */
    public void setAdvies(OmreisAdviesType value) {
        this.advies = value;
    }

    /**
     * Gets the value of the presentatieOmreisAdvies property.
     * 
     * @return
     *     possible object is
     *     {@link MeertaligeUitingenType }
     *     
     */
    public MeertaligeUitingenType getPresentatieOmreisAdvies() {
        return presentatieOmreisAdvies;
    }

    /**
     * Sets the value of the presentatieOmreisAdvies property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeertaligeUitingenType }
     *     
     */
    public void setPresentatieOmreisAdvies(MeertaligeUitingenType value) {
        this.presentatieOmreisAdvies = value;
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
