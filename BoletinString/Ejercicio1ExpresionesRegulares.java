/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pedro Martinez Gonzalez
 */
public class Ejercicio1ExpresionesRegulares {
    public static void main(String[] args){
        String str;
        do{
            System.out.print("Inserte una cadena de max 25 caracteres: ");
            str=Leer.dato();
        }while(str.length()>25 || str.isEmpty());
        str=str.trim().replaceAll("  +", " ");
        System.out.println("\n"+str);
    }
}
