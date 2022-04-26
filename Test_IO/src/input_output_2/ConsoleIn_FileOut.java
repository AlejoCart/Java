package input_output_2;

import java.io.*;

public class ConsoleIn_FileOut {

	public static void main(String[] args) throws IOException{
		
		
		InputStreamReader B_C;
	    FileWriter C_B;
	    String entrada;
	    String Salida;
	    File file= new File("TFC.txt");
	    
		BufferedReader in = new BufferedReader(B_C = new InputStreamReader(System.in));
		BufferedWriter out= new BufferedWriter(C_B = new FileWriter(file));
		
		System.out.println("Escribe, para salir ingresa 'salir' ");
		
		do {
			entrada=in.readLine();
			out.write(entrada + "/n");
			
			
		}while(!entrada.equals("salir"));
		
		out.close();
	}

}
