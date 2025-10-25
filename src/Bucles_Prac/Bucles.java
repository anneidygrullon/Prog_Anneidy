package Bucles_Prac;

public class Bucles {

    // EJERCICIO1
    public static void mostrarNumerosEnteros(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    // EJERCICIO2
    public static void mostrarNumerosPares(int n) {
        for (int i = 2; i <= n; i += 2) {
            System.out.println(i);
        }
    }

    // EJERCICIO3
    public static void mostrarDivi(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }

    // EJERCICIO4
    public static void mostrarEntreNumeros(int a, int b) {
        for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
            System.out.println(i);
        }
    }

    // EJERCICIO5
    public static void mostrarNumerosTer4(int a, int b) {
        for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
            if (i % 10 == 4) {
                System.out.println(i);
            }
        }
    }

    // EJERCICIO6
    public static void mostrarDeTalATal(int n) {
        if (n < 100 || n > 999) return;
        int b = n / 100;
        int d = n % 10;
        int a = (n / 10) % 10;
        for (int i = 1; i <= b; i++) System.out.println(i);
        for (int i = 1; i <= d; i++) System.out.println(i);
        for (int i = 1; i <= a; i++) System.out.println(i);
    }

    // EJERCICIO7
    public static void mostrarDeNumANum() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }

    // EJERCICIO8
    public static void mostrarPares() {
        for (int i = 20; i <= 200; i++) {
            if (i % 2 == 0) System.out.println(i);
        }
    }

    // EJERCICIO9
    public static void mostrarNumerosQueTerminenEn() {
        for (int i = 25; i <= 205; i++) {
            if (i % 10 == 6) System.out.println(i);
        }
    }

    // EJERCICIO10
    public static int suma(int n) {
        int sumah = 0;
        for (int i = 1; i <= n; i++) {
            sumah += i;
        }
        return sumah;
}
    }
