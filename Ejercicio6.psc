Algoritmo Ejercicio6

	Definir edad, sumaEdadMenor, sumaEdadMayor, contadorMayor, contadorMenor como Entero
	Definir promedioMenor, promedioMayor Como Real
	
	Para i<-1 Hasta 100 Con Paso 1 Hacer
		Escribir "Ingrese edad " i ":"
		Leer edad
		
		Si edad>=25 Entonces
			sumaEdadMayor <- sumaEdadMayor + edad
			contadorMayor <- contadorMayor + 1
		SiNo
			sumaEdadMenor <- sumaEdadMenor + edad
			contadorMenor <- contadorMenor + 1
		Fin Si
		
	Fin Para
	
	promedioMayor <- sumaEdadMayor / contadorMayor
	promedioMenor <- sumaEdadMenor / contadorMenor
	
	Escribir "Promedio de los mayores de 25: " promedioMayor
	Escribir "Promedio de los menores de 25: " promedioMenor
	
FinAlgoritmo
