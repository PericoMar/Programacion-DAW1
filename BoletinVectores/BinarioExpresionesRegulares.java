/**
 *
 * @author Pedro Martinez Gonzalez
 */
public class BinarioExpresionesRegulares {
    public static void main(String[] args){
        //Entorno:
        String binario;
        int bi;
        //Algoritmo:
        do{
            System.out.print("Inserte un binario: ");
            binario=Leer.dato();
        }while(binario.isEmpty() || !binario.matches("[01]*"));
        bi=Integer.valueOf(binario).intValue();
        
    }
}
