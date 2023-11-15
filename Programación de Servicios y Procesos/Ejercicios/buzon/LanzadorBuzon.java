package buzon;

public class LanzadorBuzon {

	public static void main(String[] args) {
		// Join espero a que terminen mis hijos para seguir se usa cuando tiene final es
		// programa
		Buzon buzon = new Buzon();
		Emisor Emisor = new Emisor(buzon,1);
		Thread EmisorThread = new Thread(Emisor);
		EmisorThread.start();
		
		Emisor Emisor2 = new Emisor(buzon,2);
		Thread EmisorThread2 = new Thread(Emisor2);
		EmisorThread2.start();
		

		Receptor Receptor = new Receptor(buzon, 1);
		Thread ReceptorThread = new Thread(Receptor);
		ReceptorThread.start();

		Receptor Receptor2 = new Receptor(buzon, 2);
		Thread ReceptorThread2 = new Thread(Receptor2);
		ReceptorThread2.start();

		try {
			EmisorThread.join();
			ReceptorThread.join();
			ReceptorThread2.join();
		} catch (InterruptedException e) {
			System.out.println("No se ha cerrado los hilos");
		}
	}
}
