package resol.GabrielukF;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Ejercicio4 {

    public static void ejecutar(Scanner sc) {

        System.out.print("Fecha 1 (YYYY-MM-DD): ");
        LocalDate f1 = LocalDate.parse(sc.next());

        System.out.print("Fecha 2 (YYYY-MM-DD): ");
        LocalDate f2 = LocalDate.parse(sc.next());

        if (!f1.isBefore(f2)) {
            System.out.println("Error: la primera fecha debe ser anterior.");
            return;
        }

        long dias = ChronoUnit.DAYS.between(f1, f2);
        System.out.println("Cantidad de días: " + dias);
    }
}