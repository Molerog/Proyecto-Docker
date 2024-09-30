# Usar la imagen de Node.js
FROM node:20.12.2

# Crear un directorio de trabajo (indica de manera explícita dónde se ejecutan los comandos)
WORKDIR /app

# Copiar el package.json y package-lock.json
COPY package*.json /app/

# Instalar dependencias de Node.js
RUN npm install --only=production

# Copiar el código fuente al contenedor (se ignorará lo que haya en .dockerignore)
COPY . /app

# Exponer el puerto que usa Node.js para iniciarse
EXPOSE 4000

# Exponer el puerto que comunica con el servicio de Python
EXPOSE 5912

# Definir el comando para ejecutar en producción
CMD ["npm", "start"]