package GuiaEjercicios1.ejercicio12;

import java.util.Scanner;

/*
Una granja vende la caja de 12 unidades a $ 100 y cada huevo suelto a $ 12.
Hacer un programa para ingresar la cantidad de huevos que compra un cliente y mostrar por
pantalla el importe total a pagar.
Recordatorio. Por cada 12 huevos se debe calcular una caja y el excedente se calcula como
suelto.
Ejemplo 1. Si la cantidad ingresada son 15 huevos, el programa calculará 1 caja y 3 sueltos, es
decir $ 100 + $ 12 x 3 = $ 136.
 */
public class Ejercicio12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de huevos a comprar");
        int huevos = scanner.nextInt();

        int precioPorCaja = cantidadCajas(huevos) * 100;
        int precioPorHuevosSueltos = huevosSueltos(huevos) * 12;
        int precioTotal = precioPorCaja + precioPorHuevosSueltos;

        System.out.println("El importe total es: " + precioTotal);

    }

    public static int cantidadCajas (int huevos) {
        int cantidadCajas = huevos / 12;
        return cantidadCajas;
    }

    public static int huevosSueltos (int huevos) {
        int huevosSueltos = huevos % 12;
        return huevosSueltos;
    }

}
