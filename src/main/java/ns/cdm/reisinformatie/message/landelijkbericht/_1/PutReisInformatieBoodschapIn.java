
package ns.cdm.reisinformatie.message.landelijkbericht._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import ns.cdm.reisinformatie.data.vi._1.ReisInformatieProductPatroonInformatieLandelijkType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ns:cdm:reisinformatie:data:vi:1}ReisInformatieProductPatroonInformatieLandelijk"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "reisInformatieProductPatroonInformatieLandelijk"
})
@XmlRootElement(name = "PutReisInformatieBoodschapIn")
public class PutReisInformatieBoodschapIn {

    @XmlElement(name = "ReisInformatieProductPatroonInformatieLandelijk", namespace = "urn:ns:cdm:reisinformatie:data:vi:1", required = true)
    protected ReisInformatieProductPatroonInformatieLandelijkType reisInformatieProductPatroonInformatieLandelijk;

    /**
     * Gets the value of the reisInformatieProductPatroonInformatieLandelijk property.
     * 
     * @return
     *     possible object is
     *     {@link ReisInformatieProductPatroonInformatieLandelijkType }
     *     
     */
    public ReisInformatieProductPatroonInformatieLandelijkType getReisInformatieProductPatroonInformatieLandelijk() {
        return reisInformatieProductPatroonInformatieLandelijk;
    }

    /**
     * Sets the value of the reisInformatieProductPatroonInformatieLandelijk property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReisInformatieProductPatroonInformatieLandelijkType }
     *     
     */
    public void setReisInformatieProductPatroonInformatieLandelijk(ReisInformatieProductPatroonInformatieLandelijkType value) {
        this.reisInformatieProductPatroonInformatieLandelijk = value;
    }

}
