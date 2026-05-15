package resol.GabrielukF;

import java.util.Scanner;

public class Ejercicio1 {

    public static void ejecutar(Scanner sc) {

        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        double suma = 0;
        int contador = 0;

        System.out.println("Números primos:");

        for (int n : numeros) {
            if (esPrimo(n)) {
                System.out.println(n);
                suma += n;
                contador++;
            }
        }

        if (contador > 0) {
            System.out.println("Promedio: " + (suma / contador));
        } else {
            System.out.println("No se ingresaron números primos.");
        }
    }

    public static boolean esPrimo(int n) {
        if (n <= 1) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}