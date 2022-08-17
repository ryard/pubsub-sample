
package ns.cdm.reisinformatie.data.vi._1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LandelijkBerichtType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LandelijkBerichtType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReisInformatieProductId" type="{urn:ns:cdm:reisinformatie:data:vi:1}ReisInformatieProductIdType"/&gt;
 *         &lt;element name="LandelijkPatroonInformatie" type="{urn:ns:cdm:reisinformatie:data:vi:1}LandelijkePatroonInformatieType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LandelijkBerichtType", propOrder = {
    "reisInformatieProductId",
    "landelijkPatroonInformatie"
})
public class LandelijkBerichtType {

    @XmlElement(name = "ReisInformatieProductId", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger reisInformatieProductId;
    @XmlElement(name = "LandelijkPatroonInformatie", required = true)
    protected LandelijkePatroonInformatieType landelijkPatroonInformatie;

    /**
     * Gets the value of the reisInformatieProductId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReisInformatieProductId() {
        return reisInformatieProductId;
    }

    /**
     * Sets the value of the reisInformatieProductId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReisInformatieProductId(BigInteger value) {
        this.reisInformatieProductId = value;
    }

    /**
     * Gets the value of the landelijkPatroonInformatie property.
     * 
     * @return
     *     possible object is
     *     {@link LandelijkePatroonInformatieType }
     *     
     */
    public LandelijkePatroonInformatieType getLandelijkPatroonInformatie() {
        return landelijkPatroonInformatie;
    }

    /**
     * Sets the value of the landelijkPatroonInformatie property.
     * 
     * @param value
     *     allowed object is
     *     {@link LandelijkePatroonInformatieType }
     *     
     */
    public void setLandelijkPatroonInformatie(LandelijkePatroonInformatieType value) {
        this.landelijkPatroonInformatie = value;
    }

}
