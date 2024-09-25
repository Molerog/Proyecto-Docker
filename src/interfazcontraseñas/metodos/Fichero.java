package interfazcontraseñas.metodos;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Fichero {
    
    
    //Declaramos e inicializamos las variables que serán fijas.
    private static final String CONFIG_FILE = "src/config/config.properties";
    private static final String API_URL_KEY = "API_URL";
    
    //Declaramos la variable apiURL para retornarla en un método.
    private String apiUrl;
    
    public void escribir(String nombreFichero, Object cadena){
        cadena= "Prueba";
    }
    
    public String loadApiUrlFromProperties (){
        //Instanciamos el archivo de configuración properties.
        Properties config = new Properties();
        
        //try-with-resources, permite que un recurso se abra y cierre automáticamente sin necesidad de bloque finally.
        try(FileInputStream input = new FileInputStream(CONFIG_FILE)){
            
            //Cargar el archivo de configuración
            config.load(input);
            
            //Obtener la URI desde el archivo
            apiUrl = config.getProperty(API_URL_KEY);
            
            //Validamos que exista una url válida, si no lanzamos un error al catch.
            if(apiUrl == null){
                throw new IllegalArgumentException("API_URL no está definida en el archivo de configuración");
            }
            
           
        } catch (IOException | IllegalArgumentException e){
            System.out.println("Ocurrió un error al cargar la configuración o hacer la solicitud: " + e.getMessage());
        }
         return apiUrl;
    }
}
