package ru.test.studentorder.validator;

import ru.test.studentorder.domain.*;

public class ChildrenValidator {
    public AnswerChildren checkChildren(StudentOrder so) {
        System.out.println("checkChildren");
        return new AnswerChildren();
    }
}
