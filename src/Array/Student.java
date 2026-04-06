package Array;

public class Student {
    
    int sId;
    String sname;
    int age;
    String grade;
    
    public Student(int sId, String name, int age, String grade) {
        this.sId = sId;
        this.sname = name;
        this.age = age;
        this.grade = grade;
    }
    
    @Override
    public String toString() {
        return "Student [sId=" + sId + ", sname=" + sname + ", age=" + age + ", grade=" + grade + "]";
    }
}