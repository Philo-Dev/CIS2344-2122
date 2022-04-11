package Practical_11;

import java.util.ArrayList;

public class StudentSupportOffice {

    public static void main(String[] args) {
        Module module1 = new Module();          //adds the first module "CIS2344" and students to the corresponding classlist.
        module1.setModuleID("CIS2344");
        module1.addStudent("U0000001");
        module1.addStudent("U0000004");
        module1.setClassSize();

        Module module2 = new Module();          //adds the second module "CIS2360" and students to the corresponding classlist.
        module2.setModuleID("CIS2360");
        module2.addStudent("U0000001");
        module2.addStudent("U0000003");
        module2.addStudent("U0000005");
        module2.setClassSize();

        Module module3 = new Module();          //adds the third module "CIM2130" and students to the corresponding classlist.
        module3.setModuleID("CIM2130");
        module3.addStudent("U0000003");
        module3.addStudent("U0000004");
        module3.addStudent("U0000005");
        module3.setClassSize();

        System.out.println("Old Class List: ");             //prints out previous classlist

        System.out.println(module1);
        System.out.println(module2);
        System.out.println(module3);

        module1.addStudent("U0000002");                  //adds new students to module 1 then updates classlist.
        module1.addStudent("U0000003");
        module1.addStudent("U0000005");
        module1.setClassSize();

        module2.removeStudent("U0000003");               //removes and add students to module 2 then updates classlist.
        module2.addStudent("U0000002");
        module2.setClassSize();

        module3.removeStudent("U0000005");               //removes and add students to module 3 then updates classlist.
        module3.addStudent("U0000001");
        module3.setClassSize();

        System.out.println("\n" + "New Class List: ");      //prints out new classlist

        System.out.println(module1);
        System.out.println(module2);
        System.out.println(module3);

        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Student> classList = new ArrayList<Student>();
    }
}
