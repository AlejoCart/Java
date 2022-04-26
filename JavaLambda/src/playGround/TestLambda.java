package playGround;

import interfaces.InterfazFuncional;

public class TestLambda <v>{

	public static void main(String[] args) {
		
		System.out.println("Testing lambda");
		
		InterfazFuncional <Number> inter ;
		
		inter= (a) -> {
			System.out.println("numero dentro de contar "); return a;
		};
	
		System.out.print("Probando lambda " + inter.contar(8));
		System.out.print("Probando lambda " + inter.contar(80.2));
		
		System.out.println("Testing lambda 2");
		
		inter=(a) ->{
			
			a=+84;
			System.out.println("El numero mas 84: "+ a);
			return a;
			
		};
		
		InterfazFuncional<String> interS;
	}

}
