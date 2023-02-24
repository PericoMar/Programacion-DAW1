/*Programa:MenoraMayorABC
Autor:Pedro Martinez Gonzalez
Entorno:
	a es float;
	b es float;
	c es float;
Algoritmo:
	Escribir "De menor a mayor a,b,c"
	Escribir "Inserte un valor para a: "
	Leer float
	Escribir "Inserte un valor para b: "
	Leer float
	Escribir "Inserte un valor para c: "
	Leer float
	Si a<=b entonces
		Si b<=c entonces
			Escribir a","b","c
		Sino
			Si a<=c
				Escribir a","c","b
			Sino 
				Escribir c","a","b
			Fin Si
		Fin Si
	Sino
		Si b<=c
			Si a<=c
				Escribir b","a","c
			Sino
				Escribir b","c","a
			Fin Si
		Sino
			Escribir c","b","a
		Fin Si
	Fin Si
*/

public class MenoraMayorABC{
	public static void main (String[] args){
		//Entorno:
			//****declaración de variables
		float a;
		float b;
		float c;
		//Algoritmo:
			//****Secuencia de instrucciones
		System.out.print("Inserte un valor para a: ");
		a=Leer.datoFloat();
		System.out.print("Inserte un valor para b: ");
		b=Leer.datoFloat();
		System.out.print("Inserte un valor para c: ");
		c=Leer.datoFloat();
		if (a<=b){
			if(b<=c){
				System.out.print(a+","+b+","+c);
			}else{
				if(a<=c){
					System.out.print(a+","+c+","+b);
				}else{
					System.out.print(c+","+a+","+b);
				}
			}
		}else{
			if(b<=c){
				if(a<=c){
					System.out.print(b+","+a+","+c);
				}else{
					System.out.print(b+","+c+","+a);
				}
			}else{
				System.out.print(c+","+b+","+a);
			}
		}
	}//Fin Programa		
}	
	