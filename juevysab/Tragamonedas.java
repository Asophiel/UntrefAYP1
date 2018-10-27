class Tragamonedas {

	private Tambor tambor1;
	private Tambor tambor2;
	private Tambor tambor3;

	private int pozoAcumulado;

	private int cantidadDeMonedasInsertadas;

	/*
	 * PRE: hay que elegiar un pozo mayor a 0, de lo contrario el pozo sera 100
	 * POST: el pozo elegido sera el posible premio a ganar.
	 */

	public Tragamonedas(int pozo) {
		if (pozo < 100) {
			pozo = 100;
		}
		pozoAcumulado = pozo;
		tambor1 = new Tambor();
		tambor2 = new Tambor();
		tambor3 = new Tambor();
	}

	/*
	 * PRE: si no insertas niguna moneda no se podra jalar la palanca
	 * POST:dependiendo de la cantidad de monedas que insertes, seran la
	 * cantidad de veces que podras jalar la palanca
	 */
	public void insertarMoneda(int n) {

		cantidadDeMonedasInsertadas = n;

	}

	/*
	 * PRE: se debe haber insertado alguna moneda anteriormente y definido un
	 * pozo a ganar, de lo contrario no funcionara. POST: si el valor de los
	 * tres tambores es el mismo, entonces ganars el pozo definido
	 * anteriormente.
	 */

	public int jalarPalanca() {

		int pozoGanado = 0;
		if (cantidadDeMonedasInsertadas > 0) {
			cantidadDeMonedasInsertadas = cantidadDeMonedasInsertadas - 1;

			tambor1.girar();
			tambor2.girar();
			tambor3.girar();

			if (tambor1.obtenerValor() == tambor2.obtenerValor()
					&& tambor1.obtenerValor() == tambor3.obtenerValor()) {

				pozoGanado = pozoAcumulado;
			} else if (tambor1.obtenerValor() == tambor2.obtenerValor()
					|| tambor2.obtenerValor() == tambor3.obtenerValor()
					|| tambor3.obtenerValor() == tambor1.obtenerValor()) {
				cantidadDeMonedasInsertadas = cantidadDeMonedasInsertadas + 1;
				pozoAcumulado = 0;
			} else {
				pozoAcumulado = 0;
			}

		}

		return pozoGanado;

	}

	public void aumentarPozo(int pozo) {
		if (pozo >= 100) {
			pozoAcumulado = pozoAcumulado + pozo;
		}

	}
}