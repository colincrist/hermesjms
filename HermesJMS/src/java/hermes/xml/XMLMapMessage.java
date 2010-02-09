//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-646 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.01.28 at 04:30:33 PM GMT 
//


package hermes.xml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XMLMapMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XMLMapMessage">
 *   &lt;complexContent>
 *     &lt;extension base="{}XMLMessage">
 *       &lt;sequence>
 *         &lt;element name="bodyProperty" type="{}Property" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XMLMapMessage", propOrder = {
    "bodyProperty"
})
public class XMLMapMessage
    extends XMLMessage
{

    protected List<Property> bodyProperty;

    /**
     * Gets the value of the bodyProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bodyProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBodyProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Property }
     * 
     * 
     */
    public List<Property> getBodyProperty() {
        if (bodyProperty == null) {
            bodyProperty = new ArrayList<Property>();
        }
        return this.bodyProperty;
    }

}
