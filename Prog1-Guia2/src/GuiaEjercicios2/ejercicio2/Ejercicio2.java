package GuiaEjercicios2.ejercicio2;
import java.util.Scanner;

/*
Hacer un programa para ingresar por teclado dos números y luego informar por pantalla
con un cartel aclaratorio si el primer número es múltiplo del segundo
 */
public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese dos numeros enteros: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if (num1 % num2 == 0) {
            System.out.println("El " + num1 + " es multiplo de " + num2);
        } else {
            System.out.println("No son multiplos");
        }

    }


}
