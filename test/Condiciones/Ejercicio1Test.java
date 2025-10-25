package Condiciones;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

class Ejercicio1Test {

    @Test
    @DisplayName ("Verifica numero")
    void verificarNumero() {
        assertTrue(Ejercicio1.verificarNumero(7));
    }
}