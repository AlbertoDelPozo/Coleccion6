package coleccion6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProbarBuscarNombre {
	
	String[] nombres= {" Ra�l", " Cristina   ", "Juan", " Alberto", "Sebasti�n  ", "Alicia  ", "Rebeca", "Carmen  ", "Celia  ", "Javier"};
	String[] nombresOrd= {" Alberto", "Alicia  ", "Carmen  ", "Celia  "," Cristina   ", "Javier", "Juan", " Ra�l",  "Rebeca", "Sebasti�n  ",};

	

	@Test
	void buscarEnListaOrdenada() {
		assertEquals(4,Utilidades.buscarNombre(nombresOrd, "Cristina", true));
		assertEquals(0,Utilidades.buscarNombre(nombresOrd, "   Alberto   ", true));
		assertEquals(9,Utilidades.buscarNombre(nombresOrd, "Sebasti�n    ", true));
		assertTrue(Utilidades.buscarNombre(nombresOrd, "Cristinita", true) <0 );
		
	}
	
	@Test
	void buscarEnListaDesrdenada() {
		assertEquals(0,Utilidades.buscarNombre(nombres, "Ra�l", false));
		assertEquals(9,Utilidades.buscarNombre(nombres, "   Javier   ", false));
		assertEquals(4,Utilidades.buscarNombre(nombres, "Sebasti�n    ", false));
		assertTrue(Utilidades.buscarNombre(nombres, "Cristinita", false) <0 );
		
	}

}
