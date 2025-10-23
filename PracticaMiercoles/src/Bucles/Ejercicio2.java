package Bucles;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int numero = num.nextInt();

        if (numero >= 2) {
            System.out.println("Los números pares entre 1 y " + numero + " son:");
            for (int i = 2; i <= numero; i += 2) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("No hay números pares entre 1 y " + numero);
        }
    }
}