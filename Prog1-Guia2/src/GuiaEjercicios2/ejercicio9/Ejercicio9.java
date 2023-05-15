package GuiaEjercicios2.ejercicio9;
import java.util.Scanner;

/*
Hacer un programa para ingresar tres números y listar el máximo de ellos.
 */
public class Ejercicio9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa 3 numeros enteros: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int max = num1;

        if (num2 > num1) {
            max = num2;
            if (num3 > num2) {
                max = num3;
            }
        }
        System.out.println("El numero maximo es: " + max);

    }
}
