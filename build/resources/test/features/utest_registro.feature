#language:es
  Característica: Registrar usuario en Utest
    Como probador de software
    Quiero ingresar al sitio web de Utest
    Para registrarme

    Esquema del escenario: Registrarse en el sitio web
      Dado que el usuario quiere registrarse en Utest
      Cuando el usuario busca la opcion de registro
      Entonces debe llenar los datos personales
        | nombre   | apellido   | correoElectronico   | mes   | dia   | año   |
        | <nombre> | <apellido> | <correoElectronico> | <mes> | <dia> | <año> |
      Y debe llenar los datos de su ubicacion
        | ciudad   | codigoPostal   | pais   |
        | <ciudad> | <codigoPostal> | <pais> |
      Y debe llenar los datos de sus dispositivos
        | computador    | version   | idiomaComputador   | dispositivoMovil   | modelo   | sitemaOperativoMovil   |
        | <computador> | <version> | <idiomaComputador> | <dispositivoMovil> | <modelo> | <sitemaOperativoMovil> |
      Y debe crear una contraseña
        | contraseña   |
        | <contraseña> |

      Ejemplos:
        | nombre      | apellido       | correoElectronico         | mes      | dia | año  |  ciudad | codigoPostal | pais     | computador | version | idiomaComputador | dispositivoMovil | modelo    | sitemaOperativoMovil | contraseña |
        | Berta Elena | Mazo Echeverri | bertam_123@gmail.com | February | 14  | 1969 |  Itagüi | 055410       | Colombia | Windows    | 7       | Spanish          | Samsung          | Galaxy J7 | Android 10           | Berta1234_ |
