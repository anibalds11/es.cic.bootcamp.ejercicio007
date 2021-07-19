package es.cic.bootcamp.coche;

import org.springframework.stereotype.Service;

@Service
public class CocheService {
	private MotorCombustionService mc;
	private MotorElectricoService me;
	
	public CocheService()
	{
		mc= new MotorCombustionService();
		me= new MotorElectricoService();
	}
	
	public String encender() throws MotorException
	{
		me.arrancar();
		
		if(me.getPotencia()<20)
		{
			mc.arrancar();
			int potenciaTotal=mc.getPotencia() + me.getPotencia(); 
			if(potenciaTotal<20)
			{
				throw new MotorException("Potencia total insuficiente, no se ha podido arrancar el motor");
			}
			else
			{
				return "Se han utilizado ambos motores y la potencia usada es : " + potenciaTotal/7;
			}
			
		}
		else
		{
			return "Se ha utilizado solo el electrico, y la potencia es: " + me.getPotencia();
		}
	}

	public MotorCombustionService getMc() {
		return mc;
	}

	public void setMc(MotorCombustionService mc) {
		this.mc = mc;
	}

	public MotorElectricoService getMe() {
		return me;
	}

	public void setMe(MotorElectricoService me) {
		this.me = me;
	}
	
	
	
}
