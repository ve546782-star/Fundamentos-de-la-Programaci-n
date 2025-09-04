Proceso entradascine
    Definir personas, parejas, individuales Como Entero
    Definir dia Como Cadena
    Definir tieneMembresia Como Logico
    Definir precioTotal, precioBase, descuento Como Real
	
    precioBase <- 50
    descuento <- 0
	
    Escribir "Introduce el número de personas:"
    Leer personas
	
    Escribir "Introduce el día de la semana (ejemplo: lunes, martes, miercoles...):"
    Leer dia
    dia <- Minusculas(dia)
	
    Escribir "¿Tienes membresía? (1 para sí, 0 para no):"
    Leer tieneMembresia
	
    Si dia = "miercoles" Entonces
        precioTotal <- personas * 30
    Sino
        Si dia = "jueves" Entonces
            parejas <- trunc(personas / 2)
            individuales <- personas Mod 2
            precioTotal <- (parejas * 75) + (individuales * precioBase)
        Sino
            precioTotal <- personas * precioBase
        FinSi
    FinSi
    Si tieneMembresia Entonces
        precioTotal <- precioTotal * 0.9
    FinSi
	
    Escribir "El precio total a pagar es: $", precioTotal
	
FinProceso