import org.junit.Assert;
import org.junit.Test;

public class PruebaMesaDeRestaurante {

	@Test
	public void pruebaMesa5Comensales() {

		MesaDeRestaurante mesa = new MesaDeRestaurante(5, 8);
		mesa.abrirMesa(5);
		mesa.agregarMonto();

		Assert.assertEquals(40.0, mesa.cerrarMesa(), 0);

	}

	@Test
	public void pruebaMesa0Comensales() {

		MesaDeRestaurante mesa = new MesaDeRestaurante(0, 8);
		mesa.abrirMesa(5);
		mesa.agregarMonto();

		Assert.assertEquals(0.0, mesa.cerrarMesa(), 0);

	}

	@Test
	public void pruebaMesaConCubiertosNegativos() {

		MesaDeRestaurante mesa = new MesaDeRestaurante(5, -8);

		mesa.abrirMesa(5);
		mesa.agregarMonto();

		Assert.assertEquals(-40.0, mesa.cerrarMesa(), 0);

	}

	@Test
	public void pruebaMesaConCubiertosYComensalesNegativos() {

		MesaDeRestaurante mesa = new MesaDeRestaurante(-5, -8);
		mesa.abrirMesa(-5);
		mesa.agregarMonto();

		Assert.assertEquals(40.0, mesa.cerrarMesa(), 0);

	}

	@Test
	public void pruebaMesaComensalesNegativos() {
		MesaDeRestaurante mesa = new MesaDeRestaurante(-5, 8);
		mesa.abrirMesa(-5);
		mesa.agregarMonto();

		Assert.assertEquals(-40.0, mesa.cerrarMesa(), 0);
	}

	@Test
	public void PruebaCuentaMaxima() {

		MesaDeRestaurante mesa = new MesaDeRestaurante(5, 8);
		mesa.abrirMesa(5);
		mesa.agregarMonto();
		mesa.cerrarMesa();

		Assert.assertEquals(40.0, mesa.cuentaMaxima(), 0);

	}

	@Test
	public void PruebaCantidadDeUsos() {
		MesaDeRestaurante mesa = new MesaDeRestaurante(5, 8);
		mesa.abrirMesa(3);
		mesa.agregarMonto();
		mesa.cerrarMesa();
		mesa.abrirMesa(1);
		mesa.agregarMonto();
		mesa.cerrarMesa();

		Assert.assertEquals(2, mesa.cantidadDeVecesQueSeUso());

	}

}
