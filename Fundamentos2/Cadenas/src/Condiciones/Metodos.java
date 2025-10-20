package Condiciones;

public class Metodos {

    public static int CalcularEdad(int anonac, int anoactual) {

        if (anonac >= anoactual) {
            System.out.println("Aun no se puede calcular tu edad");
            return 0;
        } else {
            return anoactual-anonac;

        }

    }

    //calcular porcentajes

    public static Double porcentaje(double monto,double porciento){
        return monto*porciento;

    }

}
