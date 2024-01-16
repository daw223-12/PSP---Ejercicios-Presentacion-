package Monitores;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia del contador compartido
        Contador contadorCompartido = new Contador();

        // Crear varios hilos que intentarán incrementar el contador
        HiloIncrementador hilo1 = new HiloIncrementador(contadorCompartido);
        HiloIncrementador hilo2 = new HiloIncrementador(contadorCompartido);

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

        // Mostrar el valor final del contador
        System.out.println("Valor final del contador: " + contadorCompartido.obtenerValor());
    }
}

