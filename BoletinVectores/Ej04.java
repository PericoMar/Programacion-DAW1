/**
 *
 * @author Pedro Martinez Gonzalez
 */
public class Ej04 {
    public static void main(String[] args){
        //Entorno:
        int[] v;
        byte i, posMin;
        int numMin;
        //Algoritmo:
        v=new int[50];
        System.out.print("Inserte un numero: ");
        v[0]=Leer.datoInt();
        posMin=0;
        numMin=v[0];
        for(i=1;i<v.length;i++){
            System.out.print("Inserte un numero: ");
            v[i]=Leer.datoInt();
            if(v[i]<=numMin){
                numMin=v[i];
                posMin=i;
            }
        }
        System.out.println("El numero maximo esta en la posicion "+(posMin+1)+
                " y es el "+numMin);
    }
}
