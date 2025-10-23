package Condiciones;

import java.util.Scanner;

public class Ejercicio7 {
    public static boolean esPrimoYNegativo(int n) {
        if (n >= -99 && n <= -10) {
            int positivo = -n;
            for (int i = 2; i <= Math.sqrt(positivo); i++) {
                if (positivo % i == 0) return false;
            }
            return true;
        }
        return false;
    }

}


