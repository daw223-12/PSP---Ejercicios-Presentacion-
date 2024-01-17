package Completo;

// Hilo que retira productos
class RetirarProducto extends Thread {
    private Almacen almacen;
    private int cantidadVaciar;
    
    public RetirarProducto(Almacen almacen,int cantidadVaciar) {
        this.almacen = almacen;
        this.cantidadVaciar = cantidadVaciar;
    }

    public void run() {
        for (int i = 1; i <= cantidadVaciar; i++) {
            try {
            	Thread.sleep(800);
                almacen.quitarElemento();
                System.out.println("Quitado; El stock es de: " + almacen.numeroElementosEnStock());
                if (almacen.numeroElementosEnStock() <= 4)
                {
                	Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
                } else {
                	Thread.currentThread().setPriority(Thread.NORM_PRIORITY);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}