package Semaforo;

import java.util.concurrent.Semaphore;

public class RecursoCompartido {
    private int valorCompartido;

    public RecursoCompartido() {
        this.valorCompartido = 0;
    }

    public int getValorCompartido() {
        return valorCompartido;
    }

    public void incrementar() {
        valorCompartido++;
    }
}
