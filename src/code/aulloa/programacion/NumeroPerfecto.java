package code.aulloa.programacion;

public class NumeroPerfecto {
    public static Boolean perfecto(int numero) {
        var suma = 0;
        for (int i=1; i<numero; i++) {
            if (numero % i == 0) {
                suma+=i;
            }
        }
        System.out.println("Tu resultado es:" + suma);
        if(suma==numero) {
            return true;
        } else {
            return false;
        }
    }
}

