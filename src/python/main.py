import random


def generar_contrasena():
    mayusculas = [chr(i) for i in range(65, 91)]  # Letras mayúsculas (A-Z)
    minusculas = [chr(i) for i in range(97, 123)]  # Letras minúsculas (a-z)
    numeros = [chr(i) for i in range(48, 58)]  # Números (0-9)
    simbolos =  ['@', '*', '_', '^']  # Símbolos especiales

    # Combina todos los caracteres posibles en una lista
    todos_caracteres = mayusculas + minusculas + numeros + simbolos

    # Genera una cadena de 12 caracteres seleccionados aleatoriamente
    contrasena = ''.join(random.choice(todos_caracteres) for _ in range(12))

    return contrasena

# Genera y muestra la contraseña
print(generar_contrasena())

