class Dado {

	private int valor;

	public Dado() {

		tirar();
	}

	public void tirar() {

		valor = ((int) (Math.random() * 6) + 1);

	}

	public int obtenerValor() {

		return valor;

	}

}
