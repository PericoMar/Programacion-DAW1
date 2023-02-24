/*Programa:Practica2
Autor:Pedro Martinez Gonzalez
Entorno:
	n es numerico entero
	adiv es numerico entero
	intentos es numerico entero
	i es numerico entero
Algoritmo:
	intentos<--0
	Repetir
		Escribir "Inserte un numero a adivinar"
		Leer n
	Hasta n>0 y n<10000
	Repetir
		Repetir
			Escribir "Intente adivinar el numero:"
			Leer adiv
		Hasta adiv>0 y adiv<10000
		i<--0
		Repetir
			Si n%10=adiv%10 entonces
				i<--i+1
			Fin Si
			n<--n\10
			adiv<--adiv\10
		Hasta adiv<1 o n<1
		Escribir "Hay ",i," parametros iguales"
		intentos<--intentos+1
	Hasta adiv=n o intentos=10
	Si adiv=n entonces
		Escribir "Has acertado el numero"
	Sino
		Escribir "Has perdido"
	Fin Si
Fin Programa
*/

public class Practica2{
	public static void main(String[] args){
		//Entorno
			//****declaracion de instrucciones
		short n;
		short adiv;
		byte intentos;
		byte i;
		short nAux;
		short adivAux;
		//Algoritmo
			//****Secuencia de instrucciones
		intentos=0;
		do{
			System.out.print("Inserte un numero a adivinar: ");
			n=Leer.datoShort();
		}while(n<1 || n>=10000);
		do{
			do{
				System.out.print("Intente adivinar el numero: ");
				adiv=Leer.datoShort();
			}while(adiv<1 || adiv>=10000);
			i=0;
			nAux=n;
			adivAux=adiv;
			if(adiv!=n){
				do{
					if(nAux%10==adivAux%10){
						i++;
					}
					nAux=(short)(nAux/10);
					adivAux=(short)(adivAux/10);
				}while(adivAux>0 && nAux>0);
				System.out.println("Hay "+i+" parametros iguales");
				intentos++;
			}
		}while(adiv!=n && intentos<10);
		if(adiv==n){
			System.out.print("Has acertado el numero");
		}else{
			System.out.print("Has perdido");
		}//Fin Si
	}//Fin Programa
}