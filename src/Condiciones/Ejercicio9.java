package Condiciones;

public class Ejercicio9 {


    public static boolean unDigitoMultiplo(int n) {
        if (n < 10 || n > 99) {
            System.out.println("Incorrecto: " + n + " no es un número de dos cifras.");
            return false;
        }

        int d1 = n / 10;  // primer dígito
        int d2 = n % 10;  // segundo dígito

        // Evitar división por cero
        if (d1 == 0 || d2 == 0) {
            System.out.println("Incorrecto: uno de los dígitos de " + n + " es 0, no se puede usar para dividir.");
            return false;
        }

        if (d2 % d1 == 0 || d1 % d2 == 0) {
            System.out.println("Correcto: en " + n + ", uno de los dígitos es múltiplo del otro (" + d1 + ", " + d2 + ").");
            return true;
        } else {
            System.out.println("Incorrecto: en " + n + ", ningún dígito es múltiplo del otro (" + d1 + ", " + d2 + ").");
            return false;
        }
    }
}
