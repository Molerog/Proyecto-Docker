from fastapi import FastAPI
from api.sendPassword import getPassword
import os
import uvicorn
from dotenv import load_dotenv

service=FastAPI()

load_dotenv()

# La variable de entorno "PORT" viene como String, hay que hacer un casting a numero para que el servidor lo pueda usar adecuadamente como puerto.
port_path = int(os.getenv('PORTPY', 8002))


@service.get("/contrasena")
def ruta_contrasena():
    return getPassword()

# El código se ejecuta solo si el archivo se está ejecutando directamente (python main.py).  
if __name__ == "__main__":   
    host = os.getenv("HOST", "127.0.0.1")
    uvicorn.run("main:service", host=host, port=port_path, reload=True)




