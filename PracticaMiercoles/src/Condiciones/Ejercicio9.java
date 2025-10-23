package Condiciones;

public class Ejercicio9 {
    public static boolean unDigitoMultiplo(int n) {
        if (n < 10 || n > 99) return false;
        int d1 = n / 10;
        int d2 = n % 10;
        return (d1 != 0 && d2 % d1 == 0) || (d2 != 0 && d1 % d2 == 0);
    }

}
