#language:es
#encoding:UTF-8
#Author: Gretty Maria Mosquera Taborda - Jonathan Andrés Vargas Sepúlveda.

Característica: Filtrar vehículos por carga
  Yo como usuario de la aplicación web de Transporte Sofka
  Quiero visualizar los vehículos que cumplen con una condición de carga
  Para poder seleccionar un vehículo

  Antecedentes:
    Dado que estoy en la pagina de filtrar vehículos por carga

  @DentroRango
  Escenario: Vehículos disponibles
    Cuando el vehiculo este dentro del rango disponible
    Entonces visualizare un listado que coincide con el criterio de filtro de vehiculo

  @FueraRango
  Escenario: Vehículos no disponibles
    Cuando el vehiculo no este dentro del rango
    Entonces visualizare un mensaje que me indica que no hay vehiculos disponibles