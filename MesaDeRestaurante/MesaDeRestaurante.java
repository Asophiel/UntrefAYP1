class MesaDeRestaurante {

	private int lugaresDisponibles;
	private double costoDelCubierto;
	private int comensales;
	private double montoDeLaCuenta;
	private int cantidadDeUsos;
	private boolean mesaAbierta;
	private double cuentaMaxima;

	public MesaDeRestaurante(int lugares, double costo) {

		if (lugares > 0 && costo > 0) {

			lugaresDisponibles = lugares;
			costoDelCubierto = costo;

		} else {

			lugaresDisponibles = 2;
			costoDelCubierto = 1;

		}

		comensales = 0;
		montoDeLaCuenta = 0;
		cuentaMaxima = 0;
		cantidadDeUsos = 0;
		mesaAbierta = false;

	}

	public void abrirMesa(int personas) {

		if (!mesaAbierta && personas > 0 && personas <= lugaresDisponibles) {

			mesaAbierta = true;
			comensales = personas;
		}

	}

	public void agregarMonto() {

		montoDeLaCuenta = montoDeLaCuenta + ((double) comensales)
				* costoDelCubierto;

		if (montoDeLaCuenta > cuentaMaxima) {

			cuentaMaxima = montoDeLaCuenta;

		}

	}

	public double cerrarMesa() {

		if (mesaAbierta) {

			mesaAbierta = false;
			cantidadDeUsos++;

		}
		return montoDeLaCuenta;
	}

	public int cantidadDeVecesQueSeUso() {

		return cantidadDeUsos;

	}

	public double cuentaMaxima() {

		return cuentaMaxima;

	}

}
