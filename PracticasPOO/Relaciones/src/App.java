import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Comparaciones comparacion = new Comparaciones(1, 5);
        System.out.println(comparacion.esMayorQue());
        System.out.println(comparacion.esMenorQue());
        System.out.println(comparacion.esIgualQue());

        System.out.println("-----");
        Comparaciones comparacion2 = new Comparaciones();
        Scanner numeros = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        comparacion2.num1 = numeros.nextInt();

        System.out.println("Ingrese el segundo número: ");
        comparacion2.num2 = numeros.nextInt();

        System.out.println(comparacion2.esMayorQue());
        System.out.println(comparacion2.esMenorQue());
        System.out.println(comparacion2.esIgualQue());
    }
}
