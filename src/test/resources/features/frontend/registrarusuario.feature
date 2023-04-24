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
    Entonces sere redirigido al area de usuario

  @RegistroInvalidoPorInformacion
  Escenario: Registro de usuario inválido
    Cuando ingreso informacion invalida
    Entonces recibire un mensaje que me indica que la informacion ingresada es invalida

  @RegistroInvalidoPorCredenciales
  Escenario: Registro de usuario fallido
    Cuando ingreso una contrasenna que no coincide
    Entonces recibire un mensaje indicando que las contrasennas no coinciden