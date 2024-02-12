package ejerciciosPoo.ordenador;

public class Ordenador extends Object {
    private String modelo;
    private float precio;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPrecio() {
        return precio;
    }


    public void setPrecio(float precio) {
        this.precio = precio;

    }

    public Ordenador(String modelo, float precio) {
        this.modelo = modelo;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return this.modelo + "\n\t" + this.precio;
    }
}