from fastapi import FastAPI
from api.sendPassword import getPassword

service=FastAPI()

@service.get("/contrasena")
def ruta_contrasena():
    return getPassword()

# El código se ejecuta solo si el archivo se está ejecutando directamente (python main.py).  
if __name__ == "__main__":   
    import uvicorn
    uvicorn.run("main:service", host="127.0.0.1", port=5912, reload=True)




