
package ns.cdm.reisinformatie.data.vi._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WijzigingTypeBerichtType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="WijzigingTypeBerichtType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="N"/&gt;
 *     &lt;enumeration value="W"/&gt;
 *     &lt;enumeration value="V"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WijzigingTypeBerichtType")
@XmlEnum
public enum WijzigingTypeBerichtType {

    N,
    W,
    V;

    public String value() {
        return name();
    }

    public static WijzigingTypeBerichtType fromValue(String v) {
        return valueOf(v);
    }

}
