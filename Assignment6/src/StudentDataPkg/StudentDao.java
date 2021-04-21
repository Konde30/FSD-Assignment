package StudentDataPkg;

import java.sql.SQLException;
import java.util.List;

public interface StudentDao {


    void addStudent(Student student) throws SQLException;
    void updateStudent(Student student) throws SQLException;
    void deleteStudent(int RollNo) throws SQLException;
    Student getStudentByRollNo(int RollNo) throws SQLException;
    List<Student> getStudent() throws SQLException;
}
