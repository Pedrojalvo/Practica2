package aplicacion;

import dominio.Mates;

public class Principal {
    public static void main(String[] args) {
        long pasos = Long.parseLong(args[0]);
        System.out.println("El número PI es " + Matematicas.generarNumeroPiRecursivo(pasos));
    }
}
