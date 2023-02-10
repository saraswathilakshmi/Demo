package mysqldemos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class valuesentryintocustomertable {
	public static void main(String[] args) throws SQLException {
		//1) Create Connection
		Connection con= DriverManager.getConnection("jdbc:mysql://LOCALHOST:3306/mydb","root","3003");
		//2) Create a statement
		Statement stmt= con.createStatement();
		//String s= "INSERT INTO customers VALUES (02,'OLIVER',26,897604839210,9086753422,'TAMILNADU')"; 
		//String s1="INSERT INTO customers VALUES(03,'VLAD',32,897048690022,9703659844,'VIJAYAWADA')";
		//String s2="INSERT INTO customers VALUES(04,'NIKKI',29,905043507799,9767207125,'vizag')"; 
		//String s3= "INSERT INTO customers VALUES(05,'KRISH',33,891122669082,8979561290,'ARAKU')";
		//String s4="INSERT INTO customers VALUES(06,'AINITI',22,465768903522,9676206124,'HYDERABAD')";
		//String s5="INSERT INTO customers VALUES(07,'AASHRITH',25,354668794536,0704659855,'GURAZALA')";
		//String s6="INSERT INTO customers VALUES(08,'RAM',35,786947584930,9000876482,'GUJARAT')";
		//String s7="INSERT INTO customers VALUES(09,'LAKSHMI',30,905676035351,9053659821,'GOA')";
		//String s8="INSERT INTO customers VALUES(10,'PRASAD',45,123455668901,1234567890,'DUBAI')";/*
		//String s9="insert into customers values('11','Sonu',34,'12345678911','9867482910','Banglore')";
		String s10= "INSERT INTO CUSTOMERS VALUES(12, 'SARU',32,'1234556677','456789001234','KERALA')";
		//3) Execute the quer
		//stmt.execute(s);
		//stmt.execute(s1);
		//stmt.execute(s2);
		//stmt.execute(s3);
		//stmt.execute(s4);
		//stmt.execute(s5);
		//stmt.execute(s6);
		//stmt.execute(s7);
		//stmt.execute(s8);
		//stmt.execute(s9);
		stmt.execute(s10);
		String a = "update customers SET address='GUJARATH' where name='AASHRITH'";
		stmt.executeUpdate(a);

		//4) Close the Connection
		con.close();
		System.out.println("Query Executed...");
		
	}

}
