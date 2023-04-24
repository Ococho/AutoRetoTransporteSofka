#language:es
#encoding:UTF-8
#Author: Gretty Maria Mosquera Taborda - Jonathan Andrés Vargas Sepúlveda.

Característica: Actualizar datos de una cuenta
  Yo como usuario de la aplicación web de Transporte Sofka
  Quiero modificar información de mi cuenta
  Para poder actualizar mis datos

  Antecedentes:
    Dado que estoy en la pagina actualizar datos

  @ModificacionExitosa
  Escenario: Modificación de información exitosa
    Cuando ingreso datos validos en el formulario
    Entonces visualizare la actualizacion de datos

  @IngresoDatosNoValidos
  Escenario: Ingreso de datos no válidos
    Cuando ingreso informacion invalida en el formulario
    Entonces visualizare un mensaje de error

  @OperacionCancelada
  Escenario: Operacion cancelada
    Cuando cancelo la actualizacion
    Entonces visualizare un mensaje indicando que los cambios fueron descartados