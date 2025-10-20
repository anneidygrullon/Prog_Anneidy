package Ejercicio;

import java.util.Scanner;

public class upcInteractivo {

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
        boolean ponerMayuscula = false;

        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);

            if (letra == '_') {
                ponerMayuscula = true;
            } else {
                if (ponerMayuscula) {
                    resultado += (char)(letra - 32);
                    ponerMayuscula = false;
                } else {
                    resultado += letra;
                }
            }
        }

        return resultado;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Elige una opción:");
        System.out.println("1. Convertir CamelCase a snake_case");
        System.out.println("2. Convertir snake_case a CamelCase");
        System.out.print("Opción: ");
        int opcion = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Escribe el texto: ");
        String texto = entrada.nextLine();

        if (opcion == 1) {
            String resultado = camelASnake(texto);
            System.out.println("Resultado en snake_case: " + resultado);
        } else if (opcion == 2) {
            String resultado = snakeACamel(texto);
            System.out.println("Resultado en CamelCase: " + resultado);
        } else {
            System.out.println("Opción no válida.");
        }

        entrada.close();
    }
}