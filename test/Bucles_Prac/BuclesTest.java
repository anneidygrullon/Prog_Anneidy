package Bucles_Prac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuclesTest {

    @Test
    void mostrarNumerosEnteros() {
        Bucles.mostrarNumerosEnteros(5);
    }

    @Test
    void mostrarNumerosPares() {
        Bucles.mostrarNumerosPares(10);
    }

    @Test
    void mostrarDivi() {
        Bucles.mostrarDivi(6);
    }

    @Test
    void mostrarEntreNumeros() {
        Bucles.mostrarEntreNumeros(3, 7);
    }

    @Test
    void mostrarNumerosTer4() {
        Bucles.mostrarNumerosTer4(1, 30);
    }

    @Test
    void mostrarDeTalATal() {
        Bucles.mostrarDeTalATal(345);
    }

    @Test
    void mostrarDeNumANum() {
        Bucles.mostrarDeNumANum();
    }

    @Test
    void mostrarPares() {
        Bucles.mostrarPares();
    }

    @Test
    void mostrarNumerosQueTerminenEn() {Bucles.mostrarNumerosQueTerminenEn();
    }

    @Test
    void suma() {assertEquals(55, Bucles.suma(10));
    }
}