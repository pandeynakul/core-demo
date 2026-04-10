package com.consistancy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MultiFieldSorting {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Sachin", 30, 45000),
                new Person("saurabh", 25, 55000),
                new Person("Rahul", 30, 45000),
                new Person("yuvraj", 25, 45000),
                new Person("Ashish", 35, 50000));

        List<Person> sortedList = people.stream().sorted(Comparator.comparing(Person::getAge).
                thenComparing(Person::getSalary).thenComparing(Person::getName)).collect(Collectors.toList());
        System.out.println(sortedList);
        System.out.println("========================");
        sortedList.forEach(p -> System.out.println(p));
        System.out.println("++++++++++++++++++====");
        sortedList.forEach(p -> System.out.println(p.getAge() + " " + p.getName() + " " + p.getSalary()));

    }
}
