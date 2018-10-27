
class MisionLlegarAlMargenOeste {
	void iniciar() { 
		
		Nave nave1 = new Nave();
		nave1.despegar();
		Radar radarNave1 = nave1.obtenerRadar();
		
		while (radarNave1.escanearOeste() == Espectro.VACIO){
			
			nave1.avanzarAlOeste();
			
			while (radarNave1.escanearOeste() == Espectro.ASTEROIDE){
				
				nave1.atacarAlOeste();
			}
		}
	}
}
