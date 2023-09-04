package Concepts.IOStreams;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class CopyBuffers {
	public static void main(String[] args) throws IOException {
		BufferedReader bReader=null;
		BufferedWriter bWriter=null;
		
		try {
			bReader=new BufferedReader(new FileReader("Buffer.txt")); //source file
			bWriter=new BufferedWriter(new FileWriter("Buffered.txt"));
			
			String line;
			while((line=bReader.readLine())!=null) {
				bWriter.write(line);
			}
			System.out.println("Process is Completed");
			
		}
		catch (IOException e) {
			e.getStackTrace();
		}
		finally {
			if(bReader !=null) {
				bReader.close();
			}
			if(bWriter!=null) {
				bWriter.close();
			}
		}
	}

}
