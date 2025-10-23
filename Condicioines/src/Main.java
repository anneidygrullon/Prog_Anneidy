import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Ingrese un numero: ");
       Scanner sc=new Scanner(System.in);

        var num = sc.nextInt();
        for (int i=num; i < 100; i++) {
            System.out.println("El numero: " + i + " termina en cuatro?: " + Ejercicio1.verificarNumero(num));
        }
        }
    }
