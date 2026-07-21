import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner (System.in);

        System.out.println("ingrese su nombre:");
        var nombre = sc.nextLine();

        System.out.println("ingrese su edad:");
        var edad = sc.nextInt();

        System.out.println("ingrese valor doube:");
        var valorDouble = sc.nextDouble();

        System.out.print("Ingrese su edad: ");
        
int edadUsuario = sc.nextInt(); // Lee un entero

System.out.print("Ingrese su salario: ");
double salarioUsuario = sc.nextDouble(); // Lee un double

sc.nextLine(); // Consume el salto de línea pendiente

System.out.print("Ingrese su nombre completo: ");
String nombreUsuario = sc.nextLine(); // Lee una línea completa de texto

System.out.println("Hola " + nombreUsuario + ", tienes " + edadUsuario + " años y ganas " + salarioUsuario);

sc.close(); // Es buena práctica cerrar el Scanner cuando ya no lo necesites






        



    }
}
