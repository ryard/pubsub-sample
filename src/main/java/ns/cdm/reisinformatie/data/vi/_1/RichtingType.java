
package ns.cdm.reisinformatie.data.vi._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RichtingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="RichtingType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;minLength value="1"/&gt;
 *     &lt;maxLength value="5"/&gt;
 *     &lt;enumeration value="Heen"/&gt;
 *     &lt;enumeration value="Beide"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RichtingType")
@XmlEnum
public enum RichtingType {

    @XmlEnumValue("Heen")
    HEEN("Heen"),
    @XmlEnumValue("Beide")
    BEIDE("Beide");
    private final String value;

    RichtingType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RichtingType fromValue(String v) {
        for (RichtingType c: RichtingType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
