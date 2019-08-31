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
 * Java class for FIELD-USAGE-TYPE.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="FIELD-USAGE-TYPE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="active"/>
 *     &lt;enumeration value="predicted"/>
 *     &lt;enumeration value="supplementary"/>
 *     &lt;enumeration value="group"/>
 *     &lt;enumeration value="order"/>
 *     &lt;enumeration value="frequencyWeight"/>
 *     &lt;enumeration value="analysisWeight"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum FIELDUSAGETYPE {

    @XmlEnumValue("active")
    ACTIVE("active"), @XmlEnumValue("analysisWeight")
    ANALYSIS_WEIGHT("analysisWeight"), @XmlEnumValue("frequencyWeight")
    FREQUENCY_WEIGHT("frequencyWeight"), @XmlEnumValue("group")
    GROUP("group"), @XmlEnumValue("order")
    ORDER("order"), @XmlEnumValue("predicted")
    PREDICTED("predicted"), @XmlEnumValue("supplementary")
    SUPPLEMENTARY("supplementary");
    private final String value;

    FIELDUSAGETYPE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FIELDUSAGETYPE fromValue(String v) {
        for (FIELDUSAGETYPE c : FIELDUSAGETYPE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
