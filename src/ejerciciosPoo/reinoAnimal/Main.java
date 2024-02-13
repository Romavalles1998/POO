package reinoAnimal;

public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro("Firulais");
        Gato gato = new Gato("Misifu");
        Tiburon tiburon = new Tiburon("Tiburoncin");
        Capybara capybara = new Capybara("Ignacio");
        Delfin delfin = new Delfin("Pinocco");

        System.out.println();
        perro.moverse();
        perro.comunicarse();
        perro.mamar();
        perro.comer();
        perro.alimentacion();
        System.out.println();
        gato.moverse();
        gato.comunicarse();
        gato.mamar();
        gato.comer();
        gato.alimentacion();
        System.out.println();
        capybara.comunicarse();
        capybara.moverse();
        capybara.comer();
        capybara.alimentacion();
        System.out.println();
        tiburon.moverse();
        tiburon.comunicarse();
        tiburon.comer();
        tiburon.alimentacion();
        System.out.println();
        delfin.comunicarse();
        delfin.moverse();
        delfin.comer();
        delfin.alimentacion();
    }
}
