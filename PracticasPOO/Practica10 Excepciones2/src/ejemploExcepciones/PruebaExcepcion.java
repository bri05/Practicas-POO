package ejemploExcepciones;

import java.io.FileInputStream;

class PruebaException {
    public static void main(String[] args) {

        FileInputStream entrada = null;

        Lanzadora lanza = new Lanzadora();
        int leo;
        try {
            entrada = new FileInputStream("archivo.txt");
            while ((leo = entrada.read()) != -1) {

                lanza.lanzaSiNegativo(leo);
            }
            System.out.println("Se encontro un número negativo");
        } catch (miExcepcion e) {

            System.out.println("Excepción presentada: " + e.getMessage());

        } catch (Exception e) {

            System.out.println("Excepción presentada: " + e.getMessage());
        }
    }
}