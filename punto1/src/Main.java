import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // definimos el aforo
        int aforo = 100;
        // Se instancia la clase objeto
        Evento evento = new Evento(aforo);

        Scanner scan = new Scanner(System.in);

        // Se registran la cantidad de personas en la "cola"
        System.out.print("Ingrese la cantidad de asistentes: ");
        int numAsistentes = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < numAsistentes; i++) {
            System.out.print("Ingrese el nombre del asistente " + (i + 1) + ": ");
            String nombre = scan.nextLine();
            System.out.print("Ingrese la cantidad de boletos que desea comprar: ");
            int tiquetesAComprar = scan.nextInt();
            scan.nextLine();
            // Se instancia el asistente con la info que pedimos de consola
            Asistente asistente = new Asistente(nombre, tiquetesAComprar);
            // Se llaman los metodos que registran al comprador y el que permite realizar la
            // compra
            evento.registrarComprador(asistente);
            evento.procesarSiguienteCompra();
        }
    }
}