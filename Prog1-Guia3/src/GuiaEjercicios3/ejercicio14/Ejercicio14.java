package GuiaEjercicios3.ejercicio14;
import java.util.Scanner;

/*
Hacer un programa para ingresar una lista de 8 números y luego informar si todos están
ordenados en forma creciente. En caso de haber dos números “empatados” considerarlos
como crecientes.
Por ejemplo si la lista fuera:
Ejemplo 1: -10, 1, 5, 7, 15, 18, 20, 23 se emitirá un cartel: “Conjunto Ordenado”
Ejemplo 2: 10, 10, 15, 20, 25, 25, 28, 33 se emitirá un cartel: “Conjunto Ordenado”
Ejemplo 3: 10, 1, 15, 7, -15, 18, 20, 23 se emitirá un cartel: “Conjunto No Ordenado”
 */
public class Ejercicio14 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese 8 numeros enteros");
        int[] numeros = new int[8];
        int numeroMenor = numeros[0];

        for (int i = 0; i < 8; i = i + 1){
            numeros[i] = scanner.nextInt();
            if (numeros[i] >= numeroMenor) {
                numeroMenor = numeros[i];
            }
        }
        if (numeroMenor == numeros[7]){
            System.out.println("Conjunto ordenado");
        } else {
            System.out.println("Conjunto No ordenado");
        }
    }
}
