//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.4-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.01.03 at 11:55:46 GMT 
//


package hermes.config;


/**
 * Java content class for SessionConfig complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/C:/work/Workspaces/Hermes/HermesJMS/src/xml/hermes-schema.xsd line 46)
 * <p>
 * <pre>
 * &lt;complexType name="SessionConfig">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="audit" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="auditDirectory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="checkSize" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="checkSizePeriod" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="reconnects" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="transacted" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="useConsumerForQueueBrowse" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface SessionConfig {


    /**
     * Gets the value of the useConsumerForQueueBrowse property.
     * 
     */
    boolean isUseConsumerForQueueBrowse();

    /**
     * Sets the value of the useConsumerForQueueBrowse property.
     * 
     */
    void setUseConsumerForQueueBrowse(boolean value);

    /**
     * Gets the value of the audit property.
     * 
     */
    boolean isAudit();

    /**
     * Sets the value of the audit property.
     * 
     */
    void setAudit(boolean value);

    /**
     * Gets the value of the checkSize property.
     * 
     */
    boolean isCheckSize();

    /**
     * Sets the value of the checkSize property.
     * 
     */
    void setCheckSize(boolean value);

    /**
     * Gets the value of the transacted property.
     * 
     */
    boolean isTransacted();

    /**
     * Sets the value of the transacted property.
     * 
     */
    void setTransacted(boolean value);

    /**
     * Gets the value of the checkSizePeriod property.
     * 
     */
    long getCheckSizePeriod();

    /**
     * Sets the value of the checkSizePeriod property.
     * 
     */
    void setCheckSizePeriod(long value);

    /**
     * Gets the value of the reconnects property.
     * 
     * @return
     *     possible object is
     *     {@link java.math.BigInteger}
     */
    java.math.BigInteger getReconnects();

    /**
     * Sets the value of the reconnects property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.math.BigInteger}
     */
    void setReconnects(java.math.BigInteger value);

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getId();

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setId(java.lang.String value);

    /**
     * Gets the value of the auditDirectory property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getAuditDirectory();

    /**
     * Sets the value of the auditDirectory property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setAuditDirectory(java.lang.String value);

}