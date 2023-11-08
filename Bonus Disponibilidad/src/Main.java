import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Disponibilidad dis = new Disponibilidad();
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println(
                    "\n Ingrese la opción deseada: \n 1 Crear un nuevo usuario \n 2 Ver usuarios conectados \n 3 Ver usuario en desconectados \n 4 Para salir \n");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre del usuario a crear: ");
                    String name = sc.nextLine();
                    dis.write(name);
                    break;
                case 2:
                    if (!dis.nombres.isEmpty()) {
                        System.out.println("Los usuarios conectados son: ");
                        dis.printText();
                    }
                    break;
                case 3:

                    if (!dis.nombres.isEmpty()) {
                        System.out.println("El usuario que se acabó de desconectar fue \n" + dis.undo());
                    }

                    break;
                case 4:
                    System.exit(0);

            }
        } while (opcion != 4);
    }
}