/*Programa:PosicionNumero
Autor:Pedro Martinez Gonzalez
Entorno:
	numIntroducido es numerico entero
	num es numerico entero
	posicion es numerico entero
	digitos es numerico entero
	valor es numerico entero
Algoritmo:
	digitos<--0
	Escribir "Inserte un numero: "
	Leer numIntroducido
	num<--numIntroducido
	Repetir
		Escribir "Inserte la posición de la cual quiere saber el valor: "
		Leer posicion
	Hasta posicion>0
	
	Si num<0  entonces
		num<-- -num
	Fin Si
	Mientras num>=1 hacer
		num<--num/10
		digitos<--digitos+1
	Fin Mientras
	valor<-- numIntroducido/10**(digitos-posicion) - (numIntroducido\10**(digitos-posicion))/10*10
	Escribir "El numero en la posicion ",posicion," es ",valor
Fin Programa
*/

public class PosicionNumero{
	public static void main(String[] args){
		//Entorno:
			//****declaracion de variables
		int numIntroducido;
		int num;
		short posicion;
		short digitos;
		short valor;
		//Algoritmo:
			//****Secuencia de instrucciones
		digitos=0;
		System.out.print("Inserte un numero: ");
		numIntroducido=Leer.datoInt();
		num=numIntroducido;
		if(num<0){
			num=-num;
			numIntroducido=-numIntroducido;
		}//Fin Si
		while(num>=1){
			num=num/10;
			digitos++;
		}//Fin Mientras
		do{
			System.out.print("Inserte la posición de la cual quiere saber el valor: ");
			posicion=Leer.datoShort();
		}while(posicion<0 || posicion>digitos);
		valor=(short)(numIntroducido/(int)Math.pow(10, digitos-posicion)-(numIntroducido/(int)Math.pow(10, digitos-posicion))/10*10);
		System.out.print("El numero en la posicion "+posicion+" es "+valor);
	}//Fin Programa
}
		
		
		