package com.consistancy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee2 {

    private String name;
    private int  age;
    private String gender;
    private String department;
    private double salary;
}
