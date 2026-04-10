package com.consistancy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AverageSalaryDeptWise {

    public static void main(String[] args) {


        List<Employee1> list = Arrays.asList(new Employee1("Alice", "HR", 50000),
                new Employee1("Bob", "IT", 60000),
                new Employee1("Carlie", "HR", 70000),
                new Employee1("Ddevid", "IT", 75000),
                new Employee1("Eve", "Finance", 80000),
                new Employee1("Frank", "Finance", 85000));
        Map<String, Double> result = list.stream().collect(Collectors.groupingBy(Employee1::getDepartment,
                Collectors.averagingDouble(Employee1::getSalary)));
        //iterate the map
        result.forEach((d, s) -> System.out.println("dept:: " + d + "" + " avgSlary:: " + s));

    }
}
