
class MisionRecorrerContorno {
	void ejecutar(){
		
		Nave navePatrulla = new Nave ();
		navePatrulla.despegar();
		
		Radar radarPatrulla = navePatrulla.obtenerRadar();
		
		while (radarPatrulla.escanearSur() != Espectro.DESCONOCIDO){
			navePatrulla.avanzarAlSur();
			
			while(radarPatrulla.escanearSur() == Espectro.ASTEROIDE || radarPatrulla.escanearSur() == Espectro.CONTENEDOR){
				navePatrulla.atacarAlSur();
				
			}
		}
		
		while (radarPatrulla.escanearOeste() != Espectro.DESCONOCIDO){
			navePatrulla.avanzarAlOeste();
			
			while(radarPatrulla.escanearOeste() == Espectro.ASTEROIDE || radarPatrulla.escanearOeste() == Espectro.CONTENEDOR){
				navePatrulla.atacarAlOeste();
		
			}	
		}
		
		while (radarPatrulla.escanearNorte() != Espectro.DESCONOCIDO){
			navePatrulla.avanzarAlNorte();
			
			while(radarPatrulla.escanearNorte() == Espectro.ASTEROIDE || radarPatrulla.escanearNorte() == Espectro.CONTENEDOR){
				navePatrulla.atacarAlNorte(); 
			}
		}
		
		
		while (radarPatrulla.escanearEste() != Espectro.DESCONOCIDO){
			navePatrulla.avanzarAlEste();
			
			while(radarPatrulla.escanearEste() == Espectro.ASTEROIDE || radarPatrulla.escanearEste() == Espectro.CONTENEDOR){
				navePatrulla.atacarAlEste();
			}
		}
		
		while (radarPatrulla.escanearSur() != Espectro.DESCONOCIDO){
			navePatrulla.avanzarAlSur();
			
			while(radarPatrulla.escanearSur() == Espectro.ASTEROIDE || radarPatrulla.escanearSur() == Espectro.CONTENEDOR){
				navePatrulla.atacarAlSur();
				
			}	
		}	
		while (radarPatrulla.escanearOeste() != Espectro.DESCONOCIDO){
			navePatrulla.avanzarAlOeste();
			
			while(radarPatrulla.escanearOeste() == Espectro.ASTEROIDE || radarPatrulla.escanearOeste() == Espectro.CONTENEDOR){
				navePatrulla.atacarAlOeste();
				
			}
		}	
	}
	
}
