package com.app.congni.interview;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Data
@NoArgsConstructor
public class Student {
    public  String name;
    public int marks;
    public int count;

    public Student(String name, int marks, int count) {
        this.name = name;
        this.marks = marks;
        this.count = count;
    }

}
