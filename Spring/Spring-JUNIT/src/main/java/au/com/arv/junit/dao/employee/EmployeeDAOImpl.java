package au.com.arv.junit.dao.employee;

import java.util.Set;

import au.com.arv.junit.pojo.employee.Employee;

public class EmployeeDAOImpl implements EmployeeDAO{
	public boolean add(Employee employee) throws Exception {
		return false;
	}

	public int remove(Set<Employee> employees) throws Exception {
		return 0;
	}

	public Employee searchById(String id) {
		return null;
	}

	public Set<Employee> searchByName(String name) {
		return null;
	}
}
