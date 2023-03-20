import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class OperationsEmployee {

	public static void main(String[] args) {
		Connection con = DBUtil.getMySQLConnection();
		CRUDDemo cd = new CRUDDemo();
		try {
			System.out.println("Enter your choice:");
			Scanner sc=new Scanner(System.in);
			int choice= sc.nextInt();
			switch (choice) {
			case 1:
				cd.insertEmployee(701, "xyz", "Mumbai");
				break;
			case 2:
				cd.readEmployee();
				break;
			case 3:
				cd.updateEmployee(601, "abc", "Kolkata");
				break;
			case 4:
				cd.deleteEmployee(601, "abc", "kolkata");
				break;

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
