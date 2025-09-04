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
			Escribir "El área del cuadrado es: ", area
		2:
			Escribir "Ingrese la base del rectángulo: "
			Leer base
			Escribir "Ingrese la altura del rectángulo: "
			Leer altura
			area <- base * altura
			Escribir "El área del rectángulo es: ", area
		3:
			Escribir "Ingrese la base del triángulo: "
			Leer base
			Escribir "Ingrese la altura del triángulo: "
			Leer altura
			area <- (base * altura) / 2
			Escribir "El área del triángulo es: ", area
		4:
			Escribir "Ingrese el radio del círculo: "
			Leer radio
			area <- 3.1416 * radio * radio
			Escribir "El área del círculo es: ", area 
		De Otro Modo:
			Escribir "Opción no válida"
	FinSegun
	
FinAlgoritmo
