package code.aulloa.programacion;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class NumerosTest {

    @Test
    @DisplayName("Prueba numero")
    @org.junit.jupiter.api.Test
    public void primo() {
        assertTrue(Numeros.primo(7));
    }
}

