package Completo;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

// Simula un almacen
class Almacen {
	private BlockingQueue<String> cola = new LinkedBlockingQueue<>(6); // Capaciad máxima 6 elm
	// Devuelve el tamño de la cola (el numero de elementos en stock
	public int numeroElementosEnStock() {
		return cola.size();
	}
	//Añade un elemento a la cola
    public void añadirElemento(String elemento) throws InterruptedException {
        cola.put(elemento);
    }
    //Retira un elemento de la cola
    public String quitarElemento() throws InterruptedException {
        String elemento = cola.take();
        return elemento;
    }
}
