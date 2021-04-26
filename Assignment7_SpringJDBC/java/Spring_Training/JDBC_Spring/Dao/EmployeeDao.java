package Spring_Training.JDBC_Spring.Dao;

import java.util.List;
import java.util.Map;

import Spring_Training.JDBC_Spring.entities.Employee;

public interface EmployeeDao {
	public int addEmployee(Employee employee);
	public int updateEmployee(Employee employee);
	public void deleteEmployee(int id);
	public void getEmployee(int id);
	public void getAllEmployees();
	

}
