package ejerciciosPoo.areaconocimiento;

public class AC {
    private int cod_ac;
    private String nombre;

    public AC(int cod_ac, String nombre) {
        this.cod_ac = cod_ac;
        this.nombre = nombre;
    }

    public int getCod_ac() {
        return cod_ac;
    }

    public void setCod_ac(int cod_ac) {
        this.cod_ac = cod_ac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
