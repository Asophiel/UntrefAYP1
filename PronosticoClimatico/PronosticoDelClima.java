public class PronosticoDelClima {

	private double temperaturaSabado;
	private double temperaturaDomingo;

	/**
	 * post: el pronostico queda inicializado con temperatura de 0º para el
	 * sábado y el domingo.
	 */
	public PronosticoDelClima() {

		temperaturaSabado = 0;
		temperaturaDomingo = 0;
	}

	/**
	 * post: devuelve la temperatura pronosticada para el día sábado en grados
	 * centígrados.
	 */
	public double obtenerTemperaturaDelSabado() {

		return temperaturaSabado;
	}

	/**
	 * post: devuelve la temperatura pronosticada para el día domingo en grados
	 * centígrados.
	 */
	public double obtenerTemperaturaDelDomingo() {

		return temperaturaDomingo;
	}

	/**
	 * pre : se indica la temperatura en grados centígrados en el rango (-40.0,
	 * 50.0). post: cambia la temperatura pronosticada para el día sábado.
	 * 
	 */
	public void pronosticarSabado(double temperatura) {

		if (temperaturaValida(temperatura)) {

			temperaturaSabado = temperatura;
		}
	}

	/**
	 * pre : se indica la temperatura en grados centígrados en el rango (-40.0,
	 * 50.0). post: cambia la temperatura pronosticada para el día domingo.
	 * 
	 */
	public void pronosticarDomingo(double temperatura) {

		if (temperaturaValida(temperatura)) {

			temperaturaDomingo = temperatura;
		}
	}

	private boolean temperaturaValida(double temperatura) {

		return ((temperatura > -40) && (temperatura < 50));
	}

	/**
	 * post: devuelve la temperatura promedio del pronóstico, en grados
	 * centígrados.
	 */
	public double calcularPromedio() {

		return (obtenerTemperaturaDelDomingo() + this
				.obtenerTemperaturaDelSabado()) / 2;
	}

	/**
	 * post: devuelve la temparatura más baja del pronóstico.
	 */
	public double buscarTemperaturaMinima() {

		double minima = obtenerTemperaturaDelSabado();

		if (obtenerTemperaturaDelDomingo() < minima) {

			minima = obtenerTemperaturaDelDomingo();
		}

		return minima;
	}

	/**
	 * post: devuelve la temparatura más alta del pronóstico.
	 */
	public double buscarTemperaturaMaxima() {

		double maxima = obtenerTemperaturaDelSabado();

		if (obtenerTemperaturaDelDomingo() > maxima) {

			maxima = obtenerTemperaturaDelDomingo();
		}

		return maxima;
	}
}
