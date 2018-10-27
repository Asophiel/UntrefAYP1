
class MisionGiroAlrededorDeBase {
	void iniciar (){
		
		Nave naveGiratoria = new Nave ();
		naveGiratoria.despegar();
		Radar miRadar = naveGiratoria.obtenerRadar();
		if (miRadar.escanearNorte() == Espectro.VACIO){
			naveGiratoria.avanzarAlNorte();
		if (miRadar.escanearNorte() == Espectro.VACIO){
				naveGiratoria.avanzarAlNorte();
		}
			
		}
		
		//primera vuelta
		
		if (miRadar.escanearEste() == Espectro.VACIO){
			naveGiratoria.avanzarAlEste();
		}
		if (miRadar.escanearEste() == Espectro.VACIO){
			naveGiratoria.avanzarAlEste();
		}
		if (miRadar.escanearSur() == Espectro.VACIO){
			naveGiratoria.avanzarAlSur();
	    }
		if (miRadar.escanearSur() == Espectro.VACIO){
			naveGiratoria.avanzarAlSur();
	    }
		if (miRadar.escanearSur() == Espectro.VACIO){
			naveGiratoria.avanzarAlSur();
	    }
		if (miRadar.escanearSur() == Espectro.VACIO){
			naveGiratoria.avanzarAlSur();
	    }
		
		if (miRadar.escanearOeste() == Espectro.VACIO){
			naveGiratoria.avanzarAlOeste();
		}
		if (miRadar.escanearOeste() == Espectro.VACIO){
			naveGiratoria.avanzarAlOeste();	
		}
		if (miRadar.escanearOeste() == Espectro.VACIO){
			naveGiratoria.avanzarAlOeste();
		}
		while (miRadar.escanearOeste() != Espectro.VACIO){
			naveGiratoria.atacarAlOeste();
		}
		if (miRadar.escanearOeste() == Espectro.VACIO){
			naveGiratoria.avanzarAlOeste();
		}
		if (miRadar.escanearNorte() == Espectro.VACIO){
			naveGiratoria.avanzarAlNorte();
		}
		if (miRadar.escanearNorte() == Espectro.VACIO){
			naveGiratoria.avanzarAlNorte();
		}
		if (miRadar.escanearNorte() == Espectro.VACIO){
			naveGiratoria.avanzarAlNorte();
		}
		if (miRadar.escanearNorte() == Espectro.VACIO){
			naveGiratoria.avanzarAlNorte();
		}
		if (miRadar.escanearEste() == Espectro.VACIO){
			naveGiratoria.avanzarAlEste();
		}
		if (miRadar.escanearEste() == Espectro.VACIO){
			naveGiratoria.avanzarAlEste();
		}
		
 	}

}
