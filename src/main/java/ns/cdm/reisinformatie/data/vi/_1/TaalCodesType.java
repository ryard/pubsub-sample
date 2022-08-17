
package ns.cdm.reisinformatie.data.vi._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Geeft de taalcodes weer
 * 
 * <p>Java class for TaalCodesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaalCodesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TaalCode" type="{urn:ns:cdm:reisinformatie:data:vi:1}TaalCodeEnumType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaalCodesType", propOrder = {
    "taalCode"
})
public class TaalCodesType {

    @XmlElement(name = "TaalCode", required = true, defaultValue = "nl")
    @XmlSchemaType(name = "token")
    protected List<ISO6391LanguageCodeContentType> taalCode;

    /**
     * Gets the value of the taalCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taalCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaalCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ISO6391LanguageCodeContentType }
     * 
     * 
     */
    public List<ISO6391LanguageCodeContentType> getTaalCode() {
        if (taalCode == null) {
            taalCode = new ArrayList<ISO6391LanguageCodeContentType>();
        }
        return this.taalCode;
    }

}
