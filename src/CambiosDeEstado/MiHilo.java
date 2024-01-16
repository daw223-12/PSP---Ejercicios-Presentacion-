package CambiosDeEstado;

class MiHilo extends Thread {
	
	private String id;
	private volatile boolean suspendido = false;
	
	public MiHilo(String id)
	{
		this.id = id;
	}
	
	

    public void suspender() {
        suspendido = true;
    }

    public synchronized void reanudar() {
        suspendido = false;
        notify();
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(id + " Valor: " + i);
            try {
                // Simulamos una pausa aleatoria para mostrar cambios de estado
                Thread.sleep(1000);

                // Verifica si el hilo ha sido suspendido
                synchronized (this) {
                    while (suspendido) {
                        wait();
                    }
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
