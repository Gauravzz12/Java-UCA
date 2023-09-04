package Concepts.filehandling;

import java.io.File;
import java.util.Scanner;

public class CreateDirectory {

	public CreateDirectory() {
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Path : ");
		String path=input.next();
		
		boolean createMoreDirectory=true;
		do {
			System.out.println("New Directory Name : ");
			String newDirectoryName=input.next();
			
			path=path+"\\"+newDirectoryName;
			
			File file=new File(path);
			
			boolean isCreated=file.mkdirs();
			
			if(isCreated) {
				System.out.println("New Directory is Successfully Created.");
			}
			else {
				System.out.println("OOps!Error in Creating new  directory");
			}
			
			System.out.println("Add another(Y/N) : ");
			
			String option=input.next();
			
			if(option.toUpperCase().equals("N")) {
				createMoreDirectory=false;
				break;
			}
		}while(createMoreDirectory);
	}

}
