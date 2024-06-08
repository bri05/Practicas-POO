 package Repaso;
 public class Usuario {
    int id_us;
    String usuario, contrasena;

    public Usuario(){
        System.out.println("Se ha creado un usuario");
    }

    public Usuario(String usuario){
        this.usuario = usuario;
    }

    public Usuario(String usuario, String contraseña){
        this.usuario = usuario;
        this.contrasena = contraseña;
    }

    public String iniciar(String usuario){
        System.out.println("Se ha iniciado sesión con el usuario"+usuario);
        String sesion = "true";
        this.id_us = 1;
        return sesion;
    }
    public void cerrar(){
        System.out.println("Cerrando sesión");

    }
    
    public static void main(String[] args){
        Usuario usuario = new Usuario();
        usuario.iniciar("admin");
        usuario.cerrar();

    }
}
