package Condiciones;

import java.util.Scanner;

public class CalcularEdad {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Elija una de las siguientes opciones;");
        System.out.println("opcion 1: Calcular Edad");
        System.out.println("opcion 2: Calcular mi sueldo");
        var opcion=sc.nextInt();

        switch (opcion) {

            case 1:
                System.out.println("digite su ano de nacimiento:");

                var anonacimiento=sc.nextInt();
                System.out.println("digite el ano Actual");

                var anoActual=sc.nextInt();

                var resultado=Metodos.CalcularEdad(anonacimiento, anoActual);

                System.out.println("Su edad actual es: "+resultado);

                break;

                case 2:
                    System.out.println("digite su sueldo:");
                    var sueldo=sc.nextDouble();
                    System.out.println("Digite el porcentaje a descontar");
                    var desccuento=sc.nextDouble();
                    var sueldofinal=sueldo-Metodos.porcentaje(sueldo,desccuento);
                    System.out.println("Su sueldo es: "+sueldofinal);
                    break;
            default:
        }


    }

}

