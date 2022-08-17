
package ns.cdm.reisinformatie.data.vi._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VerstoordBaanvakType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VerstoordBaanvakType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Baanvak" type="{urn:ns:cdm:reisinformatie:data:vi:1}BaanvakType" maxOccurs="2"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerstoordBaanvakType", propOrder = {
    "baanvak"
})
public class VerstoordBaanvakType {

    @XmlElement(name = "Baanvak", required = true)
    protected List<BaanvakType> baanvak;

    /**
     * Gets the value of the baanvak property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the baanvak property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBaanvak().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BaanvakType }
     * 
     * 
     */
    public List<BaanvakType> getBaanvak() {
        if (baanvak == null) {
            baanvak = new ArrayList<BaanvakType>();
        }
        return this.baanvak;
    }

}
