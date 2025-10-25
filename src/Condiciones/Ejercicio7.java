package Condiciones;

public class Ejercicio7 {

    public static Boolean esPrimoYNegativo(int n) {
        if (n >= -99 && n <= -10) {
            int positivo = -n;

            for (int i = 2; i <= Math.sqrt(positivo); i++) {
                if (positivo % i == 0) {
                    System.out.println("Incorrecto: " + n + " no es primo.");
                    return false;
                }
            }

            System.out.println("Correcto: " + n + " es negativo y primo.");
            return true;
        }

        System.out.println("Incorrecto: " + n + " no está entre -99 y -10.");
        return false;
}
}

