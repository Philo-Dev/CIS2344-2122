package Practical_12;

import java.util.ArrayList;

public class Module {

    String moduleID;
    int averageGrade;

    Module(String moduleID, int averageGrade) {
        this.moduleID = moduleID;
        this.averageGrade = averageGrade;
    }

    @Override
    public String toString() {
        return "Module{" +
                "moduleID='" + moduleID + '\'' +
                ", averageGrade=" + averageGrade +
                '}';
    }
}
