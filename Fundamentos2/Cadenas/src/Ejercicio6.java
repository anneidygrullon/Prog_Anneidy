public class Ejercicio6 {
    public static void main(String[] args) {
        System.out.println(esPalindrome("ab"));
        System.out.println(esPalindrome("Aa"));
        System.out.println(esPalindrome("ee"));
    }
        public static boolean esPalindrome(String letras) {
        if (letras == null || letras.length() != 2) {
            return false;
        }
        char primeraLetra = Character.toLowerCase(letras.charAt(0));
            char segundaLetra = Character.toLowerCase(letras.charAt(1));
            return primeraLetra == segundaLetra;
    }
}
