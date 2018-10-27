class PlanillaDeNotas {

	private double[] notas;

	public PlanillaDeNotas(int alumnos) {
		if (cantidadDeAlumnosValida(alumnos)) {

			notas = new double[alumnos];

		} else {

			notas = new double[0];
		}

		for (int i = 0; i < alumnos; i++) {

			notas[i] = 0.0;

		}
	}

	public int cantidadDeAlumnos() {

		return notas.length;
	}

	private boolean estaVacio(int subindiceNota) {

		return notas[subindiceNota] == 0.0;

	}

	public void cargarNota(int alumno, double nota) {

		if (alumno <= notas.length + 1 && rangoValidoDeNota(nota)
				&& notas[alumno - 1] == 0.0) {

			notas[alumno - 1] = nota;

		}
	}

	public double recuperarNota(int numeroDeOrden) {

		return notas[numeroDeOrden - 1];
	}

	private boolean cantidadDeAlumnosValida(int alumnos) {

		return (alumnos > 0);
	}

	private boolean rangoValidoDeNota(double nota) {

		return ((nota > 0) && (nota <= 10));
	}

	public double notaMaxima() {
		double notaMaxima = notas[0];

		for (int i = 1; i < notas.length; i++) {
			if (notaMaxima < notas[i]) {
				notaMaxima = notas[i];
			}

		}

		return notaMaxima;

	}

	public double notaMinima() {
		double notaMinima = notas[0];
		for (int i = 1; i < notas.length; i++) {
			if (notaMinima > notas[i] && !estaVacio(i)) {
				notaMinima = notas[i];
			}

		}
		return notaMinima;
	}

	public double promedioDeNotas() {
		double sumaDeNotas = 0.0;
		int cantidadDeAlumnos = 0;

		for (int i = 0; i < notas.length; i++) {
			if (notas[i] != 0) {

				sumaDeNotas = sumaDeNotas + notas[i];
				cantidadDeAlumnos++;
			}

		}
		return sumaDeNotas / ((double) cantidadDeAlumnos);

	}

}
