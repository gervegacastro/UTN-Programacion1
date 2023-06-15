package GuiaEjercicios3.ejercicio5;

import java.util.Scanner;

/*
Hacer un programa para que el usuario ingrese dos números y luego el programa
muestre por pantalla los números entre el menor y el mayor de ambos.
Ejemplo, si el usuario ingresa 3 y 15, se mostrarán los números entre el 3 y el 15; y si el
usuario ingresa 25 y 8, se mostrarán los números entre el 8 y el 25.
 */
public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese dos numeros enteros: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        while (num1 < (num2 - 1)) {
            num1 = num1 + 1;
            System.out.println(num1);
        }
        while (num2 < (num1 - 1)) {
            num2 = num2 + 1;
            System.out.println(num2);
        }

    }
}
