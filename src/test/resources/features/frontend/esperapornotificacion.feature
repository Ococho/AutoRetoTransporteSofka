#language:es
#encoding:UTF-8
#Author: Gretty Maria Mosquera Taborda - Jonathan Andrés Vargas Sepúlveda.

Característica: Espera por notificación
  Yo como usuario de la aplicación web de Transporte Sofka
  Quiero obtener una respuesta
  Para poder conocer el estado de mi solicitud

  Antecedentes:
    Dado que estoy en la bandeja de entrada de mi correo electronico

  @NotificacionAceptada
  Escenario: Notificación aceptada
    Cuando mi solicitud es aceptada
    Entonces visualizare un correo con un mensaje de notificacion aceptada

  @NotificacionRechazada
  Escenario: Notificación rechazada
    Cuando mi solicitud es rechazada
    Entonces visualizare un correo con un mensaje de notificacion rechazada