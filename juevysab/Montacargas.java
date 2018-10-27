class Montacargas {
	private double pesoMaximo;
	private double pesoActual;
	private double pesoDescargado;
	private int cantidadDeDescargas;

	public Montacargas(double pesoMaximoSoportado) {
		if (pesoMaximoSoportado >= 20) {
			pesoMaximo = pesoMaximoSoportado;
		} else {
			pesoMaximo = 20;

		}
	}

	public void cargar(double cargarPeso) {
		if (cargarPeso <= pesoMaximo && cargarPeso > 0
				&& pesoActual + cargarPeso <= pesoMaximo) {
			pesoActual = cargarPeso + pesoActual;
		}
	}

	public double obtenerCarga() {
		return pesoActual;
	}

	public void descargar() {
		if (pesoActual > 0) {
			pesoDescargado = pesoDescargado + pesoActual;
			pesoActual = 0;
			cantidadDeDescargas++;
		}
	}

	public double obtenerCargaPromedio() {
		return pesoDescargado / cantidadDeDescargas;
	}

}
