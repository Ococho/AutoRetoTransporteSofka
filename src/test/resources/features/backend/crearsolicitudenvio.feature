#language:es
#encoding:UTF-8
#Author: Gretty Maria Mosquera Taborda - Jonathan Andrés Vargas Sepúlveda.

Característica: Crear solicitud de envío
  Yo como consumidor de la API registrar envío para Transporte Sofka
  Quiero crear una solicitud de envío
  Para poder seleccionar los vehículos que estén disponibles

  Antecedentes:
    Dado que tengo acceso a la ruta de la API registrar envio

  @SolicitudGeneradaExitosa
  Escenario: Solicitud de carga generada
    Cuando mis datos de carga enviados son validos
    Entonces visualizare un codigo de estado nnn

  @DatosInvalidos
  Escenario: Datos inválidos en la solicitud
    Cuando mis datos de carga enviados son invalidos
    Entonces visualizare un codigo de estado nn