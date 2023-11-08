import java.util.Stack;

/**
 * Agregar un método ImprimirTexto/PrintText que va a mostar por consola el
 * resultado de la pila de acciones.
 * Se deben leer todas las palabras por consola, y se debe agregar un par de
 * acciones que se escuchan de estas palabras ingresadas.
 * Si se ingresa -1 debe deshacer la última palabra ingresada.
 * Si se igresa +print debe mostrar el texto escrito.
 *
 * while(true){
 * String texto = sc.next()
 * if(texto == -1)-....
 * if(texto == __).....
 * }
 */
public class TextEditor {
    Stack<String> actions;

    public TextEditor() {
        this.actions = new Stack<>();
    }

    public void write(String text) {
        this.actions.push(text);

    }

    public String undo() {
        if (!actions.isEmpty()) {
            return this.actions.pop();
        }
        return "No hay palabras para deshacer";
    }

    public void printText() {
        // se utiliza for each para iterar cada palabra de la pila
        // y retornar todas las palabras en orden
        for (String word : actions) {
            System.out.print(word + " ");
        }
        System.out.println();
    }
}