package Condiciones;

public class Ejercicio1 {

    public static Boolean verificarNumero(int numero) {
        var residuo=numero%10;

        if(residuo == 4) {
            return true;
        } else {
            return false;
        }
    }
}
