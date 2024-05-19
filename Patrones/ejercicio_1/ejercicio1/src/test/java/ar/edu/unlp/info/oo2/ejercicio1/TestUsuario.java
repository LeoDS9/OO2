package ar.edu.unlp.info.oo2.ejercicio1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestUsuario {
	Usuario u;
	@BeforeEach
	void setUp() {
		u = new Usuario("Javier Mylaw");
	}
	
	@Test
	void testPostearLimiteInferior(){
		String t = "a";
		assertNotNull(u.postear(t));
	}
	
	@Test
	void testPostearLimiteSuperior(){
		String t = "La brisa susurra entre las hojas, "
				+ "llevando consigo susurros del pasado y promesas del mañana. "
				+ "En cada rincón del bosque, la vida palpita en un baile eterno de luz y sombra. "
				+ "La naturaleza, sabia y serena, nos invita a perdernos en su abrazo, encontrando paz en su misterio. ChatGPT";
		assertNotNull(u.postear(t));
	}
	
	@Test
	void testPostearLimiteInferiorError(){
		String t = "";
		assertNull(u.postear(t));
	}
	
	@Test
	void testPostearLimiteSuperiorError(){
		String t = "La brisa susurra entre las hojas, "
				+ "llevando consigo susurros del pasado y promesas del mañana. "
				+ "En cada rincón del bosque, la vida palpita en un baile eterno de luz y sombra. "
				+ "La naturaleza, sabia y serena, nos invita a perdernos en su abrazo, encontrando paz en su misterio."
				+ "Mamase mamasa mamacusa";
		assertNull(u.postear(t));
	}
}
