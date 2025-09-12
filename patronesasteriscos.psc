Proceso PatronesConAsteriscos
    Definir a, b, c Como Entero
	
    Escribir "Ingrese el número: "
    Leer a
	
    Escribir "Patrón 1:"
    Para b <- 1 Hasta a Con Paso 1
        Para c <- 1 Hasta a Con Paso 1
            Escribir "*  " Sin Saltar
        FinPara
        Escribir ""
    FinPara
	
    Escribir "Patrón 2:"
    Para b <- 1 Hasta a Con Paso 1
        Para c <- 1 Hasta 2 * (a - b) + 1 Con Paso 1
            Escribir "*" Sin Saltar
        FinPara
        Escribir ""
    FinPara
	
    Escribir "Patrón 3:"
    Para b <- 1 Hasta a Con Paso 1
        Para c <- 1 Hasta 2 * b - 1 Con Paso 1
            Escribir "*" Sin Saltar
        FinPara
        Escribir ""
    FinPara
FinProceso