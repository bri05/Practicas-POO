import javax.swing.JOptionPane;

public class PruebaEmpleado {
    public static void main(String[] args) {
        EmpleadoAdministrativo EA1 = new EmpleadoAdministrativo();
        EmpleadoOperativo EO1 = new EmpleadoOperativo();

        while (true) {
            int op = Integer.parseInt(JOptionPane.showInputDialog("Menú de opciones \n"
                    + "1.- Alta Empleado Administrativo\n"
                    + "2.- Cálculo de Sueldo Empleado Administrativo\n"
                    + "3.- Listar datos Empleado Operativo\n"
                    + "4.- Salir"));

            switch (op) {
                case 1:
                    // Códigos para dar de alta un empleado administrativo
                    String de = JOptionPane.showInputDialog("Domicilio del empleado: ");
                    String te = JOptionPane.showInputDialog("Telefono del empleado: ");
                    String ce = JOptionPane.showInputDialog("CURP del empleado: ");
                    String re = JOptionPane.showInputDialog("RFC del empleado: ");
                    int ee = Integer.parseInt(JOptionPane.showInputDialog("Edad del empleado: "));
                    float sbe = Float.parseFloat(JOptionPane.showInputDialog("Sueldo base del empleado: "));
                    float ise = Float.parseFloat(JOptionPane.showInputDialog("ISR del empleado: "));
                    EA1.AltaTrabajdor(re, de, te, ce, re, ee, ise, sbe, ise);
                    System.out.println("Empleado administrativo dado de alta");
                    break;
                case 2:
                    // Códigos para calcular el sueldo de un empleado administrativo
                    float sb = Float.parseFloat(JOptionPane.showInputDialog("Sueldo base del empleado: "));
                    float isr = sb * .32f;
                    JOptionPane.showMessageDialog(null,
                            "El sueldo neto del empleado es: " + EA1.CalcularSueldoNeto(sb, isr));
                    break;
                case 3:
                    // Códigos para listar los datos de un empleado operativo
                    EO1.listarDatos();
                case 4:
                    System.exit(0);

            }

        }
    }

}
