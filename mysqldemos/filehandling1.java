package mysqldemos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class filehandling1 {
	
	public static void main(String[] args) {
		
		try {
				FileWriter myWriter = new FileWriter("C:\\Users\\welcome\\Desktop\\new record.txt");
				myWriter.write("Name:lucky");
				myWriter.write("\nName:lucky");
				myWriter.write("\nPhone number: 9052569833");
				myWriter.write("\naadhar number: 137591875046");
				myWriter.close();
				System.out.println("Successfully wrote to the File.");
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("An error occured:");
			e.printStackTrace();
		}
	
	}
}
