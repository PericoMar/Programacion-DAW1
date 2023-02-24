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
        int aux;
        byte i, i2, i3;
        //Algoritmo:
        i=0;
        v=new int[10];
        do{
            i2=0;
            System.out.print("Inserte otro numero en la tabla: ");
            v[i]=Leer.datoInt();
            while(i2<i){
                if(v[i]<v[i2]){
                    aux=v[i];
                    for(i3=i;i3>i2;i3--){
                        v[i3]=v[i3-1];
                    }
                    v[i2]=aux;
                }
                i2++;
            }
            i++;
        }while(i<v.length && continuar());
        for(i=(byte)(i-1);i>=0;i--){
            System.out.println("En la posicion "+(i+1)+" esta: "+v[i]);
        }
    }
}
