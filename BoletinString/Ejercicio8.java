/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pedro Martinez Gonzalez
 */
public class Ejercicio8 {
    public static void main(String[] args){
        String str;
        byte i,longitud;
        do{
            System.out.print("Inserte una palabra: ");
            str=Leer.dato();
        }while(str.length()>10 || str.indexOf(" ")>0);
        longitud=(byte)str.length();
        for(i=0;i<=longitud;i++){
            System.out.println(str);
            str=str.substring(longitud-1)+str.substring(0,longitud-1);
        }
    }
}
