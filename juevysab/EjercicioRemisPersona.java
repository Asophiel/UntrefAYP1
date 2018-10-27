class Persona {

	private int DNI;
	private int fechaDeNacimiento;
	private String nombre;
	private int edadesDeLosOcupantes = 0;
	private int pasajeroConMasEdad = 0;
	private int año = 20092018;
	private int cantidadDeOcupantes = 0;

	public void Pasajero(String nombreDelPasajero, int dniDelPasajero,
			int fechaNacimientoPasajero) {
		cantidadDeOcupantes = cantidadDeOcupantes + 1;
		int edad = año - fechaNacimientoPasajero;
		if (edad > pasajeroConMasEdad) {
			pasajeroConMasEdad = edad;
		}
		edadesDeLosOcupantes = edadesDeLosOcupantes + edad;
		nombre = nombreDelPasajero;
		DNI = dniDelPasajero;
		fechaDeNacimiento = fechaNacimientoPasajero;

	}

	public int PasajeroConMasEdad() {
		return pasajeroConMasEdad;
	}

	public double PromedioEdad() {
		double promedio = ((double) edadesDeLosOcupantes)
				/ ((double) cantidadDeOcupantes);
		return promedio;
	}

	public void Chofer(String nombreDelChofer, int dniDelChofer,
			int fechaNacimientoChofer) {

		nombre = nombreDelChofer;
		DNI = dniDelChofer;
		fechaDeNacimiento = fechaNacimientoChofer;
	}

	public int obtenerDNI() {
		return DNI;
	}

	public int obtenerFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public String obtenerNombre() {
		return nombre;
	}

}

class Remis {

	private String marca;
	private String patente;

	public void Auto(String marcaDelAuto, String patenteDelAuto) {
		marca = marcaDelAuto;
		patente = patenteDelAuto;
	}

	public String obtenerMarca() {
		return marca;
	}

	public String obtenerPatente() {
		return patente;
	}

}