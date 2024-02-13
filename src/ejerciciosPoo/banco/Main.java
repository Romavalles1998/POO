package banco;

import java.util.ArrayList;
import java.util.List;

class Banco {
    private String nombre;
    private List<Sucursal> sucursales;

    public Banco(String nombre) {
        this.nombre = nombre;
        this.sucursales = new ArrayList<>();
    }

    public void agregarSucursal(Sucursal sucursal) {
        this.sucursales.add(sucursal);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre del Banco: ").append(nombre).append("\n");
        sb.append("Sucursales:\n");
        for (Sucursal sucursal : sucursales) {
            sb.append(sucursal.toString()).append("\n");
        }
        return sb.toString();
    }
}

class Sucursal {
    private String direccion;
    private List<CuentaCorriente> cuentasCorrientes;

    public Sucursal(String direccion) {
        this.direccion = direccion;
        this.cuentasCorrientes = new ArrayList<>();
    }

    public void agregarCuentaCorriente(CuentaCorriente cuentaCorriente) {
        this.cuentasCorrientes.add(cuentaCorriente);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Dirección de la Sucursal: ").append(direccion).append("\n");
        sb.append("Cuentas Corrientes:\n");
        for (CuentaCorriente cuentaCorriente : cuentasCorrientes) {
            sb.append(cuentaCorriente.toString()).append("\n");
        }
        return sb.toString();
    }
}

class CuentaCorriente {
    private String numeroCuenta;
    private Cliente cliente;
    private List<Prestamo> prestamos;
    private List<Domiciliacion> domiciliaciones;

    public CuentaCorriente(String numeroCuenta, Cliente cliente) {
        this.numeroCuenta = numeroCuenta;
        this.cliente = cliente;
        this.prestamos = new ArrayList<>();
        this.domiciliaciones = new ArrayList<>();
    }

    public void agregarPrestamo(Prestamo prestamo) {
        this.prestamos.add(prestamo);
    }

    public void agregarDomiciliacion(Domiciliacion domiciliacion) {
        this.domiciliaciones.add(domiciliacion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Número de Cuenta: ").append(numeroCuenta).append("\n");
        sb.append("Cliente: ").append(cliente.toString()).append("\n");
        sb.append("Prestamos:\n");
        for (Prestamo prestamo : prestamos) {
            sb.append(prestamo.toString()).append("\n");
        }
        sb.append("Domiciliaciones:\n");
        for (Domiciliacion domiciliacion : domiciliaciones) {
            sb.append(domiciliacion.toString()).append("\n");
        }
        return sb.toString();
    }
}

class Cliente {
    private String nombre;
    private String dni;

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", DNI: " + dni;
    }
}

class Prestamo {
    private String numeroPrestamo;
    private double monto;

    public Prestamo(String numeroPrestamo, double monto) {
        this.numeroPrestamo = numeroPrestamo;
        this.monto = monto;
    }

    @Override
    public String toString() {
        return "Préstamo: " + numeroPrestamo + ", Monto: " + monto;
    }
}

class Domiciliacion {
    private String codigoRecibo;
    private double monto;

    public Domiciliacion(String codigoRecibo, double monto) {
        this.codigoRecibo = codigoRecibo;
        this.monto = monto;
    }

    @Override
    public String toString() {
        return "Código de Recibo: " + codigoRecibo + ", Monto: " + monto;
    }
}

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Santander");
        Sucursal sucursalMadrid = new Sucursal("Madrid, Calle Gran Vía");
        Sucursal sucursalBarcelona = new Sucursal("Barcelona, Paseo de Gracia");
        banco.agregarSucursal(sucursalMadrid);
        banco.agregarSucursal(sucursalBarcelona);

        Cliente clienteJuan = new Cliente("Juan Pérez", "12345678B");
        CuentaCorriente ccJuan = new CuentaCorriente("001", clienteJuan);
        sucursalMadrid.agregarCuentaCorriente(ccJuan);

        Prestamo prestamoJuan = new Prestamo("A01", 2000);
        ccJuan.agregarPrestamo(prestamoJuan);

        Domiciliacion domiciliacionJuan = new Domiciliacion("M001", 150);
        ccJuan.agregarDomiciliacion(domiciliacionJuan);

        System.out.println(banco.toString());
    }
}
