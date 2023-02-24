/*Programa: Binario
Autor:Pedro Martinez Gonzalez
Entorno:
	num es numerico entero
	binario es alfanumerico (max)
	i es numerico entero
Algoritmo:
	Escribir "Inserte un numero: "
	Leer num
	Para i de num a 2 con incremento -i\2
		Si i%2=0 entonces
			binario="0"+binario
		Sino
			binario="1"+binario
		Fin Si
	Fin Para
Fin Programa
*/

public class Binario {
	public static void main (String[] args){
		//Entorno:
			//****declaracion de variables
		int num;
		int i;
		long binario;
		boolean binarioNegativo;
		//Algoritmo:
			//****Secuencia de instrucciones
		binarioNegativo=false;
		System.out.print("Inserte un numero: ");
		num=Leer.datoInt();
		binario=0;
		if(num<0){
			binarioNegativo=true;
			num=-num;
		}
		for(i=0;num>=1;i++){
			if(num%2==1){
				binario=binario+(long)Math.pow(10,i);
			}
			num=(int)(num/2);
		}
		if (binarioNegativo){
			System.out.println("1"+binario);
		}else{
			System.out.println("0"+binario);
		}
	}//Fin Programa
}