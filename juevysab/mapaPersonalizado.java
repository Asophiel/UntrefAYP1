class MapaPersonalizado {

	Nave nave1 = new Nave();
	Radar radar1 = nave1.obtenerRadar();

	void salirDeBase() {

		nave1.despegar();
	}

	int avanzarAlEsteHastaAsteroides() {
		int pasosEste = 0;
		while (radar1.escanearEste() != Espectro.ASTEROIDE) {
			nave1.avanzarAlEste();
			pasosEste = pasosEste + 1;
		}

		return pasosEste;
	}

	int avanzarAlSurHastaHueco() {
		int pasosSur = 0;
		while (radar1.escanearEste() != Espectro.VACIO) {
			nave1.avanzarAlSur();
			pasosSur = pasosSur + 1;
		}
		return pasosSur;
	}

	void avanzarAlEste() {
		for (int i = 0; i < 7; i++) {
			nave1.avanzarAlEste();
		}
	}

	void avanzarAlNorteHastaAsteroides() {
		while (radar1.escanearNorte() != Espectro.ASTEROIDE){
			nave1.avanzarAlNorte();
		}
	}

	void romperAsteroides() {
		while (radar1.escanearNorte() == Espectro.ASTEROIDE) {
			nave1.atacarAlNorte();
		}
	}

	void avanzarAlNorteHastaContenedor() {
		while (radar1.escanearNorte() != Espectro.CONTENEDOR) {
			nave1.avanzarAlNorte();
		}
	}

	void escanearYCargarContenedor() {
		if (radar1.escanearNorte() == Espectro.CONTENEDOR) {
			nave1.cargarDesdeNorte(Sustancia.ANTIMATERIA, 100);
		}
	}

	void avanzarSurHastaHueco() {
		for (int y = 0; y < 3; y++) {
			nave1.avanzarAlSur();
		}
	}

	void avanzarOesteHastaHueco() {
		for (int u = 0; u < 6; u++) {
			nave1.avanzarAlOeste();
		}
	}

	void avanzarNorteHastaBase() {
		for (int p = 0; p < avanzarAlSurHastaHueco(); p++) {
			nave1.avanzarAlSur();
		}
	}

	void avanzarOesteHastaBase() {
		for (int g = 0; g < avanzarAlEsteHastaAsteroides(); g++) {
			nave1.avanzarAlOeste();
		}
	}

	void descargarEnBase() {
		nave1.descargarEnOeste(Sustancia.ANTIMATERIA, 100);
	}

	void misionRecolectar() {
		salirDeBase();
		avanzarAlEsteHastaAsteroides();
		avanzarAlSurHastaHueco();
		avanzarAlEste();
		avanzarAlNorteHastaAsteroides();
		romperAsteroides();
		avanzarAlNorteHastaContenedor();
		escanearYCargarContenedor();
		avanzarSurHastaHueco();
		avanzarOesteHastaHueco();
		avanzarNorteHastaBase();
		avanzarOesteHastaBase();
		descargarEnBase();

	}

}
