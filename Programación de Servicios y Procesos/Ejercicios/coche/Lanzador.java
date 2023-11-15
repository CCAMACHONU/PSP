package coche;

public class Lanzador {
	public static void main(String[] args) {
		Carrera carrera = new Carrera(1000);
		Coche cocheAlonso = new Coche("Alonso", 100, carrera);
		Coche cocheLuis = new Coche("Luis", 120, carrera);
		Coche cochePablo = new Coche("Tower", 69, carrera);
		
		Thread alonsoThread = new Thread(cocheAlonso);
		alonsoThread.start();
		
		Thread luisThread = new Thread(cocheLuis);
		luisThread.start();
		
		Thread pabloThread = new Thread(cochePablo);
		pabloThread.start();
		
		
		try {
			alonsoThread.join();
			pabloThread.join();
			luisThread.join();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		
		carrera.imprimirPodio();
		
	
	}
}
