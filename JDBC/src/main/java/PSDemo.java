
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PSDemo {

	public static void main(String[] args) {
		Connection con = DBUtil.getMySQLConnection();
		try {
			PreparedStatement pst = con.prepareStatement("select * from empdatails where empid=? AND empname=? "); // use at industry level
			pst.setInt(1, 101);
			pst.setString(2, "john");
			System.out.println("Statement created");
			ResultSet rs = pst.executeQuery();
			System.out.println("Query exhicuted");
			while (rs.next()) 
			{
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
			}
			con.close();
		} catch (Exception e) 
		{
			System.out.println(e);
		}

	}

}

// config.properties
//key=value
//rs.getInt  rs.getString
//