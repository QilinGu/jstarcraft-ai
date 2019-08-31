//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.20 at 12:48:21 PM GMT 
//

package weka.core.pmml.jaxbbindings;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for BayesOutput element declaration.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;element name="BayesOutput">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{http://www.dmg.org/PMML-4_1}Extension" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.dmg.org/PMML-4_1}TargetValueCounts"/>
 *         &lt;/sequence>
 *         &lt;attribute name="fieldName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "extension", "targetValueCounts" })
@XmlRootElement(name = "BayesOutput")
public class BayesOutput {

    @XmlElement(name = "Extension", namespace = "http://www.dmg.org/PMML-4_1", required = true)
    protected List<Extension> extension;
    @XmlElement(name = "TargetValueCounts", namespace = "http://www.dmg.org/PMML-4_1", required = true)
    protected TargetValueCounts targetValueCounts;
    @XmlAttribute(required = true)
    protected String fieldName;

    /**
     * Gets the value of the extension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the extension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Extension }
     * 
     * 
     */
    public List<Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<Extension>();
        }
        return this.extension;
    }

    /**
     * Gets the value of the targetValueCounts property.
     * 
     * @return possible object is {@link TargetValueCounts }
     * 
     */
    public TargetValueCounts getTargetValueCounts() {
        return targetValueCounts;
    }

    /**
     * Sets the value of the targetValueCounts property.
     * 
     * @param value allowed object is {@link TargetValueCounts }
     * 
     */
    public void setTargetValueCounts(TargetValueCounts value) {
        this.targetValueCounts = value;
    }

    /**
     * Gets the value of the fieldName property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * Sets the value of the fieldName property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setFieldName(String value) {
        this.fieldName = value;
    }

}
