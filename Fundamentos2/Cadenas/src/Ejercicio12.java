public class Ejercicio12 {
        public static void main(String[] args) {
            System.out.println(correoElectronicoValido("abc@me.com")); // 0C0F4D
        }

        static public boolean correoElectronicoValido(String correo) {
            int arroba = correo.indexOf("@");
            int ultimaArroba = correo.lastIndexOf("@");
            int punto = correo.indexOf(".", arroba + 1);
            int ultimoPunto = correo.lastIndexOf(".");
            return (arroba > 0) && (arroba == ultimaArroba) && (punto == ultimoPunto) && (punto > arroba + 1) && (ultimoPunto < correo.length()-1);
}
    }


