
package ns.cdm.reisinformatie.data.vi._1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.w3c.dom.Element;


/**
 * De gegevens benodigd voor de identificatie van het bericht met een reisinformatieproduct
 * 
 * <p>Java class for RIPAdministratieType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RIPAdministratieType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReisInformatieProductId" type="{urn:ns:cdm:reisinformatie:data:vi:1}ReisInformatieProductIdType"/&gt;
 *         &lt;element name="AbonnementId" type="{urn:ns:cdm:reisinformatie:data:vi:1}AbonnementIdType"/&gt;
 *         &lt;element name="ReisInformatieTijdstip" type="{urn:ns:cdm:reisinformatie:data:vi:1}ReisInformatieTijdstipType"/&gt;
 *         &lt;any processContents='skip' namespace='##other' maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RIPAdministratieType", propOrder = {
    "reisInformatieProductId",
    "abonnementId",
    "reisInformatieTijdstip",
    "any"
})
public class RIPAdministratieType {

    @XmlElement(name = "ReisInformatieProductId", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger reisInformatieProductId;
    @XmlElement(name = "AbonnementId", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger abonnementId;
    @XmlElement(name = "ReisInformatieTijdstip", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reisInformatieTijdstip;
    @XmlAnyElement
    protected List<Element> any;

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
     * Gets the value of the abonnementId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAbonnementId() {
        return abonnementId;
    }

    /**
     * Sets the value of the abonnementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAbonnementId(BigInteger value) {
        this.abonnementId = value;
    }

    /**
     * Gets the value of the reisInformatieTijdstip property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReisInformatieTijdstip() {
        return reisInformatieTijdstip;
    }

    /**
     * Sets the value of the reisInformatieTijdstip property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReisInformatieTijdstip(XMLGregorianCalendar value) {
        this.reisInformatieTijdstip = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * 
     * 
     */
    public List<Element> getAny() {
        if (any == null) {
            any = new ArrayList<Element>();
        }
        return this.any;
    }

}
