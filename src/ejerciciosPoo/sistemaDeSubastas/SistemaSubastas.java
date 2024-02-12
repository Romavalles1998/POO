package ejerciciosPoo.sistemaDeSubastas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Articulo {
    private String nombre;
    private double precio;

    public Articulo(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}

class Lote {
    private int numero;
    private double precioSalida;
    private List<Articulo> articulos;

    public Lote(int numero, double precioSalida) {
        this.numero = numero;
        this.precioSalida = precioSalida;
        this.articulos = new ArrayList<>();
    }

    // Getters y setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getPrecioSalida() {
        return precioSalida;
    }

    public void setPrecioSalida(double precioSalida) {
        this.precioSalida = precioSalida;
    }

    public List<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(List<Articulo> articulos) {
        this.articulos = articulos;
    }
}

class Pujador {
    private String nombre;
    private double cantidadPujada;

    public Pujador(String nombre) {
        this.nombre = nombre;
        this.cantidadPujada = 0.0;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCantidadPujada() {
        return cantidadPujada;
    }

    public void setCantidadPujada(double cantidadPujada) {
        this.cantidadPujada = cantidadPujada;
    }
}

class Subasta {
    private String fecha;
    private List<Lote> lotes;
    private Map<Lote, Pujador> pujas;

    public Subasta(String fecha) {
        this.fecha = fecha;
        this.lotes = new ArrayList<>();
        this.pujas = new HashMap<>();
    }

    public void agregarLote(Lote lote) {
        lotes.add(lote);
    }

    public void realizarPuja(Lote lote, Pujador pujador, double cantidad) {
        if (lotes.contains(lote)) {
            if (cantidad > pujador.getCantidadPujada()) {
                pujador.setCantidadPujada(cantidad);
                pujas.put(lote, pujador);
            }
        }
    }

    public void cerrarSubasta() {
        for (Lote lote : lotes) {
            if (pujas.containsKey(lote)) {
                System.out.println("Lote " + lote.getNumero() + " adjudicado a " + pujas.get(lote).getNombre() +
                        " por " + pujas.get(lote).getCantidadPujada() + " euros");
            } else {
                System.out.println("Lote " + lote.getNumero() + " no adjudicado");
            }
        }
    }
}

public class SistemaSubastas {
    public static void main(String[] args) {
        // Crear subasta
        Subasta subasta = new Subasta("12/02/2024");

        // Agregar lotes a la subasta
        Lote lote1 = new Lote(1, 100.0);
        lote1.getArticulos().add(new Articulo("Cuadro", 50.0));
        lote1.getArticulos().add(new Articulo("Escultura", 75.0));
        subasta.agregarLote(lote1);

        Lote lote2 = new Lote(2, 200.0);
        lote2.getArticulos().add(new Articulo("Reloj", 150.0));
        subasta.agregarLote(lote2);

        // Realizar pujas
        Pujador pujador1 = new Pujador("Pujador1");
        subasta.realizarPuja(lote1, pujador1, 60.0);

        Pujador pujador2 = new Pujador("Pujador2");
        subasta.realizarPuja(lote2, pujador2, 180.0);

        // Cerrar subasta y mostrar resultados
        subasta.cerrarSubasta();
    }
}
