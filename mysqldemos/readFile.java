package mysqldemos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readFile {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file= new File("C:\\Users\\welcome\\Desktop\\new record1.txt");
		Scanner sc= new Scanner(file);
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
		
	}

}
