/**
 *
 * @author Pedro Martinez Gonzalez
 */
public class Ejercicio2 {
    public static boolean continuar(){
        char opcion;
        do{
            System.out.print("Desea continuar? S/N: ");
            opcion=Leer.datoChar();
        }while(opcion!='S' && opcion!='s' && opcion!='N' && opcion!='n');
        return (opcion=='S' || opcion=='s');
    }
    public static void main(String[] args){
        //Entorno:
        Alumno oAlumno, oAlumnoMax;
        String nombre, apellidos;
        float notaTeorica,notaPractica, notaMedia; 
        short aula;
        byte i;
        //Algoritmo:
        System.out.print("Inserte nombre: ");
        nombre=Leer.dato();
        System.out.print("Inserte apellidos: ");
        apellidos=Leer.dato();
        do{
            System.out.print("Inserte nota teorica: ");
            notaTeorica=Leer.datoFloat();
        }while(notaTeorica>10 || notaTeorica<0);
        do{
            System.out.print("Inserte nota practica: ");
            notaPractica=Leer.datoFloat();
        }while(notaPractica>10 || notaPractica<0);
        System.out.print("Inserte aula: ");
        aula=Leer.datoShort();
        oAlumno=new Alumno(nombre, apellidos, notaTeorica, notaPractica, aula);
        oAlumnoMax=new Alumno(nombre, apellidos, notaTeorica, notaPractica, aula);
        i=1;
        notaMedia=(notaTeorica+notaPractica)/2;
        while(continuar()){
            System.out.print("Inserte nombre: ");
            nombre=Leer.dato();
            System.out.print("Inserte apellidos: ");
            apellidos=Leer.dato();
            do{
                System.out.print("Inserte nota teorica: ");
                notaTeorica=Leer.datoFloat();
            }while(notaTeorica>10 || notaTeorica<0);
            do{
                System.out.print("Inserte nota practica: ");
                notaPractica=Leer.datoFloat();
            }while(notaPractica>10 || notaPractica<0);
            System.out.print("Inserte aula: ");
            aula=Leer.datoShort();
            i++;
            oAlumno.setAtributos(nombre, apellidos, notaTeorica, notaPractica, aula);
            notaMedia=notaMedia+(notaTeorica+notaPractica)/2;
            if((notaPractica+notaTeorica)/2
                    >(oAlumnoMax.getNotaPractica()+oAlumnoMax.getNotaTeorica())/2){
                oAlumnoMax.setAtributos(nombre, apellidos, notaTeorica, notaPractica, aula);
            }
        }
        System.out.println("Nota media maxima: "+(oAlumnoMax.getNotaPractica()+oAlumnoMax.getNotaTeorica())/2+
            "\nNombre: "+oAlumnoMax.getNombre()+
            "\nApellidos: "+oAlumnoMax.getApellidos()+
            "\nNota Teorica: "+oAlumnoMax.getNotaTeorica()+
            "\nNota Practica: "+oAlumnoMax.getNotaPractica()+
            "\nAula: "+oAlumno.getAula()+
            "\nNota media: "+notaMedia/i);
    }
}
