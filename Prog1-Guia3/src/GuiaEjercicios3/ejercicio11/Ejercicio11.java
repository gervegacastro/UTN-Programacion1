package GuiaEjercicios3.ejercicio11;
import java.util.*;
/*
Hacer un programa para ingresar una lista 10 números e informar el máximo de los
negativos y el mínimo de los positivos.
Ejemplo: 5, 8, 12, 2, -10, 15, -20, 8, -3, 24. Máximo Negativo -3. Mínimo Positivo 2
 */
public class Ejercicio11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese 10 numeros");

        int[] numeros = new int[4];
        int minimoPositivo = Integer.MAX_VALUE;
        int maximoNegativo = Integer.MIN_VALUE;

        for (int i = 0; i < 4; i = i + 1){
            numeros[i] = scanner.nextInt();
            if (numeros[i] < minimoPositivo && numeros[i] >= 0) {
                minimoPositivo = numeros[i];
            } else if (numeros[i] > maximoNegativo && numeros[i] < 0){
                maximoNegativo = numeros[i];
            }
        }

        System.out.println(minimoPositivo);
        System.out.println(maximoNegativo);

    }

}

