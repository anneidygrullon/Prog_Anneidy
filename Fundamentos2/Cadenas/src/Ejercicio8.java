public class Ejercicio8 {
    public static void main(String[] args) {
        System.out.println(extension("ruta: debug.sh"));
        System.out.println(extension("ruta: /path/to/debug.sh"));
        System.out.println(extension("ruta: /the.dot/file.java"));
        System.out.println(extension("ruta: no-extension"));
    }

    public static String extension(String ruta) {
        if (ruta == null) {
            return "no contiene extension";
        }

        int ultimoPunto = ruta.lastIndexOf(".");
        int ultimaBarra = ruta.lastIndexOf("/");

        if (ultimoPunto == -1 || ultimoPunto < ultimaBarra) {
            return "no-extension";
        }

        return ruta.substring(ultimoPunto + 1, ruta.length());
    }
}