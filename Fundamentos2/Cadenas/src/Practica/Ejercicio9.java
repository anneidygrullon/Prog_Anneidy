package Practica;

public class Ejercicio9 {
    public static void main(String[] args) {
System.out.println(Dominio("https://www.java.com/en/"));
        System.out.println(Dominio("https://jcp.org"));
    }

    public static String Dominio(String url) {
        String sinProtoco = url.substring(8);
        int Lebarra = sinProtoco.indexOf("/");
        if (Lebarra == -1) {
            return sinProtoco;
        }
        return sinProtoco.substring(0, Lebarra);
    }
}
