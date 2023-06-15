package GuiaEjercicios3.ejercicio2;

/*
Hacer un programa para mostrar por pantalla los números del 1 al 20 salteando de a 3
elementos. Es decir: 1, 4, 7, 10, 13, 16, 19.
Importante: El programa no tiene ningún ingreso de datos.
 */
public class Ejercicio2 {

    public static void main(String[] args) {

        int [] contador = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        for (int i = 0; i < contador.length; i = i + 3) {
            System.out.println(contador[i]);
        }

    }
}
