package au.com.arv.dao.dao;

import java.util.Set;

import au.com.arv.dao.pojo.Employee;

public interface EmployeeDAO {
	public Set<Employee> getEmployees();
	public Employee getEmployee(int id);
}
