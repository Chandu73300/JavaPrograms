package streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return name + " (" + age + " years old)";
	}
}

public class ComparatorExmp {

	public static void main(String[] args) {
		// Create a list of Person objects
		List<Person> people = new ArrayList<>();
		people.add(new Person("Alice", 30));
		people.add(new Person("Bob", 25));
		people.add(new Person("Charlie", 35));
		people.add(new Person("Diana", 28));

//		// Create a Comparator to sort people by age in ascending order
//		Comparator<Person> ageComparator = Comparator.comparingInt(Person::getAge);
//
//		// Sort the list in ascending order by age
//		System.out.println("Sorted by age (ascending):");
//		people.sort(ageComparator);
//		people.forEach(System.out::println);
//
//		// Create a reversed Comparator to sort people by age in descending order
//		Comparator<Person> reversedAgeComparator = ageComparator.reversed();
//
//		// Sort the list in descending order by age
//		System.out.println("\nSorted by age (descending):");
//		people.sort(reversedAgeComparator);
//		people.forEach(System.out::println);
		
		people.sort(Comparator.comparingInt(Person::getAge));
		people.forEach(System.out::println);
		System.out.println("===============================");
		Collections.sort(people, Comparator.comparingInt(Person::getAge).reversed());
		people.forEach(System.out::println);
	}
}
