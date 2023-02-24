
import java.util.Random;

/**
 *
 * @author Pedro Martinez Gonzalez;
 */
public class Ej02 {
    public static void main(String[] args){
        //Entorno:
        Random numRandom;
        int[] v;
        byte i;
        //Algoritmo:
        v=new int[15];
        numRandom=new Random();
        for(i=0;i<v.length;i++){
            v[i]=numRandom.nextInt();
        }
        for(i=(byte)(v.length-1);i>=0;i--){
            System.out.println("El numero introducido en la posicion "+(i+1)+" es: "+v[i]);
        }
    }
}
