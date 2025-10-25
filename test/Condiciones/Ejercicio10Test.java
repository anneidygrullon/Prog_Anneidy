package Condiciones;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio10Test {

    @Test
    @DisplayName("Digitos Iguales")
    void digitosIguales() {
        assertTrue(Ejercicio10.digitosIguales(77));
    }
}