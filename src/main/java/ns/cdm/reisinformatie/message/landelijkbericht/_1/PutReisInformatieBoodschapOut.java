
package ns.cdm.reisinformatie.message.landelijkbericht._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{urn:ns:cdm:reisinformatie:message:landelijkbericht:1}ReisInformatieProductPILResponse"/&gt;
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
    "reisInformatieProductPILResponse"
})
@XmlRootElement(name = "PutReisInformatieBoodschapOut")
public class PutReisInformatieBoodschapOut {

    @XmlElement(name = "ReisInformatieProductPILResponse", required = true)
    protected ReisInformatieProductPILResponse reisInformatieProductPILResponse;

    /**
     * Gets the value of the reisInformatieProductPILResponse property.
     * 
     * @return
     *     possible object is
     *     {@link ReisInformatieProductPILResponse }
     *     
     */
    public ReisInformatieProductPILResponse getReisInformatieProductPILResponse() {
        return reisInformatieProductPILResponse;
    }

    /**
     * Sets the value of the reisInformatieProductPILResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReisInformatieProductPILResponse }
     *     
     */
    public void setReisInformatieProductPILResponse(ReisInformatieProductPILResponse value) {
        this.reisInformatieProductPILResponse = value;
    }

}
