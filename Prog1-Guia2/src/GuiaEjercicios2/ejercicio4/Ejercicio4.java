package GuiaEjercicios2.ejercicio4;
import java.util.Scanner;

/*
Hacer un programa para ingresar por teclado dos números y luego informar por pantalla la
diferencia absoluta entre ambos.
Ejemplo 1: Si se ingresan 3 y 8, se emite 5. Si se ingresan 8 y 3, se emite 5.
Ejemplo 2: Si se ingresan -3 y 9, se emite 12. Si se ingresan -12 y -1, se emite 11.
 */
public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese dos numero enteros: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if (num1 >= num2) {
            int resultado = num1 - num2;
            System.out.println(resultado);
        } else {
            int resultado = num2 - num1;
            System.out.println(resultado);
        }


    }
}
