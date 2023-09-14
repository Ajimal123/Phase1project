package project.phase1.pro;

import java.io.File;
import java.util.Scanner;

import project.phase1.pro.exception.ProperValuefromcustomer;

public class MainMenuClass {
	
	static File rootpath = new File("D:\\work\\JavaPhase1pro\\Files");
	
	
	public static void Mainmenuoptions () throws Exception
	{
		
	    Scanner sc = new Scanner(System.in);
		String condition = null;
		
		do {
			
			System.out.println("Please enter the below options you want to check from your end");
			System.out.println("Please enter 1 : Display all files in ascending order");
			System.out.println("Please enter 2 : SubMenu Options :: ADD / DELETE / SEARCH the specified files in the application  ");
			System.out.println("Please enter 3 : Exit from the application");
			
			int choice = sc.nextInt();
			switch (choice) {
			case 1:FilehandlingMain.Handling();
				break;
			case 2:	SubmenuOptionmenu.subOption();
				break;
			case 3:	System.exit(0);
				break;
			default: System.out.println("Please enter the correct option");
			

			}
			
			
			System.out.println("Do you want to continue ? (Y/N)");
			condition = sc.next();
			
			try {
			if (!condition.equalsIgnoreCase("Y") && !condition.equalsIgnoreCase("N")) {
				
				throw new ProperValuefromcustomer("Please enter Y or N");
			}
			}catch (Exception e)
			{
				System.err.println(e);
				
			}
			
		} while (condition.equalsIgnoreCase("y"));
		
		sc.close();
	}

}
