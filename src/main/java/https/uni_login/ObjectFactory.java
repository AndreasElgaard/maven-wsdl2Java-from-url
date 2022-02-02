
package https.uni_login;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.uni_login package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _HelloWorld_QNAME = new QName("https://uni-login.dk", "helloWorld");
    private final static QName _HelloWorldResponse_QNAME = new QName("https://uni-login.dk", "helloWorldResponse");
    private final static QName _HelloWorldWithCredentials_QNAME = new QName("https://uni-login.dk", "helloWorldWithCredentials");
    private final static QName _HelloWorldWithCredentialsResponse_QNAME = new QName("https://uni-login.dk", "helloWorldWithCredentialsResponse");
    private final static QName _HelloWorldWithDB_QNAME = new QName("https://uni-login.dk", "helloWorldWithDB");
    private final static QName _HelloWorldWithDBResponse_QNAME = new QName("https://uni-login.dk", "helloWorldWithDBResponse");
    private final static QName _SvarResponse_QNAME = new QName("https://uni-login.dk", "svarResponse");
    private final static QName _AuthentificationError_QNAME = new QName("https://uni-login.dk", "authentificationError");
    private final static QName _HentDataAftaler_QNAME = new QName("https://uni-login.dk", "hentDataAftaler");
    private final static QName _HentDataAftalerResponse_QNAME = new QName("https://uni-login.dk", "hentDataAftalerResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: https.uni_login
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NoArgs }
     * 
     */
    public NoArgs createNoArgs() {
        return new NoArgs();
    }

    /**
     * Create an instance of {@link HelloWorldResponse }
     * 
     */
    public HelloWorldResponse createHelloWorldResponse() {
        return new HelloWorldResponse();
    }

    /**
     * Create an instance of {@link Credentials }
     * 
     */
    public Credentials createCredentials() {
        return new Credentials();
    }

    /**
     * Create an instance of {@link SvarResponse }
     * 
     */
    public SvarResponse createSvarResponse() {
        return new SvarResponse();
    }

    /**
     * Create an instance of {@link AuthentificationError }
     * 
     */
    public AuthentificationError createAuthentificationError() {
        return new AuthentificationError();
    }

    /**
     * Create an instance of {@link HentDataAftalerResponse }
     * 
     */
    public HentDataAftalerResponse createHentDataAftalerResponse() {
        return new HentDataAftalerResponse();
    }

    /**
     * Create an instance of {@link Tjeneste }
     * 
     */
    public Tjeneste createTjeneste() {
        return new Tjeneste();
    }

    /**
     * Create an instance of {@link Tjenester }
     * 
     */
    public Tjenester createTjenester() {
        return new Tjenester();
    }

    /**
     * Create an instance of {@link Licens }
     * 
     */
    public Licens createLicens() {
        return new Licens();
    }

    /**
     * Create an instance of {@link Udbyder }
     * 
     */
    public Udbyder createUdbyder() {
        return new Udbyder();
    }

    /**
     * Create an instance of {@link Svar }
     * 
     */
    public Svar createSvar() {
        return new Svar();
    }

    /**
     * Create an instance of {@link Serie }
     * 
     */
    public Serie createSerie() {
        return new Serie();
    }

    /**
     * Create an instance of {@link Serier }
     * 
     */
    public Serier createSerier() {
        return new Serier();
    }

    /**
     * Create an instance of {@link Gruppe }
     * 
     */
    public Gruppe createGruppe() {
        return new Gruppe();
    }

    /**
     * Create an instance of {@link GruppeMedAntal }
     * 
     */
    public GruppeMedAntal createGruppeMedAntal() {
        return new GruppeMedAntal();
    }

    /**
     * Create an instance of {@link GrupperMedAntal }
     * 
     */
    public GrupperMedAntal createGrupperMedAntal() {
        return new GrupperMedAntal();
    }

    /**
     * Create an instance of {@link Projektgruppe }
     * 
     */
    public Projektgruppe createProjektgruppe() {
        return new Projektgruppe();
    }

    /**
     * Create an instance of {@link Projektgrupper }
     * 
     */
    public Projektgrupper createProjektgrupper() {
        return new Projektgrupper();
    }

    /**
     * Create an instance of {@link ProjektgruppeMedAntal }
     * 
     */
    public ProjektgruppeMedAntal createProjektgruppeMedAntal() {
        return new ProjektgruppeMedAntal();
    }

    /**
     * Create an instance of {@link ProjektgrupperMedAntal }
     * 
     */
    public ProjektgrupperMedAntal createProjektgrupperMedAntal() {
        return new ProjektgrupperMedAntal();
    }

    /**
     * Create an instance of {@link GruppeLicens }
     * 
     */
    public GruppeLicens createGruppeLicens() {
        return new GruppeLicens();
    }

    /**
     * Create an instance of {@link GruppeLicenser }
     * 
     */
    public GruppeLicenser createGruppeLicenser() {
        return new GruppeLicenser();
    }

    /**
     * Create an instance of {@link ProjektgruppeLicens }
     * 
     */
    public ProjektgruppeLicens createProjektgruppeLicens() {
        return new ProjektgruppeLicens();
    }

    /**
     * Create an instance of {@link ProjektgruppeLicenser }
     * 
     */
    public ProjektgruppeLicenser createProjektgruppeLicenser() {
        return new ProjektgruppeLicenser();
    }

    /**
     * Create an instance of {@link Bruger }
     * 
     */
    public Bruger createBruger() {
        return new Bruger();
    }

    /**
     * Create an instance of {@link BrugerCpr }
     * 
     */
    public BrugerCpr createBrugerCpr() {
        return new BrugerCpr();
    }

    /**
     * Create an instance of {@link Brugere }
     * 
     */
    public Brugere createBrugere() {
        return new Brugere();
    }

    /**
     * Create an instance of {@link Kontaktperson }
     * 
     */
    public Kontaktperson createKontaktperson() {
        return new Kontaktperson();
    }

    /**
     * Create an instance of {@link Elevbruger }
     * 
     */
    public Elevbruger createElevbruger() {
        return new Elevbruger();
    }

    /**
     * Create an instance of {@link Brugertilknytning }
     * 
     */
    public Brugertilknytning createBrugertilknytning() {
        return new Brugertilknytning();
    }

    /**
     * Create an instance of {@link BrugertilknytningElev }
     * 
     */
    public BrugertilknytningElev createBrugertilknytningElev() {
        return new BrugertilknytningElev();
    }

    /**
     * Create an instance of {@link BrugertilknytningAnsat }
     * 
     */
    public BrugertilknytningAnsat createBrugertilknytningAnsat() {
        return new BrugertilknytningAnsat();
    }

    /**
     * Create an instance of {@link BrugertilknytningEkstern }
     * 
     */
    public BrugertilknytningEkstern createBrugertilknytningEkstern() {
        return new BrugertilknytningEkstern();
    }

    /**
     * Create an instance of {@link Institution }
     * 
     */
    public Institution createInstitution() {
        return new Institution();
    }

    /**
     * Create an instance of {@link Instbruger }
     * 
     */
    public Instbruger createInstbruger() {
        return new Instbruger();
    }

    /**
     * Create an instance of {@link ProduktInstitution }
     * 
     */
    public ProduktInstitution createProduktInstitution() {
        return new ProduktInstitution();
    }

    /**
     * Create an instance of {@link Elev }
     * 
     */
    public Elev createElev() {
        return new Elev();
    }

    /**
     * Create an instance of {@link Ansat }
     * 
     */
    public Ansat createAnsat() {
        return new Ansat();
    }

    /**
     * Create an instance of {@link Ekstern }
     * 
     */
    public Ekstern createEkstern() {
        return new Ekstern();
    }

    /**
     * Create an instance of {@link Institutionstilknytning }
     * 
     */
    public Institutionstilknytning createInstitutionstilknytning() {
        return new Institutionstilknytning();
    }

    /**
     * Create an instance of {@link InstitutionstilknytningElev }
     * 
     */
    public InstitutionstilknytningElev createInstitutionstilknytningElev() {
        return new InstitutionstilknytningElev();
    }

    /**
     * Create an instance of {@link InstitutionstilknytningAnsat }
     * 
     */
    public InstitutionstilknytningAnsat createInstitutionstilknytningAnsat() {
        return new InstitutionstilknytningAnsat();
    }

    /**
     * Create an instance of {@link InstitutionstilknytningEkstern }
     * 
     */
    public InstitutionstilknytningEkstern createInstitutionstilknytningEkstern() {
        return new InstitutionstilknytningEkstern();
    }

    /**
     * Create an instance of {@link InstitutionstilknytningKontakt }
     * 
     */
    public InstitutionstilknytningKontakt createInstitutionstilknytningKontakt() {
        return new InstitutionstilknytningKontakt();
    }

    /**
     * Create an instance of {@link AdmBrugerprofil }
     * 
     */
    public AdmBrugerprofil createAdmBrugerprofil() {
        return new AdmBrugerprofil();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoArgs }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NoArgs }{@code >}
     */
    @XmlElementDecl(namespace = "https://uni-login.dk", name = "helloWorld")
    public JAXBElement<NoArgs> createHelloWorld(NoArgs value) {
        return new JAXBElement<NoArgs>(_HelloWorld_QNAME, NoArgs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloWorldResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HelloWorldResponse }{@code >}
     */
    @XmlElementDecl(namespace = "https://uni-login.dk", name = "helloWorldResponse")
    public JAXBElement<HelloWorldResponse> createHelloWorldResponse(HelloWorldResponse value) {
        return new JAXBElement<HelloWorldResponse>(_HelloWorldResponse_QNAME, HelloWorldResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Credentials }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Credentials }{@code >}
     */
    @XmlElementDecl(namespace = "https://uni-login.dk", name = "helloWorldWithCredentials")
    public JAXBElement<Credentials> createHelloWorldWithCredentials(Credentials value) {
        return new JAXBElement<Credentials>(_HelloWorldWithCredentials_QNAME, Credentials.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloWorldResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HelloWorldResponse }{@code >}
     */
    @XmlElementDecl(namespace = "https://uni-login.dk", name = "helloWorldWithCredentialsResponse")
    public JAXBElement<HelloWorldResponse> createHelloWorldWithCredentialsResponse(HelloWorldResponse value) {
        return new JAXBElement<HelloWorldResponse>(_HelloWorldWithCredentialsResponse_QNAME, HelloWorldResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Credentials }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Credentials }{@code >}
     */
    @XmlElementDecl(namespace = "https://uni-login.dk", name = "helloWorldWithDB")
    public JAXBElement<Credentials> createHelloWorldWithDB(Credentials value) {
        return new JAXBElement<Credentials>(_HelloWorldWithDB_QNAME, Credentials.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloWorldResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HelloWorldResponse }{@code >}
     */
    @XmlElementDecl(namespace = "https://uni-login.dk", name = "helloWorldWithDBResponse")
    public JAXBElement<HelloWorldResponse> createHelloWorldWithDBResponse(HelloWorldResponse value) {
        return new JAXBElement<HelloWorldResponse>(_HelloWorldWithDBResponse_QNAME, HelloWorldResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SvarResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SvarResponse }{@code >}
     */
    @XmlElementDecl(namespace = "https://uni-login.dk", name = "svarResponse")
    public JAXBElement<SvarResponse> createSvarResponse(SvarResponse value) {
        return new JAXBElement<SvarResponse>(_SvarResponse_QNAME, SvarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthentificationError }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AuthentificationError }{@code >}
     */
    @XmlElementDecl(namespace = "https://uni-login.dk", name = "authentificationError")
    public JAXBElement<AuthentificationError> createAuthentificationError(AuthentificationError value) {
        return new JAXBElement<AuthentificationError>(_AuthentificationError_QNAME, AuthentificationError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Credentials }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Credentials }{@code >}
     */
    @XmlElementDecl(namespace = "https://uni-login.dk", name = "hentDataAftaler")
    public JAXBElement<Credentials> createHentDataAftaler(Credentials value) {
        return new JAXBElement<Credentials>(_HentDataAftaler_QNAME, Credentials.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HentDataAftalerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HentDataAftalerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "https://uni-login.dk", name = "hentDataAftalerResponse")
    public JAXBElement<HentDataAftalerResponse> createHentDataAftalerResponse(HentDataAftalerResponse value) {
        return new JAXBElement<HentDataAftalerResponse>(_HentDataAftalerResponse_QNAME, HentDataAftalerResponse.class, null, value);
    }

}
