package ejerciciosPoo.maquinaExpendedora;

import java.util.HashMap;
import java.util.Map;

public class MaquinaExpendora {
    private double precioTique;
    private double saldoCajon;

    public MaquinaExpendora(double precioTique) {
        this.precioTique = precioTique;
        this.saldoCajon = 0.0;
    }

    public double getPrecioTique() {
        return precioTique;
    }

    public void setPrecioTique(double precioTique) {
        this.precioTique = precioTique;
    }

    public double getSaldoCajon() {
        return saldoCajon;
    }

    public void setSaldoCajon(double saldoCajon) {
        this.saldoCajon = saldoCajon;
    }

    public void introducirDinero(double cantidad) {
        saldoCajon += cantidad;
    }

    public String sacarTique() {
        if (saldoCajon >= precioTique) {
            double cambio = saldoCajon - precioTique;
            saldoCajon = 0.0;

            return calcularCambio(cambio);
        } else {
            return "Introduzca el importe exacto.";
        }
    }

    private String calcularCambio(double cambio) {
        Map<Double, Integer> billetesMonedas = new HashMap<>();
        double[] valores = { 2.0, 1.0, 0.5, 0.2, 0.1 };

        for (double valor : valores) {
            int cantidad = (int) (cambio / valor);
            if (cantidad > 0) {
                billetesMonedas.put(valor, cantidad);
                cambio -= cantidad * valor;
            }
        }

        StringBuilder resultado = new StringBuilder();
        for (Map.Entry<Double, Integer> entry : billetesMonedas.entrySet()) {
            resultado.append(entry.getValue()).append(" de ").append(entry.getKey()).append("€, ");
        }
        return resultado.toString();
    }

    public static void main(String[] args) {
        MaquinaExpendora maquina = new MaquinaExpendora(1.20);
        maquina.introducirDinero(5.0);
        System.out.println("Cambio: " + maquina.sacarTique());
    }
}
