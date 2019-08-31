//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.20 at 12:48:21 PM GMT 
//

package weka.core.pmml.jaxbbindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ParameterField element declaration.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;element name="ParameterField">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;attribute name="dataType" type="{http://www.dmg.org/PMML-4_1}DATATYPE" />
 *         &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="optype" type="{http://www.dmg.org/PMML-4_1}OPTYPE" />
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "ParameterField")
public class ParameterField {

    @XmlAttribute
    protected DATATYPE dataType;
    @XmlAttribute(required = true)
    protected String name;
    @XmlAttribute
    protected OPTYPE optype;

    /**
     * Gets the value of the dataType property.
     * 
     * @return possible object is {@link DATATYPE }
     * 
     */
    public DATATYPE getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value allowed object is {@link DATATYPE }
     * 
     */
    public void setDataType(DATATYPE value) {
        this.dataType = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the optype property.
     * 
     * @return possible object is {@link OPTYPE }
     * 
     */
    public OPTYPE getOptype() {
        return optype;
    }

    /**
     * Sets the value of the optype property.
     * 
     * @param value allowed object is {@link OPTYPE }
     * 
     */
    public void setOptype(OPTYPE value) {
        this.optype = value;
    }

}
