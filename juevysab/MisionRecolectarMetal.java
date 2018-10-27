
class MisionRecolectarMetal {
	void ejecutar(){		
						
	
		Nave naveRecolectora1 = new Nave();
		naveRecolectora1.despegar();
		Radar radarNaveRecolectora1 = naveRecolectora1.obtenerRadar();
		
		naveRecolectora1.avanzarAlOeste();
		
		for (int i = 0 ; i < 16  ; i = i + 1){
			
			naveRecolectora1.avanzarAlOeste();
			
		}
		for (int e = 0; e < 6; e = e + 1){
			
			naveRecolectora1.avanzarAlSur();
		}
		if (radarNaveRecolectora1.buscarAlSur(Sustancia.METAL) >= 50){
				
				naveRecolectora1.cargarDesdeSur(Sustancia.METAL, 50);
		}
				
		
			Nave naveRecolectora2 = new Nave();
			naveRecolectora2.despegar();
			Radar radarNaveRecolectora2 = naveRecolectora2.obtenerRadar();
			
		for (int r = 0 ; r < 18 ; r = r + 1){
			
			naveRecolectora2.avanzarAlOeste();
		}
		for (int t = 0 ; t < 7 ; t = t + 1){
			
			naveRecolectora2.avanzarAlSur();
		}
			
		if (radarNaveRecolectora2.buscarAlEste(Sustancia.METAL) >= 50){
				
				naveRecolectora2.cargarDesdeEste(Sustancia.METAL, 50);
		}		
		for (int f = 0; f < 6 ; f = f + 1){
				
				naveRecolectora1.avanzarAlNorte();
		}
		while (radarNaveRecolectora1.escanearEste() != Espectro.BASE){
				
				naveRecolectora1.avanzarAlEste();
		}
			naveRecolectora1.avanzarAlSur();
			naveRecolectora1.avanzarAlEste();
			naveRecolectora1.descargarEnNorte(Sustancia.METAL, 50);
		
		for (int g = 0 ; g < 7 ; g = g + 1 ){
				
				naveRecolectora2.avanzarAlNorte();
		}
		while (radarNaveRecolectora2.escanearEste() != Espectro.BASE){
				
				naveRecolectora2.avanzarAlEste();
		}
			naveRecolectora2.descargarEnEste(Sustancia.METAL, 50);
		
	}		
			
}
