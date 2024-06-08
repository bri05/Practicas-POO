import Repaso.Usuario;

public class Empleado extends Usuario {
    int nTarjeta, antiguedad;
    String departamento;

    public Empleado() {
        System.out.println("Se ha creado un empleado");
    }

    public Empleado(int id_us, int nTarjeta, int antiguedad, String usuario, String contrasena, String departamento) {
        this.id_us = id_us;
        this.nTarjeta = nTarjeta;
        this.antiguedad = antiguedad;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.departamento = departamento;
    }

    public String iniciar() {
        System.out.println("El empleado con el número de tarjeta " + this.nTarjeta + " a iniciado sesión");
        String sesion = "true";
        this.id_us = 1;
        return sesion;
    }

}
