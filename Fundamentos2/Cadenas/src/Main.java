import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(empiezaconMinuscula("Arlet"));
        System.out.println(empiezaconMinuscula("haciendo pruebas"));
    }
        public static boolean empiezaconMinuscula(String s) {
        var primerCaracter = s.charAt(0);
        return Character.isLowerCase(primerCaracter);
    }
    }
