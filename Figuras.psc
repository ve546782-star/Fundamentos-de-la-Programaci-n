Algoritmo figuras
	Definir  res Como Entero
	Definir lado, base, altura, radio, area Como Real
	
	Escribir "Selecione un numero del 1 a 4 dependiendo de la figura"
	Escribir "1. Area del cuadrado"
	Escribir "2. Area del Rectangulo"
	Escribir "3. Area del triangulo"
	Escribir "4. Area del circulo"
	Leer res
	
	Segun res Hacer
		1:
			Escribir "Ingrese el lado del cuadrado: "
			Leer lado
			area <- lado * lado
			Escribir "El �rea del cuadrado es: ", area
		2:
			Escribir "Ingrese la base del rect�ngulo: "
			Leer base
			Escribir "Ingrese la altura del rect�ngulo: "
			Leer altura
			area <- base * altura
			Escribir "El �rea del rect�ngulo es: ", area
		3:
			Escribir "Ingrese la base del tri�ngulo: "
			Leer base
			Escribir "Ingrese la altura del tri�ngulo: "
			Leer altura
			area <- (base * altura) / 2
			Escribir "El �rea del tri�ngulo es: ", area
		4:
			Escribir "Ingrese el radio del c�rculo: "
			Leer radio
			area <- 3.1416 * radio * radio
			Escribir "El �rea del c�rculo es: ", area 
		De Otro Modo:
			Escribir "Opci�n no v�lida"
	FinSegun
	
FinAlgoritmo
