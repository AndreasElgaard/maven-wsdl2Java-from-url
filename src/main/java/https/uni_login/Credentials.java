
package https.uni_login;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import https.wsiinst_uni_login_dk.ws.HentBrugereIGruppe;
import https.wsiinst_uni_login_dk.ws.HentGrupper;
import https.wsiinst_uni_login_dk.ws.HentGruppersLicenser;
import https.wsiinst_uni_login_dk.ws.HentInstBruger;
import https.wsiinst_uni_login_dk.ws.HentInstitution;
import https.wsiinst_uni_login_dk.ws.HentInstitutioner;


/**
 * <p>Java class for Credentials complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Credentials"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wsBrugerid" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="wsPassword" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Credentials", propOrder = {
    "wsBrugerid",
    "wsPassword"
})
@XmlSeeAlso({
    HentGrupper.class,
    HentBrugereIGruppe.class,
    HentGruppersLicenser.class,
    HentInstitution.class,
    HentInstitutioner.class,
    HentInstBruger.class
})
public class Credentials {

    @XmlElement(required = true)
    protected String wsBrugerid;
    @XmlElement(required = true)
    protected String wsPassword;

    /**
     * Gets the value of the wsBrugerid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWsBrugerid() {
        return wsBrugerid;
    }

    /**
     * Sets the value of the wsBrugerid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWsBrugerid(String value) {
        this.wsBrugerid = value;
    }

    /**
     * Gets the value of the wsPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWsPassword() {
        return wsPassword;
    }

    /**
     * Sets the value of the wsPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWsPassword(String value) {
        this.wsPassword = value;
    }

}
