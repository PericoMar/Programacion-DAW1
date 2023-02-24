/**
 *
 * @author Pedro Martinez Gonzalez
 */
public class Ejercicio5 {
    public static void main(String[] args){
        //Entorno:
        String mensaje, mensajeCodificado;
        final String ABECEDARIO="abcdefghijklmnopqrstuvwxyz";
        short longitud,i, clave;
        //Algoritmo:
        mensajeCodificado="";
        System.out.print("Inserte un mensaje: ");
        mensaje=Leer.dato();
        do{
        System.out.print("Inserte la clave: ");
        clave=Leer.datoShort();
        }while(clave<0 || clave>26);
        longitud=(short)mensaje.length();
        for(i=0;i<longitud;i++){
            if(mensaje.charAt(i)==' '){
                mensajeCodificado=mensajeCodificado+" ";
            } else {
                mensajeCodificado=mensajeCodificado+
                        ABECEDARIO.charAt((mensaje.codePointAt(i)-97+clave)%26);
            }
        }
        System.out.println("El mensaje codificado queda: "+mensajeCodificado);
    }
}
