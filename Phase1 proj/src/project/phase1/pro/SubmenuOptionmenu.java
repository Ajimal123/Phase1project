package project.phase1.pro;
import java.util.Scanner;

public class SubmenuOptionmenu {

	private static Scanner sc;

	public static void subOption () throws Exception{
		
		System.out.println("Please enter A : ADD user specified files to the application");
		System.out.println("Please enter B : DELETE a user specified files from the application");
		System.out.println("Please enter C : SEARCH a user specified files from the application");
		sc = new Scanner(System.in);
		String option = sc.next() ;
	
		
		if (option.equalsIgnoreCase("A")) {
			FilecreationMain.FileCreation();
		}else if (option.equalsIgnoreCase("B")){
			FiledeletionMain.filedelete();
			}else if (option.equalsIgnoreCase("C")) {
				FilesearchMain.filesearch();
			}else 
				System.out.println("Enter valid key");

		
		
	}
}
