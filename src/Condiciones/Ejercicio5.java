package Condiciones;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.print("Introduce un numero de dos digitos: ");
        int numero = num.nextInt();

            int primerDigito = numero / 10;
            int segundoDigito = numero % 10;

        if (primerDigito % 2 == 0 && segundoDigito % 2 == 0) {
            System.out.println("Ambos dígitos son pares.");

        } else if (primerDigito % 2 != 0 && segundoDigito % 2 == 0) {
            System.out.println("Su primer dígito no es par.");

        } else if (primerDigito % 2 == 0 && segundoDigito % 2 != 0) {
            System.out.println("Su segundo dígito no es par.");

        } else {
            System.out.println("Ninguno de sus dígitos es par.");
        }
    }
}
