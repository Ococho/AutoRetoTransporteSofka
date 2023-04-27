#language:es
#encoding:UTF-8
#Author: Gretty Maria Mosquera Taborda - Jonathan Andrés Vargas Sepúlveda.

Característica: Inicio de sesión
  Yo como usuario de la aplicación web de Transporte Sofka
  Quiero iniciar sesión
  Para poder ingresar a los servicios de la aplicación

  Antecedentes:
    Dado que estoy en la pagina de login

  @InicioSesionValido
  Escenario: Inicio de sesión válido
    Cuando ingreso credenciales validas
    Entonces visualizare un mensaje de bienvenida con mi nombre

  @InicioSesionInvalido
  Esquema del escenario: Inicio de sesión inválido
    Cuando ingreso el usuario '<correo>' con la contrasenna '<contrasenna>'
    Entonces visualizare un mensaje de error '<mensaje>'

    Ejemplos:
      | correo             | contrasenna | mensaje              |
      | maria@gmail.com    |             | No debe estar vacio! |
      |                    | maria123    | No debe estar vacio! |
      | mariagmail.com     | maria123    | Dato no válido!      |
      | ~`!#$%^&@gmail.com | maria123    | Dato no válido!      |
      | maria@gmail.com    | aria123     | No debe estar vacio! |
