/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pedro Martinez Gonzalez
 */
public class Empleado {
    //Atributos:
    private String nombre;
    private String apellidos;
    private short departamento;
    private byte seccion;
    private float sueldo;
    //Constructores:
    public Empleado(String nombre, String apellidos, short departamento, byte seccion, float sueldo){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.departamento=departamento;
        this.seccion=seccion;
        this.sueldo=sueldo;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getApellidos(){
        return this.apellidos;
    }
    public short getDepartamento(){
        return this.departamento;
    }
    public byte getSeccion(){
        return this.seccion;
    }
    public float getSueldo(){
        return this.sueldo;
    }
    public void setEmpleado(String nombre, String apellidos, short departamento, byte seccion, float sueldo){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.departamento=departamento;
        this.seccion=seccion;
        this.sueldo=sueldo;
    }
}
