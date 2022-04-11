package Practical_11;

import java.util.ArrayList;

public class Module {

    String moduleID;
    int classListSize;

    ArrayList<String> classList = new ArrayList<>();

    public String getModuleID() {
        return moduleID;
    }

    public void setModuleID(String moduleID) {
        this.moduleID = moduleID;
    }


    /**
     * A function that add a student number (s)
     * to the classlist.
     *
     * @param s The student number.
     */
    public void addStudent(String s) {
        classList.add(s);
    }

    /**
     * A function that removes a student number (s)
     * from the classlist.
     *
     * @param s The student number.
     */
    public void removeStudent(String s) {
        classList.remove(s);
    }

    /**
     * A sets the size of the classlist.
     */
    public int setClassSize() {
        classListSize = classList.size();
        return classListSize;
    }

    public int getClassListSize() {
        return classList.size();
    }

    public void setClassListSize(int classListSize) {
         this.classListSize = classList.size();
    }

    @Override
    public String toString() {
        return "Module{" +
                "moduleID='" + moduleID + '\'' +
                ", classList=" + classList +
                ", classListSize=" + classListSize +
                '}';
    }
}
