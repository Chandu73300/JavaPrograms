package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class Students {
    private String subject;
    private String name;
    private String surname;
    private String city;
    private int age;
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Students(String subject, String name, String surname, String city, int age) {
		super();
		this.subject = subject;
		this.name = name;
		this.surname = surname;
		this.city = city;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Students [subject=" + subject + ", name=" + name + ", surname=" + surname + ", city=" + city + ", age="
				+ age + "]";
	}

}

public class GroupingByExamp {
	public static void main(String[] args)
	{
//		List<String> g = Arrays.asList("geeks", "for", "geeks");
//		Map<String, Long> result
//		= g.stream().collect(
//				Collectors.groupingBy(
//						Function.identity(),
//						Collectors.counting()));
//
//		// Print the result
//		System.out.println(result);
		
		List<Students> students = Arrays.asList(
			    new Students("Math", "John", "Smith", "Miami", 19),
			    new Students("Programming", "Mike", "Miles", "New York", 21),
			    new Students("Math", "Michael", "Peterson", "New York", 20),
			    new Students("Math", "James", "Robertson", "Miami", 20),
			    new Students("Programming", "Kyle", "Miller", "Miami", 20)
			);
		
		Map<String, List<Students>> studentsBySubject = students
			    .stream()
			    .collect(
			        Collectors.groupingBy(Students::getSubject)
			    );
//		System.out.println(studentsBySubject);
		Map<String, List<String>> studentsByCity = students.stream()
	              .collect(Collectors.groupingBy(
	                  Students::getCity, 
	                  Collectors.mapping(Students::getName, Collectors.toList())));
	    
	System.out.println(studentsByCity);
	}
}
