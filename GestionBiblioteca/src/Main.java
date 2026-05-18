import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
         Biblioteca biblioteca = new Biblioteca();

        Scanner sc = new Scanner(System.in);

        while(true){

            System.out.println("\nMENU");

            System.out.println("1. Agregar libro");
            System.out.println("2. Listar libros");
            System.out.println("3. Buscar por genero");
            System.out.println("4. Prestar libro");
            System.out.println("5. Agregar usuario");
            System.out.println("6. Eliminar usuario");
            System.out.println("0. Salir");

            String opcion = sc.nextLine();

            switch(opcion){

                case "1":

                    biblioteca.agregarLibro();
                    break;

                case "2":

                    biblioteca.listarLibros();
                    break;
                
                case "4":

                    biblioteca.prestarLibro();
                    break;

                case "3":

                    biblioteca.buscarPorGenero();
                case "5":

                    biblioteca.agregarUsuario();
                    break;
                
                case "6":

                    biblioteca.eliminarUsuario();
                    break;

                case "0":

                    System.exit(0);

                default:

                    System.out.println("Opcion invalida");
            }
        }
    }
}
