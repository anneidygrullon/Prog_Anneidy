package Practica;

public class Ejercicio5 {
    public static void main(String[] args) {
    System.out.println(terminaEnS("miércoles"));
        System.out.println(terminaEnS("sábado"));
    }
    public static boolean terminaEnS(String texto) {
        var últimoCaracter = texto.charAt(texto.length() - 1);
        return (últimoCaracter == 's') || (últimoCaracter == 'S');
    }
}
