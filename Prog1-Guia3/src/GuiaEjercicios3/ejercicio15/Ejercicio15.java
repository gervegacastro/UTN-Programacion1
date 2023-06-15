package GuiaEjercicios3.ejercicio15;
import java.util.Scanner;

/*
Hacer un programa para ingresar 5 números, luego informar los 2 mayores valores
ingresados, aclarando cual es el máximo y cual el que le sigue.
Ejemplo: 10, 8, 12, 14, 3 el resultado será 14 y 12.
Ejemplo: 14, 8, 12, 14 ,3 el resultado será 14 y 14.
Ejemplo: -4, -8, -12, -20, -2 el resultado será -2 y -4
 */
public class Ejercicio15 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese 5 numeros enteros");

        int maximo1 = Integer.MIN_VALUE;
        int maximo2 = Integer.MIN_VALUE;

        for (int i = 0; i < 5; i = i + 1) {
            int numero = scanner.nextInt();
            if (numero > maximo1) {
                maximo2 = maximo1;
                maximo1 = numero;
            } else if (numero >= maximo2) {
                maximo2 = numero;
            }
        }

        System.out.println("El numero mayor es: " + maximo1 + " y el que sigue es: " + maximo2);


    }
}
