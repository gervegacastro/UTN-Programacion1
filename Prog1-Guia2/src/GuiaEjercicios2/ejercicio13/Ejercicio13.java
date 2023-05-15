package GuiaEjercicios2.ejercicio13;
import java.util.Scanner;

/*
) Hacer un programa para leer tres números diferentes y determinar e informar el número
del medio. Ejemplo: si se ingresan 6, 10, 8, se emitirá 8.
 */
public class Ejercicio13 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar tres numeros enteros distintos");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if (num1 > num2 && num1 < num3 || num1 < num2 && num1 > num3) {
            System.out.println(num1);
        } else if (num2 > num1 && num2 < num3 || num2 < num1 && num2 > num3 ) {
            System.out.println(num2);
        } else {
            System.out.println(num3);
        }

    }
}
