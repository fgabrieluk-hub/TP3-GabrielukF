package resol.GabrielukF;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Seleccione ejercicio (1-6): ");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1 -> Ejercicio1.ejecutar(sc);
            case 2 -> Ejercicio2.ejecutar(sc);
            case 3 -> Ejercicio3.ejecutar(sc);
            case 4 -> Ejercicio4.ejecutar(sc);
            case 5 -> Ejercicio5.ejecutar(sc);
            case 6 -> Ejercicio6.ejecutar(sc);
            default -> System.out.println("Opción inválida");
        }

        sc.close();
    }
}