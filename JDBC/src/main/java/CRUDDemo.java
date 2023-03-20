import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CRUDDemo {
	public void insertEmployee(int empId, String empName, String empCity) throws SQLException {
		EmployeeDetails ed = new EmployeeDetails(empId, empName, empCity);
		String query = "insert into empdatails(empid ,empName, empcity)" + "values" + "(?,?,?);";
		Connection con = DBUtil.getMySQLConnection();
		PreparedStatement pst = con.prepareStatement(query);
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
		String query = "select * from empdatails;";
		Connection con = DBUtil.getMySQLConnection();
		PreparedStatement pst = con.prepareStatement(query);
		ResultSet rs = pst.executeQuery();
		while (rs.next()) {
			System.out.println(rs.getInt(1) + " | " + rs.getString(2) + " | " + rs.getString(3));
		}
		con.close();

	}

	public void updateEmployee(int empId, String empName, String empCity) throws SQLException {
		EmployeeDetails ed = new EmployeeDetails(empId, empName, empCity);
		String query = "update empdatails set empname=? , empcity=? where empid=" + ed.getEmpId() + ";";
		Connection con = DBUtil.getMySQLConnection();
		PreparedStatement pst = con.prepareStatement(query);
		pst.setString(1, ed.getEmpName());
		pst.setString(2, ed.getEmpCity());
		if (pst.executeUpdate() > 0) {
			System.out.println("Emp Updated");
		} else {
			System.out.println("Emp Not Updated");
		}

		con.close();

	}

	public void deleteEmployee(int empId, String empName, String empCity) throws SQLException {
		EmployeeDetails ed = new EmployeeDetails(empId, empName, empCity);
		String query = "delete from empdatails where empid=" + ed.getEmpId() + ";";
		Connection con = DBUtil.getMySQLConnection();
		PreparedStatement pst = con.prepareStatement(query);
		if (pst.executeUpdate() > 0) {
			System.out.println("Record deleted Successfully");
		} else {
			System.out.println("Record not deleted");
		}
		con.close();
	}

}
