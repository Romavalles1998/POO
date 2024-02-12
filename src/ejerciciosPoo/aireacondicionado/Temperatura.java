package ejerciciosPoo.aireacondicionado;

public class Temperatura extends Object {
    private String aparato;
    private float temperaturaMax;
    private float temperaturaMin;
    private float temperaturaActual;

    public String getAparato() {
        return aparato;
    }

    public void setAparato(String aparato) {
        this.aparato = aparato;
    }

    public float getTemperaturaMax() {
        return temperaturaMax;
    }

    public void setTemperaturaMax(float temperaturaMax) {
        this.temperaturaMax = temperaturaMax;
    }

    public float getTemperaturaMin() {
        return temperaturaMin;
    }

    public void setTemperaturaMin(float temperaturaMin) {
        this.temperaturaMin = temperaturaMin;
    }

    public Temperatura(String aparato, float temperaturaMax, float temperaturaMin, float temperaturaActual) {
        this.aparato = aparato;
        this.temperaturaMax = temperaturaMax;
        this.temperaturaMin = temperaturaMin;
        this.temperaturaActual = temperaturaActual;

    }
public void subir () {
        if (this.temperaturaActual + 1 <= this.temperaturaMax)
            this.temperaturaActual++;
        else
            throw new IllegalArgumentException("La temperatura no puede superar " + this.temperaturaMax);
        }
        public void bajar () {
            if (this.temperaturaActual - 1  <= this.temperaturaMin)
                this.temperaturaActual++;
            else
                throw new IllegalArgumentException("La temperatura no puede estar debajo de " + this.temperaturaMax);
        }
    @Override
    public String toString() {
        return
                "Modelo aparato: '" + aparato + '\'' +
                        ", Temperatura máxima = " + temperaturaMax +
                        ", Temperatura mínima = " + temperaturaMin +
                        ", Temperatura Actual = " + temperaturaActual;
    }
}
