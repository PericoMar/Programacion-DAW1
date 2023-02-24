/**
 *
 * @author Pedro Martinez Gonzalez
 */
import java.util.Random;

public class Ej01 {
    public static void main(String[] args){
        //Entorno:
        Random numRandom; 
        int[] v;
        byte i;
        //Algoritmo:
        numRandom=new Random();
        v= new int[20];
        for(i=0;i<v.length;i++){
            v[i]=numRandom.nextInt();
            System.out.println("El "+(i+1)+" numero introducido es: "+v[i]);
        }
    }
}
