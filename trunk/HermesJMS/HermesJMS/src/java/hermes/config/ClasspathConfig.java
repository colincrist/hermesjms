//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-646 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.04.04 at 07:21:51 AM BST 
//


package hermes.config;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClasspathConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClasspathConfig">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="jar" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="noFactories" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="factories" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClasspathConfig")
public class ClasspathConfig {

    @XmlAttribute
    protected String jar;
    @XmlAttribute
    protected Boolean noFactories;
    @XmlAttribute
    protected String factories;

    /**
     * Gets the value of the jar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJar() {
        return jar;
    }

    /**
     * Sets the value of the jar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJar(String value) {
        this.jar = value;
    }

    /**
     * Gets the value of the noFactories property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoFactories() {
        return noFactories;
    }

    /**
     * Sets the value of the noFactories property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoFactories(Boolean value) {
        this.noFactories = value;
    }

    /**
     * Gets the value of the factories property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFactories() {
        return factories;
    }

    /**
     * Sets the value of the factories property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFactories(String value) {
        this.factories = value;
    }

}
