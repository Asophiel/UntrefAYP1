import org.junit.Assert;
import org.junit.Test;

public class PruebaPlanillaDeNotas {

	@Test
	public void planillaCreadaConAlumnosNegativos() {

		PlanillaDeNotas prueba = new PlanillaDeNotas(-20);

		Assert.assertEquals(0, prueba.cantidadDeAlumnos());

	}

	@Test
	public void cargarNotasMenos1YMenos10EnPlanillaDe20Alumnos() {

		PlanillaDeNotas prueba = new PlanillaDeNotas(20);
		prueba.cargarNota(6, -1.0);
		prueba.cargarNota(7, -10.0);

		Assert.assertEquals(0.0, prueba.recuperarNota(6), 0);
		Assert.assertEquals(0.0, prueba.recuperarNota(7), 0);

	}

	@Test
	public void cargarNotaMayorA10EnPlanillaDe20Alumnos() {

		PlanillaDeNotas prueba = new PlanillaDeNotas(20);
		prueba.cargarNota(6, 15.0);

		Assert.assertEquals(0.0, prueba.recuperarNota(15), 0);

	}

	@Test
	public void cargarNotasDeValor1Y10EnPLanillaDe20Alumnos() {

		PlanillaDeNotas prueba = new PlanillaDeNotas(20);
		prueba.cargarNota(4, 1.0);
		prueba.cargarNota(9, 10.0);

		Assert.assertEquals(1.0, prueba.recuperarNota(4), 0);
		Assert.assertEquals(10.0, prueba.recuperarNota(9), 0);

	}

	@Test
	public void cargarLaPrimerNotaDeUnaPLanillaCon30Alumnos() {

		PlanillaDeNotas prueba = new PlanillaDeNotas(30);
		prueba.cargarNota(1, 4.0);

		Assert.assertEquals(4.0, prueba.recuperarNota(1), 0);

	}

	@Test
	public void cargaUltimaNotcaDeUnaPlanillaCon50Alumnos() {

		PlanillaDeNotas prueba = new PlanillaDeNotas(50);
		prueba.cargarNota(50, 3.50);

		Assert.assertEquals(3.50, prueba.recuperarNota(50), 0);

	}

	@Test
	public void cargaLaUltimaNotaDeUnaPlanillaDe20Alumnos() {

		PlanillaDeNotas prueba = new PlanillaDeNotas(20);
		prueba.cargarNota(20, 7.0);

		Assert.assertEquals(7.0, prueba.recuperarNota(20), 0);

	}

	@Test
	public void cargarVariasNotasAUnMismoAlumnoEnPlanillaDe15Alumnos() {

		PlanillaDeNotas prueba = new PlanillaDeNotas(15);
		prueba.cargarNota(3, 9.50);
		prueba.cargarNota(3, 1.0);

		Assert.assertEquals(9.50, prueba.recuperarNota(3), 0);

	}

	@Test
	public void obtenerNotaMaximaLuegoDeHaberCagadoDistintasNotasEnPlanillaDe20Alumnos() {

		PlanillaDeNotas prueba = new PlanillaDeNotas(20);
		prueba.cargarNota(1, 9.0);
		prueba.cargarNota(2, 3.0);
		prueba.cargarNota(3, 2.0);
		prueba.cargarNota(4, 4.0);
		prueba.cargarNota(5, 3.0);
		prueba.cargarNota(6, 1.0);
		prueba.cargarNota(7, 8.0);

		Assert.assertEquals(9.0, prueba.notaMaxima(), 0);

	}

	@Test
	public void obtenerNotaMaximaSinAntesHaberCargadoNingunaNotaEnPlanillaDe30Alumnos() {

		PlanillaDeNotas prueba = new PlanillaDeNotas(30);

		Assert.assertEquals(0.0, prueba.notaMaxima(), 0);

	}

	@Test
	public void obtenerNotaMinimaLuegoDeHaberCagadoTodasLasNotasEnPlanillaDe5Alumnos() {
		PlanillaDeNotas prueba = new PlanillaDeNotas(5);

		prueba.cargarNota(1, 5.0);

		Assert.assertEquals(5.0, prueba.notaMinima(), 0);

	}

	@Test
	public void obtenerNotaMinimaSinAntesHaberCargadoNingunaNotaEnPlanillaDe10Alumnos() {
		PlanillaDeNotas prueba = new PlanillaDeNotas(10);

		Assert.assertEquals(0.0, prueba.notaMinima(), 0);

	}

	@Test
	public void obtenerPromedioDeNotasLuegoDeHaberCargadoAlMenos1NotaEnPlanillaDe15Alumnos() {
		PlanillaDeNotas prueba = new PlanillaDeNotas(15);
		prueba.cargarNota(1, 8.0);

		Assert.assertEquals(8.0, prueba.promedioDeNotas(), 0);

	}

	@Test(expected = Error.class)
	public void obtenerPromedioSinAntesHaberCargadoAlgunaNotaEnPlanillaDe10Alumnos() {

		PlanillaDeNotas prueba = new PlanillaDeNotas(10);

		Assert.assertEquals(0.0, prueba.promedioDeNotas(), 0);

	}

}
