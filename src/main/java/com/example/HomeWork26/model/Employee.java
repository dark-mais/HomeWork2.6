package com.example.HomeWork26.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;
import java.util.Random;

import static org.apache.commons.lang3.StringUtils.capitalize;


@Setter
@Getter
@EqualsAndHashCode
@ToString
public class Employee {
    private String firstName;
    private String lastName;
    private int salary;
    private int departmentID;
    private String fullName = firstName + " " + lastName;

    public Employee(String firstName, String lastName) {
        Random random = new Random();

        this.firstName = capitalize(firstName);
        this.lastName = capitalize(lastName);
        this.salary = random.nextInt(300000) + 50000;
        this.departmentID = random.nextInt(5) + 1;
    }
}
