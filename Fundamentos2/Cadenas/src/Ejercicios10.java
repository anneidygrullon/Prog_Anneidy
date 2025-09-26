public class Ejercicios10 {
    public static void main(String[] args) {
        int anio1 = 2024;
        int anio2 = 2025;

        String pascua1 = DomingoPascua(anio1);
        System.out.println("Domingo de Pascua (" + anio1 + ") -> " + pascua1);

        String pascua2 = DomingoPascua(anio2);
        System.out.println("Domingo de Pascua (" + anio2 + ") -> " + pascua2);
    }

    public static String DomingoPascua(int anio) {
        int a = anio % 19;
        int b = anio / 100;
        int c = anio % 100;
        int d = b / 4;
        int e = b % 4;
        int g = ((8 * b) + 13) / 25;
        int h = ((19 * a) + b - d - g + 15) % 30;
        int i = c / 4;
        int k = c % 4;
        int l = (32 + (2 * e) + (2 * i) - h - k) % 7;
        int m = (a + (11 * h) + (19 * l)) / 433;

        // n es el número del mes: 3 = marzo, 4 = abril
        int n = (h + l - (7 * m) + 90) / 25;

        // p es el día del mes
        int p = (h + l - (7 * m) + (33 * n) + 19) % 32;

        String mes = (n == 3) ? "marzo" : "abril";

        return String.format("%d de %s de %d", p, mes, anio);}
}