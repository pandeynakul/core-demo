package com.consistancy;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MaleAndFemaleEmpOperation {
    public static void main(String[] args) {

        List<Employee2> employee2s = Arrays.asList(
                new Employee2("john", 35, "male", "IT", 60000),
                new Employee2("steve", 38, "male", "IT", 75000),
                new Employee2("mike", 32, "male", "IT", 90000),
                new Employee2("Devid", 30, "male", "HR", 70000),
                new Employee2("chris", 31, "male", "HR", 85000),
                new Employee2("jake", 40, "male", "HR", 95000),
                new Employee2("paul", 36, "male", "Finance", 80000),
                new Employee2("Tom", 33, "male", "Finance", 78000),
                new Employee2("Eric", 39, "Female", "Finance", 88000),
                new Employee2("Riya", 39, "Female", "Finance", 86000),
                new Employee2("saniya", 39, "Female", "Finance", 78000));

        //find the male and female
        Map<String, Long> count = employee2s.stream().collect(Collectors.
                groupingBy(Employee2::getGender, Collectors.counting()));
        System.out.println(count);
        System.out.println("=======highest paid from male and female i.e. max()=======");

        Optional<Employee2> highestPaidMale = employee2s.stream().filter(x -> x.getGender().
                equalsIgnoreCase("male")).max(Comparator.comparingDouble(Employee2::getSalary));
        System.out.println(highestPaidMale);
       Optional<Employee2> highestPaidFeMale=employee2s.stream().filter(x->x.getGender().equalsIgnoreCase("female")).
                max(Comparator.comparingDouble(Employee2::getSalary));
        System.out.println(highestPaidFeMale);
        System.out.println("________________________________");

        //now department wise highest paid Employee

        Map<String, List<Employee2>> deptWiseHS = employee2s.stream().collect(Collectors.groupingBy(Employee2::getDepartment));

        deptWiseHS.forEach((d,e)->{
            Optional<Employee2> highestPaidDeptMale = e.stream().filter(x -> x.getGender().
                    equalsIgnoreCase("male")).max(Comparator.comparingDouble(Employee2::getSalary));

            Optional<Employee2> highestPaidDeptFeMale = e.stream().filter(x -> x.getGender().
                    equalsIgnoreCase("female")).max(Comparator.comparingDouble(Employee2::getSalary));
            System.out.println("department:: "+d);
            System.out.println("highest paid male :: "+ highestPaidDeptMale);
            System.out.println("highest paid female:: "+ highestPaidDeptFeMale.orElse(null));
        });
    }
}
