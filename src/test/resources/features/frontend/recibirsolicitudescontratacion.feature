#language:es
#encoding:UTF-8
#Author: Gretty Maria Mosquera Taborda - Jonathan Andrés Vargas Sepúlveda.

Característica: Recibir solicitud de contratación
  Yo como conductor de la aplicación web de Transporte Sofka
  Quiero recibir solicitudes de envío
  Para poder elegir prestar o no mi servicio

  Antecedentes:
    Dado que estoy en la bandeja principal de mi correo electronico

  @Aceptada
  Escenario: Solicitud aceptada
    Cuando acepto una solicitud
    Entonces a

  @Rechazada
  Escenario: Solicitud rechazada
    Cuando rechazo una solicitud
    Entonces b