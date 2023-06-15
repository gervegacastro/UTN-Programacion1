package GuiaEjercicios3.ejercicio20;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Se define como divisores propios de un número a aquellos que son sus divisores
excluyendo al número en sí mismo.
Ejemplo. Los divisores propios del 4 son: 1 y 2.
Ejemplo. Los divisores propios del 12 son; 1, 2, 3, 4 y 6.
Se define a un número como perfecto cuando la suma de todos sus divisores propios
coincide con el número en sí mismo.
Ejemplo: 6 es número perfecto pues 1+2+3=6
Ejemplo: 28 es número perfecto pues 1+2+4+7+14=28
Ejemplo: 12 no es número perfecto pues 1+2+3+4+6=16
Hacer un programa para ingresar un número y luego informar con un cartel aclaratorio si el
mismo es un número perfecto o es número no perfecto.
 */
public class Ejercicio20 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar un numero entero");

        int numero = scanner.nextInt();
        List<Integer> divisores = new ArrayList<>();
        int suma = 0;

        for (int i = 1; i < numero; i = i + 1){
            if (numero % i == 0) {
                divisores.add(i);
            }
        }

        for (Integer div : divisores) {
            suma = suma + div;
        }

        if (suma == numero) {
            System.out.println("El numero es perfecto");
        } else {
            System.out.println("El numero NO es perfecto");
        }
    }
}
