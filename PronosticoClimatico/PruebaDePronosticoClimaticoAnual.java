import org.junit.Assert;
import org.junit.Test;

public class PruebaDePronosticoClimaticoAnual {

	/*
	 * años bisiestos
	 */

	@Test
	public void obtenerTemperaturaConAnioBisiestoYTemperaturaEnElRango() {

		PronosticoClimaticoAnual prueba = new PronosticoClimaticoAnual(2016);

		prueba.pronosticarDia(2, 29, 25.0);
		Assert.assertEquals(25.0, prueba.obtenerTemperatura(2, 29), 0);
	}

	@Test(expected = Error.class)
	public void obtenerTemperaturaConAnioBisiestoYTemperaturaMenorAMenos40() {

		PronosticoClimaticoAnual prueba = new PronosticoClimaticoAnual(2020);
		prueba.pronosticarDia(2, 29, -50);
		Assert.assertEquals(0.0, prueba.obtenerTemperatura(2, 29), 0);
	}

	@Test(expected = Error.class)
	public void obtenerTemperaturaConAnioBisiestoYTempertaturaMayorA50() {

		PronosticoClimaticoAnual prueba = new PronosticoClimaticoAnual(2012);
		prueba.pronosticarDia(2, 29, 65);
		Assert.assertEquals(0.0, prueba.obtenerTemperatura(2, 29), 0);
	}

	@Test
	public void obtenerPromedioDelDiaPronosticadoEnDistintosMesesConAnioBisiesto() {
		PronosticoClimaticoAnual prueba = new PronosticoClimaticoAnual(2020);
		prueba.pronosticarDia(5, 29, 20);
		prueba.pronosticarDia(2, 29, 10);
		Assert.assertEquals(15.0, prueba.obtenerPromedioDelDia(29), 0);

	}

	@Test(expected = Error.class)
	public void obtenerPromedioSinPronosticarDiaConAnioBisiesto() {
		PronosticoClimaticoAnual prueba = new PronosticoClimaticoAnual(2020);
		Assert.assertEquals(0.0, prueba.obtenerPromedioDelDia(5), 0);
	}

	@Test
	public void obtenerTemperaturaMaximaEnElMesCon5DiasPronosticadosConAnioBisiesto() {
		PronosticoClimaticoAnual prueba = new PronosticoClimaticoAnual(1996);
		prueba.pronosticarDia(8, 10, -24);
		prueba.pronosticarDia(8, 5, 14);
		prueba.pronosticarDia(8, 22, 24);
		prueba.pronosticarDia(8, 11, 15);
		prueba.pronosticarDia(8, 28, 30);
		Assert.assertEquals(30.0, prueba.obtenerTemperaturaMaximaDelMes(8), 0);

	}

	/*
	 * con años no bisiestos
	 */

	@Test(expected = Error.class)
	public void obtenerTemperaturaConAnioNoBisiestoEl29DeFebreroYTemperaturaEnElRango() {
		PronosticoClimaticoAnual prueba = new PronosticoClimaticoAnual(2001);
		prueba.pronosticarDia(2, 29, 14);
		Assert.assertEquals(0.0, prueba.obtenerTemperatura(2, 29), 0);

	}

	@Test
	public void obtenerTemperaturaConAnioNoBisiestoYTemperaturaEnElRango() {
		PronosticoClimaticoAnual prueba = new PronosticoClimaticoAnual(2007);
		prueba.pronosticarDia(5, 3, -5);
		Assert.assertEquals(-5.0, prueba.obtenerTemperatura(5, 3), 0);
	}

	@Test(expected = Error.class)
	public void obtenerTemperaturaConAnioNobisiestoYtemperaturaMenorAMenos40() {
		PronosticoClimaticoAnual prueba = new PronosticoClimaticoAnual(2005);
		prueba.pronosticarDia(2, 5, -60);
		Assert.assertEquals(0.0, prueba.obtenerTemperatura(2, 5), 0);
	}

	@Test(expected = Error.class)
	public void obtenerTemperaturaConAnioNoBisiestoYTemperaturaMayorA50() {
		PronosticoClimaticoAnual prueba = new PronosticoClimaticoAnual(2005);
		prueba.pronosticarDia(4, 22, 80);
		Assert.assertEquals(0.0, prueba.obtenerTemperatura(4, 22), 0);

	}

	@Test(expected = Error.class)
	public void obtenerPromedioDeDiaNoValidoConAnioNoBisiesto() {
		PronosticoClimaticoAnual prueba = new PronosticoClimaticoAnual(2015);
		prueba.pronosticarDia(2, 29, 15);
		prueba.pronosticarDia(5, 29, 8);
		prueba.pronosticarDia(8, 29, 23);
		Assert.assertEquals(0.0, prueba.obtenerPromedioDelDia(29), 0);

	}

	@Test
	public void obtenerPromedioDelDiaPronosticadoEnDistintosMesesYAnioNoBisiesto() {
		PronosticoClimaticoAnual prueba = new PronosticoClimaticoAnual(2003);
		prueba.pronosticarDia(2, 28, 15);
		prueba.pronosticarDia(5, 28, 20);
		prueba.pronosticarDia(7, 28, 30);
		Assert.assertEquals(21.6, prueba.obtenerPromedioDelDia(28), 0.1);
	}

}
