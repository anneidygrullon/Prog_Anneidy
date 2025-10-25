package Condiciones;

public class Ejercicio8 {

    public static boolean ambosDigPrimos(int n) {
        if (n < 10 || n > 99) {
            System.out.println("Incorrecto: " + n + " no es un número de dos cifras.");
            return false;
        }

        int d1 = n / 10;
        int d2 = n % 10;

        if (esPrimo(d1) && esPrimo(d2)) {
            System.out.println("Correcto: ambos dígitos de " + n + " son primos (" + d1 + " y " + d2 + ").");
            return true;
        } else {
            System.out.println("Incorrecto: al menos uno de los dígitos de " + n + " no es primo (" + d1 + ", " + d2 + ").");
            return false;
        }
    }

    static boolean esPrimo(int x) {
        return x == 2 || x == 3 || x == 5 | x==7;
}
}