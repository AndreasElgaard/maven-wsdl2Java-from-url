
package https.uni_login;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdmBrugerprofil complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdmBrugerprofil"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="brugerid" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="regnr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="kontakttype" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="kontakttype2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="relation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="myndighed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="cpr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="navn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="aliasnavn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="adressebeskyt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="gade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="postnr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bynavn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="landekode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="land" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="kommunenr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="kommune" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="telefonbeskyt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="telefon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="arbejdstelefon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="arbtlfbeskyt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="mobilbeskyt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="mobiltelefon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="foedselsdato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="koen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fotoid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="andet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="verifikation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdmBrugerprofil", propOrder = {
    "brugerid",
    "regnr",
    "kontakttype",
    "kontakttype2",
    "relation",
    "myndighed",
    "cpr",
    "navn",
    "aliasnavn",
    "adressebeskyt",
    "gade",
    "postnr",
    "bynavn",
    "landekode",
    "land",
    "kommunenr",
    "kommune",
    "telefonbeskyt",
    "telefon",
    "arbejdstelefon",
    "arbtlfbeskyt",
    "mobilbeskyt",
    "mobiltelefon",
    "email",
    "foedselsdato",
    "koen",
    "fotoid",
    "andet",
    "verifikation"
})
public class AdmBrugerprofil {

    @XmlElement(required = true)
    protected String brugerid;
    protected String regnr;
    protected Integer kontakttype;
    protected Integer kontakttype2;
    protected String relation;
    protected Boolean myndighed;
    protected String cpr;
    protected String navn;
    protected String aliasnavn;
    protected Boolean adressebeskyt;
    protected String gade;
    protected String postnr;
    protected String bynavn;
    protected String landekode;
    protected String land;
    protected String kommunenr;
    protected String kommune;
    protected Boolean telefonbeskyt;
    protected String telefon;
    protected String arbejdstelefon;
    protected Boolean arbtlfbeskyt;
    protected Boolean mobilbeskyt;
    protected String mobiltelefon;
    protected String email;
    protected String foedselsdato;
    protected String koen;
    protected String fotoid;
    protected String andet;
    protected Boolean verifikation;

    /**
     * Gets the value of the brugerid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrugerid() {
        return brugerid;
    }

    /**
     * Sets the value of the brugerid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrugerid(String value) {
        this.brugerid = value;
    }

    /**
     * Gets the value of the regnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegnr() {
        return regnr;
    }

    /**
     * Sets the value of the regnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegnr(String value) {
        this.regnr = value;
    }

    /**
     * Gets the value of the kontakttype property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getKontakttype() {
        return kontakttype;
    }

    /**
     * Sets the value of the kontakttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setKontakttype(Integer value) {
        this.kontakttype = value;
    }

    /**
     * Gets the value of the kontakttype2 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getKontakttype2() {
        return kontakttype2;
    }

    /**
     * Sets the value of the kontakttype2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setKontakttype2(Integer value) {
        this.kontakttype2 = value;
    }

    /**
     * Gets the value of the relation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelation() {
        return relation;
    }

    /**
     * Sets the value of the relation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelation(String value) {
        this.relation = value;
    }

    /**
     * Gets the value of the myndighed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMyndighed() {
        return myndighed;
    }

    /**
     * Sets the value of the myndighed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMyndighed(Boolean value) {
        this.myndighed = value;
    }

    /**
     * Gets the value of the cpr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpr() {
        return cpr;
    }

    /**
     * Sets the value of the cpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpr(String value) {
        this.cpr = value;
    }

    /**
     * Gets the value of the navn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNavn() {
        return navn;
    }

    /**
     * Sets the value of the navn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNavn(String value) {
        this.navn = value;
    }

    /**
     * Gets the value of the aliasnavn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAliasnavn() {
        return aliasnavn;
    }

    /**
     * Sets the value of the aliasnavn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAliasnavn(String value) {
        this.aliasnavn = value;
    }

    /**
     * Gets the value of the adressebeskyt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdressebeskyt() {
        return adressebeskyt;
    }

    /**
     * Sets the value of the adressebeskyt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdressebeskyt(Boolean value) {
        this.adressebeskyt = value;
    }

    /**
     * Gets the value of the gade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGade() {
        return gade;
    }

    /**
     * Sets the value of the gade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGade(String value) {
        this.gade = value;
    }

    /**
     * Gets the value of the postnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostnr() {
        return postnr;
    }

    /**
     * Sets the value of the postnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostnr(String value) {
        this.postnr = value;
    }

    /**
     * Gets the value of the bynavn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBynavn() {
        return bynavn;
    }

    /**
     * Sets the value of the bynavn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBynavn(String value) {
        this.bynavn = value;
    }

    /**
     * Gets the value of the landekode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLandekode() {
        return landekode;
    }

    /**
     * Sets the value of the landekode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLandekode(String value) {
        this.landekode = value;
    }

    /**
     * Gets the value of the land property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLand() {
        return land;
    }

    /**
     * Sets the value of the land property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLand(String value) {
        this.land = value;
    }

    /**
     * Gets the value of the kommunenr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKommunenr() {
        return kommunenr;
    }

    /**
     * Sets the value of the kommunenr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKommunenr(String value) {
        this.kommunenr = value;
    }

    /**
     * Gets the value of the kommune property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKommune() {
        return kommune;
    }

    /**
     * Sets the value of the kommune property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKommune(String value) {
        this.kommune = value;
    }

    /**
     * Gets the value of the telefonbeskyt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTelefonbeskyt() {
        return telefonbeskyt;
    }

    /**
     * Sets the value of the telefonbeskyt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTelefonbeskyt(Boolean value) {
        this.telefonbeskyt = value;
    }

    /**
     * Gets the value of the telefon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefon() {
        return telefon;
    }

    /**
     * Sets the value of the telefon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefon(String value) {
        this.telefon = value;
    }

    /**
     * Gets the value of the arbejdstelefon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArbejdstelefon() {
        return arbejdstelefon;
    }

    /**
     * Sets the value of the arbejdstelefon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArbejdstelefon(String value) {
        this.arbejdstelefon = value;
    }

    /**
     * Gets the value of the arbtlfbeskyt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isArbtlfbeskyt() {
        return arbtlfbeskyt;
    }

    /**
     * Sets the value of the arbtlfbeskyt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setArbtlfbeskyt(Boolean value) {
        this.arbtlfbeskyt = value;
    }

    /**
     * Gets the value of the mobilbeskyt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMobilbeskyt() {
        return mobilbeskyt;
    }

    /**
     * Sets the value of the mobilbeskyt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMobilbeskyt(Boolean value) {
        this.mobilbeskyt = value;
    }

    /**
     * Gets the value of the mobiltelefon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobiltelefon() {
        return mobiltelefon;
    }

    /**
     * Sets the value of the mobiltelefon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobiltelefon(String value) {
        this.mobiltelefon = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the foedselsdato property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFoedselsdato() {
        return foedselsdato;
    }

    /**
     * Sets the value of the foedselsdato property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFoedselsdato(String value) {
        this.foedselsdato = value;
    }

    /**
     * Gets the value of the koen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKoen() {
        return koen;
    }

    /**
     * Sets the value of the koen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKoen(String value) {
        this.koen = value;
    }

    /**
     * Gets the value of the fotoid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFotoid() {
        return fotoid;
    }

    /**
     * Sets the value of the fotoid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFotoid(String value) {
        this.fotoid = value;
    }

    /**
     * Gets the value of the andet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAndet() {
        return andet;
    }

    /**
     * Sets the value of the andet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAndet(String value) {
        this.andet = value;
    }

    /**
     * Gets the value of the verifikation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVerifikation() {
        return verifikation;
    }

    /**
     * Sets the value of the verifikation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVerifikation(Boolean value) {
        this.verifikation = value;
    }

}
