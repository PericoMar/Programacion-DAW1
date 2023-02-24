/*Programa:Ej13
Autor:Pedro Martinez Gonzalez
Entorno:
	radio es numerico real
	opcion es alfanumerico (1)
	longitud es numerico real
	superficie es numerico real
	volumen es numerico real
	area es numerico real
	quiereSalir es booleano
	CONST PI es numerico real <-- 3.1416
Algoritmo:
	quiereSalir<--FALSO
	Repetir
		Repetir
			Escribir "A. Longitud de la circunferencia"
			Escribir "B. Superficie de la circunsferencia"
			Escribir "C. Volumen de la esfera"
			Escribir "D. Area de la esfera"
			Escribir "E. Salir"
			Escribir "Elija opcion:"
			Leer opcion
		Hasta opcion="A" o opcion="a" o opcion="B" o opcion="b" o opcion="C" o opcion="c" o opcion="D" o opcion="d" o opcion="E" o opcion="e"
		Si opcion="E" o opcion="e" entonces
			quiereSalir<--VERDADERO
		Sino
			Repetir
				Escribir "Inserte el radio: "
				Leer radio
			Hasta radio>0
		Fin Si
		Segun Sea opcion hacer
			A o a:
				logintud<--2*PI*radio
				Escribir "La logitud de la esfera de radio ",radio," es: ",logitud
			B o b:
				superficie<--PI*radio**2
				Escribir "La superficie de la esfera con radio ",radio," es ",superficie
			C o c:
				volumen<--(4*PI*radio**3)/3
				Escribir "El volumen de la esfera con radio ",radio," es ",volumen
			D o d:
				area<--4*PI*radio**2
				Escribir "El area de la esfera con radio ",radio," es ",area
		Fin Segun Sea
	Hasta quiereSalir
Fin Programa
*/
public class Ej13{
	public static void main(String[] args){
		//Entorno:
			//****declaracion de variables
		float radio;
		float longitud;
		float superficie;
		float volumen;
		float area;
		boolean quiereSalir;
		final float PI=3.1416F;
		char opcion;
		//Algoritmo:
			//****Secuencia de instrucciones
		quiereSalir=false;
		do{
			do{
				System.out.println("A. Longitud de la circunferencia");
				System.out.println("B. Superficie de la circunsferencia");
				System.out.println("C. Volumen de la esfera");
				System.out.println("D. Area de la esfera");
				System.out.println("E. Salir");
				System.out.println("Elija opcion:");
				opcion=Leer.datoChar();
			}while(opcion!='A' && opcion!='a' && opcion!='B' && opcion!='b' && opcion!='C' && opcion!='c' && opcion!='D' && opcion!='d' && opcion!='E' && opcion!='e');
			if(opcion=='E' || opcion=='e'){
				quiereSalir=true;
			}else{
				do{
					System.out.print("Inserte el radio: ");
					radio=Leer.datoFloat();
				}while(radio<0);
				switch(opcion){
					case 'A': case 'a':
						longitud=2*PI*radio;
						System.out.println("La logitud de la esfera de radio "+radio+" es: "+longitud);
						break;
					case 'B':case 'b':
						superficie=PI*(float)Math.pow(radio,2);
						System.out.println("La superficie de la esfera con radio "+radio+" es "+superficie);
						break;
					case 'C' :case 'c':
						volumen=(4*PI*(float)Math.pow(radio,3))/3;
						System.out.println("El volumen de la esfera con radio "+radio+" es "+volumen);
						break;
					default:
						area=4*PI*(float)Math.pow(radio,2);
						System.out.println("El area de la esfera con radio "+radio+" es "+area);
				}
			}
		}while(!(quiereSalir));
	}//Fin Programa
}