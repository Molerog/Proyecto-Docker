import axios from 'axios';
import 'dotenv/config';

const ENVIRONMENT = process.env.ENVIRONMENT;
const PORT = process.env.SERVICEPY_PORT


export const getPasswordFromApi = async ()=>{
    try {       
        //Condicional para diferenciar entorno de Docker y local
        const url = ENVIRONMENT === 'local' 
            ? `http://127.0.0.1:${PORT}/contrasena`
             //Colocar la URL para la comunicación entre contenedores. Importante no poner en este caso localhost porque no se podrán comunicar.
            : `http://python_backend:${PORT}/contrasena`;        
        const response = await axios.get(url);
        const data = response.data
        return data;
    } catch (error) {
        console.log("Algo falló en el requerimiento " + error);
    }
}