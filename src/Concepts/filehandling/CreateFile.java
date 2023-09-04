package Concepts.filehandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile {

	public CreateFile() {
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("File : ");
		String file_name=input.next();
		String path="C:/Test/Directory";
		File file=new File(path+ "/"+file_name);
		boolean result;
		
		try {
			result=file.createNewFile();
			if(result) {
				System.out.println("File Created!! \n"+file.getCanonicalPath());
			}
			else {
				System.out.println("File already exists \n"+file.getCanonicalPath());
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
