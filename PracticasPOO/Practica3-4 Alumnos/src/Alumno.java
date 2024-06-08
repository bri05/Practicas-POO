public class Alumno {
    String nombre;
    String apellidopaterno; 
    String apellidomaterno; 
    String sexo;
    String direccion;
    int edad;

    public void listarDatos(){
        System.out.println("Datos del Alumno ");
        System.out.println("Nombre: "+ nombre);
        System.out.println("Apellido paterno: " + apellidopaterno);
        System.out.println("Apellido Materno: "+ apellidomaterno);
        System.out.println("Sexo: "+ sexo);
        System.out.println("Dirección: "+ direccion);
        System.out.println("Edad: "+ edad);
        }
        public void altaAlumnos(String nom,String apaterno,String amaterno,
        String sex, String dir, int ed) {
        nombre=nom;
        apellidopaterno=apaterno;
        apellidomaterno=amaterno;
        sexo=sex;
        direccion=dir;
        edad=ed;
        }
       }
       


