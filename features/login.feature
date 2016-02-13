# language:es
Caracteristica: login
	Para loguearse
	Como usuario
	Quiero introducir mi usuario y contrase�a

	Escenario: introducir bien la contrase�a y mal el usuario
		Dado la pantalla de inicio
		Cuando introduzco mis datos y pulso aceptar
		Entonces asegurar que el login fallara

	Escenario: introducir mal la contrase�a y bien el usuario
		Dado la pantalla de inicio
		Cuando introduzco mis datos y pulso aceptar
		Entonces asegurar que el login fallara

	Escenario: introducir bien la contrase�a y bien el usuario
		Dado la pantalla de inicio
		Cuando introduzco mis datos y pulso aceptar
		Entonces asegurar que el login sera correcto

	Escenario: introducir mal la contrase�a y mal el usuario
		Dado la pantalla de inicio
		Cuando introduzco mis datos y pulso aceptar
		Entonces asegurar que el login fallara

	Escenario: introducir caracteres extra�os en la contrase�a
		Dado la pantalla de inicio
		Cuando introduzco mis datos y pulso aceptar
		Entonces asegurar que el login fallara

	Escenario: introducir caracteres extra�os en el usuario
		Dado la pantalla de inicio
		Cuando introduzco mis datos y pulso aceptar
		Entonces asegurar que el login fallara