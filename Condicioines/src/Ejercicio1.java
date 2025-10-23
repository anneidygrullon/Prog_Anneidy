import java.util.Scanner;

public class Ejercicio1 {

      public static Boolean verificarNumero (int numero) {
          var residuo = numero % 10;
          System.out.println(residuo);
          if(residuo == 4){
              return true;
          }
          else {
              return false;
          }

    }
}
