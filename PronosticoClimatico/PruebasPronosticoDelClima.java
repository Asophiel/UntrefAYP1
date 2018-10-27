import org.junit.Assert;
import org.junit.Test;




public class PruebasPronosticoDelClima {
	
	
	@Test
	public void PruebaMenorAMenosCuarenta(){
		
		PronosticoDelClima prueba = new PronosticoDelClima();
		prueba.pronosticarSabado(-45.0);
		
		Assert.assertEquals(0 , prueba.obtenerTemperaturaDelSabado(), 0);
		
		
	}
	
	@Test
	public void PruebaMayorACincuenta(){
		PronosticoDelClima prueba = new PronosticoDelClima();
		prueba.pronosticarSabado(55);
		
		Assert.assertEquals(0 , prueba.obtenerTemperaturaDelSabado() , 0);
		
		
	}
	
	@Test
	public void PruebaEnRangoDeTemperatura(){
		PronosticoDelClima prueba = new PronosticoDelClima();
		prueba.pronosticarSabado(20);
		
		Assert.assertEquals(20, prueba.obtenerTemperaturaDelSabado(),0);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
