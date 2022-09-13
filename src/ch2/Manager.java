package ch2;

import java.util.ArrayList;

public class Manager {

	public final ArrayList<Employee> employees = new ArrayList<Employee>();

	public void addEmployee(Employee e) {
		employees.add(e);
	}

	public void printEmployees() {
		for (int i = 0; i < employees.size(); i++) {
			System.out.println(this.employees.get(i).name);
		}
	}

}
