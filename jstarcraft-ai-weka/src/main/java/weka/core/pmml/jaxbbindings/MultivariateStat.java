//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.20 at 12:48:21 PM GMT 
//

package weka.core.pmml.jaxbbindings;

import java.math.BigDecimal;
import java.math.BigInteger;
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
 * Java class for MultivariateStat element declaration.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;element name="MultivariateStat">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{http://www.dmg.org/PMML-4_1}Extension" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;attribute name="category" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="chiSquareValue" type="{http://www.dmg.org/PMML-4_1}NUMBER" />
 *         &lt;attribute name="confidenceLevel" type="{http://www.dmg.org/PMML-4_1}PROB-NUMBER" default="0.95" />
 *         &lt;attribute name="confidenceLowerBound" type="{http://www.dmg.org/PMML-4_1}NUMBER" />
 *         &lt;attribute name="confidenceUpperBound" type="{http://www.dmg.org/PMML-4_1}NUMBER" />
 *         &lt;attribute name="dF" type="{http://www.dmg.org/PMML-4_1}NUMBER" />
 *         &lt;attribute name="exponent" type="{http://www.dmg.org/PMML-4_1}INT-NUMBER" default="1" />
 *         &lt;attribute name="fStatistic" type="{http://www.dmg.org/PMML-4_1}NUMBER" />
 *         &lt;attribute name="importance" type="{http://www.dmg.org/PMML-4_1}PROB-NUMBER" />
 *         &lt;attribute name="isIntercept" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *         &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="pValueAlpha" type="{http://www.dmg.org/PMML-4_1}PROB-NUMBER" />
 *         &lt;attribute name="pValueFinal" type="{http://www.dmg.org/PMML-4_1}PROB-NUMBER" />
 *         &lt;attribute name="pValueInitial" type="{http://www.dmg.org/PMML-4_1}PROB-NUMBER" />
 *         &lt;attribute name="stdError" type="{http://www.dmg.org/PMML-4_1}NUMBER" />
 *         &lt;attribute name="tValue" type="{http://www.dmg.org/PMML-4_1}NUMBER" />
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "extension" })
@XmlRootElement(name = "MultivariateStat")
public class MultivariateStat {

    @XmlElement(name = "Extension", namespace = "http://www.dmg.org/PMML-4_1", required = true)
    protected List<Extension> extension;
    @XmlAttribute
    protected String category;
    @XmlAttribute
    protected Double chiSquareValue;
    @XmlAttribute
    protected BigDecimal confidenceLevel;
    @XmlAttribute
    protected Double confidenceLowerBound;
    @XmlAttribute
    protected Double confidenceUpperBound;
    @XmlAttribute(name = "dF")
    protected Double df;
    @XmlAttribute
    protected BigInteger exponent;
    @XmlAttribute
    protected Double fStatistic;
    @XmlAttribute
    protected BigDecimal importance;
    @XmlAttribute
    protected Boolean isIntercept;
    @XmlAttribute
    protected String name;
    @XmlAttribute
    protected BigDecimal pValueAlpha;
    @XmlAttribute
    protected BigDecimal pValueFinal;
    @XmlAttribute
    protected BigDecimal pValueInitial;
    @XmlAttribute
    protected Double stdError;
    @XmlAttribute
    protected Double tValue;

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
     * Gets the value of the category property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the chiSquareValue property.
     * 
     * @return possible object is {@link Double }
     * 
     */
    public Double getChiSquareValue() {
        return chiSquareValue;
    }

    /**
     * Sets the value of the chiSquareValue property.
     * 
     * @param value allowed object is {@link Double }
     * 
     */
    public void setChiSquareValue(Double value) {
        this.chiSquareValue = value;
    }

    /**
     * Gets the value of the confidenceLevel property.
     * 
     * @return possible object is {@link BigDecimal }
     * 
     */
    public BigDecimal getConfidenceLevel() {
        if (confidenceLevel == null) {
            return new BigDecimal("0.95");
        } else {
            return confidenceLevel;
        }
    }

    /**
     * Sets the value of the confidenceLevel property.
     * 
     * @param value allowed object is {@link BigDecimal }
     * 
     */
    public void setConfidenceLevel(BigDecimal value) {
        this.confidenceLevel = value;
    }

    /**
     * Gets the value of the confidenceLowerBound property.
     * 
     * @return possible object is {@link Double }
     * 
     */
    public Double getConfidenceLowerBound() {
        return confidenceLowerBound;
    }

    /**
     * Sets the value of the confidenceLowerBound property.
     * 
     * @param value allowed object is {@link Double }
     * 
     */
    public void setConfidenceLowerBound(Double value) {
        this.confidenceLowerBound = value;
    }

    /**
     * Gets the value of the confidenceUpperBound property.
     * 
     * @return possible object is {@link Double }
     * 
     */
    public Double getConfidenceUpperBound() {
        return confidenceUpperBound;
    }

    /**
     * Sets the value of the confidenceUpperBound property.
     * 
     * @param value allowed object is {@link Double }
     * 
     */
    public void setConfidenceUpperBound(Double value) {
        this.confidenceUpperBound = value;
    }

    /**
     * Gets the value of the df property.
     * 
     * @return possible object is {@link Double }
     * 
     */
    public Double getDF() {
        return df;
    }

    /**
     * Sets the value of the df property.
     * 
     * @param value allowed object is {@link Double }
     * 
     */
    public void setDF(Double value) {
        this.df = value;
    }

    /**
     * Gets the value of the exponent property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getExponent() {
        if (exponent == null) {
            return new BigInteger("1");
        } else {
            return exponent;
        }
    }

    /**
     * Sets the value of the exponent property.
     * 
     * @param value allowed object is {@link BigInteger }
     * 
     */
    public void setExponent(BigInteger value) {
        this.exponent = value;
    }

    /**
     * Gets the value of the fStatistic property.
     * 
     * @return possible object is {@link Double }
     * 
     */
    public Double getFStatistic() {
        return fStatistic;
    }

    /**
     * Sets the value of the fStatistic property.
     * 
     * @param value allowed object is {@link Double }
     * 
     */
    public void setFStatistic(Double value) {
        this.fStatistic = value;
    }

    /**
     * Gets the value of the importance property.
     * 
     * @return possible object is {@link BigDecimal }
     * 
     */
    public BigDecimal getImportance() {
        return importance;
    }

    /**
     * Sets the value of the importance property.
     * 
     * @param value allowed object is {@link BigDecimal }
     * 
     */
    public void setImportance(BigDecimal value) {
        this.importance = value;
    }

    /**
     * Gets the value of the isIntercept property.
     * 
     * @return possible object is {@link Boolean }
     * 
     */
    public boolean isIsIntercept() {
        if (isIntercept == null) {
            return false;
        } else {
            return isIntercept;
        }
    }

    /**
     * Sets the value of the isIntercept property.
     * 
     * @param value allowed object is {@link Boolean }
     * 
     */
    public void setIsIntercept(Boolean value) {
        this.isIntercept = value;
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
     * Gets the value of the pValueAlpha property.
     * 
     * @return possible object is {@link BigDecimal }
     * 
     */
    public BigDecimal getPValueAlpha() {
        return pValueAlpha;
    }

    /**
     * Sets the value of the pValueAlpha property.
     * 
     * @param value allowed object is {@link BigDecimal }
     * 
     */
    public void setPValueAlpha(BigDecimal value) {
        this.pValueAlpha = value;
    }

    /**
     * Gets the value of the pValueFinal property.
     * 
     * @return possible object is {@link BigDecimal }
     * 
     */
    public BigDecimal getPValueFinal() {
        return pValueFinal;
    }

    /**
     * Sets the value of the pValueFinal property.
     * 
     * @param value allowed object is {@link BigDecimal }
     * 
     */
    public void setPValueFinal(BigDecimal value) {
        this.pValueFinal = value;
    }

    /**
     * Gets the value of the pValueInitial property.
     * 
     * @return possible object is {@link BigDecimal }
     * 
     */
    public BigDecimal getPValueInitial() {
        return pValueInitial;
    }

    /**
     * Sets the value of the pValueInitial property.
     * 
     * @param value allowed object is {@link BigDecimal }
     * 
     */
    public void setPValueInitial(BigDecimal value) {
        this.pValueInitial = value;
    }

    /**
     * Gets the value of the stdError property.
     * 
     * @return possible object is {@link Double }
     * 
     */
    public Double getStdError() {
        return stdError;
    }

    /**
     * Sets the value of the stdError property.
     * 
     * @param value allowed object is {@link Double }
     * 
     */
    public void setStdError(Double value) {
        this.stdError = value;
    }

    /**
     * Gets the value of the tValue property.
     * 
     * @return possible object is {@link Double }
     * 
     */
    public Double getTValue() {
        return tValue;
    }

    /**
     * Sets the value of the tValue property.
     * 
     * @param value allowed object is {@link Double }
     * 
     */
    public void setTValue(Double value) {
        this.tValue = value;
    }

}
