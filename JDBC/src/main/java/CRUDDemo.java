import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CRUDDemo {
	public void insertEmployee(EmployeeDetails ed) throws SQLException {
		Connection con = DBUtil.getMySQLConnection();
		PreparedStatement pst = con.prepareStatement("insert into empdatails(empid ,empName, empcity) values (?,?,?);");
		pst.setInt(1, ed.getEmpId());
		pst.setString(2, ed.getEmpName());
		pst.setString(3, ed.getEmpCity());
		if (pst.executeUpdate() > 0) {
			System.out.println("Record Inserted");
		} else {
			System.out.println("Record not inserted");
		}
		con.close();
	}

	public void readEmployee() throws SQLException {
		Connection con = DBUtil.getMySQLConnection();
		PreparedStatement pst = con.prepareStatement("select * from empdatails;");
		ResultSet rs = pst.executeQuery();
		while (rs.next()) {
			System.out.println(rs.getInt(1) + " | " + rs.getString(2) + " | " + rs.getString(3));
		}
		con.close();

	}

	public void updateEmployee(EmployeeDetails ed) throws SQLException {
		Connection con = DBUtil.getMySQLConnection();
		PreparedStatement pst = con.prepareStatement( "update empdatails set empname=? where empid=?;");
		pst.setString(1, ed.getEmpName());
		pst.setString(2, ed.getEmpCity());
		if (pst.executeUpdate() > 0) {
			System.out.println("Emp Updated");
		} else {
			System.out.println("Emp Not Updated");
		}

		con.close();

	}

	public void deleteEmployee(int empId) throws SQLException {
		Connection con = DBUtil.getMySQLConnection();
		PreparedStatement pst = con.prepareStatement("delete from empdatails where empid=?;");
		pst.setInt(1, empId);
		if (pst.executeUpdate() > 0) {
			System.out.println("Record deleted Successfully");
		} else {
			System.out.println("Record not deleted");
		}
		con.close();
	}

}
