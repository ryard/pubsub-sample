
package ns.cdm.reisinformatie.data.vi._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GevolgenTreindienstNiveauType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="GevolgenTreindienstNiveauType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *     &lt;maxLength value="40"/&gt;
 *     &lt;minLength value="1"/&gt;
 *     &lt;enumeration value="GeenOfVeelMinderTreinen"/&gt;
 *     &lt;enumeration value="MinderTreinen"/&gt;
 *     &lt;enumeration value="NormaalAantalOfMeerTreinen"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GevolgenTreindienstNiveauType")
@XmlEnum
public enum GevolgenTreindienstNiveauType {

    @XmlEnumValue("GeenOfVeelMinderTreinen")
    GEEN_OF_VEEL_MINDER_TREINEN("GeenOfVeelMinderTreinen"),
    @XmlEnumValue("MinderTreinen")
    MINDER_TREINEN("MinderTreinen"),
    @XmlEnumValue("NormaalAantalOfMeerTreinen")
    NORMAAL_AANTAL_OF_MEER_TREINEN("NormaalAantalOfMeerTreinen");
    private final String value;

    GevolgenTreindienstNiveauType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GevolgenTreindienstNiveauType fromValue(String v) {
        for (GevolgenTreindienstNiveauType c: GevolgenTreindienstNiveauType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
