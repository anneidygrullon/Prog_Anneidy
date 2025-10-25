package Condiciones;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.print("Introduce un número entero de dos dígitos menor que 20: ");
        int numero = num.nextInt();

        if ((numero >= 10 && numero < 20)) {
            boolean esPrimo = true;

            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }

            if (esPrimo) {
                    System.out.println(numero + " es primo.");
                } else {
                    System.out.println(numero + " no es primo.");
                }

            } else {
                System.out.println("El número no es de dos dígitos menor que 20.");
            }
            }
    }



