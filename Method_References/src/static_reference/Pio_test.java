package static_reference;

public class Pio_test {
	
	private int internal;
	
	public Pio_test (int i) {
		
		internal=i;
			
	}
	public Pio_test() {
		
		internal=1;
	}
    public Pio_test(Pio_test p ) {
		
		internal=1;
	}
    
    int getInternal() {
    	return this.internal;
    }

	public static void main(String[] args) {
		
		double Pi=4.0;
		int i=20;
		
		GenericFunctionalInterface er= Pio_test::new;
		
		er.genericM(20);
		System.out.println(er.genericM(20).getInternal());

	}

}
