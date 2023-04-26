#language:es
#encoding:UTF-8
#Author: Gretty Maria Mosquera Taborda - Jonathan Andrés Vargas Sepúlveda.

Característica: Actualizar solicitud de envío
  Yo como consumidor de la API actualizar envío para Transporte Sofka
  Quiero modificar una solicitud de envío
  Para poder ajustar una solicitud existente

  @ModificacionEnvio
  Esquema del escenario: Solicitud de carga modificada
    Dado que tengo acceso a la ruta de la API actualizar envio
    Cuando modifico los datos ID de usuario '<usuario>', origen '<origen>', destino '<destino>', peso <peso> del envio '<id>'
    Entonces visualizare un codigo de estado <codigo>
    Y los campos recibidos seran validos

    Ejemplos:
      | usuario     | origen    | destino   | peso | id                       | codigo |
      | JaDoe       | Copa      | Jardin    | 47   | 6447f379c67ebee4b468c6ce | 200    |
      | BColmenares | 123@45    | Medellin  | 57   | 6447f369b833ea0589d884f1 | 400    |
      | BeJaramillo | El Retiro | 12%345    | 10   | 6447f37bb833ea0589d884f4 | 400    |
      | MMoreno     | Jerico    | San Pedro | -1   | 6447f388b833ea0589d884f7 | 400    |
      | MoLopez     | Betulia   | Caramanta | 1001 | 6447f5d5b833ea0589d88506 | 400    |
      | JCordoba    | San Luis  | San Felix | 0    | 6447f94994148a6fb0e66400 | 400    |