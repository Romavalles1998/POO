package reinoAnimal;

abstract class Mamifero extends Animal {
    public Mamifero(String nombre) { super(nombre);
    }

    public void mamar() {
        System.out.println(nombre + " está mamando.");
    }
}

class Perro extends Mamifero {
    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void comunicarse() { System.out.println(nombre + " hace guau");
    }
    @Override
    public void comer() { System.out.println(nombre + " Es carnívoro, por lo tanto le gusta comer carne");
    }

    @Override
    public void alimentacion() {
        System.out.println(nombre + " Su alimentación se basa en:  Carne, Pienso, Envasados");

    }

    @Override
    public void moverse() {
        System.out.println(nombre + " corre a 4 patas");
    }
}

class Gato extends Mamifero {
    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public void comunicarse() {
        System.out.println(nombre + " hace miau");
    }

    @Override
    public void comer() { System.out.println(nombre + "Es carnívoro, por lo tanto le gusta comer carne");
    }

    @Override
    public void alimentacion() {  System.out.println(nombre + " Su alimentación se basa en:  Carne, Pienso, Envasados");
    }

    @Override
    public void moverse() {
        System.out.println(nombre + " se mueve sigilosamente a 4 patas");
    }
}

class Capybara extends Mamifero {
    public Capybara(String nombre) { super(nombre);
    }

    @Override
    public void comunicarse() {
        System.out.println(nombre + " hace brrrr");
    }

    @Override
    public void comer() { System.out.println(nombre + " Es herbívoro, por lo tanto le gusta comer vegetales");
    }

    @Override
    public void alimentacion() {  System.out.println(nombre + " Su alimentación se basa en: Hierbas palustres, gramíneas y hiervas ribereñas");

    }

    @Override
    public void moverse() {
        System.out.println(nombre + " se mueve con poca energía a 4 patas");
    }

}

abstract class Pez extends Animal {
    public Pez(String nombre) {
        super(nombre);
    }

    @Override
    public void moverse() {
        System.out.println(nombre + " respira por las branquias");
    }
}

class Tiburon extends Pez {
    public Tiburon(String nombre) {
        super(nombre);
    }

    @Override
    public void comunicarse() { System.out.println(nombre + " su manera de caminar es nadando");
    }

    @Override
    public void comer() { System.out.println(nombre + " Es carnívoro, por lo tanto le gusta comer carne");
    }

    @Override
    public void alimentacion() {  System.out.println(nombre + " Su alimentación se basa en:  Peces óseos, pinnípedos, cetáceos, cefalópodos y crustáceos");

    }
}
class Delfin extends Pez {
    public Delfin(String nombre) {
        super(nombre);
    }

    @Override
    public void comunicarse() {
        System.out.println(nombre + " hace acacacac");
    }

    @Override
    public void comer() { System.out.println(nombre + " Es carnívoro, por lo tanto le gusta comer carne");
    }

    @Override
    public void alimentacion() {  System.out.println(nombre + " Su alimentación se basa en:  Arenque, bacalao, macarela o cefalópodos");

    }

    @Override
    public void moverse(){ System.out.println(nombre + "nada sin parar");
    }
}


