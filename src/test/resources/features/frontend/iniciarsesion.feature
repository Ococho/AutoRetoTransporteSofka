#language:es
#encoding:UTF-8
#Author: Gretty Maria Mosquera Taborda - Jonathan Andrés Vargas Sepúlveda.

Característica: Inicio de sesión
  Yo como usuario de la aplicación web de Transporte Sofka
  Quiero iniciar sesión
  Para poder ingresar a los servicios de la aplicación

  @InicioSesion
  Esquema del escenario: Inicio de sesión
    Dado que estoy en la pagina de login
    Cuando ingreso el usuario <usuario> con la contrasenna <contrasenna>
    Entonces visualizare un mensaje de <mensaje>

    Ejemplos:
      | usuario | contrasenna | mensaje |
      |         |             |         |
      |         |             |         |
      |         |             |         |