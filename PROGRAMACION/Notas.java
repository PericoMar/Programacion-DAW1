/*Programa:Notas
Autor: Pedro Martinez Gonzalez
Entorno:
	notaNum es numerico real
	notaLetra es alfanumerico (4)
Algoritmo:
	Repetir
		Escribir "Inserte su nota [0,10]: "
		Leer notaNum
	Hasta notaNum>=0 && notaNum<=10
	Si notaNum < 3 entonces
		notaLetra="MD"
	Sino
		Si notaNum < 5 entonces
			notaLetra="INS"
		Sino
			Si notaNum < 6 entonces
				notaLetra="SNF"
			Sino
				Si < 7 entonces
					notaLetra="BIEN"
				Sino 
					Si < 9 entonces
						notaLetra="NOT"
					Sino
						notaLetra="SOB"
					Fin Si
				Fin Si
			Fin Si
		Fin Si
	Fin Si
	Escribir notaLetra
Fin Programa
*/

public class Notas{
	public static void main(String[] args){
		//Entorno:
			//****declaración de variables
		float notaNum;
		char notaLetra;
		//Algoritmo:
			//****Secuencia de instrucciones
		do{
			System.out.print("Inserte su nota [0,10]: ");
			notaNum=Leer.datoFloat();
		}while(notaNum<0 || notaNum>10);
		if(notaNum<3){
			notaLetra='M';
		}else{
			if(notaNum<5){
				notaLetra='I';
			}else{
				if(notaNum<6){
					notaLetra='F';
				}else{
					if(notaNum<7){
						notaLetra='B';
					}else{
						if(notaNum<9){
							notaLetra='N';
						}else{
							notaLetra='S';
						}
					}
				}
			}
		}
		System.out.print(notaLetra);
	}//Fin Programa
}
			
			
		
			
		