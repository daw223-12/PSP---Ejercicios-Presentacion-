package CambiosDeEstado;

public class MainEstados {
	 public static void main(String args[]) {
		 // Instancio los hilos
	        MiHilo hilo1 = new MiHilo("Hilo 1 :");
	        MiHilo hilo2 = new MiHilo("Hilo 2 :");
	        
	        // Inicia la ejecución de ambos hilos
	        hilo1.start();
	        hilo2.start();

	        // Simula una suspensión temporal del hilo1 después de 2 segundos
	        try {
	            Thread.sleep(2000);
	            hilo1.suspender();
	            System.out.println("Hilo1 suspendido después de 2 segundos.");
	            Thread.sleep(2000);
	            hilo1.reanudar();
	            System.out.println("Hilo1 reanudado después de 4 segundos.");
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        // Espera a que ambos hilos finalicen antes de continuar
	        try {
	            hilo1.join();
	            hilo2.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
}
