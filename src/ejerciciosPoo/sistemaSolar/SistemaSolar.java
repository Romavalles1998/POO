package sistemaSolar;

import java.util.ArrayList;
import java.util.List;

abstract class CuerpoCeleste {
    protected String nombre;

    public CuerpoCeleste(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public abstract String toString();
}

class Estrella extends CuerpoCeleste {
    public Estrella(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return "Estrella: " + nombre;
    }
}

class Planeta extends CuerpoCeleste {
    private List<Satelite> satelites = new ArrayList<>();

    public Planeta(String nombre) {
        super(nombre);
    }

    public void agregarSatelite(Satelite satelite) {
        satelites.add(satelite);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Planeta: " + nombre + "\n");
        for (Satelite satelite : satelites) {
            sb.append("  ").append(satelite.toString()).append("\n");
        }
        return sb.toString();
    }
}

class Satelite extends CuerpoCeleste {
    private double periodoOrbital;

    public Satelite(String nombre, double periodoOrbital) {
        super(nombre);
        this.periodoOrbital = periodoOrbital;
    }

    @Override
    public String toString() {
        return "Satélite: " + nombre + " - Periodo Orbital: " + periodoOrbital + " días";
    }
}

class SistemaSolar {
    private Estrella estrellaCentral;
    private List<Planeta> planetas = new ArrayList<>();

    public SistemaSolar(Estrella estrellaCentral) {
        this.estrellaCentral = estrellaCentral;
    }

    public void agregarPlaneta(Planeta planeta) {
        planetas.add(planeta);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(estrellaCentral.toString() + "\n");
        for (Planeta planeta : planetas) {
            sb.append(planeta.toString()).append("\n");
        }
        return sb.toString();
    }
}

