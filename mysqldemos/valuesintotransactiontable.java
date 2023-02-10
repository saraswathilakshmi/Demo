package mysqldemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;
import org.apache.logging.log4j.*;

public class valuesintotransactiontable {
private static Logger demoLogger= Logger.getLogger(valuesintotransactiontable.class.getName());
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		demoLogger.info("Successfully connected to DB");
		
		
	//1) Create Connection
		Connection con= DriverManager.getConnection("jdbc:mysql://LOCALHOST:3306/mydb","root","3003");
		
		//2) Create a statement
		Statement stmt= con.createStatement();
		//String a= "INSERT INTO transaction VALUES(01,12345678901,'06:32:45','Confirmed')";
		String s= "INSERT INTO transaction VALUES (02,897604839210,'08:30:23','Confirmed')"; 
		String s1="INSERT INTO transaction VALUES(03,897048690022,'03:05:45','Not Confirmed')";
		String s2="INSERT INTO transaction VALUES(04,905043507799,'09:34:20','Confirmed')"; 
		String s3="INSERT INTO transaction VALUES(05,891122669082,'09:44:45','Confirmed')";
		String s4="INSERT INTO transaction VALUES(06,465768903522,'08:45:01','Not Confirmed')";
		String s5="INSERT INTO transaction VALUES(07,354668794536,'07:10:10','Not Confirmed')";
		String s6="INSERT INTO transaction VALUES(08,786947584930,'09:15:18','Confirmed')";
		String s7="INSERT INTO transaction VALUES(09,905676035351,'10:30:30','Not Confirmed')";
		String s8="INSERT INTO transaction VALUES(10,123455668901,'12:45:01','Confirmed')";
		
		//3) Execute the quer
		stmt.execute(s);
		stmt.execute(s1);
		stmt.execute(s2);
		stmt.execute(s3);
		stmt.execute(s4);
		stmt.execute(s5);
		stmt.execute(s6);
		stmt.execute(s7);
		stmt.execute(s8);
		//stmt.execute(a);
		
		//4) Close the Connection
		con.close();
		System.out.println("Query Executed...");
		
	}

}