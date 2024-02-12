package ejerciciosPoo.biblioteca;

import java.util.ArrayList;
import java.util.List;

class Autor {
    private String nombre;
    private String fechaNacimiento;

    public Autor(String nombre, String fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}

class Tema {
    private String nombre;

    public Tema(String nombre) {
        this.nombre = nombre;
    }

    // Getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

class Libro {
    private String titulo;
    private Autor autor;
    private int paginas;
    private List<Tema> temas;

    public Libro(String titulo, Autor autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.temas = new ArrayList<>();
    }

    // Getters y setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public List<Tema> getTemas() {
        return temas;
    }

    public void setTemas(List<Tema> temas) {
        this.temas = temas;
    }
}

public class MainLibro {
    public static void main(String[] args) {
        // Crear autores
        Autor autor1 = new Autor("Autor A", "01/01/1980");
        Autor autor2 = new Autor("Autor B", "15/05/1975");

        // Crear temas
        Tema tema1 = new Tema("Tema 1");
        Tema tema2 = new Tema("Tema 2");
        Tema tema3 = new Tema("Tema 3");

        // Crear libros y asignar autores y temas
        Libro libro1 = new Libro("Libro 1", autor1, 200);
        libro1.getTemas().add(tema1);
        libro1.getTemas().add(tema2);

        Libro libro2 = new Libro("Libro 2", autor2, 300);
        libro2.getTemas().add(tema2);
        libro2.getTemas().add(tema3);

        // Mostrar información de los libros
        System.out.println("Información del Libro 1:");
        System.out.println("Título: " + libro1.getTitulo());
        System.out.println("Autor: " + libro1.getAutor().getNombre());
        System.out.println("Páginas: " + libro1.getPaginas());
        System.out.println("Temas:");
        for (Tema tema : libro1.getTemas()) {
            System.out.println("- " + tema.getNombre());
        }

        System.out.println("\nInformación del Libro 2:");
        System.out.println("Título: " + libro2.getTitulo());
        System.out.println("Autor: " + libro2.getAutor().getNombre());
        System.out.println("Páginas: " + libro2.getPaginas());
        System.out.println("Temas:");
        for (Tema tema : libro2.getTemas()) {
            System.out.println("- " + tema.getNombre());
        }
    }
}
