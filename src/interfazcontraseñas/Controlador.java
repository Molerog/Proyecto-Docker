

package interfazcontrase�as;
import interfazcontrase�as.httprequest.HttpBuilder;
import interfazcontrase�as.metodos.ConfigLoader;

import java.net.http.HttpResponse;

public class Controlador {
    
    private String URI;
    private HttpResponse response;
    
    public String getConfigLoader(){
        
        ConfigLoader fichero = new ConfigLoader();
        this.URI = fichero.loadApiUrlFromProperties();
        return URI;
    }
    
    public HttpResponse <String> getPasswordResponse(String uri){
        
        HttpBuilder responseGET = new HttpBuilder();
        try{
             this.response = responseGET.sendRequest(uri);
        }catch(Exception e){
            System.out.println("Ocurri� un error al hacer la solicitud: " + e.getMessage());
        }
        return this.response;
        
    }
}
