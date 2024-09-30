import axios from 'axios';
import 'dotenv/config';

const PORT = process.env.SERVICEPY_PORT


export const getPasswordFromApi = async ()=>{
    try {   
        const response = await axios.get(`http://python_backend:${PORT}/contrasena`);
        const data = response.data
        return data;
    } catch (error) {
        console.log("Algo falló en el requerimiento " + error);
    }
}