package hilosParalelos;

public class Funcionalidad2 extends Thread{

	
	public void run() {
		
		for(int i=1;i<=20;i++) {
			System.out.println("Valor de i: "+i);
			
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				
			}
		}
		
	}
	
}
