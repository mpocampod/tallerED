package Store;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        ConsoleMessages menu = new ConsoleMessages();
        int option = 0;

        do {
            System.out.println(menu.showMenu());
            option = scanner.nextInt();
            menu.runMenu(option);
        } while (option != 3);

    }
}
