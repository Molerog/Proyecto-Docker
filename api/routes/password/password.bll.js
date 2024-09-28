import axios from 'axios';
import 'dotenv/config';

const PORT = process.env.SERVICEPY_PORT


export const getPasswordFromApi = async ()=>{
    try {   
        const response = await axios.get("http://127.0.0.1:"+PORT+"/contrasena");
        const data = response.data
        return data;
    } catch (error) {
        console.log("Algo falló en el requerimiento " + error);
    }
}