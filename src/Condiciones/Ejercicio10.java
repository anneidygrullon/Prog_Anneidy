package Condiciones;

public class Ejercicio10 {

    static boolean digitosIguales(int n) {
        if (n < 10 || n > 99) {
            System.out.println("Incorrecto: " + n + " no es un número de dos cifras.");
            return false;
        }

        int d1 = n / 10; // primer dígito
        int d2 = n % 10; // segundo dígito

        if (d1 == d2) {
            System.out.println("Correcto: ambos dígitos de " + n + " son iguales (" + d1 + " y " + d2 + ").");
            return true;
        } else {
            System.out.println("Incorrecto: los dígitos de " + n + " son diferentes (" + d1 + " y " + d2 + ").");
            return false;
 }
}
}
