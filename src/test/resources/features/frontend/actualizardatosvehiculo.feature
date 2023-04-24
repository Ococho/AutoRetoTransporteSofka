#language:es
#encoding:UTF-8
#Author: Gretty Maria Mosquera Taborda - Jonathan Andrés Vargas Sepúlveda.

Característica: Actualizar datos de un vehículo
  Yo como conductor de la aplicación web de Transporte Sofka
  Quiero modificar información de mi vehículo
  Para poder actualizar sus datos

  Antecedentes:
    Dado que estoy en la pagina actualizar datos de vehiculo

  @ModificacionExitosaVehiculo
  Escenario: Modificación de información de vehículo exitosa
    Cuando ingreso datos validos del vehiculo en el formulario
    Entonces visualizare la actualizacion de datos de mi vehiculo

  @IngresoDatosNoValidosVehiculo
  Escenario: Ingreso de datos del vehículo no válidos
    Cuando ingreso informacion invalida del vehiculo en el formulario
    Entonces visualizare mensaje de error

  @OperacionCanceladaVehiculo
  Escenario: Operacion cancelada de vehículo
    Cuando cancelo la actualizacion del vehiculo
    Entonces visualizare un mensaje indicando que los cambios del vehiculo fueron descartados