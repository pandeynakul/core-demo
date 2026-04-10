package com.app.congni.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighestSalaryByListLogic {
    public static void main(String[] args) {
        //create the Employee

        Employee emp1 = new Employee(1, "Envy1", "It1", 7000);
        Employee emp2 = new Employee(2, "Envy2", "It2", 2000);
        Employee emp3 = new Employee(3, "Envy3", "It3", 5000);
        Employee emp4 = new Employee(4, "Envy4", "It4", 9000);
        Employee emp5 = new Employee(5, "Envy5", "It5", 3000);

        List<Employee> employees = Arrays.asList(emp1, emp2, emp3, emp4, emp5);

        //find the second highest salary
        employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .skip(1).limit(1).
                forEach(x -> System.out.println(x));
    }
}
