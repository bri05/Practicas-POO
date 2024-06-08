package ejemploExcepciones;

public class Lanzadora {
    void lanzaSiNegativo(int param) throws miExcepcion {
        if (param < 0)
            throw new miExcepcion("Numero negativo");
    }
}
