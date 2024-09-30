package interfazcontrase�as.httprequest;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpBuilder {
    
    //Creamos la instancia HttpClient (El sistema que env�a la petici�n).
    private HttpClient client = HttpClient.newHttpClient();
    
    //M�todo que devuelve el builder ya configurado con la URL.
    private HttpRequest.Builder getRequestBuilder(String uri){
        return HttpRequest.newBuilder().uri(URI.create(uri));
                
    }
    //M�todo para enviar la petici�n al servidor
    public HttpResponse sendRequest(String uri) throws Exception {
        HttpRequest.Builder builder = getRequestBuilder(uri); //Aqu� obtenemos el builder
        
        HttpRequest request = builder.GET().build();
        
        HttpResponse <String> response = this.client.send(request, HttpResponse.BodyHandlers.ofString());
        
        return response;
    }
    
}
