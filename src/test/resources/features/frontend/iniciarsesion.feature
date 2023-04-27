#language:es
#encoding:UTF-8
#Author: Gretty Maria Mosquera Taborda - Jonathan Andrés Vargas Sepúlveda.

Característica: Inicio de sesión
  Yo como usuario de la aplicación web de Transporte Sofka
  Quiero iniciar sesión
  Para poder ingresar a los servicios de la aplicación

  @InicioSesionInvalido
  Esquema del escenario: Inicio de sesión inválido
    Dado que estoy en la pagina de login
    Cuando ingreso el usuario '<correo>' con la contrasenna '<contrasenna>'
    Entonces visualizare un mensaje de error '<mensaje>'

    Ejemplos:
      | correo          | contrasenna | mensaje              |
      #| m@gmail.com     | maria123    |                      |
      #| maria@gmail.com | m           |                      |
      | maria@gmail.com |             | No debe estar vacio! |
      |                 | maria123    | No debe estar vacio! |