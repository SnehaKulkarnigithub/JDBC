import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

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
			e.printStackTrace();
		}
				  return con;
		
	}
	
	public static void cleanup(Connection con, Statement st, ResultSet rs) {
		try {
			// 7.Release the Resources
			if (rs != null)
				rs.close();
			if (st != null)
				st.close();
			if (con != null)
				con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void cleanup(Connection con, Statement st) {
		try {
			// 7.Release the Resources
			if (st != null)
				st.close();
			if (con != null)
				con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
