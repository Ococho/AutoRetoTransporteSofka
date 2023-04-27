#language:es
#encoding:UTF-8
#Author: Gretty Maria Mosquera Taborda - Jonathan Andrés Vargas Sepúlveda.

Característica: Convertirse en conductor
  Yo como usuario de la aplicación web de Transporte Sofka
  Quiero convertirme en conductor
  Para poder ofrecer mis servicios

  @ConvertirseConductorExitoso
  Escenario: Convertirse en conductor
    Dado que ya inicie sesion como usuario
    Cuando ingreso a la pagina de registro de conductor
    Y completo credenciale validas
    Entonces sere redirigido a la pagina de iniciar sesion

  @ConvertirseConductorErroneo
  Esquema del escenario: Convertirse en conductor erróneo
    Dado que inicie sesion como usuario '<correo>' con contrasenna '<contrasenna>'
    Cuando accedo a la pagina de registro de conductor
    Y completo los campos de telefono '<telefono>' con dni '<dni>'
    Entonces podre visualizar un mensaje '<mensaje>'

    Ejemplos:
      | correo                        | contrasenna     | telefono  | dni      | mensaje              |
      | veronica.palacios@yahoo.com   | 94t9hli0e       | 320125874 |          | No debe estar vacio! |
      | karina.rangel@hotmail.com     | frycgua3p61u343 |           | 43254788 | No debe estar vacio! |
      | marina.morales@hotmail.com    | nyzsvunhu0rg    | "#ba31224 | 15785412 | Dato no válido!      |
      | javier.ordonez@prodigy.net.mx | 1b9kreuv11      | 32014     | 95784577 | Muy corto!           |
      | estela.lugo@prodigy.net.mx    | kqp754higq5vea  | 320146487 | 34587    | Muy corto!           |