
package ns.cdm.reisinformatie.data.vi._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndicatieType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="IndicatieType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="N"/&gt;
 *     &lt;enumeration value="J"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IndicatieType")
@XmlEnum
public enum IndicatieType {

    N,
    J;

    public String value() {
        return name();
    }

    public static IndicatieType fromValue(String v) {
        return valueOf(v);
    }

}
