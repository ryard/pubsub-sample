
package ns.cdm.reisinformatie.data.vi._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Geeft de treinserie aan zoals gebruikt in een maatregel. Alleen de basistreinnummer series komen voor.
 * 			Van een treinserie worden het laagste, het hoogste nummer opgenomen zoals deze voorkomen in de stamtabel TSE.
 * 			
 * 
 * <p>Java class for TreinSerieInMaatregelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TreinSerieInMaatregelType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LaagsteTreinnr" type="{urn:ns:cdm:reisinformatie:data:vi:1}TreinNummerType"/&gt;
 *         &lt;element name="HoogsteTreinnr" type="{urn:ns:cdm:reisinformatie:data:vi:1}TreinNummerType"/&gt;
 *         &lt;element name="BeginStation" type="{urn:ns:cdm:reisinformatie:data:vi:1}StationType" maxOccurs="2"/&gt;
 *         &lt;element name="ViaStation" type="{urn:ns:cdm:reisinformatie:data:vi:1}StationType" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element name="EindStation" type="{urn:ns:cdm:reisinformatie:data:vi:1}StationType" maxOccurs="2"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TreinSerieInMaatregelType", propOrder = {
    "laagsteTreinnr",
    "hoogsteTreinnr",
    "beginStation",
    "viaStation",
    "eindStation"
})
public class TreinSerieInMaatregelType {

    @XmlElement(name = "LaagsteTreinnr")
    @XmlSchemaType(name = "positiveInteger")
    protected int laagsteTreinnr;
    @XmlElement(name = "HoogsteTreinnr")
    @XmlSchemaType(name = "positiveInteger")
    protected int hoogsteTreinnr;
    @XmlElement(name = "BeginStation", required = true)
    protected List<StationType> beginStation;
    @XmlElement(name = "ViaStation")
    protected List<StationType> viaStation;
    @XmlElement(name = "EindStation", required = true)
    protected List<StationType> eindStation;

    /**
     * Gets the value of the laagsteTreinnr property.
     * 
     */
    public int getLaagsteTreinnr() {
        return laagsteTreinnr;
    }

    /**
     * Sets the value of the laagsteTreinnr property.
     * 
     */
    public void setLaagsteTreinnr(int value) {
        this.laagsteTreinnr = value;
    }

    /**
     * Gets the value of the hoogsteTreinnr property.
     * 
     */
    public int getHoogsteTreinnr() {
        return hoogsteTreinnr;
    }

    /**
     * Sets the value of the hoogsteTreinnr property.
     * 
     */
    public void setHoogsteTreinnr(int value) {
        this.hoogsteTreinnr = value;
    }

    /**
     * Gets the value of the beginStation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the beginStation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBeginStation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StationType }
     * 
     * 
     */
    public List<StationType> getBeginStation() {
        if (beginStation == null) {
            beginStation = new ArrayList<StationType>();
        }
        return this.beginStation;
    }

    /**
     * Gets the value of the viaStation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the viaStation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getViaStation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StationType }
     * 
     * 
     */
    public List<StationType> getViaStation() {
        if (viaStation == null) {
            viaStation = new ArrayList<StationType>();
        }
        return this.viaStation;
    }

    /**
     * Gets the value of the eindStation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eindStation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEindStation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StationType }
     * 
     * 
     */
    public List<StationType> getEindStation() {
        if (eindStation == null) {
            eindStation = new ArrayList<StationType>();
        }
        return this.eindStation;
    }

}
