package ejemploExcepciones;

public class miExcepcion extends Exception {

    miExcepcion() {
        super();
    }

    miExcepcion(String cadena) {
        super(cadena);
    }
}
