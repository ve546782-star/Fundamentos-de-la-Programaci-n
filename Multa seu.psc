Algoritmo Multa
	Escribir 'ingrese la velocidad'
	Leer Velocidad
	Escribir '�hoy es su cumplea�os?'
	Leer Respuesta
	Si Respuesta=='no' Entonces
		Si Velocidad<=60 Entonces
			Escribir '0=sin multa'
		SiNo
			Si Velocidad>=62 Y Velocidad<=80 Entonces
				Escribir '1=multa peque�a'
			SiNo
				Escribir '2=multa grande'
			FinSi
		FinSi
	SiNo
		Escribir 'No hay multa'
	FinSi
FinAlgoritmo
