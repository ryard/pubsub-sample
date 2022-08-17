
package ns.cdm.reisinformatie.data.vi._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VerstoringSoortType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="VerstoringSoortType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EV"/&gt;
 *     &lt;enumeration value="GV"/&gt;
 *     &lt;enumeration value="ET"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VerstoringSoortType")
@XmlEnum
public enum VerstoringSoortType {

    EV,
    GV,
    ET;

    public String value() {
        return name();
    }

    public static VerstoringSoortType fromValue(String v) {
        return valueOf(v);
    }

}
