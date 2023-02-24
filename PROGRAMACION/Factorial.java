/*Programa: Factorial
Autor: Pedro Martinez Gonzalez
Entorno:
	num es numerico entero
	i es numerico entero
	factorial es numerico entero
Algoritmo:
	Repetir
		Escribir "Inserte un numero del que quiera saber su factorial: "
		Leer num
	Hasta num > 0
	factorial<--num
	Escribir
	Para i de num a 2 con incremento -1 hacer
		factorial<--factorial*i
	Fin Para
	Escribir "1="factorial
Fin Programa
*/

public class Factorial{
	public static void main(String[] args){
		//Entorno
			//****declaracion de variables
		int num;
		int i;
		long factorial;
		//Algoritmo
			//****Secuaencia de instrucciones
		do{
			System.out.print("Inserte un numero del que quiera saber su factorial: ");
			num=Leer.datoInt();
		}while(num<0);
		factorial=num;
		System.out.print(num+"!="+num);
		for(i=num-1;i>1;i--){
			System.out.print("x"+i);
			factorial=factorial*i;
		}
		System.out.print("x1="+factorial);
	}//Fin Programa
}
		
		