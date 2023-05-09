package GuiaEjercicios1.ejercicio6;

import java.util.Scanner;

/*
Hacer un programa para que un comercio ingrese por teclado la recaudación en pesos para
cada una de las cuatros semanas del mes. El programa debe listar la recaudación promedio
por semana y el porcentaje de recaudación por semana.
Ejemplo. Si se ingresa $ 1600, $ 1200, $ 4800 y $ 400 se listara como recaudación promedio
$ 2000 y como porcentajes por semana: 20%, 15%, 60% y 5%.
 */
public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la recaudacion de la semana 1: ");
        double semana1 = scanner.nextDouble();
        System.out.println("Ingrese la recaudacion de la semana 2: ");
        double semana2 = scanner.nextDouble();
        System.out.println("Ingrese la recaudacion de la semana 3: ");
        double semana3 = scanner.nextDouble();
        System.out.println("Ingrese la recaudacion de la semana 4: ");
        double semana4 = scanner.nextDouble();

        double recaudacionMensual = suma(semana1, semana2, semana3, semana4);
        double recaudacionPromedioSemanal = recaudacionMensual / 4;
        double porcentajeRecaudacionSemana1 = (semana1 / recaudacionMensual) * 100;
        double porcentajeRecaudacionSemana2 = (semana2 / recaudacionMensual) * 100;
        double porcentajeRecaudacionSemana3 = (semana3 / recaudacionMensual) * 100;
        double porcentajeRecaudacionSemana4 = (semana4 / recaudacionMensual) * 100;

        System.out.println("La recaudacion promedio por semana es " + recaudacionPromedioSemanal);
        System.out.println("La recaudacion mensual es: " + recaudacionMensual);
        System.out.println("El porcentaje de recaudacion de la semana 1 es: " + porcentajeRecaudacionSemana1);
        System.out.println("El porcentaje de recaudacion de la semana 2 es: " + porcentajeRecaudacionSemana2);
        System.out.println("El porcentaje de recaudacion de la semana 3 es: " + porcentajeRecaudacionSemana3);
        System.out.println("El porcentaje de recaudacion de la semana 4 es: " + porcentajeRecaudacionSemana4);
    }

    public static double suma (double semana1, double semana2, double semana3, double semana4){
        double resultado = semana1 + semana2 + semana3 + semana4;
        return resultado;
    }




}
