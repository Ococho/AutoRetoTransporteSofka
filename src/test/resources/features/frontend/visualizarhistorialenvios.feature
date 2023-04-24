#language:es
#encoding:UTF-8
#Author: Gretty Maria Mosquera Taborda - Jonathan Andrés Vargas Sepúlveda.

Característica: Visualizar historial de envíos
  Yo como usuario de la aplicación web de Transporte Sofka
  Quiero observar mi historial de envíos
  Para poder conocer a detalle los servicios que he solicitado

  Antecedentes:
    Dado que estoy en la pagina principal
    Cuando accedo a la pagina de historial de envios

  @ExisteHistorial
  Escenario: Existe historial
    Entonces visualizare el historial de envios del usuario

  @NoExisteHistorial
  Escenario: No existe historial
    Entonces visualizare un mensaje que me indica que el historial no existe