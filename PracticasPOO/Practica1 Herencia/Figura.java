public class Figura {
    String nombre;
    double area;

    public Figura() {
        System.out.println("Se creo una figura");
    }

    public Figura(String nom, double a) {
        this.nombre = nom;
        this.area = a;
    }

    public void Area() {
        System.out.println("El area de la figura "+nombre+" es: "+area);
    }

    public void DibujarFigura() {
        System.out.println("Dibujando figura "+nombre);
    }
    
}
