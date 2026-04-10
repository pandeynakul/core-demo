package com.newstart.java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8CommonProgrammingQA {

    public static void main(String[] args) {
        List<Student> studentList = Stream.of(
                new Student(1, "Rohit", 30, "Male", "Mechanical Engineering", "Mumbai", 122, Arrays.asList("+912632632782", "+1673434729929")),
                new Student(2, "Pulkit", 56, "Male", "Computer Engineering", "Delhi", 67, Arrays.asList("+912632632762", "+1673434723929")),
                new Student(3, "Ankit", 25, "Female", "Mechanical Engineering", "Kerala", 164, Arrays.asList("+912632633882", "+1673434709929")),
                new Student(4, "Satish Ray", 30, "Male", "Mechanical Engineering", "Kerala", 26, Arrays.asList("+9126325832782", "+1671434729929")),
                new Student(5, "Roshan", 23, "Male", "Biotech Engineering", "Mumbai", 12, Arrays.asList("+012632632782")),
                new Student(6, "Chetan", 24, "Male", "Mechanical Engineering", "Karnataka", 90, Arrays.asList("+9126254632782", "+16736784729929")),
                new Student(7, "Arun", 26, "Male", "Electronics Engineering", "Karnataka", 324, Arrays.asList("+912632632782", "+1671234729929")),
                new Student(8, "Nam", 31, "Male", "Computer Engineering", "Karnataka", 433, Arrays.asList("+9126326355782", "+1673434729929")),
                new Student(9, "Sonu", 27, "Female", "Computer Engineering", "Karnataka", 7, Arrays.asList("+9126398932782", "+16563434729929", "+5673434729929")),
                new Student(10, "Shubham", 26, "Male", "Instrumentation Engineering", "Mumbai", 98, Arrays.asList("+912632646482", "+16734323229929")))
                .collect(Collectors.toList());

        // 1. Find the list of students whose rank is in between 50 and 100
        List<Student> studRank = studentList.stream().filter(stu -> stu.getRank() > 50 && stu.getRank() < 100).collect(Collectors.toList());

        //System.out.println(studRank);
        // studRank.forEach(x -> System.out.println(x));
        System.out.println("==========================");


        //2. Find the Students who stays in Karnataka and sort them by their names
        List<Student> studentsByCity = studentList.stream().filter(student -> student.getCity() == "Karnataka").
                sorted(Comparator.comparing(Student::getFirstName, Comparator.reverseOrder())).collect(Collectors.toList());
        // studentsByCity.forEach(x-> System.out.println(x));
        System.out.println("=======================");

        // 3. Find all departments names
        //with the help of list and set

        List<String> deptNames = studentList.stream().map(Student::getDept).distinct().collect(Collectors.toList());
        // deptNames.forEach(x-> System.out.println(x));


        //without using the distinct keyword
        Set<String> deptNames1 = studentList.stream().map(Student::getDept).collect(Collectors.toSet());
        //deptNames1.forEach(x-> System.out.println(x));

        //4.  Find all the contact numbers

        List<String> contacts = studentList.stream().flatMap(student -> student.getContacts().stream()).distinct()
                .collect(Collectors.toList());
        // contacts.forEach(x-> System.out.println(x));

        //5.  Group The Student By Department Names
        Map<String, List<Student>> collectSDN = studentList.stream().collect(Collectors.groupingBy(Student::getDept));
        // collectSDN.entrySet().forEach((x)-> System.out.println(x.getKey()+" "+x.getValue()));


        //6. Find the department who is having number of students
        Map<String, Long> countDepts = studentList.stream().collect(Collectors.groupingBy(Student::getDept, Collectors.counting()));
        // countDepts.entrySet().forEach((x) -> System.out.println(x.getKey() + " " + x.getValue()));
        System.out.println("===========================");
        // Find the department who is having max number of students
        Map.Entry<String, Long> result = studentList.stream().collect(Collectors.groupingBy(Student::getDept, Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue()).get();
        // System.out.println(result);

        //7. Find the average age of male and female students
        Map<String, Double> avgAgeGrp = studentList.stream().collect(Collectors.groupingBy(Student::getGender,
                Collectors.averagingInt(Student::getAge)));
        //System.out.println(avgAgeGrp);

        //8. Find the highest rank in each department
        Map<String, Optional<Student>> highRankInDeptWise = studentList.stream().collect(Collectors.groupingBy(Student::getDept, Collectors.
                minBy(Comparator.comparing(Student::getRank))));
        // highRankInDeptWise.entrySet().forEach(x-> System.out.println(x.getKey()+" "+x.getValue()));
        //comparator may be by default ascending so reverse it

        //9 .
      //  List<Student> rankWise = studentList.stream().sorted(Comparator.comparing(Student::getRank, Comparator.reverseOrder())).collect(Collectors.toList());

         List<Student> rankWise = studentList.stream().sorted(Comparator.comparing(Student::getRank)).collect(Collectors.toList());
        rankWise.forEach(x -> System.out.println(x.getRank()));
        //Comparator by default print the acending
        //provide the reverse order method with comparing
        //Find the student who has second rank
        System.out.println("=======================");
        Student rankSecond = studentList.stream().sorted(Comparator.comparing(Student::getRank)).skip(2).findFirst().get();
        System.out.println(rankSecond.getRank());


    }
}
