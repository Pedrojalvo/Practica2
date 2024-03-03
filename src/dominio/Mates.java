package dominio;

import java.util.Random;

public class Mates {
    public static double generarNumeroPiRecursivo(long pasos) {
        return generarNumeroPiRecursivoAux(pasos, 0, 0, 0);
    }

    private static double generarNumeroPiRecursivoAux(long pasos, long intentos, long aciertos, Random random) {
        if (intentos >= pasos) {
            return 4.0 * ((double) aciertos / (double) intentos);
        } else {
            double x = random.nextDouble() * 2.0 - 1.0;
            double y = random.nextDouble() * 2.0 - 1.0;
            if (Math.sqrt(x * x + y * y) <= 1.0) {
                aciertos++;
            }
            return generarNumeroPiRecursivoAux(pasos, intentos + 1, aciertos, random);
        }
    }
}
