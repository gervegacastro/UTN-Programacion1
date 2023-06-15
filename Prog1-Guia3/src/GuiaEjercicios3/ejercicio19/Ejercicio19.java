package GuiaEjercicios3.ejercicio19;
import java.util.Scanner;

/*
Se define a un número como primo cuando tiene solamente dos divisores.
Ejemplo 1: 2, 7, 11, 13 son números primos, ya que todos tienen solamente dos divisores.
Ejemplo 2: 6 no es primo, pues tiene 4 divisores (1, 2 3 y 6)
Ejemplo 3: 9 no es primo, pues tiene 3 divisores (1, 3 y 9)
Favor de no confundir número primo con número par. Son dos definiciones diferentes.
Hacer un programa para ingresar un número y luego informar con un cartel aclaratorio si el
mismo es un número primo o es número no primo.
 */
public class Ejercicio19 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar un numero entero");

        int numero = scanner.nextInt();
        int divisores = 0;

        for (int i = 1; i <= numero; i = i + 1){
            if (numero % i == 0) {
                divisores = divisores + 1;
            }
        }

        if (divisores == 2) {
            System.out.println("El numero ingresado es primo");
        } else {
            System.out.println("El numero ingresado NO es primo");
        }


    }
}
