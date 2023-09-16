/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto;
import java.util.Scanner;

/**
 *
 * @author sebig
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el capital inicial: ");
        double capitalInicial = scanner.nextDouble();
        ControlInversiones control = new ControlInversiones(capitalInicial);
        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1. Realizar inversión");
            System.out.println("2. Calcular ganancias");
            System.out.println("3. Aumentar capital");
            System.out.println("4. Disminuir capital");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el monto de la inversión: ");
                    double montoInversion = scanner.nextDouble();
                    control.realizarInversion(montoInversion);
                    break;
                case 2:
                    System.out.print("Ingrese la tasa de interés (%): ");
                    double tasaInteres = scanner.nextDouble();
                    control.calcularGanancias(tasaInteres);
                    break;
                case 3:
                    System.out.print("Ingrese el monto a aumentar: ");
                    double montoAumento = scanner.nextDouble();
                    control.aumentarCapital(montoAumento);
                    break;
                case 4:
                    System.out.print("Ingrese el monto a disminuir: ");
                    double montoDisminucion = scanner.nextDouble();
                    control.disminuirCapital(montoDisminucion);
                    break;
                case 5:
                    System.out.println("Gracias por utilizar el programa.");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
