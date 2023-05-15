package GuiaEjercicios2.ejercicio11;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Hacer un programa para ingresar cinco números y listar cuántos de esos cinco números
son positivos.
 */
public class Ejercicio11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese cinco numeros enteros: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        int num5 = scanner.nextInt();

        int contador = 0;

        if (num1 > 0) {
            contador = contador + 1;
        }
        if (num2 > 0) {
            contador = contador + 1;
        }
        if (num3 > 0) {
            contador = contador + 1;
        }
        if (num4 > 0) {
            contador = contador + 1;
        }
        if (num5 > 0) {
            contador = contador + 1;
        }

        System.out.println("La cantidad de numeros ingresado positivos es: " + contador);

    }
}
