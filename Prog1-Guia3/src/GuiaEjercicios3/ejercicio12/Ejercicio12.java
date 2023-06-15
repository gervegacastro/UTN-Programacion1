package GuiaEjercicios3.ejercicio12;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Dada una lista de 7 números informar cual es el primer y segundo número impar
ingresado.
Ejemplo 8, 4, 5, 6, -9, 5,7 se informa 5 y -9.
 */
public class Ejercicio12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese 7 numeros enteros");

        int[] numeros = new int[7];
        List<Integer> impares = new ArrayList<>();

        for (int i = 0; i < 7; i = i + 1) {
            numeros[i] = scanner.nextInt();
            if (numeros[i] % 2 != 0) {
                impares.add(numeros[i]);
            }
        }

        System.out.println("El primer numero impar es: " + impares.get(0));
        System.out.println("El segundo numero impar es: " + impares.get(1));


    }
}
