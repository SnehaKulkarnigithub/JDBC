import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
	public static Connection getMySQLConnection()
	{
		Connection con=null;
		try {
				//Step 1: load the driver
				
				Class.forName("com.mysql.cj.jdbc.Driver");   //optional after 1.6 it manually add
				
				//Step 2: Connect with database using url , username and password
				
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
				  return con;
		
	}

}
