
package https.uni_login;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Ekstern complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Ekstern"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rolle" type="{https://uni-login.dk}Eksternrolle"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ekstern", propOrder = {
    "rolle"
})
public class Ekstern {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Eksternrolle rolle;

    /**
     * Gets the value of the rolle property.
     * 
     * @return
     *     possible object is
     *     {@link Eksternrolle }
     *     
     */
    public Eksternrolle getRolle() {
        return rolle;
    }

    /**
     * Sets the value of the rolle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Eksternrolle }
     *     
     */
    public void setRolle(Eksternrolle value) {
        this.rolle = value;
    }

}
