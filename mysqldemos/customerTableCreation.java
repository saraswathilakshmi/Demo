package mysqldemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class customerTableCreation {

			public static void createNewTable() {
				String url = "jdbc:mysql://localhost:3306/mydb";
				String username= "root";
				String password="3003";
				String sql= "CREATE TABLE `mydb`.`customers` (\n"
						  +" `id` INT NULL, \n"
						  +" `name` VARCHAR(45) NOT NULL, \n"
						  +"`age` INT NULL, \n"
						  +"`aadhar number` BIGINT NULL, \n"
						  +"`mobile number` VARCHAR(45), \n"
						  +"`address` VARCHAR(45) NULL,\n"
						  +" PRIMARY KEY (`name`))";
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


