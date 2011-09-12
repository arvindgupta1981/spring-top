package au.com.arv.junit.dao.employee;

import java.util.Set;

import au.com.arv.junit.pojo.employee.Employee;

public interface EmployeeDAO {
	public boolean add(Employee employee)throws Exception;
	public int remove(Set<Employee> employees)throws Exception;
	public Employee searchById(String id);
	public Set<Employee> searchByName(String name);
}
