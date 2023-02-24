/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pedro Martinez Gonzalez
 */
public class Ejercicio2 {
    public static void main(String[] args){
        String frase, auxFrase;
        byte i, longitud;
        boolean palindromo;
        palindromo=true;
        System.out.print("Inserte una frase: ");
        frase=Leer.dato();
        auxFrase=frase.trim().replaceAll(" ", "");
        longitud=(byte)auxFrase.length();
        i=0;
        while(palindromo && i<=longitud/2){
            if(auxFrase.charAt(i)!=auxFrase.charAt(longitud-1-i)){
                palindromo=false;
            }
            i++;
        }
        if(palindromo){
            System.out.println("La frase "+frase+". Es un palindromo.");
        } else {
            System.out.println("La frase "+frase+". No es un palindromo.");
        }
    }
}
