import java.util.Scanner;

public class PruebaAlumno {
    public static void main(String[] args) {
 String nom="", apaterno="", amaterno="", sex="", dir="";
 int ed=0;
 
 Alumno A1= new Alumno();
 Alumno A2= new Alumno();
 
 Scanner tec= new Scanner(System.in);
 
 for(int x=1;x<=2;x++){
 System.out.println("Nombre del Alumno: " +x);
 nom=tec.nextLine();
 System.out.println("Apellido Paterno:");
 apaterno=tec.nextLine();
 System.out.println("Apellido Materno:");
 amaterno=tec.nextLine();
 System.out.println("Sexo: ");
 sex=tec.nextLine();
 System.out.println("Dirección: ");
 dir=tec.nextLine();
 System.out.println("Edad: ");
 ed=tec.nextInt(); tec.nextLine();

 A1.altaAlumnos(nom, apaterno, amaterno, sex, dir, ed);
 A1.listarDatos();
 A2.altaAlumnos(nom, apaterno, amaterno, sex, dir, ed);
 A2.listarDatos();
 
 }
 tec.close();

 }

}


