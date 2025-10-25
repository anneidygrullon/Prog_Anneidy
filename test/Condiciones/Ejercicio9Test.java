package Condiciones;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio9Test {

    @Test
    @DisplayName("Prueba digito multiplo")
    void unDigitoMultiplo() {
        assertTrue(Ejercicio9.unDigitoMultiplo(22));
    }
}