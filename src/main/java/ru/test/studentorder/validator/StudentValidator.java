package ru.test.studentorder.validator;

import ru.test.studentorder.domain.*;

public class StudentValidator {
    public AnswerStudent checkStudent(StudentOrder so) {
        System.out.println("checkStudent");
        return new AnswerStudent();
    }
}
