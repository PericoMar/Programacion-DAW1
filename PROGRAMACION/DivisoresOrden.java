/*Programa:DivisoresOrden
Autor:Pedro Martinez Gonzalez
Entorno:
	num es numerico entero
	i es numerico entero
Algoritmo:
	Repetir
		Escribir "Inserte un numero distinto de 0: "
		Leer num
	Hasta num!=0
	Escribir "Los divisores de ",num,"son: "
	Escribir num, " , -",num
	Si num < 0 entonces
		num=-num
	Fin Si
	Para i de num\2 a 2 con incremento -1 hacer
		Si (num%i = 0) entonces
			Escribir i," , -",i
		Fin Si
	Fin Para
	Escribir "1 , -1"
Fin Programa
*/

public class DivisoresOrden {
	public static void main (String[] args){
		//Entorno:
			//****declaración de variables
		int num;
		int i;
		//ALgoritmo:
			//****Secuencia de instrucciones
		do{
			System.out.print("Inserte un numero distinto de 0: ");
			num=Leer.datoInt();
		}while(num==0);
		System.out.println("Los divisores de "+num+" son: ");
		if(num>0){
		System.out.println(num+" , "+-num);
		}else{
			System.out.println(-num+" , "+num);
			num=-num;
		}
		for(i=(int)(num/2);i>2;i--){
			if (num%i ==0){
				System.out.println(i+" , -"+i);
			}
		}
		System.out.println("1 , -1");
	}//Fin Programa
}
