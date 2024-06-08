public class Comparaciones implements EjemploInterfaces {
    int num1;
    int num2;

    public Comparaciones(){
        
    }

    public Comparaciones(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public boolean esMayorQue() {
        if (this.num1 <= this.num2) {
            return false;
        }
        return true;
    }

    public boolean esMenorQue() {
        if (this.num1 >= this.num2) {
            return false;
        }
        return true;
    }

    public boolean esIgualQue() {
        if (this.num1 != this.num2) {
            return false;
        }
        return true;
    }

}
