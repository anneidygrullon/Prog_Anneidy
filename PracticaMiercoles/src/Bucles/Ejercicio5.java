package Bucles;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int num1 = num.nextInt();

        System.out.print("Introduce el segundo número: ");
        int num2 = num.nextInt();

        int inicio = Math.min(num1, num2);
        int fin = Math.max(num1, num2);

        System.out.println("Números terminados en 4 entre " + num1 + " y " + num2 + ":");

        do {
            if (inicio % 10 == 4 || inicio % 10 == -4) {
                System.out.print(inicio + " ");
            }
            inicio++;
        } while (inicio <= fin);
    }
}

