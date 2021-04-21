package StudentDataPkg;

import java.security.PrivateKey;

public class Student {
    private int RollNo;
    private String Name;
    private String ClassName;
    int PRN;
    public Student(){

    }
    public Student (int RollNo,String Name,String ClassName,int PRN){
        this.RollNo=RollNo;
        this.Name=Name;
        this.ClassName=ClassName;
        this.PRN=PRN;
    }
    public Student (String Name,String ClassName,int RollNo){
        this.RollNo=RollNo;
        this.Name=Name;
        this.ClassName=ClassName;

    }
    public Student (int RollNo1,String Name,String ClassName){
        this.RollNo=RollNo1;
        this.Name=Name;
        this.ClassName=ClassName;

    }

    public int getRollNo() {
        return RollNo;
    }

    public void setRollNo(int rollNo) {
        RollNo = rollNo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getClassName() {
        return ClassName;
    }

    public void setClassName(String className) {
        ClassName = className;
    }

    public int getPRN() {
        return PRN;
    }

    public void setPRN(int PRN) {
        this.PRN = PRN;
    }

    @Override
    public String toString() {
        return "Student{" +
                "RollNo=" + RollNo +
                ", Name='" + Name + '\'' +
                ", ClassName='" + ClassName + '\'' +
                ", PRN='" + PRN + '\'' +
                '}';

    }
}
