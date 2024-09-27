import random

def generar_contrasena():
    # Se generan las letras y números a partir de sus códigos ASCII y sue guardan en un array.
    mayusculas = [chr(i) for i in range(65, 91)]  # Letras mayúsculas (A-Z)
    minusculas = [chr(i) for i in range(97, 123)]  # Letras minúsculas (a-z)
    numeros = [chr(i) for i in range(48, 58)]  # Números (0-9)
    simbolos =  ['@', '*', '_', '^']  # Símbolos especiales

    # Combina todos los caracteres posibles en una lista (en python se pueden sumar arrays sin usar métodos)
    todos_caracteres = mayusculas + minusculas + numeros + simbolos

    # Se crea un bucle de 12 iteraciones indicando que la variable de iteración no será utilizada, 
    contrasena = ''.join(random.choice(todos_caracteres) for _ in range(12))
   
    return contrasena