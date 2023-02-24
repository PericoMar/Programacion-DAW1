/**
 *
 * @author Pedro Martinez Gonzalez
 */
public class Ej11 {
    public static boolean continuar(){
        char opcion;
        do{
            System.out.print("Desea continuar? S/N: ");
            opcion=Leer.datoChar();
        }while(opcion!='S' && opcion!='s' && opcion!='N' && opcion!='n');
        return (opcion=='S' || opcion=='s');
    }
    public static void main(String[] args){
        //Entorno:
        int[] v;
        byte i, i2;
        //Algoritmo:
        i=0;
        v=new int[50];
        System.out.print("Inserte un numero en la tabla: ");
        v[i]=Leer.datoInt();
        while(i<50 && continuar()){
            i++;
            i2=0;
            System.out.print("Inserte otro numero en la tabla: ");
            v[i]=Leer.datoInt();
            while(i2<i && v[i2]!=v[i]){
                if(v[i]<v[i2]){
                    v[i+1]=v[i2];
                    v[i2]=v[i];
                } else {
                    i2++;
                }
            }
        }
        while(i>=0){
            System.out.println("En la posicion "+(i+1)+" esta: "+v[i]);
            i--;
        }
    }
}
