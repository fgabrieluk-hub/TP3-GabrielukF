package resol.GabrielukF;

import java.util.Scanner;

public class Ejercicio5 {

    public static void ejecutar(Scanner sc) {

        System.out.print("Ingrese número entero positivo: ");
        int num = sc.nextInt();

        System.out.println("Número en binario: " + convertirABinario(num));
    }

    public static String convertirABinario(int decimal) {
        if (decimal == 0) return "0";

        String binario = "";

        while (decimal > 0) {
            binario = (decimal % 2) + binario;
            decimal /= 2;
        }

        return binario;
    }
}