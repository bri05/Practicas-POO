public class App {
    public static void main(String[] args) throws Exception {
        Guitarra guitarraElectrica = new Guitarra();
        Piano pianoCola = new Piano();
        Violin violinCuerdas = new Violin();

        guitarraElectrica.tocarInstrumento();
        pianoCola.tocarInstrumento();
        violinCuerdas.tocarInstrumento();
        

    }
}
