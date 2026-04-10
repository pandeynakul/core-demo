package com.consistancy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TenPerSalaryIncrease {
    public static void main(String[] args) {
        List<Employee3> employee3s = Arrays.asList(new Employee3("sachin", 50000, 5),
                new Employee3("saurabh", 55000, 5),
                new Employee3("rahul", 45000, 4),
                new Employee3("yuvraj", 60000, 3),
                new Employee3("kevin", 30000, 2));

        //peek(): modify the object while iterating over list
        //collecting all the Employee
        List<Employee3> updatedList = employee3s.stream().peek(emp -> {
            if (emp.getRating() > 4) {
                //perform the logic
                //set the salary to 10% hike
                emp.setSalary(emp.getSalary() * 1.10);
            }
        }).collect(Collectors.toList());
        System.out.println(updatedList);

    }


    }

