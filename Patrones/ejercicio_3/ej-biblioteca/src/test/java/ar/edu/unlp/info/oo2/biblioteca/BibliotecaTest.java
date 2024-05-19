package ar.edu.unlp.info.oo2.biblioteca;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BibliotecaTest {

    Biblioteca b;

    @BeforeEach
    void setup(){
      b = new Biblioteca();
      b.agregarSocio(new Socio("Arya Stark", "needle@stark.com", "5234-5"));
    }

    @Test
    void testExportarSocios(){
        String json = "[\r\n" + //
                        "\t{\r\n" + //
                        "\t\t\"nombre\": \"Arya Stark\",\r\n" + //
                        "\t\t\"email\": \"needle@stark.com\",\r\n" + //
                        "\t\t\"legajo\": \"5234-5\"\r\n" + //
                        "\t}\r\n" + //
                        "]";
        assertEquals(json, b.exportarSocios());
    }
}
