package Completo;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

class Almacen {
	private BlockingQueue<String> cola = new LinkedBlockingQueue<>(6); // Capaciad máxima 6 elm
	
	public int numeroElementosEnStock() {
		return cola.size();
	}
	
    public void añadirElemento(String elemento) throws InterruptedException {
        cola.put(elemento);
    }

    public String quitarElemento() throws InterruptedException {
        String elemento = cola.take();
        return elemento;
    }
}
