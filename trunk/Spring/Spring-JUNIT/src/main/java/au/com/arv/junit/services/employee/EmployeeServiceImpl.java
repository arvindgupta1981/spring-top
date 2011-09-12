package au.com.arv.junit.services.employee;

import java.util.Set;

import au.com.arv.junit.dao.employee.EmployeeDAO;
import au.com.arv.junit.dao.employee.EmployeeDAOImpl;
import au.com.arv.junit.pojo.employee.Employee;

public class EmployeeServiceImpl implements EmployeeService{
	private EmployeeDAO employeeDAO;
	public EmployeeServiceImpl(){
		employeeDAO=new EmployeeDAOImpl();
	}
	
	public boolean add(Employee employee) throws Exception {
		return employeeDAO.add(employee);
	}

	public int remove(Set<Employee> employees) throws Exception {
		return employeeDAO.remove(employees);
	}

	public Employee searchById(String id) {
		return employeeDAO.searchById(id);
	}

	public Set<Employee> searchByName(String name) {
		return employeeDAO.searchByName(name);
	}
}
