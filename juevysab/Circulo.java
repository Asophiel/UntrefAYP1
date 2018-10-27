class Circulo {

	private double radio;

	public Circulo(double radioDelCirculo) {

		if (radioDelCirculo > 0) {

			radio = radioDelCirculo;

		} else if (radioDelCirculo < 0) {

			radio = radioDelCirculo * (-1);

		} else {
			radioDelCirculo = 1;

		}

	}
		
	public double obtenerRadio(){
		return radio;
	}
			
	public double obtenerDiametro() {

		double diametro = radio * 2;
		return diametro;

	}

	public double obtenerSuperficie() {

		double superficie = (radio * radio) * Math.PI;
		return superficie;
	}

	public double obtenerPerimetro() {

		double perimetro = radio * 2 * Math.PI;
		return perimetro;

	}
	
	public void cambiarRadio(double nuevoRadio) {
		
		double nuevoDiametro = nuevoRadio * 2;
		cambiarDiametro (nuevoDiametro);
	}
	
	public void cambiarDiametro(double nuevoDiametro) {
		
		cambiarRadio(nuevoDiametro/2);
		 
	
	}
	
	public void cambiarSuperficie(double nuevaSuperficie){
			
		
		
		
	}

}
