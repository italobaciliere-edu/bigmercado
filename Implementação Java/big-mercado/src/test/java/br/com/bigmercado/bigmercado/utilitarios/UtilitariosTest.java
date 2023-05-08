package br.com.bigmercado.bigmercado.utilitarios;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UtilitariosTest {

    @Test
    void getStringInput() {
    }

    @Test
    void getIntInput() {
        var utilitarios = new Utilitarios();
        var result = utilitarios.getIntInput();
        assertEquals(Integer, result);
    }
}