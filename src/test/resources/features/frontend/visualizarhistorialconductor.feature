#language:es
#encoding:UTF-8
#Author: Gretty Maria Mosquera Taborda - Jonathan Andrés Vargas Sepúlveda.

Característica: Visualizar historial de conductor
  Yo como conductor de la aplicación web de Transporte Sofka
  Quiero observar mi historial de envíos
  Para poder conocer a detalle los servicios que he proporcionado

  Antecedentes:
    Dado que estoy en la pagina principal
    Cuando accedo a la pagina de historial de conductor

  @ExisteHistorialConductor
  Escenario: Existe historial conductor
    Entonces visualizare el historial de envios del conductor

  @NoExisteHistorialConductor
  Escenario: No existe historial conductor
    Entonces visualizare un mensaje que me indica que el historial del conductor no existe