package GuiaEjercicios3.ejercicio7;

import java.util.Scanner;

/*
Hacer un programa para ingresar una lista de 10 números, luego informar cuántos son
positivos, cuántos son negativos, y cuántos iguales a cero.
 */
public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa 10 numeros enteros: ");

        int positivo = 0;
        int negativo = 0;
        int cero = 0;

        for (int i = 0; i < 10; i = i +1){
            int num = scanner.nextInt();
            if (num > 0) {
                positivo = positivo + 1;
            } else if (num < 0) {
                negativo = negativo + 1;
            } else if (num == 0) {
                cero = cero + 1;
            }
        }
        System.out.println("La cantidad de n° positivos es: " + positivo);
        System.out.println("La cantidad de n° negativos es: " + negativo);
        System.out.println("La cantidad de n° iguales a cero es: " + cero);
    }
}
