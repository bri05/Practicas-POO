public class App {
    public static void main(String[] args) throws Exception {
        Aereo avion = new Aereo();
        Terrestre automovil = new Terrestre();
        Maritimo barco = new Maritimo();
        Espacial cohete = new Espacial();
        Quantico maquina = new Quantico();

        avion.elegirVehiculo();
        automovil.elegirVehiculo();
        barco.elegirVehiculo();
        cohete.elegirVehiculo();
        maquina.elegirVehiculo();
    }
}
