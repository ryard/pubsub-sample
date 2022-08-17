
package ns.cdm.reisinformatie.data.vi._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrajectLiggingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TrajectLiggingType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *     &lt;enumeration value="VolledigNL"/&gt;
 *     &lt;enumeration value="DeelsNL"/&gt;
 *     &lt;enumeration value="NietNL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TrajectLiggingType")
@XmlEnum
public enum TrajectLiggingType {

    @XmlEnumValue("VolledigNL")
    VOLLEDIG_NL("VolledigNL"),
    @XmlEnumValue("DeelsNL")
    DEELS_NL("DeelsNL"),
    @XmlEnumValue("NietNL")
    NIET_NL("NietNL");
    private final String value;

    TrajectLiggingType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TrajectLiggingType fromValue(String v) {
        for (TrajectLiggingType c: TrajectLiggingType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
