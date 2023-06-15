package GuiaEjercicios3.ejercicio9;
import java.util.Scanner;

/*
Hacer un programa para ingresar una lista de 10 números, luego informar el máximo y
la posición del máximo en la lista. En caso de “empates” considerar la primera aparición.
Ejemplo: 5, -10, 20, 8, 25, 13, 35, -8, -5, 20. Se listará Máximo 35 Posición 7.
Ejemplo: 5, -10, 20, 8, 25, 13, 55, -8, 55, 20. Se listará Máximo 55 Posición 7.
 */
public class Ejercicio9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese 10 numeros enteros");

        int[] numeros = new int[10];
        int maximo = 0;
        int posicion = numeros[0];

        for (int i = 0; i < 10; i = i + 1) {
            numeros[i] = scanner.nextInt();
            if (numeros[i] > maximo) {
                maximo = numeros[i];
                posicion = i + 1;
            }
        }


        System.out.println("El numero máximo es: " + maximo);
        System.out.println("Su posicion en la lista es: " + posicion);

    }
}
