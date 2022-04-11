package Practical_12;

import java.util.ArrayList;
import java.util.List;

public class StudentSupportOffice {

    public static void main(String[] args) {

        //Arraylist for grades
        ArrayList<Grade> list = new ArrayList<Grade>();

        //Creates new instances of Grade and adding them to the array list
        Grade grade1 = new Grade("CIS2344", "U0000001",50);
        Grade grade2 = new Grade("CIS2344", "U0000002",80);
        Grade grade3 = new Grade("CIS2360", "U0000003",75);
        Grade grade4 = new Grade("CIS2360", "U0000004",50);
        Grade grade5 = new Grade("CIM2130", "U0000005",60);

        list.add(grade1);
        list.add(grade2);
        list.add(grade3);
        list.add(grade4);
        list.add(grade5);

        System.out.println(list);

        //Updates a grade in the array
        Grade grade6 = new Grade("CIS2344","U0000001",50);
        list.set(list.indexOf(grade1),grade6);

        //Inserts a new grade into the array
        Grade grade7 = new Grade("CIM2130","U0000006",90);
        list.add(grade7);

        //Removes a grade from the array
        list.remove(grade4);

        System.out.println(list);
    }
}
