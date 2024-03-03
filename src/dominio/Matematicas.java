package dominio;

import java.util.Random;

public class Matematicas {
    public static double generarNumeroPiRecursivo(long pasos) {
        return generarNumeroPiRecursivoHelper(pasos, 0, 0);
    }

    private static double generarNumeroPiRecursivoHelper(long pasos, int aciertos, int total) {
        if (pasos == 0) {
            return (double) aciertos / total * 4.0;
        } else {
            Random random = new Random();
            double x = random.nextDouble() * 2.0 - 1.0;
            double y = random.nextDouble() * 2.0 - 1.0;
            total++;
            if (Math.sqrt(x * x + y * y) <= 1.0) {
                aciertos++;
            }
            return generarNumeroPiRecursivoHelper(pasos - 1, aciertos, total);
        }
    }
}




