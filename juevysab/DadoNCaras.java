class DadoNCaras {

	private int valor;
	private int cantidadDeCaras;
	private int tirosPares;
	private int tirosImpares;

	
	public DadoNCaras(int caras) {
		if (caras < 2) {
			caras = 2;
		}
		tirosPares = 0;
		tirosImpares = 0;
		cantidadDeCaras = caras;
		tirar();
	}

	public int tirar() {

		valor = ((int) (Math.random() * cantidadDeCaras) + 1);
		contabilizarTirosParesEImpares();
		return obtenerValor();
	}

	private void contabilizarTirosParesEImpares() {

		if (valor % 2 == 0) {

			tirosPares = tirosPares + 1;

		} else {

			tirosImpares = tirosImpares + 1;
		}
	}

	public int obtenerCantidadDeTirosPares() {
		return tirosPares;
	}

	public int obtenerCantidadDeTirosImpares() {
		return tirosImpares;
	}

	public int obtenerCantidadDeCaras() {

		return cantidadDeCaras;
	}

	public int obtenerValor() {
		return valor;
		
	}

}
