/*Programa:NumerosPrimos
Autor: Pedro Martinez Gonzalez
Entorno:
	introducido es numerico entero
	num es numerico entero
	divisor es numerico entero
	cociente es numerico entero
	esPar es booleano
	tieneDivisores es booleano
Algoritmo:
	Repetir
		Escribir "Inserte un numero mayor que 0: "
		Leer introducido
	Hasta introducido>0
	Si introducido%2=2 entonces
		esPar<--VERDADERO
	Sino
		esPar<--FALSO	
	Fin Si
	cociente<--introducido
	tieneDivisores<--FALSO
	Para num de 2 a introducido hacer
		Si no esPar entonces
			Para divisor de 2 a cociente hacer
				Si no tieneDivisores entonces
					cociente<--introducido/divisor
					Si num%divisor=0 entonces
						tieneDivisores<--VERDADERO
					Fin Si
				Fin Si
			Fin Para
			tieneDivisores<--FALSO
		Fin Si
		esPar<--!esPar
	Fin Para
Fin Programa
*/

public class NumerosPrimos{
	public static void main(String[] args){
		//Entorno:
			//****declaracion de variables
		int introducido;
		int num;
		int divisor;
		int cociente;
		boolean esPar;
		boolean tieneDivisores;
		//ALgoritmo:
			//****Secuencia de instrucciones
		tieneDivisores=false;
		esPar=false;
		do{
			System.out.print("Inserte un numero mayor que 0: ");
			introducido=Leer.datoInt();
		}while(introducido<=0);
		System.out.print("Los números primos que hay hasta el "+introducido+" son:");
		if(introducido%2==0){
			esPar=true;
		}
		cociente=introducido;
		for(num=introducido;num<=introducido && num>1;num--){
			if(!esPar){
				for(divisor=3;divisor<=cociente && !tieneDivisores;divisor=divisor+2){
					cociente=num/divisor;
					if(num%divisor==0){
						tieneDivisores=true;
					}
				}
				if(!tieneDivisores){
					System.out.print(num+",");
				}
				tieneDivisores=false;
			}
			esPar=!esPar;
		}
		if(introducido==1){
			System.out.print("1.");
		}else{
			System.out.print("2,1.");
		}
	}//Fin Programa
}

			