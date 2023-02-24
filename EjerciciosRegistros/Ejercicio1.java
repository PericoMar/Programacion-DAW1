/**
 *
 * @author Pedro Martinez Gonzalez
 */
public class Ejercicio1 {
        public static boolean deseaContinuar(){
        char opcion;
        do{
            System.out.print("Desea continuar? S/N: ");
            opcion=Leer.datoChar();
        }while(opcion!='S' && opcion!='s' && opcion!='N' && opcion!='n');
        return (opcion=='S' || opcion=='s');
        }
        public static void main(String[] args){
        Empleado oEmpleadoMax, oEmpleadoMin, oEmpleado;
        String nombre, apellidos;
        short departamento;
        byte seccion;
        float sueldo;
        byte i;
        System.out.print("Inserte nombre: ");
        nombre=Leer.dato();
        System.out.print("Inserte apellidos: ");
        apellidos=Leer.dato();
        do{
            System.out.print("Inserte departamento: ");
            departamento=Leer.datoShort();
        }while(departamento>9999);
        do{
            System.out.print("Inserte seccion: ");
            seccion=(byte)Leer.datoShort();
        }while(seccion>99);
        do{
            System.out.print("Inserte sueldo: ");
            sueldo=Leer.datoFloat();
        }while(sueldo>9999.99);
        oEmpleado=new Empleado(nombre, apellidos, departamento, seccion, sueldo);
        oEmpleadoMax=new Empleado(nombre, apellidos, departamento, seccion, sueldo);
        oEmpleadoMin=new Empleado(nombre, apellidos, departamento, seccion, sueldo);
        i=1;
        while(deseaContinuar() && i<=100){
            System.out.print("Inserte nombre: ");
            nombre=Leer.dato();
            System.out.print("Inserte apellidos: ");
            apellidos=Leer.dato();
            do{
                System.out.print("Inserte departamento: ");
                departamento=Leer.datoShort();
            }while(departamento>9999);
            do{
                System.out.print("Inserte seccion: ");
                seccion=(byte)Leer.datoShort();
            }while(seccion>99);
            do{
                System.out.print("Inserte sueldo: ");
                sueldo=Leer.datoFloat();
            }while(sueldo>9999.99);
            oEmpleado.setEmpleado(nombre, apellidos, departamento, seccion, sueldo);
            if(sueldo>oEmpleadoMax.getSueldo()){
                oEmpleadoMax.setEmpleado(nombre, apellidos, departamento, seccion, sueldo);
            } else {
                if(sueldo<oEmpleadoMin.getSueldo()){
                    oEmpleadoMin.setEmpleado(nombre, apellidos, departamento, seccion, sueldo);
                }
            }
            i++;
        }
        System.out.println("Sueldo Maximo: "+oEmpleadoMax.getSueldo()+
                "\nNombre: "+oEmpleadoMax.getNombre()+
                "\nApellidos: "+oEmpleadoMax.getApellidos()+
                "\nDepartamento: "+oEmpleadoMax.getDepartamento()+
                "\nSeccion: "+oEmpleadoMax.getSeccion());
        System.out.println("Sueldo Minimo: "+oEmpleadoMin.getSueldo()+
                "\nNombre: "+oEmpleadoMin.getNombre()+
                "\nApellidos: "+oEmpleadoMin.getApellidos()+
                "\nDepartamento: "+oEmpleadoMin.getDepartamento()+
                "\nSeccion: "+oEmpleadoMin.getSeccion());
    }
}
