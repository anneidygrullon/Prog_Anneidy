package Condiciones;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio8Test {

    @Test
    @DisplayName("Ambos son primos")
    void ambosDigPrimos() {
        assertTrue(Ejercicio8.ambosDigPrimos(77));
    }

    @Test
    @DisplayName("Es primo")
    void esPrimo() {
        assertTrue(Ejercicio8.esPrimo(77));
    }
}