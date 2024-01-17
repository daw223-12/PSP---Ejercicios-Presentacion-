package Completo;

public class MainCompleto {
	
	public static void main(String[] args) throws InterruptedException {
        Almacen almacen = new Almacen();
        
        System.out.println("El stock inicial es: "+almacen.numeroElementosEnStock());
        //Crea los hilos
        RellenarProducto hiloAñadir = new RellenarProducto(almacen, 15);
        RetirarProducto hiloQuitar = new RetirarProducto(almacen, 10);
        RetirarUrgente hiloUrgente = new RetirarUrgente(almacen, 5);
        hiloUrgente.setPriority(Thread.MAX_PRIORITY);
        //Inicializa los hilos dejando un espacio entre ellos
        hiloAñadir.start();
        Thread.sleep(2000);
        hiloQuitar.start();
        Thread.sleep(2000);
        hiloUrgente.start();
        
        try {
        	hiloAñadir.join();
        	hiloQuitar.join();
        	
        	System.out.println("\nEl stock final es: "+almacen.numeroElementosEnStock());
        	
        } catch (InterruptedException e) {
			// TODO: handle exception
		}
    }
	
}
