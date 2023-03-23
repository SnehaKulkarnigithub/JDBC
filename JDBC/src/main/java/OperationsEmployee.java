public class OperationsEmployee {

	public static void main(String[] args) {
		CRUDDemo cd = new CRUDDemo();
		try {
			EmployeeDetails ed=new EmployeeDetails(2,"Damini","Bhusaval");
				cd.insertEmployee(ed);
				
				cd.readEmployee();
				
				EmployeeDetails ed1=new EmployeeDetails(2,"Damini","Bhusaval");
				
				cd.updateEmployee(ed1);
			
				cd.deleteEmployee(101);
				
			}
	catch (Exception e) {
			e.printStackTrace();
		}

	}
}

