package Monitores;

class HiloIncrementador extends Thread {
    private Contador contador;

    public HiloIncrementador(Contador contador) {
        this.contador = contador;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            // Llamada al método incrementar dentro de un bloque synchronized
            synchronized (contador) {
                contador.incrementar();
            }

            // Simulación de otras operaciones no críticas
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
