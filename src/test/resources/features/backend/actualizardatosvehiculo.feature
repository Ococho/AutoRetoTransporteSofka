#language:es
#encoding:UTF-8
#Author: Gretty Maria Mosquera Taborda - Jonathan Andrés Vargas Sepúlveda.

Característica: Actualizar datos de un vehículo
  Yo como consumidor de la API modificar datos vehículo para Transporte Sofka
  Quiero modificar información de mi vehículo
  Para poder actualizar sus datos

  Antecedentes:
    Dado que tengo acceso a la ruta de la API modificar vehiculo

  @ModificacionExitosaVehiculo
  Escenario: Modificación de información de vehículo exitosa
    Cuando envio datos validos del vehiculo en el formulario
    Entonces visualizare un codigo de estado nnn

  @IngresoDatosNoValidosVehiculo
  Escenario: Ingreso de datos del vehículo no válidos
    Cuando envio informacion invalida del vehiculo en el formulario
    Entonces visualizare un codigo de estado nn