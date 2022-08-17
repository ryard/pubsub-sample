
package ns.cdm.reisinformatie.data.vi._1;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * <p>Java class for ReisInformatieProductPatroonInformatieLandelijkType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReisInformatieProductPatroonInformatieLandelijkType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RIPAdministratie" type="{urn:ns:cdm:reisinformatie:data:vi:1}RIPAdministratieType"/&gt;
 *         &lt;element name="LandelijkePatroonInformatie" type="{urn:ns:cdm:reisinformatie:data:vi:1}LandelijkePatroonInformatieType"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Versie" use="required" type="{urn:ns:cdm:reisinformatie:data:vi:1}VersieType" /&gt;
 *       &lt;attribute name="TimeStamp" use="required" type="{urn:ns:cdm:reisinformatie:data:vi:1}TimeStampType" /&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReisInformatieProductPatroonInformatieLandelijkType", propOrder = {
    "ripAdministratie",
    "landelijkePatroonInformatie"
})
public class ReisInformatieProductPatroonInformatieLandelijkType {

    @XmlElement(name = "RIPAdministratie", required = true)
    protected RIPAdministratieType ripAdministratie;
    @XmlElement(name = "LandelijkePatroonInformatie", required = true)
    protected LandelijkePatroonInformatieType landelijkePatroonInformatie;
    @XmlAttribute(name = "Versie", required = true)
    protected String versie;
    @XmlAttribute(name = "TimeStamp", required = true)
    protected XMLGregorianCalendar timeStamp;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the ripAdministratie property.
     * 
     * @return
     *     possible object is
     *     {@link RIPAdministratieType }
     *     
     */
    public RIPAdministratieType getRIPAdministratie() {
        return ripAdministratie;
    }

    /**
     * Sets the value of the ripAdministratie property.
     * 
     * @param value
     *     allowed object is
     *     {@link RIPAdministratieType }
     *     
     */
    public void setRIPAdministratie(RIPAdministratieType value) {
        this.ripAdministratie = value;
    }

    /**
     * Gets the value of the landelijkePatroonInformatie property.
     * 
     * @return
     *     possible object is
     *     {@link LandelijkePatroonInformatieType }
     *     
     */
    public LandelijkePatroonInformatieType getLandelijkePatroonInformatie() {
        return landelijkePatroonInformatie;
    }

    /**
     * Sets the value of the landelijkePatroonInformatie property.
     * 
     * @param value
     *     allowed object is
     *     {@link LandelijkePatroonInformatieType }
     *     
     */
    public void setLandelijkePatroonInformatie(LandelijkePatroonInformatieType value) {
        this.landelijkePatroonInformatie = value;
    }

    /**
     * Gets the value of the versie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersie() {
        return versie;
    }

    /**
     * Sets the value of the versie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersie(String value) {
        this.versie = value;
    }

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeStamp(XMLGregorianCalendar value) {
        this.timeStamp = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
