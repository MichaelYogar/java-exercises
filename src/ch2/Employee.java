package ch2;

public class Employee {
	
	public final String name;
	
	public Employee(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		Employee newHire = new Employee("John");
		Employee newHire2 = new Employee("Adam");
		
		Manager manager = new Manager();
		manager.addEmployee(newHire);
		manager.addEmployee(newHire2);
		manager.printEmployees();
	}
	
}
