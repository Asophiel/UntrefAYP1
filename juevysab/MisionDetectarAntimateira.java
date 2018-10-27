class MisionDetectarAntimateria {
	void ejecutar() {

		Nave naveExploradora = new Nave();
		naveExploradora.despegar();

		Radar radarNaveExploradora = naveExploradora.obtenerRadar();

		naveExploradora.avanzarAlSur();
		naveExploradora.avanzarAlSur();
		naveExploradora.avanzarAlOeste();

		if (radarNaveExploradora.buscarAlOeste(Sustancia.ANTIMATERIA) >= 100) {

			naveExploradora.cargarDesdeOeste(Sustancia.ANTIMATERIA, 100);
			naveExploradora.avanzarAlEste();
			naveExploradora.avanzarAlNorte();
			naveExploradora.descargarEnNorte(Sustancia.ANTIMATERIA, 100);
		} else {
			while (radarNaveExploradora.escanearOeste() == Espectro.CONTENEDOR) {

				naveExploradora.atacarAlOeste();
			}
			naveExploradora.avanzarAlEste();
			naveExploradora.avanzarAlNorte();
		}

	}

}
