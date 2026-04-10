package com.consistancy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

//averaging salary department wise
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee1 {

    private String name;
    private String department;
    private double salary;
}
