
package ns.cdm.reisinformatie.data.vi._1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * Geeft de locatie van een infra verstoring en de gevolgen voor de treindienst.
 * 
 * <p>Java class for BaanvakBeperkingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaanvakBeperkingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{urn:ns:cdm:reisinformatie:data:vi:1}BaanvakBeperkingIdType"/&gt;
 *         &lt;element name="StationVan" type="{urn:ns:cdm:reisinformatie:data:vi:1}StationType"/&gt;
 *         &lt;element name="StationVia" type="{urn:ns:cdm:reisinformatie:data:vi:1}StationType" minOccurs="0"/&gt;
 *         &lt;element name="StationTot" type="{urn:ns:cdm:reisinformatie:data:vi:1}StationType" minOccurs="0"/&gt;
 *         &lt;element name="Richting" type="{urn:ns:cdm:reisinformatie:data:vi:1}RichtingType"/&gt;
 *         &lt;choice&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="GevolgenTreindienst" type="{urn:ns:cdm:reisinformatie:data:vi:1}GevolgenTreindienstType"/&gt;
 *             &lt;element name="MateVertraging" type="{urn:ns:cdm:reisinformatie:data:vi:1}MateVertragingType" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;element name="MateVertraging" type="{urn:ns:cdm:reisinformatie:data:vi:1}MateVertragingType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="Traject" type="{urn:ns:cdm:reisinformatie:data:vi:1}TrajectType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="PresentatieBaanvakBeperking" type="{urn:ns:cdm:reisinformatie:data:vi:1}MeertaligeUitingenType" minOccurs="0"/&gt;
 *         &lt;element name="PresentatieMateVertraging" type="{urn:ns:cdm:reisinformatie:data:vi:1}MeertaligeUitingenType" minOccurs="0"/&gt;
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
@XmlType(name = "BaanvakBeperkingType", propOrder = {
    "content"
})
public class BaanvakBeperkingType {

    @XmlElementRefs({
        @XmlElementRef(name = "Id", namespace = "urn:ns:cdm:reisinformatie:data:vi:1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "StationVan", namespace = "urn:ns:cdm:reisinformatie:data:vi:1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "StationVia", namespace = "urn:ns:cdm:reisinformatie:data:vi:1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "StationTot", namespace = "urn:ns:cdm:reisinformatie:data:vi:1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Richting", namespace = "urn:ns:cdm:reisinformatie:data:vi:1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "GevolgenTreindienst", namespace = "urn:ns:cdm:reisinformatie:data:vi:1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "MateVertraging", namespace = "urn:ns:cdm:reisinformatie:data:vi:1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Traject", namespace = "urn:ns:cdm:reisinformatie:data:vi:1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PresentatieBaanvakBeperking", namespace = "urn:ns:cdm:reisinformatie:data:vi:1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PresentatieMateVertraging", namespace = "urn:ns:cdm:reisinformatie:data:vi:1", type = JAXBElement.class, required = false)
    })
    @XmlAnyElement
    protected List<Object> content;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "MateVertraging" is used by two different parts of a schema. See: 
     * line 101 of file:/C:/repos/MavenRepos/soap-pil-ps/src/main/resources/wsdl/ri-cdm-common-vi.xsd
     * line 99 of file:/C:/repos/MavenRepos/soap-pil-ps/src/main/resources/wsdl/ri-cdm-common-vi.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link GevolgenTreindienstType }{@code >}
     * {@link JAXBElement }{@code <}{@link MateVertragingType }{@code >}
     * {@link JAXBElement }{@code <}{@link MeertaligeUitingenType }{@code >}
     * {@link JAXBElement }{@code <}{@link MeertaligeUitingenType }{@code >}
     * {@link JAXBElement }{@code <}{@link RichtingType }{@code >}
     * {@link JAXBElement }{@code <}{@link StationType }{@code >}
     * {@link JAXBElement }{@code <}{@link StationType }{@code >}
     * {@link JAXBElement }{@code <}{@link StationType }{@code >}
     * {@link JAXBElement }{@code <}{@link TrajectType }{@code >}
     * {@link Element }
     * 
     * 
     */
    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
    }

}
