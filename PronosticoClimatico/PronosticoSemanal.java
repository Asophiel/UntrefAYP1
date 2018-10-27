class PronosticoSemanal {

	private double[] temperaturas = new double[7];
	private double temperaturaTotal;
	private double temperaturaMaxima;
	private double temperaturaMinima;
	private int diasPronosticados;

	public PronosticoSemanal() {

		for (int i = 0; i < temperaturas.length; i++) {

			temperaturas[i] = 0.0;
		}
		temperaturaMaxima = -40;
		temperaturaMinima = 50;
		diasPronosticados = 0;

	}

	public void pronosticarDia(int numeroDeDia, double temperatura) {

		if (temperaturaValida(temperatura) && diasValidos(numeroDeDia)) {
			temperaturas[numeroDeDia - 1] = temperatura;
		}

	}

	public double obtenerTemperatura(int numeroDeDia) {

		return temperaturas[numeroDeDia - 1];

	}

	public double calcularTemperaturaMaxima() {

		for (int i = 0; i < temperaturas.length; i++) {

			if (temperaturas[i] > temperaturaMaxima) {

				temperaturaMaxima = temperaturas[i];
			}

		}

		return temperaturaMaxima;
	}

	public double calcularTemperaturaMinima() {

		for (int i = 0; i < temperaturas.length; i++) {

			if (temperaturas[i] < temperaturaMinima) {

				temperaturaMinima = temperaturas[i];
			}

		}
		return temperaturaMinima;
	}

	private boolean temperaturaValida(double temperatura) {

		return ((temperatura >= -40) && (temperatura <= 50));
	}

	public boolean diasValidos(int dia) {

		return ((dia > 0) && (dia <= 7));

	}

	public double calcularPromedio() {

		for (int i = 0; i < temperaturas.length; i++) {

			if (temperaturas[i] != 0.0) {
				
				temperaturaTotal = temperaturaTotal + temperaturas[i];
				diasPronosticados++;
			}
		}

		return temperaturaTotal / ((double) diasPronosticados);

	}

}
