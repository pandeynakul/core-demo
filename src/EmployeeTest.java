import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//count number of all employees from the list with similar names and age
//greater than 30 in java 8
public class EmployeeTest {
    public static void main(String[] args) {

        ArrayList<Employee> employeesList = new ArrayList<>();

        Employee e1 = new Employee(1, "rahul", 31);
        Employee e2 = new Employee(2, "ajuu", 24);
        Employee e3 = new Employee(3, "ky", 24);
        Employee e4 = new Employee(4, "nandu", 24);
        Employee e5 = new Employee(5, "sameer", 24);
        Employee e6 = new Employee(6, "salman", 24);
        Employee e7 = new Employee(7, "rahul", 32);
        Employee e8 = new Employee(8, "abhinv", 35);
        Employee e9 = new Employee(9, "rahul", 24);
        Employee e10 = new Employee(10, "abhinv", 33);

        employeesList.add(e1);
        employeesList.add(e2);
        employeesList.add(e3);
        employeesList.add(e4);
        employeesList.add(e5);
        employeesList.add(e6);
        employeesList.add(e7);
        employeesList.add(e8);
        employeesList.add(e9);
        employeesList.add(e10);
        System.out.println(employeesList.stream().
                filter(emp->emp.getAge()>30).collect(Collectors.groupingBy(emp->emp.getName(),Collectors.counting())));

    }








}
