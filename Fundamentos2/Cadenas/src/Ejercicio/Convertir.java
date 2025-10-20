package Ejercicio;

import java.util.Scanner;

public class Convertir {

    public static String camelASnake(String texto) {
        String resultado = "";

        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);

            if (letra >= 'A' && letra <= 'Z') {
                resultado += "_";
                resultado += (char)(letra + 32);
            } else {
                resultado += letra;
            }
        }

        return resultado;
    }

    public static String snakeACamel(String texto) {
        String resultado = "";
        boolean mayuscula = false;

        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);

            if (letra == '_') {
                mayuscula = true;
            } else {
                if (mayuscula) {
                    resultado += (char)(letra - 32);
                    mayuscula = false;
                } else {
                    resultado += letra;
                }
            }
        }

        return resultado;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escribe 1 para CamelCase a snake_case");
        System.out.println("Escribe 2 para snake_case a CamelCase");
        System.out.print("Opción: ");
        int opcion = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Escribe el texto: ");
        String texto = entrada.nextLine();

        if (opcion == 1) {
            System.out.println("Resultado: " + camelASnake(texto));
        } else if (opcion == 2) {
            System.out.println("Resultado: " + snakeACamel(texto));
        } else {
            System.out.println("Opción no válida.");
        }

        entrada.close();
    }
}
