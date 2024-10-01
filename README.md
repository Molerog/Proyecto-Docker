# Proyecto de Generación de Contraseñas

Este proyecto consiste en una aplicación distribuida que utiliza diferentes tecnologías para la generación de contraseñas, conectando una interfaz de usuario en Java con servicios backend desarrollados en Node.js y Python. Además, se utiliza Docker para orquestar y desplegar los diferentes servicios en contenedores.

## Objetivo

1. **Simplicidad**: Elimina completamente la necesidad de instalar y configurar múltiples lenguajes y dependencias en la máquina local. Docker Compose se encargará de crear contenedores para cada uno de los servicios.
2. **Escalabilidad**: Si más adelante quieres agregar nuevos servicios o cambiar configuraciones, es muy fácil de hacer desde el archivo `docker-compose.yml` sin que los usuarios tengan que cambiar su entorno local.
3. **Control total del entorno**: Asegura que todos los usuarios estén ejecutando la misma configuración y entorno, sin preocuparse por las diferencias entre sistemas operativos o versiones de software.
4. **Aprendizaje**: Utilizar Docker y Docker Compose ayuda a los desarrolladores a adquirir experiencia en tecnologías de contenedorización, orquestación de servicios y automatización de entornos de desarrollo.


## Tecnologías Utilizadas

### Java
- **Swing**: Se utiliza para desarrollar la interfaz gráfica de usuario (GUI).
- **org.json**: Una librería para procesar respuestas JSON enviadas por el backend. Permite trabajar de manera eficiente con estructuras JSON en la aplicación Java.

A continuación se muestra una captura de la **interfaz actual** de la aplicación, desarrollada en Swing. La interfaz aún está en una **fase inicial**, centrada en la funcionalidad básica de generación y exportación de contraseñas:

![Interfaz en proceso](/utils/images/image.png)

### Node.js
- **Node.js**: Recibe las peticiones enviadas desde la interfaz de Java y las redirige a otros servicios backend. El servicio actual se utiliza para la generación de contraseñas.
- **Dependencias utilizadas**:
  - **axios**: Para realizar peticiones HTTP.
  - **dotenv**: Para manejar variables de entorno.
  - **express**: Framework para manejar rutas y peticiones HTTP de manera sencilla.


### Python
- **Flask**: Un microframework para el desarrollo de aplicaciones web. Se utiliza para manejar peticiones y respuestas en el backend.
- **Uvicorn**: Un servidor ASGI rápido, que se utiliza para ejecutar la aplicación Flask en una arquitectura **apiREST**.

### SQLite (En proceso)
- **SQLite**: Base de datos ligera y eficiente utilizada para almacenar las contraseñas generadas y otros datos de la aplicación. Esta base de datos es ideal para proyectos pequeños o medianos, ya que no requiere un servidor de base de datos independiente.

### Docker
- **Docker Compose**: Utilizado para orquestar contenedores. Facilita la gestión de múltiples contenedores y la comunicación entre ellos.
- **Archivos utilizados**:
  - **Dockerfile**: Define cómo construir la imagen del contenedor.
  - **docker-compose.yml**: Configura y levanta los servicios en contenedores.
  - **.dockerignore**: Especifica qué archivos se deben excluir al construir la imagen Docker.
- **Docker Desktop**: Herramienta que facilita la gestión y ejecución de contenedores en entornos locales.

![Contenedores levantados](/utils/images/image-2.png)
![Docker Desktop](/utils/images/image-4.png)

## Instalación y Ejecución 

### Requisitos previos

- Tener instalado [Docker Desktop](https://www.docker.com/products/docker-desktop)

### Pasos para ejecutar el proyecto

1. Clonar el repositorio:
   ```bash
   git clone https://github.com/Molerog/Proyecto-Docker.git

2. (Opcional) Si lo necesitas, puedes modificar las variables de entorno en el archivo .env.

3. Levantar los servicios con Docker Compose:
    ```bash
    docker-compose up --build

 **Nota:** **Actualmente falta agregar el contenedor que corresponde a la interfaz de Java.** Es necesario definir un servicio adicional en el archivo `docker-compose.yml` para que la interfaz gráfica de Java pueda correr en un contenedor separado. **Se recomienda implementar este contenedor para completar el ciclo de integración y que todo el entorno se pueda levantar sin pasos manuales.**