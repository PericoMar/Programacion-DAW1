/**
 *
 * @author Pedro Martinez Gonzalez
 */
public class Ej8 {
    public static void main(String[] args){
        //Entorno:
        byte cuentaNotas[];
        byte i;
        byte nota;
        //Algoritmo:
        cuentaNotas= new byte[11];
        do{
            System.out.print("Inserte una nota: ");
            nota=(byte)Leer.datoShort();
            for(i=0;i<=10;i++){
                if(i==nota){
                    cuentaNotas[i]++;
                }
            }
        }while(nota>=0 && nota<=10);
        for(i=0;i<11;i++){
            if(cuentaNotas[i]>1){
                System.out.println("La nota "+i+" aparece "+cuentaNotas[i]+" veces");
            } else {
                if(cuentaNotas[i]==0){
                    System.out.println("No hay ningun "+i);
                } else {
                    System.out.println("La nota "+i+" aparece "+cuentaNotas[i]+" vez");
                }
            }
        }
    }
}
