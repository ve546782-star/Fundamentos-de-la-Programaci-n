Algoritmo tresenteros
	Escribir "introdusca numeros enteros"
	Leer a, b, c
	ab=a+b
	bc=b+c
	ac=a+c
	Si (ab=10) O (bc=10) O (ac=10) Entonces
		resultado = 10
		Escribir  "El resultado es " resultado
	SiNo
		Si ab==(bc+10) O ab==(ac+10) Entonces
			resultado = 5
			Escribir "El resultado es " resultado
		SiNo
			resultado = 0
			Escribir "El resultado es " resultado
	FinSi
FinSi

FinAlgoritmo
