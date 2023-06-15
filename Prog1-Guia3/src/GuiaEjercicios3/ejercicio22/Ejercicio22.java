package GuiaEjercicios3.ejercicio22;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Dada una lista de 10 números informar la cantidad de duplas de números impares
consecutivos.
Ejemplo: 12, 3, 5, 7, 6, 9, 13, 10, 7, -5. En esta lista las duplas son: 3:5, 5:7, 9:13, 7:-5 por
lo tanto se informará que hay 4 duplas de números impares consecutivos.
 */
public class Ejercicio22 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar 10 numeros enteros");

        int[] numeros = new int[10];

        int posicion = 0;
        int impares = 0;
        //int duplas = impares / 2;

        for (int i = 0; i < numeros.length; i = i + 1) {
            numeros[i] = scanner.nextInt();
            if (numeros[i] % 2 != 0 && i == posicion || i == posicion + 1) {
                posicion = i;
                impares = impares + 1;
            }
        }

        // anda mal, da 9 en lugar de 7
        System.out.println("La cantidad de numeros impares es: " + impares);



    }
}
