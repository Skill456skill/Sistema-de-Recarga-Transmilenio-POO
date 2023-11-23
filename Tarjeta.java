import java.util.Scanner;

public class Tarjeta {

    /* Atributos */
    private int valorPasaje = 2950;
    private int saldo;
    private int vueltas;
    private Scanner scanner;

    /*
     * Metodo Constructor para inicializar los atributos
     * 
     * @param saldo el saldo
     * 
     * @param valorpasaje el costo del pasaje
     * 
     * @param vueltas el valor de las vueltas
     * 
     * @param scanner el scanner
     * 
     * 
     * Complejidad temporal: O(N) Tiempo Constante
     */
    public Tarjeta(int saldo, int valorPasaje, int vueltas, Scanner scanner) {
        this.saldo = saldo;
        this.valorPasaje = valorPasaje;
        this.vueltas = vueltas;
        this.scanner = new Scanner(System.in);
    }

    /*
     * Metodo para recarga y saldo
     * 
     * Complejidad temporal: O(N) Tiempo Constante
     */
    public void recarga(int recarga, int valorBillet) {

        if (saldo >= valorPasaje || saldo == 0 && recarga > 0 && recarga >= 50) {
            vueltas = valorBillet - recarga;
        }

        if (saldo < 0 && recarga > 0 && recarga >= 50) {
            vueltas = valorBillet - recarga;
        }
    }

    /*
     * Getters y Setters
     */
    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getVueltas() {
        return vueltas;
    }

    public void setVueltas(int vueltas) {
        this.vueltas = vueltas;
    }

    public int getValorPasaje() {
        return valorPasaje;
    }

}