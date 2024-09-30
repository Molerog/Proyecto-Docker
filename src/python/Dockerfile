# Usar una imagen base de Python
FROM python:3.12.6

# Establecer el directorio de trabajo
WORKDIR /app

# Copiar el archivo requirements.txt y las dependencias
COPY requirements.txt /app/

# Instalar las dependencias de Python
RUN pip install --no-cache-dir -r requirements.txt

# Copiar el resto del código fuente
COPY . /app

# Exponer el puerto que usa tu aplicación (ajusta si es necesario)
EXPOSE 5912

# Definir el comando para ejecutar en producción
CMD ["uvicorn", "main:service", "--host", "127.0.0.1", "--port", "5912"]