package primero;

public class ExceptionTesting1 {
	public static void exceptions(int a) {
		
		try {
			
			//System.out.println("Number: "+a/0);
			int[] b= {1,2,3};
			for(int i=0;i<=b.length;i++) System.out.print(b[i]);
			
		}
		catch(ArithmeticException e) {
			
			System.out.print(e.getMessage());
			//System.out.print(e.toString());
			e.printStackTrace();
		}catch(IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		exceptions(2);

	}

}
