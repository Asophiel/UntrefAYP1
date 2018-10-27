
class MisionGirarAlrededorDeLaBase {
	void proceder () {
		
		Nave patrulla = new Nave();
		patrulla.despegar();
		patrulla.avanzarAlNorte ();
			
		for (int vueltas = 0 ; vueltas < 5 ; vueltas = vueltas + 1){
		
		
			patrulla.avanzarAlEste();
			patrulla.avanzarAlSur ();
			patrulla.avanzarAlSur ();
			patrulla.avanzarAlOeste ();
			patrulla.avanzarAlOeste ();
			patrulla.avanzarAlNorte ();
			patrulla.avanzarAlNorte ();
			patrulla.avanzarAlEste ();
		
		
		}
	}
	
}
