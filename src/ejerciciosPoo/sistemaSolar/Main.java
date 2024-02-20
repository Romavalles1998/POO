package sistemaSolar;

public class Main {
    public static void main(String[] args) {
        Estrella sol = new Estrella("Sol");
        SistemaSolar sistemaSolar = new SistemaSolar(sol);

        Planeta tierra = new Planeta("Tierra");
        tierra.agregarSatelite(new Satelite("Luna", 27.3));

        Planeta marte = new Planeta("Marte");
        marte.agregarSatelite(new Satelite("Fobos", 0.3));
        marte.agregarSatelite(new Satelite("Deimos", 1.3));

        Planeta jupiter = new Planeta("Júpiter");
        jupiter.agregarSatelite(new Satelite("Ganímedes", 7.15));
        jupiter.agregarSatelite(new Satelite("Calisto", 16.69));

        Planeta saturno = new Planeta("Saturno");
        saturno.agregarSatelite(new Satelite("Titán", 15.95));
        saturno.agregarSatelite(new Satelite("Rea", 4.52));

        Planeta urano = new Planeta("Urano");
        urano.agregarSatelite(new Satelite("Titania", 8.71));
        urano.agregarSatelite(new Satelite("Oberón", 13.46));

        sistemaSolar.agregarPlaneta(tierra);
        sistemaSolar.agregarPlaneta(marte);
        sistemaSolar.agregarPlaneta(jupiter);
        sistemaSolar.agregarPlaneta(saturno);
        sistemaSolar.agregarPlaneta(urano);

        System.out.println(sistemaSolar);
    }
}
