package MusicPlaylist;
import java.util.Scanner;

public class ConsoleMessages {

    private PlayList newPlaylist;
    private Scanner scanner = new Scanner(System.in).useDelimiter("\n");

    public ConsoleMessages() {
        newPlaylist = new PlayList();
    }

    public String showMenu(){
        return "\nIngrese una opcion \n1.Agregar cancion \n2.Reproducir lista de canciones \n3.Eliminar cancion \n4.Salir";
    }

    public void runMenu(int option){

        switch(option) {

            case 1:
                System.out.println("Ingrese nombre de la cancion");
                String song = scanner.next();
                System.out.println("Ingrese el nombre del cantante");
                String singer = scanner.next();

                Song newsong = new Song(song, singer);
                newPlaylist.addSong(newsong);
                System.out.println("Cancion '" + song + "' agregada");
                break;

            case 2:
                if (!newPlaylist.isEmpty()){
                    newPlaylist.playSong();
                }
                else {
                    System.out.println("Lista de reproduccion vacia");
                }
                break;

            case 3:
                if (!newPlaylist.isEmpty()){
                    System.out.println("Ingrese el nombre de la cancion a eliminar");
                    String songToDelete = scanner.next();
                    newPlaylist.deleteSong(songToDelete);
                }
                else {
                    System.out.println("Lista de reproduccion vacia");
                }
                break;

            case 4:
                System.out.println("Saliendo de la PlayList");
                break;

            default:
                System.out.println("Opcion incorrecta");
        }
    }
}
