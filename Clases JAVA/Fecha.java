
import java.util.GregorianCalendar;

/**
 *
 * @author Pedro Martinez Gonzalez
 */
public class Fecha {
        //Atributos:
    private int dia=1;
    private int mes=1;
    private int anio=2023;
    //Constructor:
    public Fecha(){
        this.asignarFecha();
    }
    public Fecha(int dia){
        GregorianCalendar calendar;
        calendar = new GregorianCalendar();
        if(Fecha.esFechaCorrecta(dia, calendar.get(GregorianCalendar.MONTH), calendar.get(GregorianCalendar.YEAR))){
            this.dia=dia;
            this.mes=calendar.get(GregorianCalendar.MONTH);
            this.anio=calendar.get(GregorianCalendar.YEAR);
        } else {
            System.out.println("La fecha no es valida se asignará la fecha actual");
            this.asignarFecha();
        }
    }
    public Fecha(int dia, int mes){
        GregorianCalendar calendar;
        calendar= new GregorianCalendar();
            if(Fecha.esFechaCorrecta(dia, mes, calendar.get(GregorianCalendar.YEAR))){
            this.dia=dia;
            this.mes=mes;
            this.anio=calendar.get(GregorianCalendar.YEAR);
        } else {
            System.out.println("La fecha no es valida se asignará la fecha actual");
            this.asignarFecha();
        }
    }
    public Fecha(int dia, int mes, int anio){
        if(Fecha2.esFechaCorrecta(dia,mes,anio)){
            this.dia=dia;
            this.mes=mes;
            this.anio=anio;
        } else {
            System.out.println("La fecha no es valida se asignará la fecha actual");
            this.asignarFecha();
        }
    }
    public void setFecha(int dia, int mes, int anio){
        if(Fecha2.esFechaCorrecta(dia,mes,anio)){
            this.dia=dia;
            this.mes=mes;
            this.anio=anio;
        } else {
            this.asignarFecha();
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
    public void asignarFecha(){
        GregorianCalendar calendar;
        calendar = new GregorianCalendar();
        this.dia=calendar.get(GregorianCalendar.DAY_OF_MONTH);
        this.mes=calendar.get(GregorianCalendar.MONTH);
        this.anio=calendar.get(GregorianCalendar.YEAR);
    }
    public void asignarFecha(int dia){
        this.dia=dia;
    }
    public void asignarFecha(int dia, int mes){
        this.dia=dia;
        this.mes=mes;
    }
    public void asignarFecha(int dia, int mes, int anio){
        this.dia=dia;
        this.mes=mes;
        this.anio=anio;
    }
}
