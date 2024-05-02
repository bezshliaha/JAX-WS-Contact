package org.example.contact.api;

import jakarta.xml.ws.Service;
import org.example.contact.utils.Constants;
import org.example.server.service.DataService;

import javax.xml.namespace.QName;
import java.net.URL;
import java.net.URI;

public class DataContact {

    public String runContact(String data) throws Exception {
        URL url = URI.create(Constants.WSDL_URL).toURL();

        QName qname = new QName(
                "http://service.server.example.org/",
                "DataServiceImplService"
        );
        Service service = Service.create(url, qname);
        DataService dataService = service.getPort(DataService.class);
        return dataService.getData(data);
    }
}
