package es.cic.bootcamp.coche;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CocheServiceTestIntegracion {
		
	private CocheService cut;
	
	@BeforeEach
	void setUp() throws Exception {
		
		cut = new CocheService();
		cut.setMe(new MotorElectricoService());
		cut.setMc(new MotorCombustionService());

	}

	@Test
	void testArrancar() {
		try {
			cut.encender();
		} catch (MotorException e) {
			e.printStackTrace();
		}
		
	}

}
