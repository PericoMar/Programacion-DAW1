/**
 *
 * @author Pedro Martinez Gonzalez
 */
public class Ej03 {
    public static void main(String[] args){
        //Entorno:
        int[] v;
        byte i, posMax;
        int numMax;
        //Algoritmo:
        v=new int[50];
        System.out.print("Inserte un numero: ");
        v[0]=Leer.datoInt();
        posMax=0;
        numMax=v[0];
        for(i=1;i<v.length;i++){
            System.out.print("Inserte un numero: ");
            v[i]=Leer.datoInt();
            if(v[i]>numMax){
                numMax=v[i];
                posMax=i;
            }
        }
        System.out.println("El numero maximo esta en la posicion "+(posMax+1)+
                " y es el "+numMax);
    }
}
