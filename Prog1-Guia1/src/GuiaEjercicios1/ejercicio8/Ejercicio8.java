package GuiaEjercicios1.ejercicio8;
import java.util.Scanner;

/*
Hacer un programa para ingresar por teclado el importe de una venta sin el descuento y el
importe de esa misma venta con el descuento aplicado y luego informar por pantalla el
porcentaje de descuento aplicada a la misma.
Ejemplo 1. Si el importe de la venta sin descuento es $ 1.500 y el importe de la venta con
descuento es $ 1.200 entonces el porcentaje de descuento aplicado fue el 20%.
 */
public class Ejercicio8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el precio inicial de la venta");
        double precioInicial = scanner.nextDouble();

        System.out.println("Ingrese el precio final de la venta");
        double precioFinal = scanner.nextDouble();

        double descuento = calcularDescuento(precioInicial, precioFinal);
        System.out.println("El descuento es de: " + descuento + "%");

    }

    public static double calcularDescuento (double precioInicial, double precioFinal) {
        double resultado = ((precioInicial - precioFinal) / precioInicial) * 100;
        return resultado;
    }
}
