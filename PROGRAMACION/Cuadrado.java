/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrador
 */
public class Cuadrado {
    public static int elementoCuadrado(int fila, int columna){
        int elemento;
        if(fila==1 || columna==1){
            elemento=1;
        } else {
            elemento=elementoCuadrado(fila-1,columna)+elementoCuadrado(fila,columna-1);
        }
        return elemento;
    }
    public static void main(String[] args){
        //Entorno:
        int n;
        int fila;
        int columna;
        //Algoritmo:
        do{
            System.out.print("Inserte el numero de digitos: ");
            n=Leer.datoInt();
        }while(n<=0);
        for(fila=1;fila<=n;fila++){
            for(columna=1;columna<=n;columna++){
                System.out.print(elementoCuadrado(fila,columna)+"\t");
            }
            System.out.println();
        }
    }
}
