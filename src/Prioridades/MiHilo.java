package Prioridades;

class MiHilo extends Thread {

	private String id;
	public MiHilo (String id)
	{
		this.id = id;
	}

    @Override
    public void run() {
    	//Simulo una ejecución compleja
        for (int i=0; i<5; i++)
        {
        	try {
        		Thread.sleep(1000);
        		Thread.yield();
        	} catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //Mando un mensaje cuando termino
        System.out.println("Hilo "+id+" ha terminado");
    }
}

