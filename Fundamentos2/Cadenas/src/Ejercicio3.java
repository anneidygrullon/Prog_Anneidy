public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println(esVocal('a'));
        System.out.println(esVocal( 'b'));
    }
        public static boolean esVocal(char letra) {
            var letraMinúscula = Character.toLowerCase(letra);
            return "aeiou".contains(Character.toString(letraMinúscula));
        }

    }

