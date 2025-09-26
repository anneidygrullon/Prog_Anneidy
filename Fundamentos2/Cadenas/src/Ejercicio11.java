public class Ejercicio11 {
        public static void main (String[] args) {
            System.out.println(hexString (12, 15, 77)); // 0C0F4D
        }
        static public String hexString (int r, int g, int b){
            return String. format ("%02X%02X%02X",r,g,b);
        }
}
