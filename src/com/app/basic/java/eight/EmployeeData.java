package com.app.basic.java.eight;

import java.util.ArrayList;
import java.util.List;

public class EmployeeData {
    //input
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<Employee>();
        //serviceObject
        EmployeeService employeeService = new EmployeeService();
        //data
        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

        //maleFemale
        employeeService.maleFemaleEmployee(employeeList);
        //allDepartments:
        employeeService.getAllDepartments(employeeList);
        // average age of male and female employees
        employeeService.avgAgeEmployeeMF(employeeList);
        //HighestPaidEmployee
        employeeService.highestPaidEmployee(employeeList);
        //joinedAfter2015
        employeeService.joinedAfter2015(employeeList);
        //CountEmpDepartmentWise
        employeeService.CountEmpDepartmentWise(employeeList);
        //avgSalDepartmentWise
        employeeService.avgSalDepartmentWise(employeeList);
        //yougestInProductDeptMale
        employeeService.yougestInProductDeptMale(employeeList);
        //workingExperienceGuy
        employeeService.workingExperienceGuy(employeeList);
        //employeeInSalesInMarketing
        employeeService.employeeInSalesInMarketing(employeeList);
        //avgSalaryOfMFEmployee
        employeeService.avgSalaryOfMFEmployee(employeeList);
        //getEmployeeNameDepartmentWise
        employeeService.getEmployeeNameDepartmentWise(employeeList);
        //averageAndTotalSalary
        employeeService.averageAndTotalSalary(employeeList);
        //seprateEmployee
        employeeService.seprateEmployee(employeeList);
        //oldestAgeEmployee
        employeeService.oldestAgeEmployee(employeeList);
        //average salary
        employeeService.averageSlary(employeeList);
        //
        employeeService.averageSum(employeeList);
        System.out.println("******************************************");
        employeeService.getEmployeeNameDepartmentWise2(employeeList);

    }
}
