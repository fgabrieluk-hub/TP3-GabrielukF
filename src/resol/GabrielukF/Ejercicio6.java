package resol.GabrielukF;

import java.util.Scanner;

public class Ejercicio6 {

    public static void ejecutar(Scanner sc) {

        sc.nextLine(); // limpiar buffer

        System.out.print("Ingrese mensaje: ");
        String texto = sc.nextLine();

        System.out.print("Ingrese desplazamiento: ");
        int desp = sc.nextInt();

        System.out.println("Mensaje cifrado: " + cifrar(texto, desp));
    }

    public static String cifrar(String texto, int desp) {
        String resultado = "";

        for (char c : texto.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                c = (char) ((c - base + desp) % 26 + base);
            }
            resultado += c;
        }

        return resultado;
    }
}