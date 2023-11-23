import java.text.SimpleDateFormat;
import java.util.Date;

public class Usuario {

    /* Atributos */
    private String nombre;
    private int codigo;
    private int saldo;
    private int valorRecargado;

    /*
     * Metodo constructor para inicializar los atributos
     * 
     * @param nombre
     * 
     * @param codigo
     * 
     * Complejidad temporal: O(N) Tiempo Constante
     */
    public Usuario(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    /*
     * Metodo para mostrar fecha
     * 
     * @param fechaActual Asigna la fecha
     * 
     * @param fecha Asigna el formato de la fecha
     * 
     * Complejidad temporal: O(N) Tiempo Constante
     */
    public static void mostrarfecha() {

        Date fechaActual = new Date();
        SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yy");

        System.out.println("\n" + fecha.format(fechaActual));
    }

    /*
     * Metodo para mostrar el pefil
     * 
     * Complejidad temporal: O(N) Tiempo Constante
     */
    public void mostrarPerfil() {
        System.out.println("\nBienvenid@ Usuario " + getNombre());
        System.out.println("----------------------------------------");
        System.out.println("PERFIL: " + getNombre());
        System.out.println("Código: " + getCodigo());
        System.out.println("Saldo: $" + getSaldo());
        System.out.println("Cantidad ingresada: $" + getValorRecargado());
        System.out.println("----------------------------------------\n");
    }

    /*
     * Getters y Setters
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo += saldo;
    }

    public int getValorRecargado() {
        return valorRecargado;
    }

    public void setValorRecargado(int valorRecargado) {
        this.valorRecargado = valorRecargado;
    }

}
