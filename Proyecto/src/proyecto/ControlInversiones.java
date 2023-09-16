/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author sebig
 */
public class ControlInversiones {

    private double capital;
    private double inversiones;
    private double ganancias;

    public ControlInversiones(double capitalInicial) {
        this.capital = capitalInicial;
        this.inversiones = 0;
        this.ganancias = 0;
    }

    public void realizarInversion(double monto) {
        if (monto > 0 && monto <= capital) {
            inversiones += monto;
            capital -= monto;
            System.out.println("Inversión exitosa. Inversiones totales: " + inversiones);
        } else {
            System.out.println("Monto inválido o insuficiente.");
        }
    }

    public void calcularGanancias(double tasaInteres) {
        ganancias = inversiones * (tasaInteres / 100);
        System.out.println("Ganancias acumuladas: " + ganancias);
    }

    public void aumentarCapital(double monto) {
        if (monto > 0) {
            capital += monto;
            System.out.println("Capital aumentado. Nuevo capital: " + capital);
        } else {
            System.out.println("Monto inválido.");
        }
    }

    public void disminuirCapital(double monto) {
        if (monto > 0 && monto <= capital) {
            capital -= monto;
            System.out.println("Capital disminuido. Nuevo capital: " + capital);
        } else {
            System.out.println("Monto inválido o insuficiente.");
        }
    }
 }