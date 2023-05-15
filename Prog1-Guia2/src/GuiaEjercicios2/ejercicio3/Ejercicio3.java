package GuiaEjercicios2.ejercicio3;
import java.util.Scanner;

/*
Hacer un programa para ingresar por teclado un número y luego informar por pantalla con
un cartel aclaratorio si el mismo es par o impar.
 */
public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("El n° es par");
        } else {
            System.out.println("El n° es impar");
        }

    }
}
