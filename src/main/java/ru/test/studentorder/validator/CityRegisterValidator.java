package ru.test.studentorder.validator;

import ru.test.studentorder.domain.*;

public class CityRegisterValidator {
    public AnswerCityRegister checkCityRegister(StudentOrder so) {
        System.out.println("checkCity");
        return new AnswerCityRegister();
    }
}
