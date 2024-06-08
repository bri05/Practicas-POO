import javax.swing.JOptionPane;

public class EmpleadoOperativo extends Persona {
    float sueldoBase, horasTrabajadas, precioHora;

    public EmpleadoOperativo() {
        System.out.println("Se ha registrado un empleado operativo");
    }

    public EmpleadoOperativo(String nombre, String domicilio, String telefono, String curp, String rfc, int edad,
            float sueldoBase, float horasTrabajadas, float precioHora) {
        super.nombre = nombre;
        super.domicilio = domicilio;
        super.telefono = telefono;
        super.curp = curp;
        super.rfc = rfc;
        super.edad = edad;
        this.sueldoBase = sueldoBase;
        this.horasTrabajadas = horasTrabajadas;
        this.precioHora = precioHora;
    }

        public void listarDatos(){
        JOptionPane.showMessageDialog(null, "Datos del Empleado \n"
        +"Nombre: "+ nombre+"\n Domicilio: " + domicilio
        +"\n Teléfono: "+ telefono
        +"\n CURP: "+ curp
        +"\n RFC: "+ rfc
        +"\n Edad: "+ edad
        +"\n Sueldo Base: "+ sueldoBase
        +"\n Horas Trabajadas: "+ horasTrabajadas
        +"\n Precio por Hora: "+ precioHora);
        } 




}
