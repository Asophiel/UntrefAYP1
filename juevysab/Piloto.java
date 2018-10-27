class Piloto {
	Nave navePilotada = new Nave();
	Radar radar = navePilotada.obtenerRadar();

	int pasosEste = 0;
	int pasosOeste = 0;
	int pasosSur = 0;

	void salirDeLaBase() {
		navePilotada.despegar();
		navePilotada.avanzarAlNorte();
	}

	int moverAlNorte() {
		int pasosNorte = 0;
		while (radar.escanearNorte() == Espectro.VACIO) {
			navePilotada.avanzarAlNorte();
			pasosNorte = pasosNorte + 1;

		}
		return pasosNorte;

	}

	void destruirAlNorte() {

		while (radar.escanearNorte() != Espectro.VACIO
				&& radar.escanearNorte() != Espectro.DESCONOCIDO) {
			navePilotada.atacarAlNorte();
		}
	}

	int llegarAlNorte() {
		int pasosTotalesNorte = 0;
		while (radar.escanearNorte() != Espectro.DESCONOCIDO) {
			int pasos = moverAlNorte();
			pasosTotalesNorte = pasosTotalesNorte + pasos;
			destruirAlNorte();
		}
		return (pasosTotalesNorte);
	}

	int moverAlEste() {
		int pasosEste = 0;
		while (radar.escanearEste() == Espectro.VACIO) {
			navePilotada.avanzarAlEste();
			pasosEste = pasosEste + 1;
		}
		return pasosEste;
	}

	void destruirAlEste() {

		while (radar.escanearEste() != Espectro.VACIO
				&& radar.escanearEste() != Espectro.DESCONOCIDO) {
			navePilotada.atacarAlEste();
		}
	}

	int llegarAlEste() {
		int pasosTotalesEste = 0;
		while (radar.escanearEste() != Espectro.DESCONOCIDO) {
			int pasos = moverAlEste();
			pasosTotalesEste = pasosTotalesEste + pasos;
			destruirAlEste();
		}
		return pasosTotalesEste;
	}

	int moverAlSur() {
		int pasosSur = 0;
		while (radar.escanearSur() == Espectro.VACIO) {
			navePilotada.avanzarAlSur();
			pasosSur = pasosSur + 1;
		}
		return pasosSur;
	}

	void destruirAlSur() {
		while (radar.escanearSur() != Espectro.VACIO
				&& radar.escanearSur() != Espectro.DESCONOCIDO) {
			navePilotada.atacarAlSur();
		}
	}

	int llegarAlSur() {
		int pasosTotalesSur = 0;
		while (radar.escanearSur() != Espectro.DESCONOCIDO) {
			int pasos = moverAlSur();
			pasosTotalesSur = pasosTotalesSur + pasos;
			destruirAlSur();
		}
		return pasosTotalesSur;
	}

	int moverAlOeste() {
		int pasosOeste = 0;
		while (radar.escanearOeste() == Espectro.VACIO) {
			navePilotada.atacarAlOeste();
			pasosOeste = pasosOeste + 1;
		}
		return pasosOeste;
	}

	void destruirAlOeste() {
		while (radar.escanearOeste() != Espectro.VACIO
				&& radar.escanearOeste() != Espectro.DESCONOCIDO) {
			navePilotada.atacarAlOeste();
		}
	}

	int llegarAlOeste() {

		int pasosTotalesOeste = 0;
		while (radar.escanearOeste() != Espectro.DESCONOCIDO) {
			int pasos = moverAlOeste();
			pasosTotalesOeste = pasosTotalesOeste + pasos;
			destruirAlOeste();
		}
		return pasosTotalesOeste;
	}
} 
