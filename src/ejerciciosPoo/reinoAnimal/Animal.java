package reinoAnimal;

public abstract class Animal {
    protected String nombre;

    public Animal(String nombre) { this.nombre = nombre; }

    public abstract void comunicarse();
    public abstract void comer();

    public abstract void alimentacion();
    public abstract void moverse();

    @Override
    public String toString() {
        return "Animal: " + nombre;
    }

}

