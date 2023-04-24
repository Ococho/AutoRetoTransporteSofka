#language:es
#encoding:UTF-8
#Author: Gretty Maria Mosquera Taborda - Jonathan Andrés Vargas Sepúlveda.

Característica: Crear solicitud de envío
  Yo como usuario de la aplicación web de Transporte Sofka
  Quiero crear una solicitud de envío
  Para poder seleccionar los vehículos que estén disponibles

  Antecedentes:
    Dado que estoy en la pagina de crear solicitudes de envio

  @SolicitudGeneradaExitosa
  Escenario: Solicitud de carga generada
    Cuando mis datos de carga son validos
    Entonces sere redirigido a la lista de vehiculos disponibles

  @DatosInvalidos
  Escenario: Datos inválidos en la solicitud
    Cuando mis datos de carga son invalidos
    Entonces visualizare un mensaje que me indica que los datos de la carga son invalidos