package coleccion6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LetrasNIFTest {
	
	//valores de prueba para el DNI
	int dniFranco=1;
	int dniEmerito=10;
	int dniNoNacido=99999998;
	

	@Test
	@DisplayName("Probando cálculo letra verificación DNI Españo")
	void testCalcularLetraNIF() {
		assertTrue(Utilidades.letraNIF(dniFranco)=='R');
		assertTrue(Utilidades.letraNIF(dniEmerito)=='X');
		assertTrue(Utilidades.letraNIF(dniNoNacido)=='T');
	}
	
	

}
