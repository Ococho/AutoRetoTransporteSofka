# Transporte Sofka | Automatización aplicación web y APIs REST

## **Requisitos**
Para este proyecto, se necesitará:

> - Java 11.
> - Gradle para compilar el proyecto.

## ¿Cómo correr el proyecto?
1. Posterior a clonar este repositorio en su ordenador, ingrese a la siguiente ruta ➜ src\test\java\com\sofkau\runners.
2. Presionar clic derecho en el archivo "TodosTest".
3. Seleccionar la opción Run 'TodosTest'.

## Arquetipo del proyecto - Patrón ScreenPlay
**main/java/com/sofkau**

> - _models:_ Contiene clases con las definiciones de objetos para automatizar interacciones en aplicaciones.
> - _questions:_ Contiene las clases que incluyen preguntas claves para cada test case.
> - _tasks:_ Contiene las clases con métodos que realizan tareas específicas dentro del sistema, lo cual nos permitiría reutilizar la lógica sí es necesitarlo.
> - _ui:_ Contiene las clases con métodos que nos permitan seleccionar elementos de la interfaz de usuario.
> - _utils:_ Contiene las clases con métodos que nos realicen procesos que son comunes pero utiles.

**test/java/com/sofkau**
> - _runners:_ Clases para correr los test cases.
> - _setup:_ Clases para configuraciones.
> - _stepdefinitions:_ Clases con la ejecución de los pasos definidos en los feature .

**test/resources/java/com/sofkau**
> - _features:_ Contiene los gherkin con la definición de los casos de prueba en un lenguaje natural.

### Este repositorio contiene la documentación respecto a los proyectos:

- [Backend](https://github.com/migueltorresd/transporte-sofka_back)

- [Frontend](https://github.com/migueltorresd/transporte-sofka_front)

Documentación requerida:
- [x] Plan de calidad.
- [x] Diseño de casos de prueba. `src/test/resources/features`  
- [x] Matriz de riesgo.
- [x] Informe de pruebas.
- [x] Informe de análisis de código estático.   
- [x] Informe de cierre.

### Automatizaciones
Es posible ejecutar las automatizaciones de:

**Frontend**: 
- Registro de usuario. 
- Iniciar sesión. 
- Convertirse en conductor. 

**Backend**
- Crear usuarios. 
- Crear envío. 
- Actualizar envío. 
- Actualizar usuario. 

> *Nota*: 
> - Las automatizaciones relacionadas con el Backend están obsoletas debido a que las APIs no se encuentran expuestas.
> - El reporte asociado a la ejecución de pruebas automatizadas web se puede acceder descargando la carpeta *target* e ingresando al archivo ubicado en `target/site/serenity/index.html`

- - -
*By: Gretty María Mosquera Taborda - Jonathan Andrés Vargas Sepúlveda 🐢*