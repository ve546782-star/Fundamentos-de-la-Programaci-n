Proceso TablasMultiplicar
    Definir n, i Como Entero
	
    Repetir
        Escribir "Ingrese un número para generar su tabla de multiplar (0 para terminar): "
        Leer n
		
        Si n <> 0 Entonces
            Para i <- 1 Hasta 10 Con Paso 1
                Escribir n, " x ", i, " = ", n * i
            FinPara
        FinSi
		
    Hasta Que n = 0
	
    Escribir "terminando programa"
FinProceso
