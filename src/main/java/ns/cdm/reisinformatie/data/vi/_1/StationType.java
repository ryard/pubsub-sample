
package ns.cdm.reisinformatie.data.vi._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Gedeelte van de spoorweg, bestemd (en ingericht) om treinen te doen stoppen, beginnen, eindigen, inhalen of kruisen en voorzien van ten minste één wissel en tevens bestemd (en ingericht) om reizigers te laten in- of uitstappen en/of goederen aan te nemen en /of af te leveren. Het station datatype bevat elementen met informatie over een station.
 * 
 * <p>Java class for StationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StationCode" type="{urn:ns:cdm:reisinformatie:data:vi:1}StationCodeType"/&gt;
 *         &lt;element name="Type" type="{urn:ns:cdm:reisinformatie:data:vi:1}StationTypeType"/&gt;
 *         &lt;element name="KorteNaam" type="{urn:ns:cdm:reisinformatie:data:vi:1}KorteStationNaamType"/&gt;
 *         &lt;element name="MiddelNaam" type="{urn:ns:cdm:reisinformatie:data:vi:1}MiddelStationNaamType"/&gt;
 *         &lt;element name="LangeNaam" type="{urn:ns:cdm:reisinformatie:data:vi:1}LangeStationNaamType"/&gt;
 *         &lt;element name="UICCode" type="{urn:ns:cdm:reisinformatie:data:vi:1}UICCodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StationType", propOrder = {
    "stationCode",
    "type",
    "korteNaam",
    "middelNaam",
    "langeNaam",
    "uicCode"
})
public class StationType {

    @XmlElement(name = "StationCode", required = true)
    protected String stationCode;
    @XmlElement(name = "Type", required = true)
    protected String type;
    @XmlElement(name = "KorteNaam", required = true)
    protected String korteNaam;
    @XmlElement(name = "MiddelNaam", required = true)
    protected String middelNaam;
    @XmlElement(name = "LangeNaam", required = true)
    protected String langeNaam;
    @XmlElement(name = "UICCode")
    protected String uicCode;

    /**
     * Gets the value of the stationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationCode() {
        return stationCode;
    }

    /**
     * Sets the value of the stationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationCode(String value) {
        this.stationCode = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the korteNaam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKorteNaam() {
        return korteNaam;
    }

    /**
     * Sets the value of the korteNaam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKorteNaam(String value) {
        this.korteNaam = value;
    }

    /**
     * Gets the value of the middelNaam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddelNaam() {
        return middelNaam;
    }

    /**
     * Sets the value of the middelNaam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddelNaam(String value) {
        this.middelNaam = value;
    }

    /**
     * Gets the value of the langeNaam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLangeNaam() {
        return langeNaam;
    }

    /**
     * Sets the value of the langeNaam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLangeNaam(String value) {
        this.langeNaam = value;
    }

    /**
     * Gets the value of the uicCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUICCode() {
        return uicCode;
    }

    /**
     * Sets the value of the uicCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUICCode(String value) {
        this.uicCode = value;
    }

}
