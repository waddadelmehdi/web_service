package ma.wem;

import jakarta.xml.ws.Endpoint;
import ma.wem.ws.BanqueService;

public class ServerJWS {
    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:9090/",new BanqueService());
        System.out.println("Web service deploye sur http://0.0.0.0:9090/");
    }
}
