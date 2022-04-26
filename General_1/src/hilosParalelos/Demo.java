package hilosParalelos;

public class Demo {
	
	public static void main(String args[]) {
		
	
	Thread hilo1= new Funcionalidad2();
	
	Runnable hilo2= new Funcionalidad1(5);
	Runnable hilo3= new Funcionalidad1(10);
	Runnable hilo4= new Funcionalidad1(15);
	
	hilo1.start();
	new Thread(hilo2).start();
	new Thread(hilo3).start();
	new Thread(hilo4).start();
	
	}

}
