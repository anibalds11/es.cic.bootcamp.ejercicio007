package es.cic.bootcamp.coche;

public class MotorCombustionService{
	
	private int potencia=0;				

	public void arrancar()
	{
		this.potencia= (int) Math.floor(Math.random()*41)+5;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
	
	
	
}