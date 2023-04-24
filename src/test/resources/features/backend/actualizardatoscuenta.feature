#language:es
#encoding:UTF-8
#Author: Gretty Maria Mosquera Taborda - Jonathan Andrés Vargas Sepúlveda.

Característica: Actualizar datos de una cuenta
  Yo como consumidor de la API modificar datos usuario para Transporte Sofka
  Quiero modificar información de mi cuenta
  Para poder actualizar mis datos

  Antecedentes:
    Dado que tengo acceso a la ruta de la API modificar usuario

  @ModificacionExitosa
  Escenario: Modificación de información exitosa
    Cuando envio datos validos en el formulario
    Entonces visualizare un codigo de estado nnn

  @IngresoDatosNoValidos
  Escenario: Ingreso de datos no válidos
    Cuando envio informacion invalida en el formulario
    Entonces visualizare un codigo de estado nnnn