package coleccion6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LetrasNIETest {
	
	//valores de prueba para el NIE
	
	int extranjero=9999999;

	
	
	@Test
	@DisplayName("Probando verificación NIE Extranjero")
	void testCalcularLetraNIE() {
		assertEquals('K', Utilidades.letraNIE("X"+String.valueOf(extranjero)));
		assertEquals('G', Utilidades.letraNIE("Y"+String.valueOf(extranjero)));
		assertEquals('H', Utilidades.letraNIE("Z"+String.valueOf(extranjero)));
		assertEquals('D', Utilidades.letraNIE("A"+String.valueOf(extranjero)));
		assertEquals('\u0000', Utilidades.letraNIE("B"+String.valueOf(extranjero)));
		;
	}

}
