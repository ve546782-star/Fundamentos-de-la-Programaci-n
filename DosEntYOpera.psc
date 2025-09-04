Algoritmo poliza
	Definir plan Como Caracter
    Definir base, costoTotal Como Real
    Definir alcohol, lentes, enfermedad, mayor40 Como Caracter
	
    Escribir "Ingrese el plan (A o B): "
    Leer plan
	
    Si plan = "A" Entonces
        base <- 1200
    Sino
        base <- 950
    FinSi
	
    costoTotal <- base
	
    Escribir "¿Consume alcohol? (S/N): "
    Leer alcohol
    Si alcohol = "S" Entonces
        costoTotal <- costoTotal + base * 0.10
    FinSi
	
    Escribir "¿Utiliza lentes? (S/N): "
    Leer lentes
    Si lentes = "S" Entonces
        costoTotal <- costoTotal + base * 0.05
    FinSi
	
    Escribir "¿Tiene alguna enfermedad (cardíaca, diabetes, etc)? (S/N): "
    Leer enfermedad
    Si enfermedad = "S" Entonces
        costoTotal <- costoTotal + base * 0.05
    FinSi
	
    Escribir "¿Es mayor de 40 años? (S/N): "
    Leer mayor40
    Si mayor40 = "S" Entonces
        costoTotal <- costoTotal + base * 0.20
    Sino
        costoTotal <- costoTotal + base * 0.10
    FinSi
	
    Escribir "El costo total de la póliza es: $", costoTotal
	
FinProceso