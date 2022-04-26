package input_output;
import java.io.*;

public class FileI_In_Console_O {

	public static void main(String[] args) {
		
		OutputStreamWriter output;
		String Inter;
		BufferedReader input;
		FileReader file;
		
		try {
			
			input=new BufferedReader(file=new FileReader("D:\\Eclipse resources\\Test.txt"));
				
			do {Inter=input.readLine();
				System.out.println(Inter);
			}while(input.readLine()!=null);
			
			
		}catch (IOException exc) {
				
			System.out.println(exc);
		}
			
	}
}
