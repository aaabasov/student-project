package ru.test.studentorder;

import ru.test.studentorder.mail.MailSender;
import ru.test.studentorder.domain.*;
import ru.test.studentorder.validator.*;

public class StudentOrderChecker {

    public static void main(String[] args) {

    }

    static void checkAll(){

        while (true) {

            StudentOrder so = readStudentOrder();

            AnswerCityRegister cityAnswer = checkCityRegister(so);
            if(!cityAnswer.success)
                continue;

            AnswerWedding wedAnswer = checkWedding(so);
            AnswerChildren childAnswer = checkChildren(so);
            AnswerStudent studAnswer = checkStudent(so);

            sendMail(so);

        }
    }

    private static StudentOrder readStudentOrder() {
        StudentOrder so = new StudentOrder();
        return so;
    }

    private static AnswerStudent checkStudent(StudentOrder so) {
        return new StudentValidator().checkStudent(so);
    }

    private static AnswerChildren checkChildren(StudentOrder so) {
        return new ChildrenValidator().checkChildren(so);
    }

    private static AnswerWedding checkWedding(StudentOrder so) {
        return new WeddingValidator().checkWedding(so);
    }

    private static AnswerCityRegister checkCityRegister(StudentOrder so) {
        return new CityRegisterValidator().checkCityRegister(so);
    }

    private static void sendMail(StudentOrder so) {
        new MailSender().sendMail(so);
    }
}
