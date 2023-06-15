package GuiaEjercicios3.ejercicio13;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Dada una lista de 7 números informar cual es el primer y último número impar
ingresado.
Ejemplo 8, 4, -5, 6, 9, 5, 18 se informa -5 y 5
 */
public class Ejercicio13 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese 7 numeros enteros");

        List<Integer> impares = new ArrayList<>();

        for (int i = 0; i < 7; i = i + 1){
            int numero = scanner.nextInt();
            if (numero % 2 != 0) {
                impares.add(numero);
            }
        }

        System.out.println("El primer numero impar es: " + impares.get(0));
        System.out.println("EL último numero impar es: " + impares.get(impares.size()-1));

    }
}
