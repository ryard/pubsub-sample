
package ns.cdm.reisinformatie.data.vi._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PresentatieTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PresentatieTypeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *     &lt;enumeration value="Kort"/&gt;
 *     &lt;enumeration value="Middel"/&gt;
 *     &lt;enumeration value="Lang"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PresentatieTypeType")
@XmlEnum
public enum PresentatieTypeType {

    @XmlEnumValue("Kort")
    KORT("Kort"),
    @XmlEnumValue("Middel")
    MIDDEL("Middel"),
    @XmlEnumValue("Lang")
    LANG("Lang");
    private final String value;

    PresentatieTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PresentatieTypeType fromValue(String v) {
        for (PresentatieTypeType c: PresentatieTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
