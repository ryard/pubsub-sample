
package ns.cdm.reisinformatie.data.vi._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SignaleringVerstoringType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SignaleringVerstoringType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TijdVak" type="{urn:ns:cdm:reisinformatie:data:vi:1}TijdvakType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="VerstoordBaanvak" type="{urn:ns:cdm:reisinformatie:data:vi:1}VerstoordBaanvakType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignaleringVerstoringType", propOrder = {
    "tijdVak",
    "verstoordBaanvak"
})
public class SignaleringVerstoringType {

    @XmlElement(name = "TijdVak")
    protected List<TijdvakType> tijdVak;
    @XmlElement(name = "VerstoordBaanvak")
    protected List<VerstoordBaanvakType> verstoordBaanvak;

    /**
     * Gets the value of the tijdVak property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tijdVak property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTijdVak().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TijdvakType }
     * 
     * 
     */
    public List<TijdvakType> getTijdVak() {
        if (tijdVak == null) {
            tijdVak = new ArrayList<TijdvakType>();
        }
        return this.tijdVak;
    }

    /**
     * Gets the value of the verstoordBaanvak property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the verstoordBaanvak property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVerstoordBaanvak().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VerstoordBaanvakType }
     * 
     * 
     */
    public List<VerstoordBaanvakType> getVerstoordBaanvak() {
        if (verstoordBaanvak == null) {
            verstoordBaanvak = new ArrayList<VerstoordBaanvakType>();
        }
        return this.verstoordBaanvak;
    }

}
