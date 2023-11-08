public class Asistente {

    public String nombre;
    public int tiquetesAComprar;

    public Asistente(String nombre, int tiquetesAComprar) {
        this.nombre = nombre;
        this.tiquetesAComprar = tiquetesAComprar;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTiquetesAcomprar() {
        return tiquetesAComprar;
    }
}
