# language:es
Caracteristica: login
	Para loguearse
	Como usuario
	Quiero introducir mi usuario y contraseña

	Escenario: introducir bien la contraseña y mal el usuario
		Dado la pantalla de inicio
		Cuando introduzco mis datos y pulso aceptar
		Entonces asegurar que el login fallara

	Escenario: introducir mal la contraseña y bien el usuario
		Dado la pantalla de inicio
		Cuando introduzco mis datos y pulso aceptar
		Entonces asegurar que el login fallara

	Escenario: introducir bien la contraseña y bien el usuario
		Dado la pantalla de inicio
		Cuando introduzco mis datos y pulso aceptar
		Entonces asegurar que el login sera correcto

	Escenario: introducir mal la contraseña y mal el usuario
		Dado la pantalla de inicio
		Cuando introduzco mis datos y pulso aceptar
		Entonces asegurar que el login fallara

	Escenario: introducir caracteres extraños en la contraseña
		Dado la pantalla de inicio
		Cuando introduzco mis datos y pulso aceptar
		Entonces asegurar que el login fallara

	Escenario: introducir caracteres extraños en el usuario
		Dado la pantalla de inicio
		Cuando introduzco mis datos y pulso aceptar
		Entonces asegurar que el login fallara