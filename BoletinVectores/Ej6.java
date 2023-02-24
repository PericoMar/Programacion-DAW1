/**
 *
 * @author Pedro Martinez Gonzalez
 */
public class Ej6 {
    public static boolean continuar(){
        //Entorno:
            char opcion;
        //Algoritmo:
            do{
                System.out.print("¿Continuar? s/n: ");
                opcion=Leer.datoChar();
            }while(opcion!='s' && opcion!='S' && opcion!='n' && opcion!='N');
            return (opcion=='s' || opcion=='S');
    }//Fin Funcion
    public static void main(String[] args){
        //Entorno:
        byte[] v={7,8,3,0,33};
        byte i;
        int num;
        //Algoritmo:
        System.out.print("Inserte el numero que quiera buscar: ");
        num=Leer.datoInt();
        i=0;
        while(i<v.length-1 && v[i]!=num){
            i++;
        }
        if(v[i]==num){
            System.out.println(num+" se encuentra en la posicion "+(i+1));
        } else {
            System.out.println(num+" no esta");
        }
        while(continuar()){
            System.out.print("Inserte el numero que quiera buscar: ");
            num=Leer.datoInt();
            i=0;
            while(i<v.length-1 && v[i]!=num){
                i++;
            }
            if(v[i]==num){
                System.out.println(num+" se encuentra en la posicion "+(i+1));
            } else {
                System.out.println(num+" no esta");
            }
        }
    }
}
