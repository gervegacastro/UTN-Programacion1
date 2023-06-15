package GuiaEjercicios3.ejercicio3;

/*
Hacer un programa para mostrar por pantalla los números del 20 al 1 en orden
decreciente.
Importante: El programa no tiene ningún ingreso de datos.
 */
public class Ejercicio3 {

    public static void main(String[] args) {

        int [] contador = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        for (int i = contador.length -1; i >= 0 ; i = i - 1) {
            System.out.println(contador[i]);
        }

    }
}
