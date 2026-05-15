package resol.GabrielukF;

import java.util.Scanner;

public class Ejercicio3 {

    public static void ejecutar(Scanner sc) {

        sc.nextLine(); // limpiar buffer

        System.out.print("Ingrese texto: ");
        String texto = sc.nextLine();

        System.out.print("Ingrese carácter: ");
        char c = sc.next().toLowerCase().charAt(0);

        int contador = 0;

        for (int i = 0; i < texto.length(); i++) {
            if (Character.toLowerCase(texto.charAt(i)) == c) {
                System.out.println("Posición: " + i);
                contador++;
            }
        }

        double porcentaje = (contador * 100.0) / texto.length();

        System.out.println("La letra '" + c + "' aparece " + contador + " veces.");
        System.out.println("Representa el " + porcentaje + "% del texto.");
    }
}