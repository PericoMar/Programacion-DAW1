/*Programa:Ej30
Autor:Pedro Martinez Gonzalez
Entorno:
	n es numerico entero
	i es numerico entero
	num1 es numerico entero
	num2 es numerico entero
Algoritmo:
	Repetir
		Escribir "Inserte cuantos valores de la funcion de Fibonacci quiere conocer: "
		Leer n
	Hasta n>0
	num1<--0
	num2<--1
	Para i de 1 a n hacer
		Si n%2=1 entonces
			Escribir num1,","
			num1<--num1+num2
		Sino
			Escribir num2,","
			num2<--num1+num2
		Fin Si
	Fin Para
Fin Programa
*/

public class Ej30{
	public static void main(String[] args){
		//Entorno:
			//****delcaracion de variables
		short n;
		short i;
		int num1;
		int num2;
		//Algoritmo:
			//****Secuencia de instrucciones
		do{
			System.out.print("Inserte cuantos valores de la funcion de Fibonacci quiere conocer: ");
			n=Leer.datoShort();
		}while(n<=0);
		num1=0;
		num2=1;
		System.out.print(num1);
		for(i=1;i<=n;i++){
			if(i!=1){
				if(i%2==0){
					System.out.print(","+num2);
					num1=num1+num2;
				}else{
					System.out.print(","+num1);
					num2=num2+num1;
				}
			}
		}	
	}//Fin Programa
}
	
		