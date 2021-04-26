package Spring_Training.JDBC_Spring.Dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

import Spring_Training.JDBC_Spring.entities.Employee;

public class EmployeeDaoImpl<var> implements EmployeeDao {
	private JdbcTemplate jdbcTemplate;
	

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int addEmployee(Employee employee) {
		String query = "insert into employee (id, name, email) values (?,?,?)";
        int result =  jdbcTemplate.update(query,employee.getId(), employee.getName(), employee.getEmail());
        return result;
	}

	public int updateEmployee(Employee employee) {
		String query="update employee set name=?,email=? where id=?";

	int	result1 =jdbcTemplate.update(query,employee.getName(),employee.getEmail(),employee.getId());
		if(result1>0) {
			System.out.println("Employee updated");
		}else {
			System.out.println("employee not updated");
		}
		return result1;
		
	}

	public void deleteEmployee(int id) {
		String query="delete from employee where id=?";

		int	result1 =jdbcTemplate.update(query,id);
			if(result1>0) {
				System.out.println("("+result1+")Employee deleted");
			}else {
				System.out.println("employee not deleted");
			}
	}

	public void getEmployee(int id) {
	     String sql="select * from employee where id="+id;
		List<Map<String, Object>> employee2= jdbcTemplate.queryForList(sql);
		System.out.println("Employee selected from id number");
		   System.out.println(employee2);
	}

	public void getAllEmployees() {

		String sql="select * from employee";
		List<Map<String, Object>> employee1= jdbcTemplate.queryForList(sql);
		System.out.println("All Employee data");
	   System.out.println(employee1);
		//return employee1;
		//return employee1;
	}

}
