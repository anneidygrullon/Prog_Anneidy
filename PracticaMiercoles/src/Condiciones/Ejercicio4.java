package Condiciones;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.print("Introduce un número de dos digitos: ");
        int numero = num.nextInt();

        if ((numero >= 10)) {
            int primerDigito = numero / 10;
            int segundoDigito = numero % 10;
            int suma = primerDigito + segundoDigito;

            System.out.println("La suma de los dígitos de " + numero + " es: " + suma);
        } else {
            System.out.println("El número no tiene dos dígitos.");
        }
    }
    }