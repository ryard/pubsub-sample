
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
 * Geeft de informatie over een bepaald traject weer.
 * 
 * <p>Java class for TrajectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrajectType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TrajectCode" type="{urn:ns:cdm:reisinformatie:data:vi:1}TrajectCodeType"/&gt;
 *         &lt;element name="TrajectType" type="{urn:ns:cdm:reisinformatie:data:vi:1}TrajectCategorieType"/&gt;
 *         &lt;element name="TrajectNaamCodes" type="{urn:ns:cdm:reisinformatie:data:vi:1}TrajectNaamCodesType"/&gt;
 *         &lt;element name="TrajectNaam" type="{urn:ns:cdm:reisinformatie:data:vi:1}TrajectNaamType"/&gt;
 *         &lt;element name="Ligging" type="{urn:ns:cdm:reisinformatie:data:vi:1}TrajectLiggingType"/&gt;
 *         &lt;element name="TrajectStations" type="{urn:ns:cdm:reisinformatie:data:vi:1}StationType" maxOccurs="unbounded" minOccurs="2"/&gt;
 *         &lt;element name="AantalReizen" type="{urn:ns:cdm:reisinformatie:data:vi:1}AantalReizenType"/&gt;
 *         &lt;element name="TrajectVervoerder" type="{urn:ns:cdm:reisinformatie:data:vi:1}TrajectVervoerderType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "TrajectType", propOrder = {
    "trajectCode",
    "trajectType",
    "trajectNaamCodes",
    "trajectNaam",
    "ligging",
    "trajectStations",
    "aantalReizen",
    "trajectVervoerder",
    "any"
})
public class TrajectType {

    @XmlElement(name = "TrajectCode", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String trajectCode;
    @XmlElement(name = "TrajectType", required = true)
    @XmlSchemaType(name = "normalizedString")
    protected TrajectCategorieType trajectType;
    @XmlElement(name = "TrajectNaamCodes", required = true)
    protected TrajectNaamCodesType trajectNaamCodes;
    @XmlElement(name = "TrajectNaam", required = true)
    protected TrajectNaamType trajectNaam;
    @XmlElement(name = "Ligging", required = true)
    @XmlSchemaType(name = "normalizedString")
    protected TrajectLiggingType ligging;
    @XmlElement(name = "TrajectStations", required = true)
    protected List<StationType> trajectStations;
    @XmlElement(name = "AantalReizen", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger aantalReizen;
    @XmlElement(name = "TrajectVervoerder")
    protected List<String> trajectVervoerder;
    @XmlAnyElement
    protected List<Element> any;

    /**
     * Gets the value of the trajectCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrajectCode() {
        return trajectCode;
    }

    /**
     * Sets the value of the trajectCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrajectCode(String value) {
        this.trajectCode = value;
    }

    /**
     * Gets the value of the trajectType property.
     * 
     * @return
     *     possible object is
     *     {@link TrajectCategorieType }
     *     
     */
    public TrajectCategorieType getTrajectType() {
        return trajectType;
    }

    /**
     * Sets the value of the trajectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrajectCategorieType }
     *     
     */
    public void setTrajectType(TrajectCategorieType value) {
        this.trajectType = value;
    }

    /**
     * Gets the value of the trajectNaamCodes property.
     * 
     * @return
     *     possible object is
     *     {@link TrajectNaamCodesType }
     *     
     */
    public TrajectNaamCodesType getTrajectNaamCodes() {
        return trajectNaamCodes;
    }

    /**
     * Sets the value of the trajectNaamCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrajectNaamCodesType }
     *     
     */
    public void setTrajectNaamCodes(TrajectNaamCodesType value) {
        this.trajectNaamCodes = value;
    }

    /**
     * Gets the value of the trajectNaam property.
     * 
     * @return
     *     possible object is
     *     {@link TrajectNaamType }
     *     
     */
    public TrajectNaamType getTrajectNaam() {
        return trajectNaam;
    }

    /**
     * Sets the value of the trajectNaam property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrajectNaamType }
     *     
     */
    public void setTrajectNaam(TrajectNaamType value) {
        this.trajectNaam = value;
    }

    /**
     * Gets the value of the ligging property.
     * 
     * @return
     *     possible object is
     *     {@link TrajectLiggingType }
     *     
     */
    public TrajectLiggingType getLigging() {
        return ligging;
    }

    /**
     * Sets the value of the ligging property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrajectLiggingType }
     *     
     */
    public void setLigging(TrajectLiggingType value) {
        this.ligging = value;
    }

    /**
     * Gets the value of the trajectStations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trajectStations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrajectStations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StationType }
     * 
     * 
     */
    public List<StationType> getTrajectStations() {
        if (trajectStations == null) {
            trajectStations = new ArrayList<StationType>();
        }
        return this.trajectStations;
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
     * Gets the value of the trajectVervoerder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trajectVervoerder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrajectVervoerder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTrajectVervoerder() {
        if (trajectVervoerder == null) {
            trajectVervoerder = new ArrayList<String>();
        }
        return this.trajectVervoerder;
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
