
package ns.cdm.reisinformatie.data.vi._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Geeft de naam van een traject aan in halffabricaat, hierin zijn in de meeste gevallen 2 stations (of stads)namen opgenomen en in sommige gevallen aangevuld met een of twee via-station(s) of steden.
 * 
 * <p>Java class for TrajectNaamType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrajectNaamType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Van" type="{urn:ns:cdm:reisinformatie:data:vi:1}LangeStationNaamType"/&gt;
 *         &lt;element name="Via" type="{urn:ns:cdm:reisinformatie:data:vi:1}LangeStationNaamType" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element name="Naar" type="{urn:ns:cdm:reisinformatie:data:vi:1}LangeStationNaamType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrajectNaamType", propOrder = {
    "van",
    "via",
    "naar"
})
public class TrajectNaamType {

    @XmlElement(name = "Van", required = true)
    protected String van;
    @XmlElement(name = "Via")
    protected List<String> via;
    @XmlElement(name = "Naar", required = true)
    protected String naar;

    /**
     * Gets the value of the van property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVan() {
        return van;
    }

    /**
     * Sets the value of the van property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVan(String value) {
        this.van = value;
    }

    /**
     * Gets the value of the via property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the via property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVia().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getVia() {
        if (via == null) {
            via = new ArrayList<String>();
        }
        return this.via;
    }

    /**
     * Gets the value of the naar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaar() {
        return naar;
    }

    /**
     * Sets the value of the naar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaar(String value) {
        this.naar = value;
    }

}
