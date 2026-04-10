package com.consistancy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Connizant Java Question
//20 lakhs
public class EmployeeBonus {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(new Employee("Alice", 8, 4),
                new Employee("Bob", 6, 5),
                new Employee("Carlie", 9, 2),
                new Employee("Ddevid", 7, 3),
                new Employee("Eve", 8, 6));

        String result = employees.stream().filter(emp -> emp.getPScore() > 7).
                filter(employee -> employee.getYAtCompany() > 3).
                map(Employee::getName).sorted().collect(Collectors.joining(","));
        System.out.println(result);
        System.out.println("================================");
        String result2 = employees.stream().filter(emp -> emp.getPScore() > 7 && emp.getYAtCompany() > 3).
                map(Employee::getName).sorted().collect(Collectors.joining(","));
        System.out.println(result);

    }
}
