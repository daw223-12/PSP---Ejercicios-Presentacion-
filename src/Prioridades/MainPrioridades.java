package Prioridades;

public class MainPrioridades {
    public static void main(String[] args) {
        // Crear instancias de hilos
        HiloPrioridades hilo1 = new HiloPrioridades("hilo1");
        HiloPrioridades hilo2 = new HiloPrioridades("hilo2");

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

