package Bucles;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.print("Introduce un número entero diferente de 1: ");
        int numero = num.nextInt();

        if (numero >= 1) {
            System.out.println("Los números entre 1 y " + numero + " son:");
            for (int i = 1; i <= numero; i++) {
                System.out.print(i + " ");
            }
        }
    }
}
