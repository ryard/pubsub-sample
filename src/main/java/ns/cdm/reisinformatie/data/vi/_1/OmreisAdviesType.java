
package ns.cdm.reisinformatie.data.vi._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Geeft de omreisadviezenomschrijving weer.
 * 
 * <p>Java class for OmreisAdviesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OmreisAdviesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReisAdviesCode" type="{urn:ns:cdm:reisinformatie:data:vi:1}ReisAdviesCodeType"/&gt;
 *         &lt;element name="Omschrijving" type="{urn:ns:cdm:reisinformatie:data:vi:1}OmschrijvingInTaalType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="OmreisAdviesStation" type="{urn:ns:cdm:reisinformatie:data:vi:1}StationType" maxOccurs="2"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OmreisAdviesType", propOrder = {
    "reisAdviesCode",
    "omschrijving",
    "omreisAdviesStation"
})
public class OmreisAdviesType {

    @XmlElement(name = "ReisAdviesCode", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String reisAdviesCode;
    @XmlElement(name = "Omschrijving", required = true)
    protected List<OmschrijvingInTaalType> omschrijving;
    @XmlElement(name = "OmreisAdviesStation", required = true)
    protected List<StationType> omreisAdviesStation;

    /**
     * Gets the value of the reisAdviesCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReisAdviesCode() {
        return reisAdviesCode;
    }

    /**
     * Sets the value of the reisAdviesCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReisAdviesCode(String value) {
        this.reisAdviesCode = value;
    }

    /**
     * Gets the value of the omschrijving property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the omschrijving property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOmschrijving().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OmschrijvingInTaalType }
     * 
     * 
     */
    public List<OmschrijvingInTaalType> getOmschrijving() {
        if (omschrijving == null) {
            omschrijving = new ArrayList<OmschrijvingInTaalType>();
        }
        return this.omschrijving;
    }

    /**
     * Gets the value of the omreisAdviesStation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the omreisAdviesStation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOmreisAdviesStation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StationType }
     * 
     * 
     */
    public List<StationType> getOmreisAdviesStation() {
        if (omreisAdviesStation == null) {
            omreisAdviesStation = new ArrayList<StationType>();
        }
        return this.omreisAdviesStation;
    }

}
