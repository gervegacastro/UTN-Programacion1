package GuiaEjercicios1.ejercicio5;

import java.util.Scanner;

/*
Un comercio vende tres marcas de alfajores distintas A, B y C.
Hacer un programa para ingresar por teclado la cantidad de alfajores vendidos de cada una de
las tres marcas y luego se informe el porcentaje de ventas para cada una de ellas.
Ejemplo. Si se ingresa 100, 25 y 75 como cantidades vendidas entonces el programa calculará
e informará A: 50%, B: 12,50% y C: 37,50%
 */
public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad vendida de alfajores A: ");
        double A = scanner.nextDouble();
        System.out.println("Ingrese la cantidad vendida de alfajores B: ");
        double B = scanner.nextDouble();
        System.out.println("Ingrese la cantidad vendida de alfajores C: ");
        double C = scanner.nextDouble();

        double resultadoA = porcentajeVentasA(A, B, C);
        double resultadoB = porcentajeVentasB(A, B, C);
        double resultadoC = porcentajeVentasC(A, B, C);
        System.out.println("El porcentaje de venta de alfajores A es: " + resultadoA + "%");
        System.out.println("El porcentaje de venta de alfajores B es: " + resultadoB + "%");
        System.out.println("El porcentaje de venta de alfajores C es: " + resultadoC + "%");


    }
    public static double porcentajeVentasA (double A, double B, double C) {
        double totalVentas = A + B + C;
        double totalVentasA = (A / totalVentas) * 100;
        return totalVentasA;
    }

    public static double porcentajeVentasB (double A, double B, double C) {
        double totalVentas = A + B + C;
        double totalVentasB = (B / totalVentas) * 100;
        return totalVentasB;
    }

    public static double porcentajeVentasC (double A, double B, double C) {
        double totalVentas = A + B + C;
        double totalVentasC = (C / totalVentas) * 100;
        return totalVentasC;
    }
}
