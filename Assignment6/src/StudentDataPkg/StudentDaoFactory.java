package StudentDataPkg;

import java.sql.SQLException;

public class StudentDaoFactory {
    private static StudentDao dao;
    public static StudentDao getStudentDao() throws SQLException {
        if(dao==null){
            dao=new StudentDaoImpl();
        }
        return dao;
    }
}
