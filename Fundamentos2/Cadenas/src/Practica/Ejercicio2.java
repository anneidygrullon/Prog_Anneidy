package Practica;

public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println(pluralizar(4, "Codigo"));
    }
        public static String pluralizar(int conteo, String s) {
            return (conteo < 2) ? String.format("%d %s", conteo, s) : String.format("%d %ss", conteo, s);
        }
    }

