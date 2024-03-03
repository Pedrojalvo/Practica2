package aplicacion;

import dominio.Matematicas;

public class Principal {
    public static void main(String[] args) {
        int pasos = Integer.parseInt(args[0]);
        System.out.println("El número PI es " + Matematicas.generarNumeroPiRecursivo(pasos));
    }
}
