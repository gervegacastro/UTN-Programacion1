package GuiaEjercicios2.ejercicio1;
import java.util.Scanner;

/*
Hacer un programa para ingresar por teclado un número y luego emitir por pantalla un
cartel aclaratorio indicando si el mismo es positivo, negativo o cero.
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        int numero = scanner.nextInt();

        if (numero == 0){
            System.out.println("El n° ingresado es cero");
        }
        if (numero > 0) {
            System.out.println("El n° ingresado es positivo");
        }
        if (numero < 0){
            System.out.println("El n° ingresado es negativo");
        }

    }
}
