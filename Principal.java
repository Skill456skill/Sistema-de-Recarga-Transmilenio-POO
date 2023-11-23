import java.util.Scanner;
import java.util.Random;

public class Principal {

    public static Scanner sc = new Scanner(System.in);

    /*
     * Metodo main
     * 
     * Complejidad temporal: O(N) Tiempo Constante
     */
    public static void main(String[] args) {

        Usuario.mostrarfecha();
        Random ram = new Random();
        Usuario perfil = new Usuario("Alejandra", ram.nextInt(1000000, 100000000));
        Tarjeta recargador = new Tarjeta(0, 2950, 0, sc);

        while (true) {
            perfil.mostrarPerfil();
            System.out.println("¿Qué desea hacer?");
            System.out.println("1. Recargar");
            System.out.println("2. Cancelar");
            System.out.println("Por favor, ingrese 1 o 2: ");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\n----------------------------------------");
                    System.out.println("Su saldo actual es: $" + perfil.getSaldo());
                    System.out.println("Recarga mínima: " + recargador.getValorPasaje());
                    System.out.print("Ingrese el monto que desea recargar: $");
                    int recarga = sc.nextInt();
                    System.out.print("Con cuanto desea recargar?: $");
                    int valorBillet = sc.nextInt();
                    recargador.recarga(recarga, valorBillet);
                    perfil.setValorRecargado(valorBillet);

                    if (recargador.getSaldo() >= recargador.getValorPasaje()
                            || recargador.getSaldo() < recargador.getValorPasaje()
                            || recargador.getSaldo() == 0 && recarga >= 50) {
                        perfil.setSaldo(recarga);
                        recargador.setSaldo(recarga);
                        System.out.println("TRANSACCION EXITOSA");

                        System.out.println("VUELTAS: $" + recargador.getVueltas());
                        System.out.println();
                    }

                    if (recargador.getSaldo() < 0 && recarga > 0 && recarga >= 50) {
                        perfil.setSaldo(recarga);
                        recargador.setSaldo(recarga);
                        System.out.println("TRANSACCION EXITOSA");
                        System.out.println("Se desconto su deuda del valor total de la recarga");

                        System.out.println("VUELTAS: $" + recargador.getVueltas());
                        System.out.println();
                    }

                    if (recargador.getSaldo() < 0 || recarga <= 0 || recarga < 50) {
                        System.out.println("RECARGA INVALIDA");
                        System.out.println("No fue posible efectuar la recarga\n");
                    }
                    System.out.println("----------------------------------------\n");

                    break;
                case 2:
                    System.out.println("\n----------------------------------------");
                    System.out.println("Recarga cancelada.");
                    System.out.println("Ningún monto fue agregado al saldo.");
                    System.out.println("Gracias por Usar nuestros servicios.");
                    System.out.println("----------------------------------------\n");
                    return;
                default:
                    System.out.println("ERROR: Proceso Inválido\n");
                    break;
            }
        }
    }

}