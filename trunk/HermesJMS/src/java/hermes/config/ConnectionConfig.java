//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.4-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.12.06 at 11:32:15 GMT 
//


package hermes.config;


/**
 * Java content class for ConnectionConfig complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/C:/work/Workspaces/Hermes/HermesJMS/src/xml/hermes-schema.xsd line 35)
 * <p>
 * <pre>
 * &lt;complexType name="ConnectionConfig">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="session" type="{}SessionConfig" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="clientID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="connectionPerThread" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="password" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="username" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface ConnectionConfig {


    /**
     * Gets the value of the Session property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the Session property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSession().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link hermes.config.SessionConfig}
     * 
     */
    java.util.List getSession();

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getUsername();

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setUsername(java.lang.String value);

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getPassword();

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setPassword(java.lang.String value);

    /**
     * Gets the value of the connectionPerThread property.
     * 
     */
    boolean isConnectionPerThread();

    /**
     * Sets the value of the connectionPerThread property.
     * 
     */
    void setConnectionPerThread(boolean value);

    /**
     * Gets the value of the clientID property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getClientID();

    /**
     * Sets the value of the clientID property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setClientID(java.lang.String value);

}
