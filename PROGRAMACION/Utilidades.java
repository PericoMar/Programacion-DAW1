/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrador
 */
public class Utilidades {
    public static byte cifras(int n){
        byte cifras;
        cifras=0;
        while(n>0){
            n=n/10;
            cifras++;
        }
        return cifras;
    }
    public static boolean esBisiesto(short anio){
        boolean esBisiesto;
        esBisiesto=false;
        if(anio%4==0 && (anio%100!=0 || anio%400==0l) && anio>=1582){
            esBisiesto=true;
        }
        return esBisiesto;
    }
    public static boolean deseaContinuar(){
        char opcion;
        boolean deseaContinuar;
        do{
            System.out.print("Desea continuar? S/N: ");
            opcion=Leer.datoChar();
        }while(opcion!='S' && opcion!='s' && opcion!='N' && opcion!='n');
        if(opcion=='S' || opcion=='s'){
            deseaContinuar=true;
        } else {
            deseaContinuar=false;
        }
        return deseaContinuar;
    }
    public static boolean esFechaValida(byte dia, byte mes, short anio){
        boolean esFechaValida;
        esFechaValida=true;
        if(anio<0){
            esFechaValida=false;
        } else {
           if(mes<1 || mes>12){
              esFechaValida=false;
           } else {
               if(dia<1){
                   esFechaValida=false;
               } else {
                switch(mes){
                case 4: case 6: case 9: case 11:
                    if(dia>30){
                       esFechaValida=false;
                    }
                break;
                case 2:
                    if(esBisiesto(anio)){
                        if(dia>29){
                            esFechaValida=false;
                        }
                    } else {
                        if(dia>28){
                            esFechaValida=false;
                        }
                    }
                    break;
                default:
                    if(dia>31){
                        esFechaValida=false;
                    }
                }
               }
            }
        }
        return esFechaValida;
    }
    public static boolean esCapicua(int num){
        boolean esCapicua;
        byte cifras;
        byte i;
        esCapicua=true;
        cifras=cifras(num);
        i=1;
        while(i<=cifras/2 && esCapicua){
            if((byte)(num/Math.pow(10,cifras-i)%10)!=(byte)(num%Math.pow(10,i)/Math.pow(10,i-1))){
                esCapicua=false;
            }
            i++;
        }
        return esCapicua;
    }
    public static byte sacaDigito(int n, byte pos){
        byte digito;
        digito=0;
        digito=(byte)(n/Math.pow(10,cifras(n)-pos)%10);
        return digito;
    }
    public static int invierte(int n){
        int reves;
        byte i;
        byte cifras;
        cifras=cifras(n);
        i=1;
        reves=0;
        while(n>0){
            reves=reves+(int)(n%10*Math.pow(10,cifras-i));
            n=n/10;
            i++;
        }
        return reves;
    }
}
