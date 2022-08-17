
package ns.cdm.reisinformatie.data.vi._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DagenType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DagenType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Ma"/&gt;
 *     &lt;enumeration value="Di"/&gt;
 *     &lt;enumeration value="Wo"/&gt;
 *     &lt;enumeration value="Do"/&gt;
 *     &lt;enumeration value="Vr"/&gt;
 *     &lt;enumeration value="Za"/&gt;
 *     &lt;enumeration value="Zo"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DagenType")
@XmlEnum
public enum DagenType {

    @XmlEnumValue("Ma")
    MA("Ma"),
    @XmlEnumValue("Di")
    DI("Di"),
    @XmlEnumValue("Wo")
    WO("Wo"),
    @XmlEnumValue("Do")
    DO("Do"),
    @XmlEnumValue("Vr")
    VR("Vr"),
    @XmlEnumValue("Za")
    ZA("Za"),
    @XmlEnumValue("Zo")
    ZO("Zo");
    private final String value;

    DagenType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DagenType fromValue(String v) {
        for (DagenType c: DagenType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
