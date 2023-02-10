package mysqldemos;

import java.io.File;
import java.io.IOException;

public class filehandling {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		File file= new File("C:\\Users\\welcome\\Desktop\\new record.txt");
		try {
			if(file.createNewFile()) {
				System.out.println("File created: " +file.getName());
				
			}else
			{
				System.out.println("File alredy exists:");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("An error occured:");
			e.printStackTrace();
		}

	}

}
