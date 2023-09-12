package project.phase1.pro;

import java.io.File;
import java.text.Collator;
import java.util.Arrays;

public class FilehandlingMain {

	public static void Handling()
	{

		MainMenuClass.rootpath = new File("D:\\work\\JavaPhase1pro\\Files");
		String fileName[] = MainMenuClass.rootpath.list();
//		
//		for(String files : fileName)
//		{
//			System.out.println(files);
//		}
	
		Arrays.sort(fileName, Collator.getInstance());  // case sensitive sorting of array
		
			
		System.out.println("Please find the Assending order of the files in the Application");
		
			for(String files : fileName)
			{
				System.out.println(files);
			}
			
		
		
	}
		
	}
	
