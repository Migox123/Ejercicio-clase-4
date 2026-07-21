import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
          
        Scanner sc = new Scanner (System.in);
/* 
        System.out.println("ingrese su nombre:");
        var nombre = sc.nextLine();

        System.out.println("ingrese su edad:");
        var edad = sc.nextInt();

        System.out.println("ingrese valor doube:");
        var valorDouble = sc.nextDouble();
        */



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

public class App {
    public static void ejemploConversion(String[] args) {
        int cantidad =  5;
        int total = 4;
        =total/Cantidad; // División entera
        int promedio = total / cantidad; // División entera
        System.out.println("Promedio: " + promedio);

    }

    // situacion 1 conversion implicita
    int numeroEntero = 10;
    double numeroDouble = numeroEntero;     // Conversión implícita de int a double
    Sout.println("Número entero: " + numeroEntero);



public static void ejemploScanner() {
    Scanner sc = new Scanner(System.in);

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


public static void ejemploRelacionales() {
    int a = 10;
    int b = 5;

    System.out.println(a > b ); // true
    system.out.println(a < b ); // false
    System.out.println(a >= b );    // true
    System.out.println(a <= b ); // false
    System.out.println(a == b );// false
    System.out.println(a != b );    // true

    
}