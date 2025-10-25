package code.aulloa.programacion;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class NumeroPerfectoTest {

    @Test
    @DisplayName("Prueba Numero")
    @org.junit.jupiter.api.Test
    public void perfecto() {

        assertTrue(NumeroPerfecto.perfecto(6));
    }
}