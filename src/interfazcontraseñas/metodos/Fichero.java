package interfazcontrase�as.metodos;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Fichero {
    
    
    //Declaramos e inicializamos las variables que ser�n fijas.
    private static final String CONFIG_FILE = "src/config/config.properties";
    private static final String API_URL_KEY = "API_URL";
    
    //Declaramos la variable apiURL para retornarla en un m�todo.
    private String apiUrl;
    
    public void escribir(String nombreFichero, Object cadena){
        cadena= "Prueba";
    }
    
    public String loadApiUrlFromProperties (){
        //Instanciamos el archivo de configuraci�n properties.
        Properties config = new Properties();
        
        //try-with-resources, permite que un recurso se abra y cierre autom�ticamente sin necesidad de bloque finally.
        try(FileInputStream input = new FileInputStream(CONFIG_FILE)){
            
            //Cargar el archivo de configuraci�n
            config.load(input);
            
            //Obtener la URI desde el archivo
            apiUrl = config.getProperty(API_URL_KEY);
            
            //Validamos que exista una url v�lida, si no lanzamos un error al catch.
            if(apiUrl == null){
                throw new IllegalArgumentException("API_URL no est� definida en el archivo de configuraci�n");
            }
            
           
        } catch (IOException | IllegalArgumentException e){
            System.out.println("Ocurri� un error al cargar la configuraci�n o hacer la solicitud: " + e.getMessage());
        }
         return apiUrl;
    }
}
