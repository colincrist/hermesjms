//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-646 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.05.03 at 10:11:50 AM BST 
//


package hermes.config;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NamingProviderConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NamingProviderConfig">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="namingConfig" type="{}NamingConfig" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="connectionFactoryBinding" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NamingProviderConfig", propOrder = {
    "namingConfig"
})
public class NamingProviderConfig {

    protected NamingConfig namingConfig;
    @XmlAttribute
    protected String connectionFactoryBinding;

    /**
     * Gets the value of the namingConfig property.
     * 
     * @return
     *     possible object is
     *     {@link NamingConfig }
     *     
     */
    public NamingConfig getNamingConfig() {
        return namingConfig;
    }

    /**
     * Sets the value of the namingConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamingConfig }
     *     
     */
    public void setNamingConfig(NamingConfig value) {
        this.namingConfig = value;
    }

    /**
     * Gets the value of the connectionFactoryBinding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionFactoryBinding() {
        return connectionFactoryBinding;
    }

    /**
     * Sets the value of the connectionFactoryBinding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionFactoryBinding(String value) {
        this.connectionFactoryBinding = value;
    }

}
