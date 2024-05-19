package ar.edu.unlp.info.oo2.ejercicio1;


import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestTwitter {
	Twitter t;
	String screenName;
	@BeforeEach
	void setUp() {
		t = new Twitter();
		screenName = "Leo";
		t.agregarUsuario(screenName);
	}

	@Test
	void testAgregarUsuarioExitoso() {
		String nombre = "Lolo";
		assertNotNull(t.agregarUsuario(nombre));
	}
	
	void testAgregarUsuarioFallido() {
		assertNull(t.agregarUsuario(screenName));
	}
	
}
