public class EmpleadoAdministrativo extends Persona {
    float sueldoBase, isr;

    public EmpleadoAdministrativo() {
        System.out.println("Se ha registrado un empleado administrativo");
    }

    public EmpleadoAdministrativo(String nombre, String domicilio, String telefono, String curp, String rfc, int edad,
            float sueldoBase, float sueldoNeto, float isr) {
        super.nombre = nombre;
        super.domicilio = domicilio;
        super.telefono = telefono;
        super.curp = curp;
        super.rfc = rfc;
        super.edad = edad;
        this.sueldoBase = sueldoBase;
        this.isr = isr;

    }

    public void AltaTrabajdor(String nombre, String domicilio, String telefono, String curp, String rfc, int edad,
            float sueldoBase, float sueldoNeto, float isr) {
        super.nombre = nombre;
        super.domicilio = domicilio;
        super.telefono = telefono;
        super.curp = curp;
        super.rfc = rfc;
        super.edad = edad;
        this.sueldoBase = sueldoBase;
        this.isr = isr;

    }

    public float CalcularSueldoNeto(float sueldoBase, float isr) {
        float sueldoNeto = sueldoBase - isr;
        return sueldoNeto;

    }

}
