import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbcDemo {

	public static void main(String[] args) {
		try
		{
		//Step 1: load the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Step 2: Connect with database using url , username and password
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjavajdbc_01", "root", "root");
		
		//Step 3: create Statement
		
		Statement stmt=con.createStatement();
		
		//Step 4 : Execute query
		
		ResultSet rs=stmt.executeQuery("select * form emp");
		
		//Step 5 : Extract data
		
		while (rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+ " " +rs.getString(3));
		}
		con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}

	}

}




// config.properties
//key=value
//rs.getInt  rs.getString
//