package Practical_12;

public class Student {

    String studentID;
    int averageGrade;

    Student(String studentID, int averageGrade) {
        this.studentID = studentID;
        this.averageGrade = averageGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID='" + studentID + '\'' +
                ", averageGrade=" + averageGrade +
                '}';
    }

}
