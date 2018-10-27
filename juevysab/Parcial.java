class Parcial {

	private int cantidadDeNotas = 0;
	private int notaMasAlta = 0;
	private int notaMasBaja = 10;
	private int sumaDeNotas = 0;
	private String nombreAlumnoConNotaMasAlta;

	public void cargarNotaDelParcial(String nombre, int notas) {
		if (notas > 0 && notas <= 10) {
			cantidadDeNotas = cantidadDeNotas + 1;
			sumaDeNotas = sumaDeNotas + notas;
			if (notas > notaMasAlta) {
				notaMasAlta = notas;
				nombreAlumnoConNotaMasAlta = nombre;
			}
			if (notas < notaMasBaja) {
				notaMasBaja = notas;
			}
		}
	}

	public int cantidadDeAlumnosQueRindieron() {
		return cantidadDeNotas;
	}

	public int notaMasBajaObtenida() {
		return notaMasBaja;
	}

	public int notaMasAltaObtenida() {
		System.out.print(obtenerNombreNotaMasAlta());
		return notaMasAlta;
	}

	public double promedioPrimerParcial() {
		double notaPromedio = 0;
		notaPromedio = ((double) sumaDeNotas) / ((double) cantidadDeNotas);
		return notaPromedio;
	}

	public String obtenerNombreNotaMasAlta() {
		return nombreAlumnoConNotaMasAlta;
	}
}
