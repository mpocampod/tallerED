package Store;

import java.util.Scanner;

public class ConsoleMessages {

    private Store newStore;
    private Scanner scanner;

    public ConsoleMessages() {
        newStore = new Store();
    }

    public String showMenu(){
        return "\nIngrese una opción \n1.Agregar cliente \n2.Atender a los clientes \n3.Salir de la Tienda";
    }

    public void runMenu(int option) {

        switch (option) {

            case 1:
                scanner = new Scanner(System.in).useDelimiter("\n");

                System.out.println("Ingrese el nombre completo del cliente");
                String name = scanner.next();

                int ticket = newStore.generateTicket();
                Customer newCustomer = new Customer(name,ticket);
                newStore.addCustomer(newCustomer);
                System.out.println("Cliente " + name + " agregado con el número de ticket " + ticket);
                break;

            case 2:
                if (!newStore.isEmpty()) {
                    newStore.serveCustomers();
                } else {
                    System.out.println("Lista de clientes vacia");
                }
                break;

            case 3:
                System.out.println("Saliendo de la Tienda");
                break;

            default:
                System.out.println("Opción incorrecta, por favor vuelva a ingresar la opción");
        }

    }
}
