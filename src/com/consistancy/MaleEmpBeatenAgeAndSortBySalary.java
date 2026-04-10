package com.consistancy;

import java.util.*;
import java.util.stream.Collectors;

//top 3 male employee
//having age between 30 nd 40
//male
//sort by salary dept wise
public class MaleEmpBeatenAgeAndSortBySalary {

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
        Map<String, List<Employee2>> EmpDeptWise =
                employee2s.stream().filter(e -> e.getAge() > 30 && e.getAge() < 40).filter(e -> e.getGender().equalsIgnoreCase("male"))
                        .collect(Collectors.groupingBy(Employee2::getDepartment));

        //collect in the hashmap
        HashMap<String, List<Employee2>> hm = new HashMap<>();
        //sort by salary
        EmpDeptWise.forEach((d, e) -> {
            List<Employee2> sortedSalry = e.stream().sorted(Comparator.comparingDouble(Employee2::getSalary).reversed()).limit(3).
                    collect(Collectors.toList());
            hm.put(d, sortedSalry);

        });
        hm.forEach((x, y) -> {
            System.out.println(" dept:: " + x);
            y.forEach(System.out::println);
        });


    }
}

