package Bucles;

public class Ejercicio6 {
    public static void mostrarCadaDigito(int n) {
        if (n < 100 || n > 999) return;
        int c = n / 100;
        int d = (n / 10) % 10;
        int u = n % 10;
        for (int i = 1; i <= c; i++) System.out.println(i);
        for (int i = 1; i <= d; i++) System.out.println(i);
        for (int i = 1; i <= u; i++) System.out.println(i);
    }
}
