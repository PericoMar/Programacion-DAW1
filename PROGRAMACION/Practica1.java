/*Programa:Practica1
Autor:Pedro Martinez Gonzalez
Entorno:
	n es numerico entero
	adiv es numerico entero
	i es numerico entero
Algoritmo:
	i<--0
	Repetir
		Escribir "Inserte un numero a adivinar:"
		Leer n
	Hasta n>0 y n<100
	Repetir
		Repetir
			Escribir "Intente adivinar el numero: "
			Leer adiv
		Hasta adiv>=0 y adiv=<100
		Si n<adiv entonces
			Escribir "El numero es menor"
		Sino
			Escribir "El numero es mayor"
		Fin Si
		i<--i+1
	Hasta i=5 o adiv=n
	Si adiv=n entonces
		Escribir "Has acertado el numero"
	Sino
		Escribir "Has perdido"
	Fin Si
Fin Programa
*/
public class Practica1{
	public static void main(String[] args){
		//Entorno:
			//****declaracion de variables
		short n;
		short adiv;
		byte i;
		//Algoritmo:
			//****Secuencia de instrucciones
		i=0;
		do{
			System.out.print("Inserte un numero a adivinar:");
			n=Leer.datoShort();
		}while(n<0 || n>100);
		do{
			do{
				System.out.print("Intente adivinar el numero: ");
				adiv=Leer.datoShort();
			}while(adiv<0 || adiv>100);
			if(n<adiv){
				System.out.println("El numero es menor");
			}else{
				if(n>adiv){
					System.out.println("El numero es mayor");
				}
			}//Fin Si
			i++;
		}while(i<5 && adiv!=n);
		if(adiv==n){
			System.out.print("Has acertado el numero");
		}else{
			System.out.print("Has perdido");
		}//Fin Si
	}//Fin Programa
}