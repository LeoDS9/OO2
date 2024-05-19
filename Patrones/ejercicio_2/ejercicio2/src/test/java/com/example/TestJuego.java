package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestJuego {
    Juego j;

    @BeforeEach
    void setUp(){
        j = new Juego();
    }

    @Test
    void testEmpezarJuegoConGanador(){
        Opcion opc1 = new Tijera();
        Opcion opc2 = new Lagarto();
        assertEquals("Tijera decapita lagarto, gana tijera", j.empezarJuego(opc1, opc2));
    }

    @Test
    void testEmpezarJuegoEmpate(){
        Opcion opc1 = new Tijera();
        Opcion opc2 = new Tijera();
        assertEquals("Empate", j.empezarJuego(opc1, opc2));
    }

}
