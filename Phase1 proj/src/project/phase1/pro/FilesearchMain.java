package project.phase1.pro;

import java.io.File;
import java.util.Scanner;

public class FilesearchMain {

	
	private static Scanner sc;

	public static void filesearch() {
		


		MainMenuClass.rootpath = new File("D:\\work\\JavaPhase1pro\\Files");
		sc = new Scanner(System.in);
		
		System.out.println("Enter the file to be search");
		
		String file = sc.next();
		
		String filesearch = MainMenuClass.rootpath.getPath()+"//"+ file;
		MainMenuClass.rootpath = new File(filesearch);
		
		if (MainMenuClass.rootpath.exists()) {
			
			System.out.println("File is present");
		} else 
			System.out.println("File is not present");
		
	}
	}

