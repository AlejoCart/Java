package static_reference;

public class StaticMethodReferenceDemo {
	
	static boolean test(Functional_interface f,int v) {
		
		return f.method(v);
		
	}

	public static void main(String[] args) {


		System.out.println(test(Static_method_class::comprobation, 5));

	}

}
