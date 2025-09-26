public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.println(titleCase("java"));
        System.out.println(titleCase("JAVA"));
    }
    public static String titleCase(String texto) {
        var primeraLetra = texto.substring(0, 1 );
        var restoDelTexto = texto.substring(1);
        return String.format("%S%s", primeraLetra, restoDelTexto.toLowerCase());
    }
    }

