package Semaforo;

import java.util.concurrent.Semaphore;

public class MainSemaforo {
	public static void main(String[] args) {
        Semaphore semaforo = new Semaphore(1); // Semáforo binario //con valor inicial 1
        RecursoCompartido recurso = new RecursoCompartido();

        Thread hilo1 = new Thread(() -> {
        try {
                semaforo.acquire(); // Esperar al semáforo
                recurso.incrementar(); // Acceder al recurso //compartido
                semaforo.release(); // Liberar el semáforo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        
        Thread hilo2 = new Thread(() -> {
            try {
                semaforo.acquire(); // Esperar al semáforo
                recurso.incrementar(); // Acceder al recurso //compartido
                semaforo.release(); // Liberar el semáforo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Iniciar los hilos
        hilo1.start();
        hilo2.start();

        // Esperar a que los hilos terminen
        try {
            hilo1.join();
            hilo2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Valor compartido después de la  ejecución: " + recurso.getValorCompartido());
    }

}
