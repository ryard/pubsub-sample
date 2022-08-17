
package ns.cdm.reisinformatie.data.vi._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ISO6391LanguageCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ISO6391LanguageCodeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="nl"/&gt;
 *     &lt;enumeration value="en"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ISO6391LanguageCodeContentType")
@XmlEnum
public enum ISO6391LanguageCodeContentType {


    /**
     * Dutch; Flemish
     * 
     */
    @XmlEnumValue("nl")
    NL("nl"),

    /**
     * English
     * 
     */
    @XmlEnumValue("en")
    EN("en");
    private final String value;

    ISO6391LanguageCodeContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ISO6391LanguageCodeContentType fromValue(String v) {
        for (ISO6391LanguageCodeContentType c: ISO6391LanguageCodeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
