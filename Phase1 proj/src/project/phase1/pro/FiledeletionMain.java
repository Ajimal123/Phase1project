package project.phase1.pro;

import java.io.File;
import java.util.Scanner;

public class FiledeletionMain  {
	
	private static Scanner sc;

	public static void filedelete() throws Exception {
		

		MainMenuClass.rootpath = new File("D:\\work\\JavaPhase1pro\\Files");
		sc = new Scanner(System.in);
		
		System.out.println("Enter the file to be Deleted");
		
		String deletfile = sc.next();
		
		String deletefilepath = MainMenuClass.rootpath.getPath()+ "//" +deletfile;
		MainMenuClass.rootpath = new File(deletefilepath);
		
		if(MainMenuClass.rootpath.exists())
		{
			MainMenuClass.rootpath.delete();
			System.out.println("File sucessfully deleted");
		}else {
			System.out.println("File not present");
		}
		
		
	}

}
