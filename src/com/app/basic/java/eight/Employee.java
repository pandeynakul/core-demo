package com.app.basic.java.eight;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {

    int id;
    String name;
    int age;
    String gender;
    String department;
    int yearOfJoining;
    double salary;
}
