package es.cic.bootcamp.coche;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class CocheControllerTest {
	
	private CocheController cut;
	
	private CocheService dependencia;
	
	@BeforeEach
	void setUp() throws Exception {
		cut = new CocheController();
		dependencia= mock(CocheService.class);
		
		cut.setCocheService(dependencia);
	}

	@Test
	void testArranque() {
		when(cut.encenderCoche()).thenReturn("Hola mundo");
		
		
	}

}
