public class Ajedrez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        short filaInicial;//filaInicial es numerico entero
        short columnaInicial;//columnaInicial es numerico entero
        byte fila;//fila es numerico entero
        byte columna;//columna es numerico entero
        //Algoritmo:
        do{//Repetir
            System.out.print("Inserte una fila: ");//Escribir "Inserte una fila: "
            filaInicial=Leer.datoShort();//Leer fila
        }while(filaInicial<1 || filaInicial>8);//Hasta fila>=1 y fila<=8
        do{//Repetir
            System.out.print("Inserte una columna: ");//Escribir "Inserte una columna: "
            columnaInicial=Leer.datoShort();//Leer columna
        }while(columnaInicial<1 || columnaInicial>8);//Hasta columna>=1 y columna<=8
        System.out.print("|");
        for(fila=1;fila<=8;fila++){//Para fila de 1 a 8 hacer
            for(columna=1;columna<=8;columna++){//Para columna de 1 a 8 hacer
				if(filaInicial==fila && columnaInicial==columna){
					System.out.print(" A |");
				}else{
					if(filaInicial+columnaInicial==fila+columna || filaInicial-columnaInicial==fila-columna){
						System.out.print(" * |");
					}else{
						if((fila+columna)%2==0){
							System.out.print(" B |");
						}else{
							System.out.print(" N |");
						}
					}
				}
			}	
            System.out.print("\n|");
        }
    }
}