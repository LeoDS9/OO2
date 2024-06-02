package com.example;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProyectoTest {
    Proyecto p;

    @BeforeEach
    void setUp(){
        p = new Proyecto("Vacaciones de invierno", "Salir con amigos", LocalDate.now(), 
                LocalDate.now().plusWeeks(3), 3, 15);
        p.aprobarEtapa();
    }

    @Test
    void testAprobarProyecto(){
        assertTrue(p.getEtapa() instanceof EnEvaluacion);
        p.aprobarEtapa();
        assertTrue(p.getEtapa() instanceof Confirmada);
    }

    
}
