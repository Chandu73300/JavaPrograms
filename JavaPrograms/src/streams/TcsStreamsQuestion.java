package streams;
import java.util.*;
import java.util.stream.Collectors;

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "'}";
    }
}

public class TcsStreamsQuestion {
    public static void main(String[] args) {
        // Create a list of Employee objects
        List<Employee> employees = Arrays.asList(
            new Employee("John"),
            new Employee("Alexandrea"),
            new Employee("Bob"),
            new Employee("Christine")
        );

        // Sort the employees based on the length of their names
        List<Employee> sortedEmployees = employees.stream()
            .sorted(Comparator.comparingInt(e -> e.getName().length()))
            .collect(Collectors.toList());

        // Print the sorted list
        sortedEmployees.forEach(System.out::println);
        
        String s = null;
		System.out.println(s.toString());//Null pointer Exception
		System.out.println(String.valueOf(s));//null
		System.out.println((String)s);//null
		System.out.println(s);//null
    }
}