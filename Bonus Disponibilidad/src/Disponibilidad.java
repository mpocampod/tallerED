import java.util.Stack;

public class Disponibilidad {

    Stack<String> nombres;

    public Disponibilidad() {
        this.nombres = new Stack<>();
    }

    public void write(String name) {
        this.nombres.push(name);

    }

    public String undo() {
        if (!nombres.isEmpty()) {
            return this.nombres.pop();
        }
        return "No hay ningun usuario conectado";
    }

    public void printText() {
        for (String usuario : nombres) {
            System.out.println(usuario);
        }
    }
}
