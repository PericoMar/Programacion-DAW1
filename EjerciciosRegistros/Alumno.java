/**
 *
 * @author Pedro Martinez Gonzalez
 */
public class Alumno {
    //Atributos:
    private String nombre;
    private String apellidos;
    private float notaTeorica;
    private float notaPractica;
    private short aula;
    //Constructor:
    public Alumno(String nombre, String apellidos, float notaTeorica, float notaPractica, short aula){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.notaTeorica=notaTeorica;
        this.notaPractica=notaPractica;
        this.aula=aula;
    }
    //Metodos:
    public String getNombre(){
        return this.nombre;
    }
    public String getApellidos(){
        return this.apellidos;
    }
    public float getNotaTeorica(){
        return this.notaTeorica;
    }
    public float getNotaPractica(){
        return this.notaPractica;
    }
    public short getAula(){
        return this.aula;
    }
    public void setAtributos(String nombre, String apellidos, float notaTeorica, float notaPractica, short aula){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.notaTeorica=notaTeorica;
        this.notaPractica=notaPractica;
        this.aula=aula;
    }
}
