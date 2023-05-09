package GuiaEjercicios1.ejercicio2;
import java.util.Scanner;
/*
Hacer un programa que solicite por teclado que se ingresen dos números y luego
guardarlos en dos variables distintas. A continuación se deben intercambiar mutuamente
los valores en ambas variables y mostrarlos por pantalla.
Ejemplo: Suponiendo que se ingresan 3 y 8 como valores y que la variables usadas son A y B,
entonces A=3 y B=8, pero luego debe quedar A=8 y B=3.
 */
public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un valor entero para la variableA : ");
        int variableA = scanner.nextInt();
        System.out.println("Ingrese un valor entero para la variableB : ");
        int variableB = scanner.nextInt();

        int ingreso1 = variableA;
        int ingreso2 = variableB;

        variableA = ingreso2;
        variableB = ingreso1;

        System.out.println("Los valores inveritidos son :");
        System.out.println("Variable A --> " + variableA);
        System.out.println("Variable B --> " + variableB);

    }
}
