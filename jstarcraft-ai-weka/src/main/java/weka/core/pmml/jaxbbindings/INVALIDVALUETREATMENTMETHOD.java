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
 * Java class for INVALID-VALUE-TREATMENT-METHOD.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="INVALID-VALUE-TREATMENT-METHOD">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="returnInvalid"/>
 *     &lt;enumeration value="asIs"/>
 *     &lt;enumeration value="asMissing"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum INVALIDVALUETREATMENTMETHOD {

    @XmlEnumValue("asIs")
    AS_IS("asIs"), @XmlEnumValue("asMissing")
    AS_MISSING("asMissing"), @XmlEnumValue("returnInvalid")
    RETURN_INVALID("returnInvalid");
    private final String value;

    INVALIDVALUETREATMENTMETHOD(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static INVALIDVALUETREATMENTMETHOD fromValue(String v) {
        for (INVALIDVALUETREATMENTMETHOD c : INVALIDVALUETREATMENTMETHOD.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
