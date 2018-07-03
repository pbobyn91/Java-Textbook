public class BasePlusCommissionEmployeeTest {
	
	public static void main(String[] args){
		
		BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee("Bob", "Lewis",
											"333-33-3333", 5000, .04, 300);
		
		System.out.printf("Employee information obtained by get methods:%n");
		System.out.printf("%s %s%n", "First Name is ", 	employee.getFirstName());
		System.out.printf("%s %s%n", "Last Name is ", 	employee.getLastName());
		System.out.printf("%s %s%n", "Social Security Number is ", 	employee.getSocialSecurityNumber());
		System.out.printf("%s %.2f%n", "Gross Sales is ", 	employee.getGrossSales());
		System.out.printf("%s %.2f%n", "Commission Rate is ", 	employee.getCommissionRate());
		System.out.printf("%s %.2f%n", "Base Salary is ", 	employee.getBaseSalary());
		
		employee.setBaseSalary(1000);
		
		System.out.printf("%n%s:%n%n%s%n", "Updated employee information obtained by toString", employee.toString());
		
	}
}