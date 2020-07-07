package adapter;

public class Main {

	public static void main(String[] args) {
		/** Using Class/Two-way adapter **/ 

		
		/** Using Object Adapter **/
		Employee employee = new Employee();
		EmployeeClassAdapter employeeClassAdapter = new EmployeeClassAdapter();
		populateEmployeeData(employee);
		populateEmployeeData(employeeClassAdapter);
		EmployeeObjectAdapter employeeObjectAdapter = new EmployeeObjectAdapter(employee);
		BusinessCardDesigner businessCardDesigner = new BusinessCardDesigner();
		System.out.println(businessCardDesigner.designCard(employeeObjectAdapter));
		System.out.println(businessCardDesigner.designCard(employeeClassAdapter));


	}

	private static void populateEmployeeData(Employee employee) {
		employee.setFullName("Elliot Alderson");
		employee.setJobTitle("Security Engineer");
		employee.setOfficeLocation("Allsafe Cybersecurity, New York City, New York");
	}
}
