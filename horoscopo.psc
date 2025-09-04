Algoritmo horoscopo
	Escribir "Ingresa tu dia de nacimiento"
	Definir dia, mes como Entero;
	Leer dia;
	Escribir "Ingresa tu mes de nacimiento (en número):";
	Leer mes;
	
	
	Segun mes Hacer
		1: 
			Si dia >= 20 Entonces
				Escribir "Tu signo es Acuario.";
			SiNo
				Escribir "Tu signo es Capricornio.";
			FinSi
		2: 
			Si dia >= 19 Entonces
				Escribir "Tu signo es Piscis.";
			SiNo
				Escribir "Tu signo es Acuario.";
			FinSi
		3:
			Si dia >= 21 Entonces
				Escribir "Tu signo es Aries.";
			SiNo
				Escribir "Tu signo es Piscis.";
			FinSi
		4:
			Si dia >= 20 Entonces
				Escribir "Tu signo es Tauro.";
			SiNo
				Escribir "Tu signo es Aries.";
			FinSi
		5: 
			Si dia >= 21 Entonces
				Escribir "Tu signo es Géminis.";
			SiNo
				Escribir "Tu signo es Tauro.";
			FinSi
		6: 
			Si dia >= 21 Entonces
				Escribir "Tu signo es Cáncer.";
			SiNo
				Escribir "Tu signo es Géminis.";
			FinSi
		7: 
			Si dia >= 23 Entonces
				Escribir "Tu signo es Leo.";
			SiNo
				Escribir "Tu signo es Cáncer.";
			FinSi
		8:
			Si dia >= 23 Entonces
				Escribir "Tu signo es Virgo.";
			SiNo
				Escribir "Tu signo es Leo.";
			FinSi
		9:
			Si dia >= 23 Entonces
				Escribir "Tu signo es Libra.";
			SiNo
				Escribir "Tu signo es Virgo.";
			FinSi
		10:
			Si dia >= 23 Entonces
				Escribir "Tu signo es Escorpio.";
			SiNo
				Escribir "Tu signo es Libra.";
			FinSi
		11:
			Si dia >= 22 Entonces
				Escribir "Tu signo es Sagitario.";
			SiNo
				Escribir "Tu signo es Escorpio.";
			FinSi
		12: 
			Si dia >= 22 Entonces
				Escribir "Tu signo es Capricornio.";
			SiNo
				Escribir "Tu signo es Sagitario.";
			FinSi
		De Otro Modo:
			Escribir "Mes no valido, Por favor, ingresa un número del 1 al 12.";
	FinSegun

FinAlgoritmo
