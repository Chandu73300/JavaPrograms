package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import mtdreference.Employee;

public class Streams extends Employee {
	public static void main(String[] args) {
		//		Employee[] arrayEmpObj = {new Employee(1, "Jeff Bezos", 100000.0), 
		//			    new Employee(2, "Bill Gates", 200000.0), 
		//			    new Employee(3, "Mark Zuckerberg", 300000.0)};
		//		Stream.of(arrayEmpObj).map(Employee::getName).forEach(System.out::println);
		//=================================================================//

		//		List<Integer> li = Arrays.asList(1,4,6,2,3,9,4);
		//		li.stream().map(a -> a*3).forEach(System.out::println);
		//=================================================================//

		//		Stream.of(1,4,6,2,3,9,4).map(a -> a*3).forEach(System.out::println);
		//=================================================================//

		//		List<Integer> li = List.of(1,4,6,2,3,9,4);
		//		li.stream().map(a -> a*3).forEach(System.out::println);
		//=================================================================//

		//		HashSet<String> set = new HashSet<>();
		//		set.addAll(Arrays.asList("geeks", "gfg", "g", "e", "e", "k", null));
		//		set.stream().map(String::toUpperCase).forEach(System.out::println); //only at this line throws null pointer exception.

		//		HashSet<String> set1 = new HashSet<>();
		//		set1.addAll(Arrays.asList(null,null,"Ramu","DEV"));//only printed one null value.
		//		Iterator<String> ir = set1.iterator();
		//		while(ir.hasNext()) {
		//			System.out.println(ir.next());//Printed null value
		//		}
		//=================================================================//

		//		String[] str = {"Ravi", "Chandu", "Banu"};
		//		Stream<String> st = Arrays.stream(str);
		//		st.forEach(System.out::println);
		//=================================================================//

		//		int[] i = {1,2,3,4};
		//		for(int n:i) {
		//			System.out.println(n);
		//		}

		/* mapMulti */
		//		List<String> words = Arrays.asList("hello", "world", "java");
		//        Stream<String> wordStream = words.stream();
		//        Stream<Character> charactersStream = wordStream.mapMulti((word, consumer) -> {
		//            for (char c : word.toCharArray()) {
		//                consumer.accept(c);  // Provide each character to the consumer
		//            }
		//        });
		//
		//        List<Character> characters = charactersStream.collect(Collectors.toList());
		//        System.out.println("Characters: " + characters);

		/* Stream<T> peek(Consumer<? super T> action) */
		//		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		//        List<Integer> processedNumbers = numbers.stream()
		//            .peek(number -> System.out.println("Original number: " + number))
		//            .map(number -> number * 2)
		//            .peek(number -> System.out.println("Doubled number: " + number))
		//            .collect(Collectors.toList());
		//
		//        System.out.println("Processed numbers: " + processedNumbers);

		/* Stream<T> limit(long maxSize) */
		//		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		//        List<Integer> limitedNumbers = numbers.stream()
		//            .limit(3)
		//            .collect(Collectors.toList());
		//        System.out.println("Limited numbers: " + limitedNumbers);

		/* Stream<T> skip(long n) */
		//		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		//        List<Integer> remainingNumbers = numbers.stream()
		//            .skip(4)
		//            .collect(Collectors.toList());
		//        System.out.println("Remaining numbers after skip: " + remainingNumbers);

		/* void forEachOrdered(Consumer<? super T> action) */
		//		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		//        numbers.parallelStream()
		//            .forEachOrdered(number -> System.out.println("Number: " + number));

		/* T reduce(T identity, BinaryOperator<T> accumulator) */
		//		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		//        Integer sum = numbers.stream()
		//            .reduce(0, (accumulator, element) -> accumulator + element);
		//        System.out.println("Sum: " + sum);

		/* Optional<T> min(Comparator<? super T> comparator) */
		//		List<Integer> numbers = Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5);
		//        Optional<Integer> minNumber = numbers.stream()
		//            .min(Comparator.naturalOrder());
		//        minNumber.ifPresentOrElse(
		//            min -> System.out.println("Minimum number: " + min),
		//            () -> System.out.println("Stream is empty")
		//        );

		/* Stream<T> generate(Supplier<? extends T> s) */
//		Stream<Integer> numbers = Stream.generate(new NumberSupplier());
//		List<Integer> firstFiveNumbers = numbers
//				.limit(5)
//				.collect(Collectors.toList());
//		System.out.println("First five numbers: " + firstFiveNumbers);
	}
}
class NumberSupplier implements Supplier<Integer> {
	private int current = 1;

	@Override
	public Integer get() {
		return current++;
	}
}
