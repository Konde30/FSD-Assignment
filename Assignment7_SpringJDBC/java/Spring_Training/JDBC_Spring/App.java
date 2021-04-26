package Spring_Training.JDBC_Spring;
import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Spring_Training.JDBC_Spring.Dao.EmployeeDaoImpl;
import Spring_Training.JDBC_Spring.entities.Employee;

public class App 
{
    public static void main( String[] args ) throws SQLException
    {
    	
    	 ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    	
         
       System.out.println( "Application is started......." );
//        
//        JdbcTemplate jdbcTemplate=  (JdbcTemplate) context.getBean("jdbcTemplate");
//    
//       List<Map<String, Object>> result=jdbcTemplate.queryForList("select * from employee");
//      System.out.println(result);
      int option1=6;
    int option = 0;
    	  do {
    	  
          System.out.println("================================================================");
          System.out.println("Press 1: Insert");
          System.out.println("Press 2: Update");
          System.out.println("Press 3: Delete");
          System.out.println("Press 4: Get");
          System.out.println("Press 5: Get By Id");
          System.out.println("Press 6: For Terminate");
          System.out.println("==================================================================");
          
          System.out.println("Please select any one options");

    	  Scanner scanner = new Scanner(System.in);
    	  option = scanner.nextInt();
          
          switch (option){
              case 1: {
                  insert();
                  break;
              }
              case 2: {
                  update();
                  break;
              }
              case 3: {
                  delete();
                  break;
              }
              case 4: {
                  get();
                  break;
              }
              case 5: {
                  getById();
                  break;
              }
              case 6: {
                 
                  break;
              }
              default: {
                  System.out.println("Incorrect options");
              }
          }
  
    }while(option!=6);
    }
	private static void getById() {
		 ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		 EmployeeDaoImpl daoImpl=context.getBean("empDao",EmployeeDaoImpl.class);
		
		 daoImpl.getEmployee(1);
		
	}

	private static void get() {
		 ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		 EmployeeDaoImpl daoImpl=context.getBean("empDao",EmployeeDaoImpl.class);
		  daoImpl.getAllEmployees();
		
	}

	private static void delete() {
		 ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		 EmployeeDaoImpl daoImpl=context.getBean("empDao",EmployeeDaoImpl.class);
		 daoImpl.deleteEmployee(4);
		
	}

	private static void update() {
		 ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		 EmployeeDaoImpl daoImpl=context.getBean("empDao",EmployeeDaoImpl.class);
    	 Employee employee=new Employee();
		 employee.setName("Kp");
    	 employee.setEmail("KK@gmail.com");
    	 employee.setId(3);
    	 
    	 int result1=daoImpl.updateEmployee(employee);
    	 System.out.println("("+result1+") rows updated...");
		
	}

	private static void insert() {
		 ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		 EmployeeDaoImpl daoImpl=context.getBean("empDao",EmployeeDaoImpl.class);
    	 Employee employee=new Employee();
         employee.setEmail("Pooja@gmail.com");
         employee.setName("Pooja");
         employee.setId(3);
         int result = daoImpl.addEmployee(employee);
         System.out.println("("+result+") rows inserted..");
		
	} 
}
       
        
    

