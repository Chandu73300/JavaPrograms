package streams;

import java.util.ArrayList;
import java.util.Arrays;
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
        people.add(new Person("Charlie", 30));
        people.add(new Person("Diana", 25));
        people.add(new Person("Eve", 30));

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
		
//		people.sort(Comparator.comparingInt(Person::getAge));
//		people.forEach(System.out::println);
//		System.out.println("===============================");
//		Collections.sort(people, Comparator.comparingInt(Person::getAge).reversed());
//		people.forEach(System.out::println);
		
//		Comparator<Person> compAge = Comparator.comparingInt(Person::getAge);
//		Comparator<Person> compName = Comparator.comparing(Person::getName);
//		
//		Comparator<Person> byAgeThenName = compAge.thenComparing(compName);
//		people.sort(byAgeThenName);
//		people.forEach(System.out::println);
        
//        List<Integer> numbers = Arrays.asList(1,5,2,8,7,8,4,4,2,8,11,25);
//        numbers.sort(Comparator.naturalOrder());
//        System.out.println("Sorted integers (natural order): " + numbers);
//        
//        List<String> words = new ArrayList<>();
//        words.add("banana");
//        words.add("apple");
//        words.add("cherry");
//        words.add("date");
//        words.add("elderberry");
//        
//        words.sort(Comparator.naturalOrder());
//        System.out.println("Sorted strings (natural order): " + words);
        
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(null);
        numbers.add(1);
        numbers.add(4);
        numbers.add(null);
        numbers.add(5);
        numbers.add(2);
        numbers.add(null);
        
        numbers.sort(Comparator.nullsFirst(Comparator.naturalOrder()));
        System.out.println("Sorted with nulls first: " + numbers);
        
        numbers.sort(Comparator.nullsLast(Comparator.naturalOrder()));
        System.out.println("Sorted with nulls first: " + numbers);
	}
}
