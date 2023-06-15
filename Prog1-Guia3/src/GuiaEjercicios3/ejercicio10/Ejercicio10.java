package GuiaEjercicios3.ejercicio10;

import java.util.Scanner;

/*
Hacer un programa para ingresar una lista de 10 números, luego informar el máximo y
el mínimo.
Ejemplo: 10, 20, -5, 30,-15, 5, 42, 0, 22, -13. Se listará Máximo 42 Mínimo -15.
Ejemplo: 10, 20, 5, 30, 15, 5, 42, 8, 22, 13. Se listará Máximo 42 Mínimo 5.
Ejemplo: -10, -20, -5, -30, -15, -12, -42, -8, -22, -13. Se listará Máximo -5 Mínimo -42.
Observe que los tres ejemplos dejan en claro que la idea de que el máximo
“seguramente” es un positivo y el mínimo “seguramente” es un negativo, queda
totalmente descartada.
 */
public class Ejercicio10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar 10 numeros enteros");

        int[] numeros = new int[10];
        int maximo = numeros[0];
        int minimo = numeros[0];

        for (int i = 0; i < 10; i = i + 1) {
            numeros[i] = scanner.nextInt();
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
        }

        System.out.println("El numero maximo es: " + maximo);
        System.out.println("El numero minimo es: " + minimo);
    }
}
