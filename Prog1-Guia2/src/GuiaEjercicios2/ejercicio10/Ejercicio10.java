package GuiaEjercicios2.ejercicio10;
import java.util.Scanner;

/*
Hacer un programa para ingresar cinco números y listar el máximo de ellos.
 */
public class Ejercicio10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa cinco numeros: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        int num5 = scanner.nextInt();

        int max = num1;

        if (num2 > num1) {
            max = num2;
        }
        if (num3 > num2) {
            max = num3;
        }
        if (num4 > num3) {
            max = num4;
        }
        if (num5 > num4) {
            max = num5;
        }

        System.out.println("El maximo es: " + max);

    }
}
