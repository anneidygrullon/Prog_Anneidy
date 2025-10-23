package Condiciones;

public class Ejercicio8 {
    public static boolean ambosDigPrimos(int n) {
        if (n < 10 || n > 99) return false;
        int d1 = n / 10;
        int d2 = n % 10;
        return esPrimoMenorQue20(d1) && esPrimoMenorQue20(d2);
    }
}
