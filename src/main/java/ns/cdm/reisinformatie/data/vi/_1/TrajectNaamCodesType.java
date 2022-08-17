
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
 * Geeft de naam van een traject aan voor o.a. de InfoPlus bedienaar en NS, hierin zijn in de meeste gevallen 2 stationscodes opgenomen en in sommige gevallen aangevuld met een of twee via-stationcode(s). 
 * 
 * <p>Java class for TrajectNaamCodesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrajectNaamCodesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VanStationCode" type="{urn:ns:cdm:reisinformatie:data:vi:1}StationCodeType"/&gt;
 *         &lt;element name="ViaStationCode" type="{urn:ns:cdm:reisinformatie:data:vi:1}StationCodeType" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element name="NaarStationCode" type="{urn:ns:cdm:reisinformatie:data:vi:1}StationCodeType"/&gt;
 *         &lt;element name="Achtervoegsel" type="{urn:ns:cdm:reisinformatie:data:vi:1}AchtervoegselType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrajectNaamCodesType", propOrder = {
    "vanStationCode",
    "viaStationCode",
    "naarStationCode",
    "achtervoegsel"
})
public class TrajectNaamCodesType {

    @XmlElement(name = "VanStationCode", required = true)
    protected String vanStationCode;
    @XmlElement(name = "ViaStationCode")
    protected List<String> viaStationCode;
    @XmlElement(name = "NaarStationCode", required = true)
    protected String naarStationCode;
    @XmlElement(name = "Achtervoegsel")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String achtervoegsel;

    /**
     * Gets the value of the vanStationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVanStationCode() {
        return vanStationCode;
    }

    /**
     * Sets the value of the vanStationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVanStationCode(String value) {
        this.vanStationCode = value;
    }

    /**
     * Gets the value of the viaStationCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the viaStationCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getViaStationCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getViaStationCode() {
        if (viaStationCode == null) {
            viaStationCode = new ArrayList<String>();
        }
        return this.viaStationCode;
    }

    /**
     * Gets the value of the naarStationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaarStationCode() {
        return naarStationCode;
    }

    /**
     * Sets the value of the naarStationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaarStationCode(String value) {
        this.naarStationCode = value;
    }

    /**
     * Gets the value of the achtervoegsel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAchtervoegsel() {
        return achtervoegsel;
    }

    /**
     * Sets the value of the achtervoegsel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAchtervoegsel(String value) {
        this.achtervoegsel = value;
    }

}
