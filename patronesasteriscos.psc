Proceso PatronesConAsteriscos
    Definir a, b, c Como Entero
	
    Escribir "Ingrese el n�mero: "
    Leer a
	
    Escribir "Patr�n 1:"
    Para b <- 1 Hasta a Con Paso 1
        Para c <- 1 Hasta a Con Paso 1
            Escribir "*  " Sin Saltar
        FinPara
        Escribir ""
    FinPara
	
    Escribir "Patr�n 2:"
    Para b <- 1 Hasta a Con Paso 1
        Para c <- 1 Hasta 2 * (a - b) + 1 Con Paso 1
            Escribir "*" Sin Saltar
        FinPara
        Escribir ""
    FinPara
	
    Escribir "Patr�n 3:"
    Para b <- 1 Hasta a Con Paso 1
        Para c <- 1 Hasta 2 * b - 1 Con Paso 1
            Escribir "*" Sin Saltar
        FinPara
        Escribir ""
    FinPara
FinProceso