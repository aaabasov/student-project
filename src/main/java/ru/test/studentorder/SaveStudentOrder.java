package ru.test.studentorder;

import ru.test.studentorder.domain.StudentOrder;

public class SaveStudentOrder {

    public static void main(String[] args) {
        StudentOrder so = new StudentOrder();
        so.sethFirstName("Alex");
        so.sethLastName("Ivanov");
        so.setwFirstName("Diana");
        so.setwLastName("Ivaonva");

        saveStudentOrder(so);
    }

    private static void saveStudentOrder(StudentOrder so) {
        System.out.println("...");
    }


}
