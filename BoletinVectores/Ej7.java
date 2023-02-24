/**
 *
 * @author Pedro Martinez Gonzalez
 */
public class Ej7 {
    public static void main(String[] args){
        //Entorno:
        float[] v;
        byte i;
        //Algoritmo:
        v=new float[50];
        for(i=0;i<v.length;i++){
            System.out.print("Inserte un numero: ");
            v[i]=Leer.datoFloat();
        }
        for(i=(byte)(v.length-1);i>=0;i--){
            System.out.println("En la posicion "+(i+1)+" esta el: "+v[i]);
        }
    }
}
