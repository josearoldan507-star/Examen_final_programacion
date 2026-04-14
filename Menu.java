import java.util.Scanner;

public class Menu {

    private Scanner sc;

    public Menu() {
        sc = new Scanner(System.in);
    }

    public int mostrarMenu() {
        System.out.println("\n===== ENCICLOPEDIA ANIME =====");
        System.out.println("1. Agregar personaje");
        System.out.println("2. Listar personajes");
        System.out.println("3. Buscar personaje");
        System.out.println("4. Actualizar personaje");
        System.out.println("5. Eliminar personaje");
        System.out.println("6. Salir");
        System.out.print("Seleccione una opcion: ");

        int opcion = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        return opcion;
    }
}