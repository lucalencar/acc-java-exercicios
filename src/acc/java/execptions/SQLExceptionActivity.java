package acc.java.execptions;
//Needs to be completed
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//The following program throws a checked exception. 
public class SQLExceptionActivity {


	public static void main(String[] args) throws SQLException {

			String url = "jdbc:mysql://localhost/activity1"; 
			String user = "root";
			String pass = "abcd1234";
			
			//The following code would not compile unless it's put inside a try catch
			//1 - put it in a try block and handle ClassNotFoundException
			
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				System.out.println(e);
			}
			
			Connection cn = DriverManager.getConnection(url, user, pass);
			System.out.println("Connection successfully established! \n");
			
			cn.close();
			
			//2 - You also need to catch SQLException for it to compile
			
	
	}

}
