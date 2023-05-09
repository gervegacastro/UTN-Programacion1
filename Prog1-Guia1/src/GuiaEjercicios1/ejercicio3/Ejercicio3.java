package GuiaEjercicios1.ejercicio3;

import java.util.Scanner;

/*
Una concesionaria de autos paga a los vendedores un sueldo fijo de $ 15.000 más $ 2.000
de premio por cada auto vendido. Hacer un programa que permita ingresar por teclado la
cantidad de autos vendidos por un vendedor y luego informar por pantalla el sueldo total a
pagar.
Ejemplo. Si la cantidad de autos vendidos fuera 4 entonces el sueldo total a pagar es de
$ 23.000.
 */
public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int fijo = 15000;
        int premio = 2000;
        System.out.println("Ingrese la cantidad de autos vendidos : ");
        int cantidadAutos = scanner.nextInt();
        int resultado = sueldoTotal(fijo, premio, cantidadAutos);

        System.out.println("El sueldo total es --> " + resultado);

    }

    public static int sueldoTotal (int fijo, int premio, int cantidadAutos) {
        int resultado = fijo + (premio * cantidadAutos);
        return resultado;
    }
}
