package GuiaEjercicios2.ejercicio6;
import java.util.Scanner;

/*
Hacer un programa para ingresar por teclado tres números y luego determinar e informar
con una leyenda aclaratoria si los tres son iguales entre sí, caso contrario no emitir nada.
Ayuda: Si A es igual a B y B es igual a C, entonces A y C son iguales.
 */
public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese 3 numeros enteros: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if (num1 == num2 || num2 == num3) {
            System.out.println("Los numeros ingresados son inguales");
        }


    }
}
