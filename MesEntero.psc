Algoritmo MesEntero
	Definir Mes Como Entero
	Escribir "Introduce el numero del mes (1-12)"
	leer Mes
		segun Mes hacer
			1: escribir "Enero - 31 Dias"
			2: escribir "Febrero - 28 Dias"
			3: escribir "Marzo - 31 Dias"
			4: escribir "Abril - 30 Dias"
			5: escribir "Mayo - 31 Dias"
			6: escribir "Junio - 30 Dias"
			7: escribir "Julio - 31 Dias"
			8: escribir "Agosto - 31 Dias"
			9: escribir "Septiembre - 30 Dias"
			10: escribir "Octubre - 31 Dias"
			11: escribir "Noviembre - 31 Dias"
			12: escribir "Diciembre _ 31 Dias"
			De Otro Modo:
				Escribir "Entrada no valida"
				Escribir "Error el numero de mes debe estar entre 1 y 12"
		FinSegun
FinAlgoritmo
