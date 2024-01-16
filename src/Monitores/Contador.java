package Monitores;

class Contador {
    private int valor = 0;

    // Método synchronized para incrementar el contador de manera segura
    public synchronized void incrementar() {
        valor++;
        System.out.println("Valor incrementado por el hilo " + Thread.currentThread().getId() + ": " + valor);
    }

    // Método para obtener el valor del contador
    public int obtenerValor() {
        return valor;
    }
}

