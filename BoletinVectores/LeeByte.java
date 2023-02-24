/**
 *
 * @author Pedro Martinez Gonzalez
 */
public class LeeByte {
        public static byte leerByte(){
            //Entorno:
            short num;
            do{
                System.out.print("Inserte un dato");
                num=Leer.datoShort();
            }while(num>Byte.MAX_VALUE || num<Byte.MIN_VALUE);
            return (byte) num;
    }
}
