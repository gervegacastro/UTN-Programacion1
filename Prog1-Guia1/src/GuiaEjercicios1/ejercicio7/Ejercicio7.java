package GuiaEjercicios1.ejercicio7;

import java.util.Scanner;

/*
Hacer un programa para ingresar por teclado el importe de una venta y el porcentaje de
descuento aplicada a la misma y luego informar por pantalla el importa a pagar.
Ejemplo 1. Si el importe de la venta es $ 1.200 y el descuento es el 15% entonces el total a
pagar será de $ 1.020.
Ejemplo 2. Si el importe de la venta es $ 800 y el descuento es el 0% entonces el total a pagar
será de $ 800.
 */
public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el importe de la venta");
        double precio = scanner.nextDouble();

        System.out.println("Ingrese el porcentaje de descuento");
        double descuento = scanner.nextDouble();

        double importeFinal = importeFinal(precio, descuento);
        System.out.println("El importe final es de: " + importeFinal);

    }

    public static double importeFinal (double precio, double descuento) {
        double desc = (precio * descuento) / 100;
        return precio - desc;
    }
}
