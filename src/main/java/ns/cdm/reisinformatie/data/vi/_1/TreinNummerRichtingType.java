
package ns.cdm.reisinformatie.data.vi._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TreinNummerRichtingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TreinNummerRichtingType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Even"/&gt;
 *     &lt;enumeration value="Oneven"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TreinNummerRichtingType")
@XmlEnum
public enum TreinNummerRichtingType {

    @XmlEnumValue("Even")
    EVEN("Even"),
    @XmlEnumValue("Oneven")
    ONEVEN("Oneven");
    private final String value;

    TreinNummerRichtingType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TreinNummerRichtingType fromValue(String v) {
        for (TreinNummerRichtingType c: TreinNummerRichtingType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
