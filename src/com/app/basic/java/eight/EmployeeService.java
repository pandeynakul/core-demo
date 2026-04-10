package com.app.basic.java.eight;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeService {
    public static void maleFemaleEmployee(List<Employee> employeeList) {
        //How many male and female employees are there in the organization?
        Map<String, List<Employee>> collect = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender));
        System.out.println(collect.toString());
        System.out.println("===========================XX");
        System.out.println();
        //iterate the map in java 8
        Set<Map.Entry<String, List<Employee>>> entries = collect.entrySet();
        for (Map.Entry<String, List<Employee>> entry : entries) {
            for (Employee values : entry.getValue()) {
                System.out.println(entry.getKey() + " " + values);
            }
            System.out.println();
        }
        System.out.println("==============================XX");
        Map<String, Long> noOfMaleAndFemaleEmployees = employeeList.stream().
                collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(noOfMaleAndFemaleEmployees);
        System.out.println("=============================XX");
    }

    //Print the name of all departments in the organization
    public void getAllDepartments(List<Employee> employeeList) {
        employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
        System.out.println("===============================XX");
    }

    // Average age of male and female employees
    public void avgAgeEmployeeMF(List<Employee> employeeList) {
        Map<String, Double> avgAgeGenderWise = employeeList.stream().collect(Collectors.
                groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
        System.out.println(avgAgeGenderWise);
        System.out.println("===============================XX");
    }

    // highest paid employee
    public void highestPaidEmployee(List<Employee> employeeList) {
        Employee employee = employeeList.stream().
                collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))).get();
        System.out.println("Highest Paid Employee : Name " + employee.getName() + " EmpID " + employee.getId()
                + " Salary " + employee.getSalary());
        System.out.println("===============================XX");

    }

    //Get the names of all employees who have joined after 2015
    public void joinedAfter2015(List<Employee> employeeList) {
        List<String> asList = employeeList.stream().filter(e -> e.getYearOfJoining() > 2015).
                map(Employee::getName).collect(Collectors.toList());
        System.out.println(asList);
        System.out.println("===============================XX");
    }

    //Count the number of employees in each department?
    public void CountEmpDepartmentWise(List<Employee> employeeList) {

        Map<String, Long> numOfEmployee
                = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(numOfEmployee);
        //just retrieve the map
        Set<Map.Entry<String, Long>> entries = numOfEmployee.entrySet();
        for (Map.Entry entry : entries) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println("===============&&================XX");
    }

    // What is the average salary of each department?
    public void avgSalDepartmentWise(List<Employee> employeeList) {
        Map<String, Double> avgSalDept = employeeList.stream().collect(Collectors.groupingBy
                (Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        //iterate it
        Set<Map.Entry<String, Double>> itrDeptSalAvg = avgSalDept.entrySet();
        for (Map.Entry entry : itrDeptSalAvg) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        //avgSalDept.entrySet().stream().forEach((x)-> System.out.println(x.getKey()+" : "+x.getValue()));
        System.out.println("===============&&================XX");

    }

    //Query 3.8 : Get the details of youngest male employee in the product development department?
    public void yougestInProductDeptMale(List<Employee> employeeList) {
        Employee x = employeeList.stream().
                filter(e -> e.getDepartment() == "Product Development" && e.getGender() == "Male").
                min(Comparator.comparingInt(Employee::getAge)).get();
                /*forEach(x -> System.out.println(x.getName() + " "
                        + x.getGender() + " "
                        + x.getDepartment() + " "
                        + x.getSalary() + ""
                        + x.getId() + " " + x.getYearOfJoining()));*/
        System.out.println(x.getName() + " "
                + x.getGender() + " "
                + x.getDepartment() + " "
                + x.getSalary() + ""
                + x.getId() + " " + x.getYearOfJoining());
        System.out.println("==========================XX");
    }

    //Who has the most working experience in the organization?
    public void workingExperienceGuy(List<Employee> employeeList) {
        Optional<Employee> first = employeeList.stream().
                sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();
        System.out.println(first.get());
        //To retrieve the option
        System.out.println("==========================XX");
    }

    //How many male and female employees are there in the sales and marketing team?
    public void employeeInSalesInMarketing(List<Employee> employeeList) {
        Map<String, Long> collect = employeeList.stream().filter(e -> e.getDepartment() == "Sales And Marketing")
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(collect);
        System.out.println("==========================XX");
    }

    // What is the average salary of male and female employees?
    public void avgSalaryOfMFEmployee(List<Employee> employeeList) {
        Map<String, Double> avgSalMF = employeeList.stream().
                collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));

        System.out.println(avgSalMF);
        System.out.println("==========================XX");
    }

    //List down the names of all employees in each department?
    public void getEmployeeNameDepartmentWise(List<Employee> employeeList) {
        Map<String, List<Employee>> empNameDept = employeeList.stream().
                collect(Collectors.groupingBy(Employee::getDepartment));
        //retrieve the map
        Set<Map.Entry<String, List<Employee>>> entries = empNameDept.entrySet();
        //retrieve the data
        for (Map.Entry<String, List<Employee>> data : entries) {
            System.out.println("===========");
            System.out.println(data.getKey());
            System.out.println("---------------");
            //iterate the list
            List<Employee> deptEmpName = data.getValue();
            for (Employee itrEmpName : deptEmpName) {
                System.out.println(itrEmpName.getName());
            }

        }
        System.out.println("==========================XX");
    }

    //List down the names of all employees in each department?
    public   void getEmployeeNameDepartmentWise2(List<Employee> employeeList) {
        System.out.println("Alterenate iternation of the above logic getEmployeeNameDepartmentWise2-->");
         employeeList.stream().
                collect(Collectors.groupingBy(Employee::getDepartment))
                .entrySet().stream().forEach(e->{
             System.out.println(e.getKey());
             System.out.println("============");
             e.getValue().forEach(emp-> System.out.println(emp.getName()));
         });


         //.forEach(e->e.getValue().forEach(System.out::println));


        System.out.println("==========================XX");
    }

    // What is the average salary and total salary of the whole organization?
    //for total getSum()
    //for avrage getAvrage()
    public void averageAndTotalSalary(List<Employee> employeeList) {
        DoubleSummaryStatistics summaryStatics = employeeList.stream().
                collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println("total salary :: " + summaryStatics.getSum());
        System.out.println("Avarage slary :: " + summaryStatics.getAverage());
        System.out.println("==========================XX");
    }

    //Separate the employees who are younger or equal to 25 years
    // from those employees who are older than 25 years.

    public void seprateEmployee(List<Employee> employeeList) {
        Map<Boolean, List<Employee>> seprateEmp = employeeList.stream().
                collect(Collectors.partitioningBy(emp -> emp.getAge() > 25));
        System.out.println(seprateEmp);
        //return the entry
        Set<Map.Entry<Boolean, List<Employee>>> entries=seprateEmp.entrySet();
        System.out.println("==========================XX");
        //iterate the list
        for(Map.Entry<Boolean, List<Employee>> entry:entries){
            if(entry.getKey()==false) {
                List<Employee> employees = entry.getValue();
                for (Employee emp : employees) {
                    System.out.println(emp.getName() + " " + emp.getAge());
                }
            }

        }
        System.out.println("=====================================XX");
    }
    // Query 3.15 : Who is the oldest employee in the organization?
    // What is his age and which department he belongs to?

    public void oldestAgeEmployee(List<Employee> employeeList){
        Optional<Employee> collect = employeeList.stream().
                collect(Collectors.maxBy(Comparator.comparingInt(Employee::getAge)));
        System.out.println(collect);
        //retrieve the details
        Employee employee = collect.get();
        System.out.println(employee.getName());
        System.out.println(employee.getDepartment());
        System.out.println(employee.getAge());
        System.out.println("==============================");


    }

    public void averageSlary(List<Employee> employeeList) {
        double asDouble = employeeList.stream().filter(e -> e.getSalary() > 15000).map(e -> e.getSalary()).mapToDouble(i -> i).average().getAsDouble();
        System.out.println(asDouble);
        System.out.println("==============================");
    }

    public void averageSum(List<Employee> employeeList) {
        List<String> hr = employeeList.stream().filter(e -> e.getDepartment().equals("HR")).map(e -> e.getName()).collect(Collectors.toList());
        System.out.println(hr);
        System.out.println("==============================");
    }
}
