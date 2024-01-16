package Completo;

public class RetirarUrgente extends Thread {
	private Almacen almacen;
    private int cantidadVaciar;
    
    public RetirarUrgente(Almacen almacen,int cantidadVaciar) {
        this.almacen = almacen;
        this.cantidadVaciar = cantidadVaciar;
    }

    public void run() {
        for (int i = 1; i <= cantidadVaciar; i++) {
            
                try {
					almacen.quitarElemento();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                System.out.println("URGENCIA; El stock es de: " + almacen.numeroElementosEnStock());
        }
    }
}
