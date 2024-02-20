package network;
import java.util.ArrayList;
import java.util.List;

class Comentario {
    private String usuario;
    private String texto;

    public Comentario(String usuario, String texto) {
        this.usuario = usuario;
        this.texto = texto;
    }

    public String getUsuario() {
        return usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    public String getTexto() {
        return texto;
    }
    
    public void setTexto(String texto) {
        this.texto = texto;
    }
}

abstract class Publicacion {
    private static int count = 0;
    protected int id;
    protected String autor;
    protected String fecha;
    protected int likes;
    protected List<Comentario> comentarios;

    public Publicacion(String autor, String fecha) {
        this.autor = autor;
        this.fecha = fecha;
        this.likes = 0;
        this.comentarios = new ArrayList<>();
        this.id = ++count;
    }

    abstract void mostrarDetalle();
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public String getFecha() {
        return fecha;
    }
    
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public int getLikes() {
        return likes;
    }
    
    public void setLikes(int likes) {
        this.likes = likes;
    }
    
    public List<Comentario> getComentarios() {
        return comentarios;
    }
    
    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

    public void agregarComentario(Comentario comentario) {
        comentarios.add(comentario);
    }

    public void incrementarLikes() {
        likes++;
    }
}

class Texto extends Publicacion {
    private String texto;
    
    // Constructor
    public Texto(String autor, String fecha, String texto) {
        super(autor, fecha);
        this.texto = texto;
    }

    @Override
    void mostrarDetalle() {
        System.out.println("ID: " + id);
        System.out.println("Autor: " + autor);
        System.out.println("Fecha: " + fecha);
        System.out.println("Texto: " + texto);
        System.out.println("Likes: " + likes);
        System.out.println("Comentarios:");
        for (Comentario comentario : comentarios) {
            System.out.println("- " + comentario.getUsuario() + ": " + comentario.getTexto());
        }
        System.out.println();
    }

    public String getTexto() {
        return texto;
    }
    public void setTexto(String texto) {
        this.texto = texto;
    }
}

class Foto extends Publicacion {
    private String nombreArchivo;
    private String titulo;
    

    public Foto(String autor, String fecha, String nombreArchivo, String titulo) {
        super(autor, fecha);
        this.nombreArchivo = nombreArchivo;
        this.titulo = titulo;
    }

    @Override
    void mostrarDetalle() {
        System.out.println("ID: " + id);
        System.out.println("Autor: " + autor);
        System.out.println("Fecha: " + fecha);
        System.out.println("Título: " + titulo);
        System.out.println("Nombre de archivo: " + nombreArchivo);
        System.out.println("Likes: " + likes);
        System.out.println("Comentarios:");
        for (Comentario comentario : comentarios) {
            System.out.println("- " + comentario.getUsuario() + ": " + comentario.getTexto());
        }
        System.out.println();
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }
    
    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}


class Usuario {
    private String nombre;
    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}


public class Main {
    public static void main(String[] args) {

        Usuario usuarioMaria = new Usuario("usuariomaria");
        Usuario usuarioMario = new Usuario("usuariomario");
        Usuario usuarioMarta = new Usuario("usuariomarta");
        

        Texto texto1 = new Texto(usuarioMaria.getNombre(), "2024-02-20", "Este es un mensaje de texto.");
        texto1.incrementarLikes();
        texto1.agregarComentario(new Comentario(usuarioMario.getNombre(), "¡Qué interesante!"));
        
        Texto texto2 = new Texto(usuarioMario.getNombre(), "2024-02-21", "Otro mensaje de texto.");
        texto2.agregarComentario(new Comentario(usuarioMaria.getNombre(), "Gracias por compartir."));
        

        Foto foto1 = new Foto(usuarioMarta.getNombre(), "2024-02-22", "foto1.jpg", "Mi primera foto");
        foto1.incrementarLikes();
        foto1.agregarComentario(new Comentario(usuarioMaria.getNombre(), "Bonita imagen."));
        
        Foto foto2 = new Foto(usuarioMaria.getNombre(), "2024-02-23", "foto2.jpg", "Una vista increíble");
        

        texto1.mostrarDetalle();
        texto2.mostrarDetalle();
        foto1.mostrarDetalle();
        foto2.mostrarDetalle();

        int totalLikes = texto1.getLikes() + texto2.getLikes() + foto1.getLikes() + foto2.getLikes();
        System.out.println("Total de likes en todas las publicaciones: " + totalLikes);
    }
}
