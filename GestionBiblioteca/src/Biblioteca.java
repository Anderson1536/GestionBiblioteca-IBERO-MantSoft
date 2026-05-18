import java.util.*;

public class Biblioteca {

    private HashMap<String, Libro> libros = new HashMap<>();
    private HashMap<String, Usuario> usuarios = new HashMap<>();
    private HashMap<String, String> prestamos = new HashMap<>();

    Scanner sc = new Scanner(System.in);

    public void agregarLibro() {

        System.out.print("ISBN: ");
        String isbn = sc.nextLine();

        if (libros.containsKey(isbn)) {

            System.out.println("ERROR: ISBN ya registrado.");
            return;
        }

        System.out.print("Titulo: ");
        String titulo = sc.nextLine();

        System.out.print("Autor: ");
        String autor = sc.nextLine();

        System.out.print("Genero: ");
        String genero = sc.nextLine();

        System.out.print("Año: ");
        int anio = Integer.parseInt(sc.nextLine());

        Libro libro = new Libro(
                isbn,
                titulo,
                autor,
                genero,
                anio);

        libros.put(isbn, libro);

        System.out.println("Libro agregado.");
    }

    public void listarLibros() {

        if (libros.isEmpty()) {

            System.out.println("No hay libros.");
            return;
        }

        for (Libro libro : libros.values()) {

            String estado = prestamos.containsKey(
                    libro.getIsbn())
                            ? "Prestado"
                            : "Disponible";

            System.out.println(
                    libro.getTitulo()
                            + " | "
                            + libro.getAutor()
                            + " | "
                            + estado);
        }
    }

    public void buscarPorGenero() {

        System.out.print("Genero: ");

        String generoBusqueda = sc.nextLine();

        boolean encontrado = false;

        for (Libro libro : libros.values()) {

            if (libro.getGenero()
                    .equalsIgnoreCase(generoBusqueda)) {

                System.out.println(
                        libro.getTitulo()
                                + " | "
                                + libro.getAutor());

                encontrado = true;
            }
        }

        if (!encontrado) {

            System.out.println(
                    "No existen libros de ese genero.");
        }
    }

    public void prestarLibro() {

        System.out.print("ISBN: ");

        String isbn = sc.nextLine();

        System.out.print("ID Usuario: ");

        String usuario = sc.nextLine();

        if (prestamos.containsKey(isbn)) {

            System.out.println(
                    "Libro ya prestado.");

            return;
        }

        prestamos.put(
                isbn,
                usuario);

        System.out.println(
                "Prestamo realizado.");
    }

    public void agregarUsuario() {

        System.out.print("ID: ");

        String id = sc.nextLine();

        System.out.print("Nombre: ");

        String nombre = sc.nextLine();

        Usuario usuario = new Usuario(
                id,
                nombre);

        usuarios.put(
                id,
                usuario);

        System.out.println(
                "Usuario agregado.");
    }

    public void eliminarUsuario() {

        System.out.print(
                "ID Usuario: ");

        String id = sc.nextLine();

        if (usuarios.containsKey(id)) {

            usuarios.remove(id);

            System.out.println(
                    "Usuario eliminado.");

        } else {

            System.out.println(
                    "Usuario no encontrado.");
        }
    }
    
}
