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
      | usuario                  | origen                                | destino                               | peso | id                       | codigo |
      | 6449086ecbd2eed87395f4e9 | 6.438634012554406, -75.33137941088387 | 6.167330475342829, -75.62072091370935 | 47   | 64492ebd70314b576124abaa | 200    |
      | 64491e52ebadb2c268766013 | 123@45                                | 6.276525538970002, -75.57307006378643 | 57   | 644938fa70314b576124abb8 | 400    |
      | 6449443d049900c5026e3bdd | 6.06002537311521, -75.50427645712104  | 12%345                                | 10   | 6449412a35bc388a854efeee | 400    |
      | 6449445c049900c5026e3be7 | 5.792520238575488, -75.78246330670534 | 6.458475184552928, -75.56050505860287 | -1   | 644942bb049900c5026e3bcc | 400    |
      | 644947c96b0fee87e7bcc425 | 6.058240187364985, -75.18155886451794 | 6.090837324963214, -75.33573400085217 | 1001 | 644942bb049900c5026e3bd0 | 400    |
      | 644947f26b0fee87e7bcc431 | 8.471815005836573, -76.74986529353384 | 8.115680049211766, -74.7890727392625  | 0    | 644942ca049900c5026e3bd4 | 400    |