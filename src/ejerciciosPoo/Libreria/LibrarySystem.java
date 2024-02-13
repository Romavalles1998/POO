package Libreria;

// Main class
public class LibrarySystem {
    public static void main(String[] args) {

        Autor autor = new Autor("A001");
        Editorial editorial = new Editorial("E001");
        Libro libro = new Libro("ISBN001", "T001", editorial);
        Ejemplar ejemplar = new Ejemplar(libro, "REG001");
        Lector lector = new Lector("DNI001");
        Historico historico = new Historico(lector, ejemplar, "2024-02-13", "2024-03-13");


        System.out.println("Libro ISBN: " + ejemplar.libro.isbn);
        System.out.println("Ejemplar Registro: " + ejemplar.n_reg);
        System.out.println("Lector DNI: " + historico.lector.dni);
        System.out.println("Fecha de prestamo: " + historico.data_p);
        System.out.println("Fecha de devolucion: " + historico.data_t);
    }
}
