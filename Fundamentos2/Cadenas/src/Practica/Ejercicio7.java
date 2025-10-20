package Practica;

public class Ejercicio7 {
    public static void main(String[] args) {
       System.out.println(esExterno("/definetely-internal"));
        System.out.println(esExterno("https://www.java.com"));
        System.out.println(esExterno("http://dont-go.com"));
    }
    public static boolean esExterno(String enlace) {
        if (enlace.startsWith("http://") || enlace.startsWith("https://")) {
            return true;
        } else if (enlace.startsWith("/")) {
            return false;
        }
        return false;
    }
}
