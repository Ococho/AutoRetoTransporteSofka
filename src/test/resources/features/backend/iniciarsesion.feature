#language:es
#encoding:UTF-8
#Author: Gretty Maria Mosquera Taborda - Jonathan Andrés Vargas Sepúlveda.

Característica: Inicio de sesión
  Yo como consumidor de la API inicio de sesión para Transporte Sofka
  Quiero iniciar sesión
  Para poder acceder a los servicios de la API

  @InicioSesion
  Esquema del escenario: Inicio de sesión
    Dado que tengo acceso a la ruta de la API
    Cuando envio una peticion POST del usuario <usuario> con la contrasenna <contrasenna>
    Entonces visualizare un codigo de estado <codigo>

    Ejemplos:
      | usuario | contrasenna | codigo |
      |         |             |        |
      |         |             |        |
      |         |             |        |