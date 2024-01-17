package Completo;

// Hilo que rellena el producto
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
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}