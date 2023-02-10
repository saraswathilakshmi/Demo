package mysqldemos;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
public class logMessages {
		
		public static void main(String[] args) throws SQLException {
			Logger log = Logger.getLogger(logMessages.class);
			int num = 5;
	
			BasicConfigurator.configure();
				Connection con = null;
					if (num < 10) {
						con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "3003");
							log.info("Connected Successfully");
		} else {
			log.error("error");
			}
					int num1 = 6;
					try(Statement stmt = con.createStatement();)  {
					String a = "update customers SET address='GUJARATHI' where id=7";
					stmt.executeUpdate(a);
					if(num1>5)
					{
						log.info("Data Updated Successfully");
					}else
					{
						log.error("Data  not Updated");
					}
					}catch(SQLException se) {
						System.out.println(se.getMessage());
						se.printStackTrace();
					}catch(Exception e) {
						System.out.println(e.getMessage());
						e.printStackTrace();
					}
					con.close();
					//System.out.println("Sucessfully updated");
				
			}
		}




	


