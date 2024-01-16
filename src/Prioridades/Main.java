package Prioridades;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de hilos
        MiHilo hilo1 = new MiHilo("hilo1");
        MiHilo hilo2 = new MiHilo("hilo2");

        // Establecer la prioridad de los hilos
        hilo1.setPriority(Thread.MIN_PRIORITY);
        hilo2.setPriority(Thread.MAX_PRIORITY);

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
    }
}

