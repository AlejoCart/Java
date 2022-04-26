package Test;
//import java.math.*;
import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		
		String binario="";
		int decimal=0;
		int valor;
		boolean numeros=true;
		boolean paso=false;
		boolean unLoop=false;
		
		System.out.println("Ingrese un valor binario y no mas de 8 numeros.");
		Scanner entrada= new Scanner(System.in);
		
		do {
		
			if(binario.length()>7 &&unLoop ) System.out.println("Numero ingresado incorrecto, mas de 8 digitos");
			 if(!numeros&&unLoop)System.out.println("Numero ingresado incorrecto, se ingreso un valor distino a '0' y '1'");
		binario=entrada.next();
		numeros=true;
		
		for(int i=0;i<binario.length();i++) {
			
			if(binario.charAt(i)!='0' & binario.charAt(i)!='1')numeros=false;
			
			/*System.out.print(binario.charAt(i));
			System.out.println(numeros);
			System.out.println(binario.length()>8);*/
		      }
		unLoop=true;
		
		if(binario.length()<=8 && numeros)  paso=true;
		
		}while(!paso);
		
		entrada.close();
		
		for(int i=0;i<binario.length();i++) {
			
			char c=binario.charAt(binario.length()-i-1);
			
			if(c=='1') {
				valor=(int) Math.pow(2, i);
				decimal+=valor;
			}
		}
		System.out.println(binario + " en decimal equivale a: "+decimal);
	}
}
	
