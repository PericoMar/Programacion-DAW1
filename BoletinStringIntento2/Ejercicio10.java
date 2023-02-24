/**
 *
 * @author Pedro Martinez Gonzalez
 */
public class Ejercicio10 {
    public static void main(String[] args){
        //Entorno:
        String texto;
        short indice;
        byte i;
        //Algoritmo:
        System.out.print("Inserte un texto: ");
        texto=Leer.dato();
        texto=texto.trim().replaceAll(" ", "").toLowerCase();
        while(texto.compareTo("")!=0){
            i=0;
            for(indice=0;
                    indice<=texto.lastIndexOf(texto.charAt(0));indice++){
                if(texto.charAt(0)==texto.charAt(indice)){
                    i++;
                }
            }
            if(i==1){
                System.out.println("La letra "+texto.charAt(0)+" aparece 1 vez");
            } else {
                System.out.println("La letra "+texto.charAt(0)+" aparece "+i+" veces");
            }
            texto=texto.replaceAll(String.valueOf(texto.charAt(0)),"");
        }
    }
}
