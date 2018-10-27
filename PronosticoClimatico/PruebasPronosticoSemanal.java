import org.junit.Assert;
import org.junit.Test;

public class PruebasPronosticoSemanal {

	PronosticoSemanal prueba = new PronosticoSemanal();

	@Test
	public void NoAdmiteTemperaturasMenosAMenosCuarenta() {

		prueba.pronosticarDia(1, -45.0);

		Assert.assertEquals(0.0, prueba.obtenerTemperatura(1), 0);

	}

	@Test
	public void NoAdmiteTemperaturasMayoresACincuenta() {

		prueba.pronosticarDia(1, 80.0);

		Assert.assertEquals(0.0, prueba.obtenerTemperatura(1), 0);

	}

	@Test
	public void NoAdmieteMasDeSieteDias() {

		Assert.assertFalse(prueba.diasValidos(8));
	}

	@Test
	public void AdmiteTemperaturaCiencuenta() {
		prueba.pronosticarDia(1, 50.0);

		Assert.assertEquals(50.0, prueba.obtenerTemperatura(1), 0);

	}

	@Test
	public void AdmiteTemperaturaMenosCuarenta() {

		prueba.pronosticarDia(1, -40.0);

		Assert.assertEquals(-40.0, prueba.obtenerTemperatura(1), 0);

	}

	@Test
	public void AdmiteTemperaturasMayoresACero() {

		prueba.pronosticarDia(1, 20);

		Assert.assertEquals(20.0, prueba.obtenerTemperatura(1), 0);

	}

	@Test
	public void AdmiteTemperaturasMenoresACero() {

		prueba.pronosticarDia(1, -15);

		Assert.assertEquals(-15.0, prueba.obtenerTemperatura(1), 0);
	}

	@Test
	public void FucionaCorrectamenteElPromedio() {

		prueba.pronosticarDia(1, 20);
		prueba.pronosticarDia(6, -25);
		prueba.pronosticarDia(7, 3);

		Assert.assertEquals(-0.666, prueba.calcularPromedio(), 0.1);

	}

	@Test
	public void FuncionCorrectamenteLaTemperaturaMaxima() {

		prueba.pronosticarDia(1, 15);
		prueba.pronosticarDia(2, 30);
		prueba.pronosticarDia(3, 50);

		Assert.assertEquals(50.0, prueba.calcularTemperaturaMaxima(), 0);

	}

	@Test
	public void FucionaCorrectamenteLaTemperaturaMinima() {

		prueba.pronosticarDia(1, 20);
		prueba.pronosticarDia(2, -15);
		prueba.pronosticarDia(3, 2);

		Assert.assertEquals(-15, prueba.calcularTemperaturaMinima(), 0);

	}
	
	@Test
	public void PronosticarSieteVecesElMismoDia() {
		prueba.pronosticarDia(1, 20);
		prueba.pronosticarDia(1, 30);
		prueba.pronosticarDia(1, -18);
		prueba.pronosticarDia(1, -23);
		prueba.pronosticarDia(1, 10);
		prueba.pronosticarDia(1, 12);
		prueba.pronosticarDia(1, -35);

		Assert.assertEquals(-35, prueba.calcularPromedio(), 0);

	}

	@Test
	public void PromedioSinPronosticarNingunDia(){
		
		Assert.assertEquals(0, prueba.calcularPromedio() , 0);
	}
	
	
	
	
	
	
	
	
	
	
}
