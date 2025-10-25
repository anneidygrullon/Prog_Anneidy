package Condiciones;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int numero = num.nextInt();

        if ((numero >= 100 && numero <= 999)) {
            System.out.println("El número tiene 3 dígitos.");
        } else {
            System.out.println("El número NO tiene 3 dígitos.");
        }
    }
}
