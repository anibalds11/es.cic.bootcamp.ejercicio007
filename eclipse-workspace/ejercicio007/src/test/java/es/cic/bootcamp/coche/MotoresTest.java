package es.cic.bootcamp.coche;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MotoresTest {

	private MotorElectricoService me;
	private MotorCombustionService mc;
	
	@BeforeEach
	void setUp() throws Exception {
		this.me= new MotorElectricoService();
		this.mc= new MotorCombustionService();
	}

	@Test
	void testMotorElectrico() {
		me.arrancar();
		assertTrue(me.getPotencia()<=40,"La potencia era " + me.getPotencia());
		assertTrue(me.getPotencia()>=5,"La potencia era " + me.getPotencia());
		int potencia1=me.getPotencia();
		me.arrancar();
		assertNotEquals(potencia1, me.getPotencia());
	}
	@Test
	void testMotorCombustion() {
		mc.arrancar();
		assertTrue(mc.getPotencia()<=40,"La potencia era " + mc.getPotencia());
		assertTrue(mc.getPotencia()>=5,"La potencia del c era " + mc.getPotencia());
		int potencia1=mc.getPotencia();
		mc.arrancar();
		assertNotEquals(potencia1, mc.getPotencia());
	}

}
