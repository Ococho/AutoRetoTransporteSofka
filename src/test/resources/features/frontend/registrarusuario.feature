#language:es
#encoding:UTF-8
#Author: Gretty Maria Mosquera Taborda - Jonathan Andrés Vargas Sepúlveda.

Característica: Registrar usuario
  Yo como usuario de la aplicación web de Transporte Sofka
  Quiero registrar una cuenta
  Para poder acceder a los servicios de la aplicación

  Antecedentes:
    Dado que estoy en la pagina de registro

  @RegistroExitoso
  Escenario: Registro de usuario exitoso
    Cuando ingreso datos de registro validos
    Entonces sere redirigido al area de inicio de sesion

  @RegistroInvalido
  Esquema del escenario: Registro de usuario inválido
    Cuando ingreso mis nombres '<nombres>', apellidos '<apellidos>', correo '<correo>', contrasenna '<contrasenna>' con su confirmacion '<cContrasenna>'
    Entonces recibire un mensaje '<mensaje>' que me indica que la informacion ingresada es invalida
    Ejemplos:
      | nombres | apellidos | correo               | contrasenna | cContrasenna | mensaje                 |
      | 1!%^$#  | Vargas    | ron.vargas@gmail.com | vargas123   | vargas123    | Dato no válido!         |
      | Ron     | $67^$#    | ron.vargas@gmail.com | vargas123   | vargas123    | Dato no válido!         |
      | Ron     | Vargas    | ron.vargasgmail.com  | vargas123   | vargas123    | Dato no válido!         |
      | Ron     | Vargas    | ron.vargas@gmail.com | vargas123   | 123vargas    | Contraseña no coincide! |