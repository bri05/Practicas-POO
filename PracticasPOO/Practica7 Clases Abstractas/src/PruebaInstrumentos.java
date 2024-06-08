public class PruebaInstrumentos {
    public static void main(String arg[]){
        InstrumentosMusicales miGuitarra= new Guitarra();
        System.out.println("Instrumento : "+miGuitarra.tipoDeInstrumento);
        miGuitarra.tocarInstrumento();
        System.out.println();
 
        InstrumentosMusicales miPiano= new Piano();
        System.out.println("Instrumento : "+miPiano.tipoDeInstrumento);
        miPiano.tocarInstrumento();
        System.out.println();
 
        InstrumentosMusicales miViolin= new Violin();
        System.out.println("Instrumento : "+miViolin.tipoDeInstrumento);
        miViolin.tocarInstrumento();
       }
       
}
