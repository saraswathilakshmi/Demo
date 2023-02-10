package mysqldemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class selectById {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url="jdbc:mysql://localhost:3306//mydb";
		String uname="root";
		String pass="3003";
		String Query="select name from mydb.sty where id=114"; 
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		Statement st= con.createStatement();
		ResultSet rs=st.executeQuery(Query);
		rs.next();
		String name= rs.getString("uname");
		System.out.println(name);
		st.close();
		con.close();

	}

}
