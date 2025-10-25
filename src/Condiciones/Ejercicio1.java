package Condiciones;

public class Ejercicio1 {

    public static Boolean verificarNumero(int numero) {
        var residuo=numero%10;

        if(residuo == 4) {
            System.out.println("El numero es mayor a 4");
            return true;
        } else {
            System.out.println("El numero es menor a 4");
            return false;
        }
    }
}
