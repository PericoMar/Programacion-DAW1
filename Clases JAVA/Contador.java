/**
 *
 * @author Pedro Martínez González
 */
public class Contador {
    //Atributos:
    private int valor;
    private int incremento;
    //Constructores:
    public Contador(){
        this.incremento=1;
    }
    public Contador(int incremento){
        this.incremento=incremento;
    }
    public Contador(int valor, int incremento){
        this.valor=valor;
        this.incremento=incremento;
    }
    public int getIncremento(){
        return incremento;
    }
    public void incrementaCuenta(){
        this.valor++;
    }
    public void iniciaCuenta(int valor){
        this.valor=valor;
    }
    public int obtenerCuenta(){
        return this.valor;
    }
}
