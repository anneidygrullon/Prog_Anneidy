package Practica;

public class Ejercicio13 {
        public static void main (String[] args) {
            System.out. println(elipsificar("yo soy Anneidy", 6));} // 0C0F4D
            static String elipsificar(String titulo, int longitud) {
                int espacio = titulo.indexOf(" ", longitud);
                return (espacio == -1 ? titulo : titulo.substring(0, espacio)+"...");
}
        }
