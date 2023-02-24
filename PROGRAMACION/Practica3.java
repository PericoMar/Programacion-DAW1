/**
 *
 * @author Pedro Martinez Gonzalez
 */
public class Practica3 {
    public static void main(String[] args){
        //Entorno:
        int numSecreto;
        int n;
        byte i;
        byte cifras;
        byte intentos;
        //Algoritmo:
        intentos=0;
        do{
            numSecreto=(int)(Math.random()*1000000);
        }while(numSecreto<=0);
        cifras=Utilidades.cifras(numSecreto);
        System.out.print("Le toca adivinar el numero: ");
        for(i=0;i<cifras;i++){
            System.out.print("*");
        }
        System.out.print("\nAdivine el numero: ");
        n=Leer.datoInt();
        while(numSecreto!=n && intentos<=3){
            System.out.print("\nEstos digitos son correctos: ");
            for(i=1;i<=cifras;i++){
                if(Utilidades.sacaDigito(numSecreto,i)==Utilidades.sacaDigito(n, i)){
                    if
                    System.out.print(Utilidades.sacaDigito(n, i));
                } else {
                    System.out.print("*");
                }
            }
            intentos++;
            System.out.print("\nAdivine el numero: ");
            n=Leer.datoInt();
        }
        if(numSecreto==n){
            System.out.println("\nCorrecto! El numero era: "+numSecreto);
        } else {
            System.out.println("\nLo siento, has perdido, el numero era: "+numSecreto);
        }
    }
}
