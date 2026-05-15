package resol.GabrielukF;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {

    public static void ejecutar(Scanner sc) {

        Random r = new Random();

        System.out.print("Ingrese tamaño N: ");
        int n = sc.nextInt();

        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = r.nextInt(100) + 1;
            }
        }

        System.out.println("Matriz generada:");
        mostrarMatriz(matriz);

        int diag1 = sumarDiagonalPrincipal(matriz);
        int diag2 = sumarDiagonalSecundaria(matriz);

        System.out.println("Suma diagonal principal: " + diag1);
        System.out.println("Suma diagonal secundaria: " + diag2);
        System.out.println("Mayor: " + Math.max(diag1, diag2));
    }

    public static void mostrarMatriz(int[][] m) {
        for (int[] fila : m) {
            for (int num : fila) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
    }

    public static int sumarDiagonalPrincipal(int[][] m) {
        int suma = 0;
        for (int i = 0; i < m.length; i++) {
            suma += m[i][i];
        }
        return suma;
    }

    public static int sumarDiagonalSecundaria(int[][] m) {
        int suma = 0;
        for (int i = 0; i < m.length; i++) {
            suma += m[i][m.length - 1 - i];
        }
        return suma;
    }
}