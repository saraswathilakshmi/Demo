package mysqldemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class transactiontablecreation {

	public static void createNewTable() {
		String url = "jdbc:mysql://localhost:3306/mydb";
		String username= "root";
		String password="3003";
		String sql= "CREATE TABLE `mydb`.`transaction` (\n"
				  +" `id` INT NOT NULL, \n"
				  +"`aadhar number` BIGINT(30) NULL, \n"
				  +"`txn time` TIME(5), \n"
				  +"`status` VARCHAR(45) NULL,\n"
				  +" PRIMARY KEY (`id`))";
		try(Connection con= DriverManager.getConnection(url,username,password);
				Statement stmt= con.createStatement())
						{
					stmt.execute(sql);
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	public static void main(String[] args) {
		createNewTable();
	}
}