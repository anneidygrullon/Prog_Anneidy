package Practica;

public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println(empiezaconMinuscula("Arlet"));
        System.out.println(empiezaconMinuscula("haciendo pruebas"));
    }

    public static boolean empiezaconMinuscula(String s) {
        var primerCaracter = s.charAt(0);
        return Character.isLowerCase(primerCaracter);
    }
}