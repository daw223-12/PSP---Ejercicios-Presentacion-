package Completo;

// Hilo que rellena el producto con 15 unidades
class RellenarProducto extends Thread {
    private Almacen almacen;
    private int cantidadRellenar;

    public RellenarProducto(Almacen almacen, int cantidadRellenar) {
        this.almacen = almacen;
        this.cantidadRellenar = cantidadRellenar;
    }

    public void run() {
        for (int i = 1; i <= cantidadRellenar; i++) {
            try {
            	Thread.sleep(800);//Simula la rellenación
                almacen.añadirElemento("Elm" + i);
                System.out.println("Añadido; El stock es de: " + almacen.numeroElementosEnStock());
                System.out.println("Mi prioridad es "+ Thread.currentThread().getPriority());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}