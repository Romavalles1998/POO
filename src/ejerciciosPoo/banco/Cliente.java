/*package ejerciciosPoo.banco;

import java.util.HashSet;
import java.util.Set;

public class Cliente {
    private int nCLi;
    private String nombre;
    private Sucursal sucursal;
    private Set<Prestamo> prestamos;

    private CC CC;


    public Cliente(int nCLi, String nombre, Sucursal sucursal) {
        this.nCLi = nCLi;
        this.nombre = nombre;
        this.sucursal = sucursal;
        this.prestamos = new HashSet<>();
    }
    public Sucursal getSucursal() {
        return sucursal;
    }
    public CC getCuentaCorriente() {
        return CC;
    }

    public void setCuentaCorriente(CC CC) {
        this.CC = CC;
    }
    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }
    public Set<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(Set<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    public int getnCLi() {
        return nCLi;
    }

    public void setnCLi(int nCLi) {
        this.nCLi = nCLi;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void addPrestamo(Prestamo prestamo) {
        this.prestamos.add(prestamo);
    }
    public void setPrestamo(Prestamo prestamo){
        this.prestamos.add(prestamo);
}
public void addCuentaCorriente(){

}
    @Override
    public String toString() {
        return "Cliente{" +
                "nCLi=" + nCLi +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}*/
