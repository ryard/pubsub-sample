package ns.cdm.reisinformatie.message.landelijkbericht._1;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.5.3
 * 2022-08-16T19:27:39.162+02:00
 * Generated source version: 3.5.3
 *
 */
@WebServiceClient(name = "PILPushExport_InfoPlusPILInterfaceHttpService",
                  wsdlLocation = "file:/C:/repos/MavenRepos/soap-pil-ps/src/main/resources/wsdl/PPV_Med_PILPush_PILPushExport.wsdl",
                  targetNamespace = "urn:ns:cdm:reisinformatie:message:landelijkbericht:1")
public class PILPushExportInfoPlusPILInterfaceHttpService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("urn:ns:cdm:reisinformatie:message:landelijkbericht:1", "PILPushExport_InfoPlusPILInterfaceHttpService");
    public final static QName PILPushExportInfoPlusPILInterfaceHttpPort = new QName("urn:ns:cdm:reisinformatie:message:landelijkbericht:1", "PILPushExport_InfoPlusPILInterfaceHttpPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/repos/MavenRepos/soap-pil-ps/src/main/resources/wsdl/PPV_Med_PILPush_PILPushExport.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(PILPushExportInfoPlusPILInterfaceHttpService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/C:/repos/MavenRepos/soap-pil-ps/src/main/resources/wsdl/PPV_Med_PILPush_PILPushExport.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public PILPushExportInfoPlusPILInterfaceHttpService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public PILPushExportInfoPlusPILInterfaceHttpService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PILPushExportInfoPlusPILInterfaceHttpService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public PILPushExportInfoPlusPILInterfaceHttpService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public PILPushExportInfoPlusPILInterfaceHttpService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public PILPushExportInfoPlusPILInterfaceHttpService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns InfoPlusPILInterface
     */
    @WebEndpoint(name = "PILPushExport_InfoPlusPILInterfaceHttpPort")
    public InfoPlusPILInterface getPILPushExportInfoPlusPILInterfaceHttpPort() {
        return super.getPort(PILPushExportInfoPlusPILInterfaceHttpPort, InfoPlusPILInterface.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns InfoPlusPILInterface
     */
    @WebEndpoint(name = "PILPushExport_InfoPlusPILInterfaceHttpPort")
    public InfoPlusPILInterface getPILPushExportInfoPlusPILInterfaceHttpPort(WebServiceFeature... features) {
        return super.getPort(PILPushExportInfoPlusPILInterfaceHttpPort, InfoPlusPILInterface.class, features);
    }

}
