package Condiciones;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int numero = num.nextInt();

        if (numero > 0) {
            System.out.println("El numero es positivo "+numero);
        } else {
            System.out.println("El numero es negativo "+numero);
        }
    }
}
