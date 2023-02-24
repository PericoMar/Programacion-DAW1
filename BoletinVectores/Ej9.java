/**
 *
 * @author Pedro Martinez Gonzalez
 */
public class Ej9 {
    public static void main(String[] args){
        //Entorno:
        byte[] v={7,8,3,0,33};
        byte i;
        byte numSig;
        //Algoritmo:
        System.out.println("La tabla queda: ");
        for(i=(byte)(v.length-1);i>0;i--){
            numSig=v[(i-1)%5];
            v[(i+1)%5]=v[i];
            v[i]=v[(i-1)%5];
            System.out.println("En la posicion "+(i+1)+" esta "+v[i]);
        }
        System.out.println("En la posicion "+(i+1)+" esta "+v[i]);
    }
}