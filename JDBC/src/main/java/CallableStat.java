import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class CallableStat {

	void callable()
	{
		Connection con= DBUtil.getMySQLConnection();
		try
		{
			CallableStatement cs=con.prepareCall("call employee.printemp()");
			boolean b=cs.execute();
			
			System.out.println(b);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
		

	

}
