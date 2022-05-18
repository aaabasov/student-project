package ru.test.studentorder;

import ru.test.studentorder.domain.StudentOrder;

public class SaveStudentOrder {

    public static void main(String[] args) {
        StudentOrder so = new StudentOrder();
        so.setHFirstName("Alex");
        so.setHLastName("Ivanov");
        so.setWFirstName("Diana");
        so.setWLastName("Ivaonva");

        saveStudentOrder(so);
    }

    private static void saveStudentOrder(StudentOrder so) {
        System.out.println("...");
    }


}
