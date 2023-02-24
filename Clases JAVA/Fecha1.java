/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pedro Martínez González
 */
public class Fecha1 {
    //Atributos:
    private int dia=1;
    private int mes=1;
    private int anio=2023;
    //Constructor:
    public Fecha1(){
    }
    public void setFecha(int dia, int mes, int anio){
        if(Fecha1.esFechaCorrecta(dia,mes,anio)){
            this.dia=dia;
            this.mes=mes;
            this.anio=anio;
        }
    }
    public void mostrarFecha(){
        System.out.println("La fecha es "+this.dia+"//"+this.mes+"//"+this.anio);
    }
    public static boolean esFechaCorrecta(int dia,int mes, int anio){
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
    public int getDia(){
        return this.dia;
    }
    public int getMes(){
        return this.mes;
    }
    public int getAnio(){
        return this.anio;
    }
    private static boolean esBisiesto(int anio){
        return anio%4==0 && (anio%100!=0 || anio%400==0) && anio>=1582;
    }
}
