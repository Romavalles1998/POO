package ejerciciosPoo.areaconocimiento;

public class Departamento {
 private int num_d;
 private String nombreDepartamento;

 private AC ac;

    public Departamento(int num_d, String nombreDepartamento, AC ac) {
        this.num_d = num_d;
        this.nombreDepartamento = nombreDepartamento;
        this.ac = ac;
    }

    public int getNum_d() {
        return num_d;
    }

    public void setNum_d(int num_d) {
        this.num_d = num_d;
    }

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    public AC getAc() {
        return ac;
    }

    public void setAc(AC ac) {
        this.ac = ac;
    }

    @Override
    public String toString() {
        return "Departamento: " +
                "num_d = " + num_d +
                ", Nombre de Departamento: '" + nombreDepartamento + '\'' + ac;
    }
}
