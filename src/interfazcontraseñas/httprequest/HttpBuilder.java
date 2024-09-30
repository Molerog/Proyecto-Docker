package interfazcontraseñas.httprequest;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpBuilder {
    
    //Creamos la instancia HttpClient (El sistema que envía la petición).
    private HttpClient client = HttpClient.newHttpClient();
    
    //Método que devuelve el builder ya configurado con la URL.
    private HttpRequest.Builder getRequestBuilder(String uri){
        return HttpRequest.newBuilder().uri(URI.create(uri));
                
    }
    //Método para enviar la petición al servidor
    public HttpResponse sendRequest(String uri) throws Exception {
        HttpRequest.Builder builder = getRequestBuilder(uri); //Aquí obtenemos el builder
        
        HttpRequest request = builder.GET().build();
        
        HttpResponse <String> response = this.client.send(request, HttpResponse.BodyHandlers.ofString());
        
        return response;
    }
    
}
