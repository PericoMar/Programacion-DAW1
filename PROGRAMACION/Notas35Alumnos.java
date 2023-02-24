/*Programa:Notas35Alumnos
Autor:Pedro Martínez Gonzalez
Entorno:
	nota es alfanumerico(4)
	notaNumerica es numerico real
	media es numerico real
	porcentajeSuspensos es numerico entero
	porcentajeAprobados es numerico entero
	CONST ALUMNOS es numerico entero <-- 35
	i es numerico entero
	numAprobados es numerico entero
	numSuspensos es numerico entero
Algoritmo:
	media<--0
	Repetir
		Escribir "Inserte un nota: "
		Leer nota
	Hasta nota="SOBR" o nota="NOT" o nota="BIEN" o nota="SUF" o nota="INS" o nota="MD" o nota=" "
	Para i de 1 a ALUMNOS hacer
		Segun Sea nota hacer
			"SOBR":
				notaNumerica <-- 9.5
			"NOT":
				notaNumerica <-- 7.5
			"BIEN":
				notaNumerica <-- 6
			"SUF":
				notaNumerica <-- 5
			"INS":
				notaNumerica <-- 4.5
			"MD":
				notaNumerica <-- 3
			Sino
				notaNumerica <-- 0
		Fin Segun Sea
		Si notaNumerica>=5 hacer
			numAprobados<--aprobado+1
		Sino
			numSuspensos<--suspensos+1
		Fin Si
		media<--media+notaNumerica
	Fin Para
	media<--media/ALUMNOS
	porcentajeAprobados<--numAprobados*100/ALUMNOS
	porcentajeSuspensos<--numSuspensos*100/ALUMNOS
	Escribir "Hay ",numAprobados," numero de aprobados con un porcentaje de aprobado del ",porcentajeAprobados," y ",numSuspensos ,"numero de suspensos con un porcentaje del ",porcentajeSuspensos,". La nota media es de ",media
Fin Programa
*/

public class 
		