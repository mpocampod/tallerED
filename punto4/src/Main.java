public class Main {
    public static void main(String[] args) {
        String expresion = "(3 + 2) * [5 - (2 + 1)]";

        if (VerificarExpresion.esExpresionValida(expresion)) {
            System.out.println("La expresión es válida.");
        } else {
            System.out.println("La expresión no es válida.");
        }
    }
}
