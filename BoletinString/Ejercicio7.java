/**
 *
 * @author Pedro Martinez Gonzalez
 */
public class Ejercicio7 {
    public static void main(String[] args){
        //Entorno:
        String str, mensajeSalida, mensaje;
        byte indice,indice2, i;
        //Algoritmo:
        mensaje="";
        mensajeSalida="";
        do{
            System.out.print("Inserte un mensaje: ");
            str=Leer.dato().toLowerCase();
        }while(str.length()>50);
        for(indice=0;indice<str.length()-1;indice++){
            i=0;
            if(str.substring(indice,indice+2).indexOf(" ")<0){
                for(indice2=0;indice2<str.length()-1;indice2++){
                    if(str.substring(indice,indice+2).compareTo(str.substring(indice2,indice2+2))==0 
                            && str.substring(indice2,indice2+2).indexOf(" ")<0){
                        i++;
                    }
                }
            }
            if(i!=1){
                mensajeSalida=str.substring(indice,indice+2)+" aparece "+i+" veces";
            } else {
                mensajeSalida=str.substring(indice,indice+2)+" aparece 1 vez";
            }
            if(mensaje.indexOf(mensajeSalida)<0 && str.substring(indice,indice+2).indexOf(" ")<0){
                System.out.println(mensajeSalida);
            }
            mensaje=mensaje+mensajeSalida;
        }
    }
}
