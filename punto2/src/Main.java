import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        TextEditor te = new TextEditor();
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println(
                    "\n Ingrese la opción deseada: \n 1 Para escribir una palabra \n 2 Para deshacer la última palabra ingresada \n 3 para mostrar las palabras ingresadas  \n 4 Para salir \n");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la palabra: ");
                    String text = sc.nextLine();
                    te.write(text);
                    break;
                case 2:
                    System.out.println(" Escriba -1 para completar la acción: ");
                    String accion = sc.nextLine();
                    if (accion.equals("-1")) {
                        if (!te.actions.isEmpty()) {
                            System.out.println("Deshacer la última palabra: " + te.undo());
                        }
                    }
                    break;
                case 3:
                    System.out.println(" Escriba +print para completar la acción: ");
                    accion = sc.nextLine();
                    if (accion.equals("+print")) {
                        System.out.println("Texto escrito: ");
                        te.printText();

                    }
                    break;
                case 4:
                    System.exit(0);

            }
        } while (opcion != 4);
    }
}