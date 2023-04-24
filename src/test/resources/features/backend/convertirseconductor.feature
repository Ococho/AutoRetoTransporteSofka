#language:es
#encoding:UTF-8
#Author: Gretty Maria Mosquera Taborda - Jonathan Andrés Vargas Sepúlveda.

Característica: Convertirse en conductor
  Yo como consumidor de la API registro conductor para Transporte Sofka
  Quiero convertirme en conductor
  Para poder ofrecer mis servicios

  @TengoVehiculo
  Escenario: Tengo un vehículo
    Dado que tengo acceso a la ruta de la API registro conductor
    Cuando envio los datos de registro de vehiculo
    Entonces visualizare un codigo de estado nnn