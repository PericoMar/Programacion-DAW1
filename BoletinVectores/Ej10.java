/**
 *
 * @author Pedro Martinez Gonzalez
 */
public class Ej10 {
    public static void main(String[] args){
        //Entorno:
        byte[] v={7,8,3,0,33};
        byte i;
        byte numSig;
        //Algoritmo:
        System.out.println("La tabla queda: ");
        for(i=0;i<v.length-1;i++){
            numSig=v[(i+1)%5];
            v[(i+1)%5]=v[i];
            v[i]=numSig;
            System.out.println("En la posicion "+(i+1)+" esta "+v[i]);
        }
        System.out.println("En la posicion "+(i+1)+" esta "+v[i]);
    }
}
