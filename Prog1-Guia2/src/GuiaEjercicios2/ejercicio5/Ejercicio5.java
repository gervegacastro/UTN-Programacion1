package GuiaEjercicios2.ejercicio5;
import java.util.Scanner;

/*
Un negocio de perfumería efectúa descuentos según el importe de la venta.
- Si el importe es menor a $100 aplicar un descuento del 5%
- Si el importe es entre $100 y hasta $500 aplicar un descuento del 10%
- Si el importe es mayor a $500 aplicar un descuento del 15%
Hacer un programa donde se ingresa el importe original sin descuento y que se informe por
pantalla el importe con el descuento ya aplicado
 */
public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el importe de su compra: ");
        double importe = scanner.nextDouble();

        if (importe < 100) {
            double descuento = importe - (importe * 0.05);
            System.out.println("Tiene un descuento de un 5%. El precio final es: " + descuento);
        }
        if (importe >= 100 && importe < 500) {
            double descuento = importe - (importe * 0.1);
            System.out.println("Tiene un descuento de un 10%. El precio final es: " + descuento);
        }
        if (importe >= 500) {
            double descuento = importe - (importe * 0.15);
            System.out.println("Tiene un descuento de un 15%. El precio final es: " + descuento);
        }






    }
}
