import java.util.Stack;

public class VerificarExpresion {
    public static boolean esExpresionValida(String expresion) {
        Stack<Character> pila = new Stack<Character>();

        for (char caracter : expresion.toCharArray()) {
            if (caracter == '(' || caracter == '[' || caracter == '{') {
                pila.push(caracter);
            } else if (caracter == ')' || caracter == ']' || caracter == '}') {
                if (pila.isEmpty()) {
                    return false; // No hay un paréntesis/llave/corchete de apertura correspondiente
                } else if ((caracter == ')' && pila.peek() == '(') ||
                        (caracter == ']' && pila.peek() == '[') ||
                        (caracter == '}' && pila.peek() == '{')) {
                    pila.pop();
                } else {
                    return false; // Los paréntesis/llaves/corchetes no coinciden
                }
            }
        }

        return pila.isEmpty();
    }
}
