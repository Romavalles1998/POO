package Libreria;

class Autor {
    String cod_aut;
    public Autor(String cod_aut) {
        this.cod_aut = cod_aut;
    }

}

class Libro {
    String isbn;
    String cod_t;
    Editorial editorial;

    public Libro(String isbn, String cod_t, Editorial editorial) {
        this.isbn = isbn;
        this.cod_t = cod_t;
        this.editorial = editorial;
    }
}

class Editorial {
    String cod_ed;
    public Editorial(String cod_ed) {
        this.cod_ed = cod_ed;
    }
}

class Ejemplar {
    Libro libro;
    String n_reg;

    public Ejemplar(Libro libro, String n_reg) {
        this.libro = libro;
        this.n_reg = n_reg;
    }
}

class Lector {
    String dni;
    public Lector(String dni) {
        this.dni = dni;
    }
}

class Historico {
    Lector lector;
    Ejemplar ejemplar;
    String data_p;
    String data_t;

    public Historico(Lector lector, Ejemplar ejemplar, String data_p, String data_t) {
        this.lector = lector;
        this.ejemplar = ejemplar;
        this.data_p = data_p;
        this.data_t = data_t;
    }
}

