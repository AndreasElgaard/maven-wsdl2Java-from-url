
package https.uni_login;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstitutionstilknytningAnsat complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstitutionstilknytningAnsat"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rolle" type="{https://uni-login.dk}Ansatrolle" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstitutionstilknytningAnsat", propOrder = {
    "rolle"
})
public class InstitutionstilknytningAnsat {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected List<Ansatrolle> rolle;

    /**
     * Gets the value of the rolle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rolle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRolle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ansatrolle }
     * 
     * 
     */
    public List<Ansatrolle> getRolle() {
        if (rolle == null) {
            rolle = new ArrayList<Ansatrolle>();
        }
        return this.rolle;
    }

}
