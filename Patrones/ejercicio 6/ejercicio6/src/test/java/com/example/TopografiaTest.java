package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TopografiaTest {
    Topografia mixta;
    Topografia mixta2;
    
    @BeforeEach
    void setUp(){
        List<Topografia> partes2 = new ArrayList<>();
        partes2.add(new Agua());
        partes2.add(new Tierra());
        partes2.add(new Tierra());
        partes2.add(new Agua());
        mixta2 = new Mixta(partes2);
        List<Topografia> partes = new ArrayList<>();
        partes.add(new Agua());
        partes.add(new Tierra());
        partes.add(new Tierra());
        partes.add(mixta2);
        mixta = new Mixta(partes);
    }

    @Test
    void testProporcionAgua(){
        assertEquals(0.375, mixta.proporcionAgua());
    }

    @Test
    void testIgualdadTrue(){
        List<Topografia> partes = new ArrayList<>();
        partes.add(new Agua());
        partes.add(new Tierra());
        partes.add(new Tierra());
        partes.add(mixta2);
        Topografia mixta3 = new Mixta(partes);
        assertTrue(mixta.igual(mixta3));
    }

    @Test
    void testIgualdadFalse(){
        Topografia agua = new Agua();
        assertFalse(mixta.igual(agua));
    }
}
