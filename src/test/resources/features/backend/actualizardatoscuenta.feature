#language:es
#encoding:UTF-8
#Author: Gretty Maria Mosquera Taborda - Jonathan Andrés Vargas Sepúlveda.

Característica: Actualizar datos de una cuenta
  Yo como consumidor de la API modificar datos usuario para Transporte Sofka
  Quiero modificar información de mi cuenta
  Para poder actualizar mis datos

  Antecedentes:

  @ModificacionUsuario
  Esquema del escenario: Modificación de información de usuario
    Dado que tengo acceso a la ruta de la API modificar usuario
    Cuando modifico los datos rol de usuario <rol>, nombres '<nombres>', dni '<dni>', correo '<correo>', contrasenna '<contrasenna>' y telefono '<telefono>' del usuario '<usuario>'
    Entonces vere el codigo de estado <codigo>
    Y los campos admitidos seran validos

    Ejemplos:
      | rol | nombres    | dni        | correo              | contrasenna | telefono   | codigo | usuario                  |
      | 0   | Joe Doe    | 1234567890 | joe.doe@gmail.com   | Joe1234     | 3216549870 | 200    | 6449086ecbd2eed87395f4e9 |
      | 0   | 1 Joe      | 1234567891 | joe.1@gmail.com     | Joe11234    | 3216549871 | 400    | 64491e52ebadb2c268766013 |
      | 0   | Jane Doe   | #234567890 | jane.doe@gmail.com  | Jane1234    | 3216549872 | 400    | 6449443d049900c5026e3bdd |
      | 0   | Joe Does   | 1234567892 | joe.doegmail.com    | Joes1234    | 3216549873 | 400    | 6449445c049900c5026e3be7 |
      | 0   | Jane Does  | 1234567893 | jane.doe@gmail.com  |             | 3216549874 | 400    | 644947c96b0fee87e7bcc425 |
      | 0   | Janes Does | 1234567894 | janes.doe@gmail.com | Janes1234   | a216549874 | 400    | 644947f26b0fee87e7bcc431 |