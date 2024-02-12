package ejerciciosPoo.person;

public class Person extends Object{

    private String nombre;
    private String direccion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Person(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;

    }
    @Override
    public String toString(){
        return this.nombre + "\n\t" + this.direccion;
    }
}

