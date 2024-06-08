public class Persona {
    String nombre, domicilio, telefono, curp, rfc;
    int edad;

    public Persona(){
        System.out.println("Se ha registrado una persona");
    }

    public Persona(String nombre, String domicilio, String telefono, String curp, String rfc, int edad){
        this.nombre = nombre;
        this.domicilio = domicilio;
        this. telefono = telefono;
        this.curp = curp;
        this.rfc = rfc;
        this.edad = edad;

    }

    public void CalcularSueldoNeto(){
        System.out.println("Método para calcular el sueldo neto de un trabajador: ");
    }

}
