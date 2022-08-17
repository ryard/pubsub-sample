
package ns.cdm.reisinformatie.data.vi._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrajectCategorieType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TrajectCategorieType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *     &lt;enumeration value="NL"/&gt;
 *     &lt;enumeration value="Buurland"/&gt;
 *     &lt;enumeration value="HSL"/&gt;
 *     &lt;enumeration value="Internationaal"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TrajectCategorieType")
@XmlEnum
public enum TrajectCategorieType {

    NL("NL"),
    @XmlEnumValue("Buurland")
    BUURLAND("Buurland"),
    HSL("HSL"),
    @XmlEnumValue("Internationaal")
    INTERNATIONAAL("Internationaal");
    private final String value;

    TrajectCategorieType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TrajectCategorieType fromValue(String v) {
        for (TrajectCategorieType c: TrajectCategorieType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
