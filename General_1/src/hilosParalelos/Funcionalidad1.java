package hilosParalelos;

public class Funcionalidad1 implements Runnable{

	private String dato="Buscando datos...";
	private int time=0;
	public Funcionalidad1(int tiempo){
		this.time=tiempo;
	}
	
	public void run() {
		
		try {
			Thread.sleep(time*1000);
			System.out.println(dato);
		}catch(InterruptedException e) {}
		
	}
	
}
