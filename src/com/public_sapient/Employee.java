package com.public_sapient;

import lombok.*;

import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Employee {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return name.equals(employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    private  int empId;
    private String name;
    private int salary;
    private String deptName;


}
