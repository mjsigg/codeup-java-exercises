package grades;

import java.util.ArrayList;

public class Student {
    private String studentName;
    private String userName;
    private ArrayList<Integer> grades;

    ////Constructor
    public Student(String studentName) {
        this.studentName = studentName;
        this.grades = new ArrayList<>();
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void addGrade (int grade) {
        grades.add(grade);
    }

    public double getGradeAverage() {
        int sum = 0;
        for (int grade : grades) {
           sum += grade;
        }
        return sum / grades.size();
    }


    public static void main(String[] args) {

    }

}
