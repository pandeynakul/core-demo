package com.consistancy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class NthHighestSalary {

    public static void main(String[] args) {
        int n = 3;

        List<Employee1> list = Arrays.asList(new Employee1("Alice", "HR", 50000),
                new Employee1("Bob", "IT", 60000),
                new Employee1("Carlie", "HR", 70000),
                new Employee1("Ddevid", "IT", 75000),
                new Employee1("Eve", "Finance", 80000),
                new Employee1("Frank", "Finance", 85000));
        //skip and find first()

        Optional<Employee1> nthHIghestSalary = list.stream().sorted(Comparator.comparingDouble(Employee1::getSalary).reversed()).skip(n - 1).
                findFirst();
        System.out.println(nthHIghestSalary);
        //print the between salary

    }
}
