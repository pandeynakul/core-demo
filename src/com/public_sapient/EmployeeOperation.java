package com.public_sapient;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeOperation {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "arjun", 120000, "IT"),
                new Employee(2, "sneha", 140000, "MECH"),
                new Employee(3, "rupal", 12000, "CS"),
                new Employee(4, "snehal", 150000, "IT"),
                new Employee(5, "jollyka", 13000, "CS"),
                new Employee(6, "sudhil", 120000, "MECH"),
                new Employee(7, "amir", 170000, "ETC"),
                new Employee(5, "raj", 19000, "MECH"));

        //find the department wise counting of Employee

        Map<String, Long> countingEmp = employees.stream().collect(Collectors.groupingBy(Employee::getDeptName, Collectors.counting()));
        countingEmp.entrySet().stream().forEach(x -> System.out.println(x.getKey() + " :" + x.getValue()));
        //find the deparmant name which has highest number of Employee
        System.out.println("=========================");
        String depthavinghighestEmp = employees.stream().collect(Collectors.groupingBy(Employee::getDeptName, Collectors.counting())).entrySet()
                .stream().max(Map.Entry.comparingByValue()).get().getKey();
        System.out.println(depthavinghighestEmp);


        System.out.println("=========================");


    }
}
