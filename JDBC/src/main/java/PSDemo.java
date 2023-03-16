
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class PSDemo{

	public static void main(String[] args) {
		//Step 1 : get connection
		Connection con=DBUtil.getMySQLConnection();
		try
		{
		//Step 2: create PreparedStatement
		
		PreparedStatement pst=con.prepareStatement("select * from empdatails where empid=? AND empname=? "); //use at industry level
		pst.setInt(1, 101);
		pst.setString(2, "john");
		System.out.println("Statement created");
		
		//Step 3 : Execute query
		
		ResultSet rs=pst.executeQuery();
		System.out.println("Query exhicuted");
		
		//Step 4 : Extract data
		
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