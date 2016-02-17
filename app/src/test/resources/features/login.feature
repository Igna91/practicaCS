# language: es
Característica: login
Para loguearse
Como usuario
Quiero introducir mi usuario y contraseña

Escenario: introducir bien la contraseña y mal el usuario
Dado que he introducido el usuario <entrada_1> en el login
Y que  he introducido la contraseña <entrada_2> en el login
Cuando oprimo el <boton>
Entonces el resultado debe ser <resultado> en la pantalla
