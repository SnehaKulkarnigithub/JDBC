public class OperationsEmployee {

	public static void main(String[] args) {
		CRUDDemo cd = new CRUDDemo();
		try {
			//EmployeeDetails ed=new EmployeeDetails(9,"etyt","mumbai");
				//cd.insertEmployee(ed);
				
				cd.readEmployee();
				
				EmployeeDetails ed1=new EmployeeDetails(10,"uyeiu","nagpur");
				
				cd.updateEmployee(ed1);
			
				cd.deleteEmployee(201);
				
			}
	catch (Exception e) {
			e.printStackTrace();
		}

	}
}

