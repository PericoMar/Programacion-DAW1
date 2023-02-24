/*Programa:Ej38
Autor:Pedro Martinez Gonzalez
Entorno:
	z es numerico entero
	x es numerico entero
	y es numerico entero
Algoritmo:
	z<--5
	x<--2
	y<--1
	Escribir "Z X Y"
	Mientras z>=x hacer
		x++;
		Si z**2=x**2+y**2 entonces
			Escribir z," ",x," ",y
		Fin Si
		y++;
		Si  z**2=x**2+y**2 entonces
			Escribir z," ",x," ",y
		Fin Si
	Fin Mientras
Fin Programa
*/

public class Ej38{
	public static void main(String[] args){
		//Entorno:
			//****declaracion de variables
		int z;
		int x;
		int y;
		//Algoritmo:
			//****Secuencia de instrucciones
		System.out.println("Z X Y");
		for(z=5;z<=50;z++){
			x=(int)z/2;
			y=(int)z/2;
			while(z>=x) {
				x++;
				y=1;
				while(y<x){
					if(Math.pow(z,2)==Math.pow(x,2)+Math.pow(y,2)){
						System.out.println(z+" "+x+" "+y);
					}
					y++;
				}
			}
		}
	}
}