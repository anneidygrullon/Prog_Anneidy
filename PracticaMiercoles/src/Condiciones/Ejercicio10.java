package Condiciones;

public class Ejercicio10 {
    // ejercicio 9
    public static boolean digitosIguales(int n) {
        if (n < 10 || n > 99) return false;
        return (n / 10) == (n%10);
}
}
