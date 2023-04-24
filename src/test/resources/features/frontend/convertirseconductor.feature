#language:es
#encoding:UTF-8
#Author: Gretty Maria Mosquera Taborda - Jonathan Andrés Vargas Sepúlveda.

Característica: Convertirse en conductor
  Yo como usuario de la aplicación web de Transporte Sofka
  Quiero convertirme en conductor
  Para poder ofrecer mis servicios

  @TengoVehiculo
  Escenario: Tengo un vehículo
    Dado que estoy ubicado en la pagina principal
    Cuando accedo a la pagina de registro de conductor
    Y completo los campos del formulario de registro de vehiculo
    Entonces visualizare un mensaje indicando que el registro fue exitoso