import Repaso.Usuario;

public class Main {

    public static void main(String[] args){
        Usuario usuario = new Usuario();
        Usuario usuario1 = new Usuario("admin", "admin");
        Usuario usuario2 = new Usuario("admin");
        usuario.iniciar("admin");
        usuario.cerrar();
        Usuario usuario2 = new Usuario();
        usuario2.usuario = "admin";

    }

    
    
}
