package project.phase1.pro;

import java.io.File;
import java.util.Scanner;

public class FilecreationMain  {

	private static Scanner sc;
	

	public static void FileCreation() throws Exception{
		

		MainMenuClass.rootpath = new File("D:\\work\\JavaPhase1pro\\Files");
		sc = new Scanner(System.in);
		
		
		System.out.println("Enter the filename to be created");
		
		String fileName = sc.next()	;
		
		// String path = jj.getPath()+ "//" + "aac.txt";
		
		String path = MainMenuClass.rootpath.getPath()+ "//" + fileName;
		MainMenuClass.rootpath = new File(path);
		
		if (MainMenuClass.rootpath.exists())
		{
			
			System.out.println("File already exixt");
		}
		else {
		MainMenuClass.rootpath.createNewFile();		
		System.out.println("File Created");}
		
		
		
	}

	
}
