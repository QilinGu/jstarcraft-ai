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
 * Java class for NN-NORMALIZATION-METHOD.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="NN-NORMALIZATION-METHOD">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="simplemax"/>
 *     &lt;enumeration value="softmax"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum NNNORMALIZATIONMETHOD {

    @XmlEnumValue("none")
    NONE("none"), @XmlEnumValue("simplemax")
    SIMPLEMAX("simplemax"), @XmlEnumValue("softmax")
    SOFTMAX("softmax");
    private final String value;

    NNNORMALIZATIONMETHOD(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NNNORMALIZATIONMETHOD fromValue(String v) {
        for (NNNORMALIZATIONMETHOD c : NNNORMALIZATIONMETHOD.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
