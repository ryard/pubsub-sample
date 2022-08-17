
package ns.cdm.reisinformatie.data.vi._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Geeft de stations waarvoor de beperking geldt.
 * 
 * <p>Java class for StationGeografieType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StationGeografieType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StationVan" type="{urn:ns:cdm:reisinformatie:data:vi:1}StationType"/&gt;
 *         &lt;element name="StationVia" type="{urn:ns:cdm:reisinformatie:data:vi:1}StationType" minOccurs="0"/&gt;
 *         &lt;element name="StationTot" type="{urn:ns:cdm:reisinformatie:data:vi:1}StationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StationGeografieType", propOrder = {
    "stationVan",
    "stationVia",
    "stationTot"
})
public class StationGeografieType {

    @XmlElement(name = "StationVan", required = true)
    protected StationType stationVan;
    @XmlElement(name = "StationVia")
    protected StationType stationVia;
    @XmlElement(name = "StationTot")
    protected StationType stationTot;

    /**
     * Gets the value of the stationVan property.
     * 
     * @return
     *     possible object is
     *     {@link StationType }
     *     
     */
    public StationType getStationVan() {
        return stationVan;
    }

    /**
     * Sets the value of the stationVan property.
     * 
     * @param value
     *     allowed object is
     *     {@link StationType }
     *     
     */
    public void setStationVan(StationType value) {
        this.stationVan = value;
    }

    /**
     * Gets the value of the stationVia property.
     * 
     * @return
     *     possible object is
     *     {@link StationType }
     *     
     */
    public StationType getStationVia() {
        return stationVia;
    }

    /**
     * Sets the value of the stationVia property.
     * 
     * @param value
     *     allowed object is
     *     {@link StationType }
     *     
     */
    public void setStationVia(StationType value) {
        this.stationVia = value;
    }

    /**
     * Gets the value of the stationTot property.
     * 
     * @return
     *     possible object is
     *     {@link StationType }
     *     
     */
    public StationType getStationTot() {
        return stationTot;
    }

    /**
     * Sets the value of the stationTot property.
     * 
     * @param value
     *     allowed object is
     *     {@link StationType }
     *     
     */
    public void setStationTot(StationType value) {
        this.stationTot = value;
    }

}
