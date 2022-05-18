package ru.test.studentorder.domain;

import lombok.*;

public class StudentOrder {
    @Getter
    @Setter
    private String hFirstName;

    @Getter
    @Setter
    private String hLastName;

    @Getter
    @Setter
    private String wFirstName;

    @Getter
    @Setter
    private String wLastName;
}
