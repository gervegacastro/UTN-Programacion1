package GuiaEjercicios3.ejercicio8;
import java.util.Scanner;

/*
Hacer un programa para ingresar una lista de 10 números, luego informar el máximo.
Ejemplo: 5, 10, 20, 8, 25, 13, 35, -8, -5, 20. Se listará Máximo 35.
Ejemplo: 5, 10, 20, 8, 55, 13, 55, -8, -5, 20. Se listará Máximo 55.
 */
public class Ejercicio8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa 10 numeros enteros");

        int maximo = 0;

        for (int i = 0; i < 10; i = i + 1) {
            int num = scanner.nextInt();
            if (num > maximo) {
                maximo = num;
            }
        }
        System.out.println("El numero máximo es: " + maximo);

    }
}
