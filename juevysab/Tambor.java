class Tambor {

	private DadoNCaras dado;

	Tambor(){
		
		dado = new DadoNCaras(3);
	}
	public void girar() {

		dado.tirar();
	}

	public int obtenerValor() {
		return dado.obtenerValor();
	}

}
