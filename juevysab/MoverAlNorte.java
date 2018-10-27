class MoverAlNorte {

	Nave naveExploradora = new Nave ();
	Radar radarNaveExploradora = naveExploradora.obtenerRadar();
	
	
	void salirDeBase(){
		
		naveExploradora.despegar(); 
	}
	
	
	int moverAlNorte(int n){
		
		salirDeBase();
		int pasos = 0;
		for (int i = 0; i < n && radarNaveExploradora.escanearNorte() == Espectro.VACIO; i = i + 1) {
			naveExploradora.avanzarAlNorte();
			pasos = pasos + 1;
			
		if (radarNaveExploradora.escanearNorte() != Espectro.VACIO && radarNaveExploradora.escanearNorte() != Espectro.DESCONOCIDO){
			destruirAlNorte();
		}
		
		}
		return pasos;
		
	}
	
	int moverAlOeste(int t){
		
		int pasos = 0;
		for (int i = 0; i < t && radarNaveExploradora.escanearOeste() == Espectro.VACIO; i = i + 1) {
			naveExploradora.avanzarAlOeste();
			pasos = pasos + 1;
			
		while (radarNaveExploradora.escanearOeste() != Espectro.VACIO || radarNaveExploradora.escanearOeste() != Espectro.DESCONOCIDO){
				naveExploradora.atacarAlOeste();
			}
			
		}
		return pasos;
	}
	void destruirAlNorte (){
		
		while (radarNaveExploradora.escanearNorte() != Espectro.VACIO && radarNaveExploradora.escanearNorte() != Espectro.DESCONOCIDO){
			naveExploradora.atacarAlNorte();
		}
	}
	
	void destruirAlOeste(){
		
		while (radarNaveExploradora.escanearOeste() != Espectro.VACIO && radarNaveExploradora.escanearOeste() != Espectro.DESCONOCIDO){
			naveExploradora.atacarAlOeste();
		}
	}
	
	int llegarAlMargenNorte(int n){
		naveExploradora.despegar();
		int pasosTotales =0;
		if (radarNaveExploradora.escanearNorte() == Espectro.VACIO){
			pasosTotales = moverAlNorte(n);
		} else { 
			destruirAlNorte();
			
		}
		return pasosTotales;
	}
	
	int moverNaveNorteOeste(int n , int t){
		int pasosTotales = 0;
		salirDeBase();
		if (radarNaveExploradora.escanearNorte() == Espectro.VACIO){
			moverAlNorte(n);
		} else {
			destruirAlNorte();
		}
		if (radarNaveExploradora.escanearOeste() == Espectro.VACIO){
			moverAlOeste(t);
		} else {
			destruirAlOeste();
		}
		pasosTotales = n + t;
		return pasosTotales;
	}	
	
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	