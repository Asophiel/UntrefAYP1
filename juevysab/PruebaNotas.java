import org.junit.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({})
public class PruebaNotas {

	@Test
	public void pruebaParcial() {
		Parcial parcial = new Parcial();

		Assert.assertEquals(0, parcial.cantidadDeAlumnosQueRindieron());

	}

}
