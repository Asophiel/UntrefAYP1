public class PronosticoClimaticoAnual {

	public double temperaturasMensuales[][] = new double[12][];

	public PronosticoClimaticoAnual(int anio) {

		temperaturasMensuales[0] = new double[31];
		temperaturasMensuales[2] = new double[31];
		temperaturasMensuales[3] = new double[30];
		temperaturasMensuales[4] = new double[31];
		temperaturasMensuales[5] = new double[30];
		temperaturasMensuales[6] = new double[31];
		temperaturasMensuales[7] = new double[31];
		temperaturasMensuales[8] = new double[30];
		temperaturasMensuales[9] = new double[31];
		temperaturasMensuales[10] = new double[30];
		temperaturasMensuales[11] = new double[31];

		if (esBiciesto(anio)) {

			temperaturasMensuales[1] = new double[29];
			recorrerArray();

		} else {

			temperaturasMensuales[1] = new double[28];
			recorrerArray();

		}
	}

	public void pronosticarDia(int mes, int dia, double temperatura) {
		if (temperaturasHabiles(temperatura) && mesesHabiles(mes)
				&& diaValido(dia, mes)) {
			temperaturasMensuales[mes - 1][dia - 1] = temperatura;
		} else {
			throw new Error();
		}
	}

	private boolean diaValido(int dia, int mes) {

		return (dia >= 1) && (dia <= temperaturasMensuales[mes - 1].length);

	}

	private boolean esBiciesto(int anio) {

		return (anio % 4 == 0 && ((anio % 100 != 0) || (anio % 400 == 0)));

	}

	public double obtenerTemperatura(int mes, int dia) {

		return temperaturasMensuales[mes - 1][dia - 1];
	}

	public double obtenerPromedioDelDia(int dia) {

		double sumaDeTemperaturasDelDia = 0.0;
		int cantidadDeMesesQueSePronosticoEseDia = 0;

		for (int i = 0; i < temperaturasMensuales.length; i++) {
			if (temperaturasMensuales[i][dia - 1] != 0.0) {
				sumaDeTemperaturasDelDia = sumaDeTemperaturasDelDia
						+ temperaturasMensuales[i][dia - 1];
				cantidadDeMesesQueSePronosticoEseDia++;

			}
		}
		return sumaDeTemperaturasDelDia
				/ ((double) cantidadDeMesesQueSePronosticoEseDia);
	}

	public double obtenerTemperaturaMaximaDelMes(int mes) {
		double temperaturaMaxima = -40;

		for (int i = 0; i < temperaturasMensuales[mes - 1].length; i++) {
			if (temperaturasHabiles(temperaturasMensuales[mes - 1][i])
					&& temperaturasMensuales[mes - 1][i] > temperaturaMaxima
					&& temperaturasMensuales[mes - 1][i] != 0.0) {
				temperaturaMaxima = temperaturasMensuales[mes - 1][i];
			}
		}
		return temperaturaMaxima;
	}

	private boolean temperaturasHabiles(double temperatura) {

		return (temperatura >= -40) && (temperatura <= 50);
	}

	private boolean mesesHabiles(int mes) {

		return (mes >= 1) && (mes <= 12);

	}

	private void recorrerArray() {

		for (int i = 0; i < temperaturasMensuales.length; i++) {
			for (int j = 0; j < temperaturasMensuales[i].length; j++) {
				temperaturasMensuales[i][j] = 0.0;
			}
		}

	}

}
