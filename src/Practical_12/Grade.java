package Practical_12;

public class Grade{

    String module;
    String student;
    int score;

    Grade(String module, String student, int score) {
        this.module = module;
        this.student = student;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "module='" + module + '\'' +
                ", student='" + student + '\'' +
                ", score=" + score +
                '}' + "\n";
    }
}
