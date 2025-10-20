package Ejercicio;

import java.util.Scanner;

public class ValidadorContrasena {

    public static boolean contraseñaFuerte(String contraseña) {
        if (contraseña.length() < 8) {
            return false;
        }

        boolean mayuscula = false;
        boolean numero = false;
        boolean especial = false;

        for (int i = 0; i < contraseña.length(); i++) {
            char c = contraseña.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                mayuscula = true;
            } else if (c >= '0' && c <= '9') {
                numero = true;
            } else if (!Character.isLetterOrDigit(c)) {
                especial = true;
            }
        }

        return mayuscula && numero && especial;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escribe tu contraseña: ");
        String texto = entrada.nextLine();

        if (contraseñaFuerte(texto)) {
            System.out.println(" Contraseña fuerte.");
        } else {
            System.out.println(" Contraseña débil.");
        }

        entrada.close();
    }
}