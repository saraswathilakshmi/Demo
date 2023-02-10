package mysqldemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MYSQLDMLCommands {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		
	//1) Create Connection
		Connection con= DriverManager.getConnection("jdbc:mysql://LOCALHOST:3306/mydb","root","3003");
		
		//2) Create a statement
		Statement stmt= con.createStatement();
		
		String s= "INSERT INTO sty VALUES(115,'DIANA')";
		
		//3) Execute the query
		stmt.execute(s);
		//4) Close the Connection
		con.close();
		System.out.println("Query Executed...");
		
	}

}
