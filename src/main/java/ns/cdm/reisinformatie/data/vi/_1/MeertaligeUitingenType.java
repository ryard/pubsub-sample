
package ns.cdm.reisinformatie.data.vi._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Geeft de uitingen van een presentatielement
 * 
 * <p>Java class for MeertaligeUitingenType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeertaligeUitingenType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Uitingen" type="{urn:ns:cdm:reisinformatie:data:vi:1}UitingenType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeertaligeUitingenType", propOrder = {
    "uitingen"
})
public class MeertaligeUitingenType {

    @XmlElement(name = "Uitingen", required = true)
    protected List<UitingenType> uitingen;

    /**
     * Gets the value of the uitingen property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uitingen property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUitingen().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UitingenType }
     * 
     * 
     */
    public List<UitingenType> getUitingen() {
        if (uitingen == null) {
            uitingen = new ArrayList<UitingenType>();
        }
        return this.uitingen;
    }

}
