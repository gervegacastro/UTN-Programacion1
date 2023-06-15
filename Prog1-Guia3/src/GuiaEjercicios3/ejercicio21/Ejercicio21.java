package GuiaEjercicios3.ejercicio21;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Dada una lista de 7 números informar el primer número par ingresado y su ubicación en
la lista y el último de los números primos y su ubicación en la lista.
Ejemplo 7, 4, 5, 6, 9, 13, 10 se informa Primer número par: 4 ubicación 2. Ultimo primo:
13 ubicación 6.
Ejemplo 9, 5, 21, 9, 13, 15, 6 se informa Primer número par: 6 ubicación 7. Ultimo primo:
13 ubicación 5.
 */
public class Ejercicio21 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar siete numeros enteros");

        int[] numeros = new int[7];

        List<Integer> numerosPares = new ArrayList<>();
        int primerPar = 0;
        int posPrimerPar = 0;

        int ultimoPrimo = 0;
        int posUltimoPrimo = 0;
        
        for (int i = 0; i < 7; i = i + 1){
            numeros[i] = scanner.nextInt();
            if (numeros[i] % 2 == 0) {
                numerosPares.add(numeros[i]);
            }
            if (esPrimo(numeros[i])) {
                ultimoPrimo = numeros[i];
                posUltimoPrimo = i + 1;
            }
        }

        for (int i = 0; i < 7; i = i + 1) {
            if (numerosPares.get(0) == numeros[i]) {
                primerPar = numeros[i];
                posPrimerPar = i + 1;
            }
        }

        System.out.println("El primer par es: " + primerPar + " y su posicion es: " + posPrimerPar);
        System.out.println("El ultimo primo es: " + ultimoPrimo + " y su posicion es: " + posUltimoPrimo);
    }

    static boolean esPrimo (int numero) {
        int cantDivisores = 0;
        for (int div = 1; div <= numero; div = div + 1) {
            if (numero % div == 0) {
                cantDivisores = cantDivisores + 1;
            }
        }
        if (cantDivisores == 2) {
            return true;
        }
        return  false;
    }
}
