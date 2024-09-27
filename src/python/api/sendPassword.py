import sys
sys.path.insert(1, 'C:\\Users\\German\\Desktop\\BackendAppJsContraseñas\\src\\python\service')

from generatePassword import generar_contrasena

def getPassword():
    contrasena_segura = generar_contrasena()
    return {"contrasena": contrasena_segura}

