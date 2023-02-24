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
		Sino
			Si a<=c
				guadaResultado=c
				c=b
				b=guardaResultado
			Sino 
				guardaResultado=a
				a=c
				c=b
				b=guardaResultado
			Fin Si
		Fin Si
	Sino
		Si b<=c
			Si a<=c
				guardaResultado=b
				b=a
				a=guardaResultado
			Sino
				guardaResultado=a
				a=b
				b=c
				c=guardaResultado
			Fin Si
		Sino
			guardaResultado=a
			a=c
			c=guardaResultado
		Fin Si
	Fin Si
	Escribir a,",",b,",",c
*/

public class MenoraMayorABC{
	public static void main (String[] args){
		//Entorno:
			//****declaración de variables
		float a;
		float b;
		float c;
		float guardaResultado;
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
			}else{
				if(a<=c){
					guardaResultado=c;
					c=b;
					b=guardaResultado;
				}else{
					guardaResultado=a;
					a=c;
					c=b;
					b=guardaResultado;
				}
			}
		}else{
			if(b<=c){
				if(a<=c){
					guardaResultado=b;
					b=a;
					a=guardaResultado;
				}else{
					guardaResultado=a;
					a=b;
					b=c;
					c=guardaResultado;
				}
			}else{
				guardaResultado=a;
				a=c;
				c=guardaResultado;
			}
		}
		System.out.print(a+","+b+","+c);
	}//Fin Programa		
}	