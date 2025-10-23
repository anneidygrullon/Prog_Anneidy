package Bucles;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int num1 = num.nextInt();

        System.out.print("Introduce el segundo número: ");
        int num2 = num.nextInt();

        System.out.println("Los números comprendidos entre " + num1 + " y " + num2 + " son:");

        int inicio = Math.min(num1, num2);
        int fin = Math.max(num1, num2);

        while (inicio <= fin) {
            System.out.print(inicio + " ");
            inicio++;
        }
    }
}
