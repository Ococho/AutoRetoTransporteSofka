#language:es
#encoding:UTF-8
#Author: Gretty Maria Mosquera Taborda - Jonathan Andrés Vargas Sepúlveda.

Característica: Registrar usuario
  Yo como consumidor de la API registrar usuario para Transporte Sofka
  Quiero registrar una cuenta
  Para poder acceder a los servicios de la API

  Antecedentes:
    Dado que tengo acceso a la ruta de la API registro

  @RegistroExitoso
  Escenario: Registro de usuario exitoso
    Cuando envio datos de registro validos
    Entonces podre visualizar un codigo de estado <201>

  @RegistroInvalidoPorInformacion
  Escenario: Registro de usuario inválido
    Cuando envio informacion invalida
    Entonces podre ver un codigo de estado <400>