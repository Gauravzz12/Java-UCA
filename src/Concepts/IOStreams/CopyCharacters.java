package Concepts.IOStreams;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class CopyCharacters {


	public static void main(String[] args) throws IOException {
		FileReader in=null;
		FileWriter out=null;
		
		try {
			in=new FileReader("abc"); //source file
			out=new FileWriter("xyz.txt");
			
			int c;
			while((c=in.read())!=-1) {
				out.write(c);
			}
			System.out.println("Process is Completed");
			
		}
		catch (FileNotFoundException fe) {
			System.out.println("Sorry, the source file is not found!");
		}
		finally {
			if(in !=null) {
				in.close();
			}
			if(out!=null) {
				out.close();
			}
		}
	}

}
