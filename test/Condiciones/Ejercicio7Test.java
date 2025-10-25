package Condiciones;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio7Test {

    @Test
    @DisplayName("Prueba")
    void esPrimoYNegativo() {
        assertEquals( false, Ejercicio7.esPrimoYNegativo(-77));
    }
}