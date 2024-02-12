package ejerciciosPoo.cuenta;

public class Cuenta {
    private String titular;
    private double cantidad;

    public Cuenta(String titular) {
        this.titular = titular;
        this.cantidad = 0.0; // Inicializamos la cantidad en 0
    }

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        if (cantidad >= 0) {
            this.cantidad = cantidad;
        } else {
            this.cantidad = 0.0; // Si la cantidad es negativa, la establecemos como 0
        }
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        if (cantidad >= 0) {
            this.cantidad = cantidad;
        }
    }

    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            this.cantidad += cantidad;
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0) {
            if (this.cantidad - cantidad < 0) {
                this.cantidad = 0;
            } else {
                this.cantidad -= cantidad;
            }
        }
    }

    @Override
    public String toString() {
        return "Titular: " + titular + "\nSaldo: " + cantidad;
    }

    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("Juan");
        Cuenta cuenta2 = new Cuenta("María", 1000.0);

        System.out.println(cuenta1);
        System.out.println(cuenta2);

        cuenta1.ingresar(500.0);
        cuenta2.retirar(300.0);

        System.out.println("\nDespués de operaciones:");
        System.out.println(cuenta1);
        System.out.println(cuenta2);
    }
}
