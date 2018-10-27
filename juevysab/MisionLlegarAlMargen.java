
class MisionLlegarAlMargen {
	
	void iniciar (){
		
		Nave miNave = new Nave ();
		miNave.despegar();
		
		Radar miRadar = miNave.obtenerRadar();
		
		while(miRadar.escanearNorte() == Espectro.VACIO){
			
			miNave.avanzarAlNorte();
		

			while (miRadar.escanearNorte() == Espectro.ASTEROIDE){
				
				miNave.atacarAlNorte();
			}
		}
	}
}
