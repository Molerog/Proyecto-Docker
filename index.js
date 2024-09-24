import express from 'express';
import 'dotenv/config';
import router from './api/routes/routes.js';


const app = express();

const PORT = process.env.PORT || 3000;

app.listen(PORT, () =>{
    console.log(`Servidor corriendo en el puerto ${PORT}`)
});

app.use("/javaApi", router);