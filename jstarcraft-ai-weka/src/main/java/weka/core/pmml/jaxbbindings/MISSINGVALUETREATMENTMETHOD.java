//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.20 at 12:48:21 PM GMT 
//

package weka.core.pmml.jaxbbindings;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

/**
 * <p>
 * Java class for MISSING-VALUE-TREATMENT-METHOD.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="MISSING-VALUE-TREATMENT-METHOD">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="asIs"/>
 *     &lt;enumeration value="asMean"/>
 *     &lt;enumeration value="asMode"/>
 *     &lt;enumeration value="asMedian"/>
 *     &lt;enumeration value="asValue"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum MISSINGVALUETREATMENTMETHOD {

    @XmlEnumValue("asIs")
    AS_IS("asIs"), @XmlEnumValue("asMean")
    AS_MEAN("asMean"), @XmlEnumValue("asMedian")
    AS_MEDIAN("asMedian"), @XmlEnumValue("asMode")
    AS_MODE("asMode"), @XmlEnumValue("asValue")
    AS_VALUE("asValue");
    private final String value;

    MISSINGVALUETREATMENTMETHOD(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MISSINGVALUETREATMENTMETHOD fromValue(String v) {
        for (MISSINGVALUETREATMENTMETHOD c : MISSINGVALUETREATMENTMETHOD.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
