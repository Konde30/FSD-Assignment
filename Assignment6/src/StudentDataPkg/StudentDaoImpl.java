package StudentDataPkg;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {
    private static Statement statement=null;
    private Connection conn;
    public StudentDaoImpl() throws SQLException {
        conn=ConnectionFactory.getConnection();
        statement=conn.createStatement();


    }

    @Override
    public void addStudent(Student student) throws SQLException {
        String sql = "insert into studentdata values (" + student.getRollNo() +
                ", '" + student.getName()+ "', '" +
                student.getClassName()+"','"+ student.getPRN()+ "')";
        int count = 0;
        count = statement.executeUpdate(sql);

        if (count > 0) {
            System.out.println("Student saved");
        } else {
            System.out.println("Student Data Not Saved");
        }
    }





    @Override
    public void updateStudent(Student student) throws SQLException {
        String sql = "update studentdata set Name='"+student.getName()+"', ClassName='"+student.getClassName()+"' where RollNo="+ student.getRollNo();
        int count = 0;
        count = statement.executeUpdate(sql);

        if (count > 0) {
            System.out.println("Student Data Updated");
        } else {
            System.out.println("Student Data Not Updated");
        }
    }



    @Override
    public void deleteStudent(int RollNo) throws SQLException {
        String sql = "delete from studentdata where RollNo= "+ RollNo;
        int count = 0;
        count = statement.executeUpdate(sql);

        if (count > 0) {
            System.out.println("Student Deleted");
        } else {
            System.out.println("Student data not Deleted");
        }

    }

    @Override
    public Student getStudentByRollNo(int RollNo) throws SQLException {
        Student  studentid = null;
        String sql = "select * from studentdata where RollNo = "+ RollNo;
        ResultSet rs = statement.executeQuery(sql);
        if(rs.next()){
            int RollNo1 = rs.getInt("RollNo");
            String Name = rs.getString("Name");
            String ClassName = rs.getString("ClassName");
            studentid = new Student( RollNo1,Name, ClassName);
        }
        return studentid;

    }

    @Override
    public List<Student> getStudent() throws SQLException {
        List<Student> list = new ArrayList<>();
        String sql = "select * from studentdata";
        ResultSet rs = statement.executeQuery(sql);
        while (rs.next()){
            int RollNo = rs.getInt("RollNo");
            String Name = rs.getString("Name");
            String ClassName = rs.getString("ClassName");
            int PRN=rs.getInt("PRN");
            Student student = new Student(RollNo, Name, ClassName,PRN);
            list.add(student);
        }
        return list;
    }
}
