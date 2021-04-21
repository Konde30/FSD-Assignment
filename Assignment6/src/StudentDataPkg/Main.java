package StudentDataPkg;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
       // StudentDao dao = StudentDaoFactory.getStudentDao();

        System.out.println("Please select any one options for Student Data");
        System.out.println("***************************");
        System.out.println("Press 1: Insert");
        System.out.println("Press 2: Update");
        System.out.println("Press 3: Delete");
        System.out.println("Press 4: Get");
        System.out.println("****************************");

        int option = scanner.nextInt();
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
                getStudent();
                break;
            }
            default: {
                System.out.println("Incorrect options");
            }
        }
    }

    private static void getStudent() throws SQLException {
        StudentDao dao=StudentDaoFactory.getStudentDao();
        List<Student> list =  dao.getStudent();
        for (Student stud:list) {
            System.out.println(stud.toString());
        }
    }

    private static void delete() throws SQLException {
        StudentDao dao=StudentDaoFactory.getStudentDao();
        dao.deleteStudent(1);

    }

    private static void update() throws SQLException {
        StudentDao dao=StudentDaoFactory.getStudentDao();
        Student student1=new Student("Akshay","BE",1);
        dao.updateStudent(student1);

    }

    private static void insert() throws SQLException {
        StudentDao dao=StudentDaoFactory.getStudentDao();
        Student student=new Student(1,"poja","BE",1234);
        dao.addStudent(student);
    }
//    Student list1 =  dao.getStudentByRollNo(3);
//            System.out.println(list1.toString());
}
