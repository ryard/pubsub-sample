
package ns.cdm.reisinformatie.data.vi._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActueleLandelijkeBerichtenType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActueleLandelijkeBerichtenType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LandelijkBericht" type="{urn:ns:cdm:reisinformatie:data:vi:1}LandelijkBerichtType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Versie" use="required" type="{urn:ns:cdm:reisinformatie:data:vi:1}VersieType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActueleLandelijkeBerichtenType", propOrder = {
    "landelijkBericht"
})
public class ActueleLandelijkeBerichtenType {

    @XmlElement(name = "LandelijkBericht")
    protected List<LandelijkBerichtType> landelijkBericht;
    @XmlAttribute(name = "Versie", required = true)
    protected String versie;

    /**
     * Gets the value of the landelijkBericht property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the landelijkBericht property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLandelijkBericht().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LandelijkBerichtType }
     * 
     * 
     */
    public List<LandelijkBerichtType> getLandelijkBericht() {
        if (landelijkBericht == null) {
            landelijkBericht = new ArrayList<LandelijkBerichtType>();
        }
        return this.landelijkBericht;
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

}
