import sys
import os
from dotenv import load_dotenv

load_dotenv()

service_path = os.getenv('PYTHON_SERVICE_PATH')

# Para poder importar la función "generar_contrasena" hay que añadir la ruta absoluta de la función que queremos importar al path de búsqueda de Python. 
# Esto es necesario porque son archivos que están dentro de carpetas al mismo nivel.
sys.path.insert(1, service_path)

from generatePassword import generar_contrasena

def getPassword():
    contrasena_segura = generar_contrasena()
    return {"contrasena": contrasena_segura}

