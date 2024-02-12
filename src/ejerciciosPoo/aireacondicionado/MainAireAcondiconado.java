package ejerciciosPoo.aireacondicionado;

public class MainAireAcondiconado {
    public static void main(String[] args) {
        Temperatura p1 = new Temperatura("Daison 3400", 30, 0,23);
        Temperatura p2 = new Temperatura("Cecotec 3900", 32, -4,21);
        Temperatura p3 = new Temperatura("Conga 4080", 28, -6,27);

        p3.subir();
        System.out.println(p3);
    }
}
