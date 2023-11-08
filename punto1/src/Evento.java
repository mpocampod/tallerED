import java.util.LinkedList;
import java.util.Queue;

public class Evento {
    // Se crea la cola que va a almacenar los asistentes
    Queue<Asistente> cola;
    int aforo;
    int cantDisponibles;

    public Evento(int aforo) {
        this.aforo = aforo;
        this.cantDisponibles = aforo;
        this.cola = new LinkedList<>();
    }

    // se agregan a la cola los asistentes
    public void registrarComprador(Asistente asistente) {
        this.cola.add(asistente);
    }

    public void procesarSiguienteCompra() {
        while (!cola.isEmpty()) {
            // revisa que la cola no este vacia y coge al primer usuario
            // que esta en la cola para realizar el proceso y despues eliminarlo
            Asistente asistente = cola.remove();
            // define una variable para el metodo de la clase asistente
            int tiquetesAComprar = asistente.getTiquetesAcomprar();

            if (tiquetesAComprar > 0) {
                // si los tiquetes que va a comprar es menor a la cantidad disponible se venden
                // se descuentan esos tickets de la cantidad disponible
                if (tiquetesAComprar <= cantDisponibles) {
                    System.out.println(asistente.getNombre() + " ha comprado " + tiquetesAComprar + " tickets");
                    cantDisponibles -= tiquetesAComprar;
                } else {
                    System.out.println(asistente.getNombre() + " solo pudo comprar " + cantDisponibles
                            + " tickets debido a la disponibilidad.");
                    cantDisponibles = 0;
                    System.out.println("SOLD OUT");
                    break;
                }
            } else {
                System.out.println("No hay personas en espera");
            }
            System.out.println(
                    asistente.getNombre() + " salió de la fila y los Tickets disponibles son: " + cantDisponibles);
        }
    }
}
