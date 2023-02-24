/*Programa:Primeors100Numeros
Autor:Pedro Martinez Gonzalez
Entorno:
	i es numerico entero
	i2 es numerico entero
	opcion es alfanumerico (1)
Algoritmo:
	Para i de 1 100 hacer
		Para i2 de 1 a 20 hacer
			Escribir i2
		Fin Para
		Escribir "Pulse cualquier tecla para continuar"
		Leer opcion
	Fin Para
Fin Programa
*/

public class Ej25{
	public static void main(String[] args){
		//Entorno
			//****declaracion de variables
		byte i;
		char opcion;
		//Algoritmo:
			//****Secuencia de instrucciones
		for(i=1;i<=100;i++){
			System.out.println(i);
			if(i%5==0){
				System.out.print("Pulse cualquier tecla para continuar");
				opcion=Leer.datoChar();

			}//Fin Si
		}//Fin Para
	}//Fin Programa
}
	