/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pedro Martinez Gonzalez
 */
public class Ejercicio3 {
    public static void main(String[] args){
        //Entorno:
        String mensaje, mensajeCodificado;
        byte i, anteriorEspacioBlanco;
        //Algoritmo:
        do{
            System.out.print("Inserte una frase: ");
            mensaje=Leer.dato();
        }while(mensaje.length()>256);
        mensaje=mensaje.trim();
        anteriorEspacioBlanco=0;
        mensajeCodificado="";
        while(mensaje.indexOf(" ",anteriorEspacioBlanco)!=-1){
            for(i=(byte)(mensaje.indexOf(" ",anteriorEspacioBlanco)-1);i>=anteriorEspacioBlanco;i--){
                mensajeCodificado=mensajeCodificado+mensaje.charAt(i);
            }
            mensajeCodificado=mensajeCodificado+" ";
            anteriorEspacioBlanco=(byte)(mensaje.indexOf(" ",anteriorEspacioBlanco)+1);
        }
        for(i=(byte)(mensaje.length()-1);i>=anteriorEspacioBlanco;i--){
            mensajeCodificado=mensajeCodificado+mensaje.charAt(i);
        }
        System.out.println("El mensaje codificado queda: "+mensajeCodificado);
    }
}
