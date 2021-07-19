package es.cic.bootcamp.coche;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CocheServiceTest {
	
	private CocheService cut;
	private MotorCombustionService dependencia1;
	private MotorElectricoService dependencia2;
	
	@BeforeEach
	void setUp() throws Exception {
		
		this.cut=new CocheService();
		this.dependencia1=mock(MotorCombustionService.class);
		this.dependencia2=mock(MotorElectricoService.class);
		
		this.cut.setMc(dependencia1);
		this.cut.setMe(dependencia2);
		
	}

	@Test
	void testArrancar() {
		
	}

}
